package com.imooc.jdbc.hrapp.command;

import java.sql.*;
import java.util.Scanner;

public class QueryCommand implements Command{
    @Override
    public void execute() {
        System.out.println("请输入部门名称：");
        Scanner in = new Scanner(System.in);
        String pdname=in.next();
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        try {
            //1.加载JDBC驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.创建数据库连接
            conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/imooc?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true",
                    "root","root");
            //3.创建Statement对象
            stmt=conn.createStatement();
            //结果集
            rs=stmt.executeQuery("select * from employee where dname='"+pdname+"'");
            //4.遍历查询结果
            while(rs.next()){
                Integer eno=rs.getInt(1);//JDBC中字段索引从1开始，而非0
                String ename=rs.getString("ename");
                Float salary=rs.getFloat("salary");
                String dname=rs.getString("dname");
                System.out.println(eno + "-" + ename + "-" + salary + "-" + dname);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (rs!=null){
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if(stmt!=null){
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (conn!=null&& !conn.isClosed()){
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
