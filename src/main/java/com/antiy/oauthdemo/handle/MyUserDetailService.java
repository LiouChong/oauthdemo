package com.antiy.oauthdemo.handle;

import com.antiy.oauthdemo.pojo.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Author: Liuchong
 * Description: 用户验证类
 * date: 2019/8/23 16:43
 */
@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        MyUser myUser = new MyUser();
        myUser.setUserName(s);
        myUser.setPassword(this.passwordEncoder.encode("123456"));

        return new User(s, myUser.getPassword(), myUser.isEnabled(),
                myUser.isAccountNonExpired(), myUser.isCredentialsNonExpired(),
                myUser.isAccountNonLocked(), AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
