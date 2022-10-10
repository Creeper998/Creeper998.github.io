package com.java.Mapper;

import com.java.pojo.Adm;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface AdmMapper {

    /*
    * 根据管理员名和密码查询
    * */

    @Select("select * from adm where admName=#{admName} and password = #{password}")
    Adm select(@Param("admName") String admName, @Param("password")  String password);

}
