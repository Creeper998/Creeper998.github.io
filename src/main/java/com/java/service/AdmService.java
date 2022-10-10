package com.java.service;

import com.java.Mapper.AdmMapper;
import com.java.pojo.Adm;
import com.java.pojo.User;
import com.java.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class AdmService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    public Adm login(String admName, String password){
        SqlSession sqlSession = factory.openSession();
        //获取代理对象
        AdmMapper mapper = sqlSession.getMapper(AdmMapper.class);

        Adm adm = mapper.select(admName, password);

        sqlSession.close();

        return adm;
    }

}
