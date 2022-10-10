package com.java.service;

import com.java.Mapper.RoomMapper;
import com.java.Mapper.UserMapper;
import com.java.pojo.Room;
import com.java.pojo.User;
import com.java.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    public boolean insert(User user){
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user1 = mapper.selectById(user.getId());
        System.out.println("id是"+user.getId());
        if(user1==null) {
            mapper.insert(user);
            sqlSession.commit();
        }
        //关闭资源
        sqlSession.close();
        return user1==null;
    }


    public void updateUser(User user){
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(user);
        mapper.updateUser(user);
        sqlSession.commit();
        sqlSession.close();
    }

    public List<User> UserSelectAll(){
        SqlSession sqlSession = factory.openSession();
        //获取代理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        //调用代理对象的方法
        List<User> list = mapper.userSelectAll();
        //关闭资源
        sqlSession.close();

        return list;
    }

    public User selectById(String id){
        //调用BrandMapper.selectAll()

        //SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();
        //获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //获取代理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //调用代理对象的方法
        User brand = mapper.selectById(id);
        //关闭资源
        sqlSession.close();

        return brand;

    }

    public void userDelete(String id){
        //获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //获取代理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);


        //调用代理对象的方法
        mapper.userDelete(id);
        //提交事务
        sqlSession.commit();
        //关闭资源
        sqlSession.close();
    }


    public List<User> userSelect(User user){
        //获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //获取代理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //调用代理对象的方法

        List<User> select = mapper.select(user);

        //关闭资源
        sqlSession.close();

        return select;
    }


}
