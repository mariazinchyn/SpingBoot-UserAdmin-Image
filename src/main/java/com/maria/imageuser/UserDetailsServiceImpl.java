package com.maria.imageuser;

import com.maria.imageuser.model.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private AppUserRepo appUserRepo;

    @Autowired
    public UserDetailsServiceImpl(AppUserRepo appUserRepo,
                                  PasswordEncoder passwordEncoder) {
        this.appUserRepo = appUserRepo;
       // this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return appUserRepo.findByUsername(s);
    }


}
