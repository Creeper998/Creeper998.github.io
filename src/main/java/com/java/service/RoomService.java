package com.java.service;

import com.java.Mapper.AdmMapper;
import com.java.Mapper.RoomMapper;
import com.java.Mapper.UserMapper;
import com.java.pojo.Adm;
import com.java.pojo.Room;
import com.java.pojo.User;
import com.java.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class RoomService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    /*
     * 查询所有
     * @return
     * */
    public List<Room> selectAll(){
        //调用BrandMapper.selectAll()

        //SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();
        //获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //获取代理对象
        RoomMapper mapper = sqlSession.getMapper(RoomMapper.class);
        //调用代理对象的方法
        List<Room> list = mapper.selectAll();
        //关闭资源
        sqlSession.close();

        return list;

    }

    public void update(Room room){
        SqlSession sqlSession = factory.openSession();
        RoomMapper mapper = sqlSession.getMapper(RoomMapper.class);
        //Room room1 = mapper.selectByUsername(room.getUsername());

        mapper.update(room);
        //提交事务
        sqlSession.commit();

        //关闭资源
        sqlSession.close();
    }

    public boolean update(Room room,String id){
        SqlSession sqlSession = factory.openSession();
        RoomMapper mapper = sqlSession.getMapper(RoomMapper.class);
        //Room room1 = mapper.selectByUsername(room.getUsername());
        UserMapper mapper1 = sqlSession.getMapper(UserMapper.class);
        User user = mapper1.selectById(id);
        if(user==null) {
            mapper.update(room);
            //提交事务
            sqlSession.commit();
        }
        //关闭资源
        sqlSession.close();
        return user==null;
    }

    public Room selectByRoomN(Integer roomN){
        //调用BrandMapper.selectAll()
        //SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();
        //获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //获取代理对象
        RoomMapper mapper = sqlSession.getMapper(RoomMapper.class);
        Room room = mapper.selectByRoomN(roomN);
        //关闭资源
        sqlSession.close();
        return room;

    }

    public boolean RoomInsert(Room room){
        SqlSession sqlSession = factory.openSession();
        RoomMapper mapper = sqlSession.getMapper(RoomMapper.class);
        Room room1 = mapper.selectByRoomN(room.getRoomN());
        if(room1==null) {
            mapper.insertRoom(room);
            sqlSession.commit();
        }
        //关闭资源
        sqlSession.close();
        return room1==null;
    }

    public void roomDelete(String roomN){
        //获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //获取代理对象
        RoomMapper mapper = sqlSession.getMapper(RoomMapper.class);
        //调用代理对象的方法
        mapper.roomDelete(roomN);
        //提交事务
        sqlSession.commit();
        //关闭资源
        sqlSession.close();
    }

    public List<Room> roomSelect(Room room){
        //获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //获取代理对象
        RoomMapper mapper = sqlSession.getMapper(RoomMapper.class);
        //调用代理对象的方法
        System.out.println("service,room:"+room);
        List<Room> select = mapper.select(room);

        System.out.println("service,select:"+select);
        //关闭资源
        sqlSession.close();

        return select;
    }
}
