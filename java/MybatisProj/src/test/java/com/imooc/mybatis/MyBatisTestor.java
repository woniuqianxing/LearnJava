package com.imooc.mybatis;

import com.imooc.mybatis.dto.GoodsDTO;
import com.imooc.mybatis.entity.Goods;
import com.imooc.mybatis.utils.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * JUNIT单元测试类
 */
public class MyBatisTestor {
    @Test
    public void testSqlSessionFactory() throws IOException {
        //利用Reader加载classpath下的mybatis-config.xml核心配置文件
        Reader reader=Resources.getResourceAsReader("mybatis-config.xml");
        //初始化SqlSessionFactory对象，同时解析mybatis-config.xml文件
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        System.out.println("SessionFactory加载成功");
        SqlSession sqlSession=null;
        try {
            //创建SqlSession对象，SqlSession是JDBC的扩展类，用于与数据库交互
            sqlSession = sqlSessionFactory.openSession();
            //创建数据库连接（测试用）
            Connection connection = sqlSession.getConnection();
            System.out.println(connection);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (sqlSession!=null){
                //如果type="POOLED",代表使用连接池，close则是将连接回到连接池中
                //如果type="UNPOOLED",代表直连，close则会调用Connection.close()方法关闭连接
                sqlSession.close();
            }
        }
    }
    @Test
    public void testMyBatisUtils(){
        SqlSession sqlSession=null;
        try {
            sqlSession = MyBatisUtils.openSession();
            Connection connection = sqlSession.getConnection();
            System.out.println(connection);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            MyBatisUtils.closeSession(sqlSession);

        }
    }
    @Test
    public void testSelectAll(){

        SqlSession session=null;
        try {
            session = MyBatisUtils.openSession();
            List<Goods> list=session.selectList("goods.selectAll");
            for (Goods g:list){
                System.out.println(g.getTitle());
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            MyBatisUtils.closeSession(session);

        }
    }
    @Test
    public void testSelectById(){
        SqlSession session=null;
        try{
            session=MyBatisUtils.openSession();
            Goods goods=session.selectOne("goods.selectById",1602);
            System.out.println(goods.getTitle());
        }catch(Exception e){
            throw e;
        }finally {
            MyBatisUtils.closeSession(session);
        }
    }
    @Test
    public void testSelectByPriceRange(){
        SqlSession session=null;
        try{
            session=MyBatisUtils.openSession();
            Map param= new HashMap();
            param.put("min",100);
            param.put("max",500);
            param.put("limit",10);
            List<Goods> list=session.selectList("selectByPriceRange",param);
            for (Goods g:list){
                System.out.println(g.getTitle()+":"+g.getCurrentPrice());
            }
        }catch (Exception e){
            throw e;
        }finally {
            MyBatisUtils.closeSession(session);
        }
    }

    @Test
    public void testSelectGoodsDTO(){
        SqlSession session=null;
        try{
            session=MyBatisUtils.openSession();
            List<GoodsDTO> list=session.selectList("goods.selectGoodsDTO");
            for (GoodsDTO g:list){
                System.out.println(g.getGoods().getTitle());
            }
        }catch (Exception e){
            throw e;
        }finally {
            MyBatisUtils.closeSession(session);
        }
    }
    @Test
    public void testInsert() throws Exception{
        SqlSession session = null;
        try {
            session = MyBatisUtils.openSession();
            Goods goods=new Goods();
            goods.setTitle("测试商品");
            goods.setSubTitle("测试子标题");
            goods.setOriginalCost(200f);
            goods.setCurrentPrice(100f);
            goods.setDiscount(0.5f);
            goods.setIsFreeDelivery(1);
            goods.setCategoryId(43);
            //insert()方法返回值代表本次成功插入的记录总数
            int num=session.insert("goods.insert",goods);
            session.commit();//提交事务数据
            System.out.println(goods.getGoodsId());
        }catch (Exception e){
            if (session!=null){
                session.rollback();//回滚事务
            }
        }finally {
            MyBatisUtils.closeSession(session);
        }
    }

    @Test
    public void testUpdate() throws Exception{
        SqlSession session=null;
        try{
            session=MyBatisUtils.openSession();
            Goods goods=session.selectOne("goods.selectById",739);
            goods.setTitle("更新测试商品");
            int sum=session.update("goods.update",goods);
            session.commit();
        }catch (Exception e){
            throw e;
        }finally {
            MyBatisUtils.closeSession(session);
        }
    }
    @Test
    public void testDelete() throws Exception{
        SqlSession session=null;
        try{
            session=MyBatisUtils.openSession();
            int sum=session.delete("goods.delete",739);
            System.out.println(sum);
            session.commit();
        }catch (Exception e){
            throw e;
        }finally {
            MyBatisUtils.closeSession(session);
        }
    }
    @Test
    public void testSelectByTitle() throws Exception{
        SqlSession session=null;
        try{
            session=MyBatisUtils.openSession();
            Map param=new HashMap();
            param.put("title","''or 1=1 or title='【德国】爱他美婴幼儿配方奶粉1段800g*2罐 铂金版'");
            List<Goods> list= session.selectList("goods.selectByTitle",param);
            for (Goods g:list){
                System.out.println(g.getTitle()+":"+g.getCurrentPrice());
            }
        }catch (Exception e){
            throw e;
        }finally {
            MyBatisUtils.closeSession(session);
        }
    }

    @Test
    public void testDynamicSQL(){
        SqlSession session=null;
        try{
            session=MyBatisUtils.openSession();
            Map param=new HashMap();
            param.put("categoryId",44);
            param.put("currentPrice",500);
            //查询条件
            List<Goods> list= session.selectList("goods.dynamicSQL",param);
            for (Goods g:list){
                System.out.println(g.getTitle()+":"+g.getCategoryId()+g.getCurrentPrice());
            }
        }catch (Exception e){
            throw e;
        }finally {
            MyBatisUtils.closeSession(session);
        }
    }

    @Test
    public void testLevelCache() throws Exception{
        SqlSession session=null;
        try{
            session=MyBatisUtils.openSession();
            Goods goods=session.selectOne("goods.selectById",1603);
            System.out.println(goods.hashCode());
        }catch (Exception e){
            throw e;
        }finally {
            MyBatisUtils.closeSession(session);
        }
        try{
            session=MyBatisUtils.openSession();
            Goods goods=session.selectOne("goods.selectById",1603);
//            session.commit();//commit提交时对该namespace缓存强制清空
//            Goods goods1=session.selectOne("goods.selectById",1603);
            System.out.println(goods.hashCode()/**+":"+goods1.hashCode()**/);
        }catch (Exception e){
            throw e;
        }finally {
            MyBatisUtils.closeSession(session);
        }
    }

}
