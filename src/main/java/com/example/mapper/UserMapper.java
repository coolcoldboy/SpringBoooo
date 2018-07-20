package com.example.mapper;

import com.example.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    User findUserById(Long userID);

    int updateTempAlbumID(@Param(value = "userID") Long userID, @Param(value = "albumID") int albumID);
}
