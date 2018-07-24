package com.example.Service.impl;

import com.example.Service.UserService;
import com.example.mapper.UserMapper;
import com.example.model.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
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

        try {
            UserMapper userMapper2 = sqlSession.getMapper(UserMapper.class);
            int ret = userMapper2.updateTempAlbumID(id, 10);
            User user = userMapper2.findUserById(id);
            System.out.println(user.getUserID() + ";" + user.getUserName());
            return ret;
        } catch (Exception e) {
            throw  e;
        }

    }
}
