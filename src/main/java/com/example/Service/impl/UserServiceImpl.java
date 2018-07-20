package com.example.Service.impl;

import com.example.Service.UserService;
import com.example.mapper.UserMapper;
import com.example.model.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private SqlSession sqlSession;

    @Override
    public User findUserById(Long id) {

        return userMapper.findUserById(id);
    }

    @Override
    public int updateTempAlbumID(Long id) {
        int ret = userMapper.updateTempAlbumID(id,2);
//        sqlSession.commit();
        return ret;
    }
}
