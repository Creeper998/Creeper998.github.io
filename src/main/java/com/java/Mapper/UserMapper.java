package com.java.Mapper;

import com.java.pojo.Room;
import com.java.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Insert("insert into user values(#{id},#{username},#{tel},#{roomN})")
    void insert(User user);

    void updateUser(User user);

    @Select("select * from user")
    List<User> userSelectAll();


    @Select("select * from user where id=#{id}")
    User selectById(String id);

    @Delete("delete from user where id=#{id};")
    void userDelete(String id);


    List<User> select(User user);

}
