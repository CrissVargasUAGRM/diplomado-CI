package com.nur.repositories.users;

import com.nur.core.BusinessRuleValidationException;
import com.nur.model.Usuario;
import com.nur.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Primary
@Repository
public class UserCrudRepositoryImpl implements IUserRepository{
    @Autowired
    private IUserCrudRepository userRepository;

    @Override
    public UUID update(Usuario user) throws BusinessRuleValidationException {
        Usuario users = new Usuario(user.getUsername(), user.getAccountType(), user.getEmail(), user.getPass());
        
        return null;
    }

    @Override
    public Usuario getById(UUID id) {
        return null;
    }
}
