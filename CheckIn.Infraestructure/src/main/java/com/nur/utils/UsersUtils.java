package com.nur.utils;

import com.nur.model.UserJpaModel;
import com.nur.model.Usuario;

public class UsersUtils {
    public static UserJpaModel userToJpaEntity(Usuario users){
        UserJpaModel model = new UserJpaModel();
        model.setId(users.getId());
        model.setAccountType(users.getAccountType());
        model.setEmail(users.getEmail());
        model.setUsername(users.getUsername());
        return model;
    }

    public static Usuario jpaToUser(UserJpaModel jpaModel){
        return new Usuario(
        );
    }
}
