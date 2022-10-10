package com.java.Mapper;

import com.java.pojo.Room;
import com.java.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RoomMapper {

    @Select("select * from room")
    List<Room> selectAll();

    /*@Select("select * from room limit #{count}")
    List<Room> selectI(int count);*/

    //Room select(int roomN,String roomClass,String roomStatus,int bedN,String money,String username);

    @Select("select * from room where roomN=(select username from user where room.roomN=user.roomN)")
    Room selectByUsername(String username);

    @Select("select * from room where roomN=#{roomN}")
    Room selectByRoomN(Integer roomN);

    void update(Room room);

    @Insert("insert into room values (#{roomN},#{roomClass},#{roomStatus},#{bedN},#{money},#{username});")
    void insertRoom(Room room);

    @Delete("delete from room where roomN=#{roomN};")
    void roomDelete(String roomN);


    List<Room> select(Room room);
}
