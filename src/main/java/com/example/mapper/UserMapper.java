package com.example.mapper;

import com.example.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User findUserById(Long userID);

    void updateTempAlbumID(Long userID,int albumID);
}
