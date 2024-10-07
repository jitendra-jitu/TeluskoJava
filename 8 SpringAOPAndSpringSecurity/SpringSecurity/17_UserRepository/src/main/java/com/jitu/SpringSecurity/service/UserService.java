package com.jitu.SpringSecurity.service;


import com.jitu.SpringSecurity.dao.UserRepo;
import com.jitu.SpringSecurity.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserService implements UserDetailsService {


    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = repo.findByUsername(username);

        if(user==null){
            System.out.println("404 not found");
            throw new UsernameNotFoundException("404 not found"+username);

        }
        return user;
    }
}
