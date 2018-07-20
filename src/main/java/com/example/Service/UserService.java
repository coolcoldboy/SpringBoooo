package com.example.Service;

import com.example.model.User;

public interface UserService {
    User findUserById(Long id);
    int updateTempAlbumID(Long id);
}
