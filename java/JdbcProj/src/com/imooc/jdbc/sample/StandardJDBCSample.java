package com.imooc.jdbc.sample;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 标准JDBC操作五步骤
 */
public class StandardJDBCSample {
    public static void main(String[] args) {
        Connection conn=null;
        try {
            //1.加载并注册JDBC驱动,class代表加载指定的类
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.创建数据库连接
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/imooc?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true",
                    "root", "root"
            );
            //3.创建Statement对象
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select *from employee");
            //4.遍历查询结果
            while (rs.next()) {
                Integer eno = rs.getInt(1);//eno
                String ename = rs.getString("ename");
                Float salary = rs.getFloat("salary");
                String dname = rs.getString("dname");
                System.out.println(eno + "-" + ename + "-" + salary + "-" + dname);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (conn != null && conn.isClosed() == false) {
                    //5.关闭连接，释放资源
                    conn.close();
                }
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }

    }
}
