/*package com.cts.attendance.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cts.attendance.entity.UserCred;
import com.cts.attendance.repository.UserRepository;

@Service
public class AuthenticationService implements UserDetailsService
{
@Autowired
private UserRepository userRepository;

private static final Logger logger = LoggerFactory.getLogger(AuthenticationService.class);
//@Autowired
//private PasswordEncoder passwordEncoder;

@Override
public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    UserCred userCred = userRepository.findByLoginName(username);
    if (userCred == null) {
        throw new UsernameNotFoundException("User not found with username: " + username);
    }
    //String hashedPassword= passwordEncoder.encode(userCred.getPassword());
    logger.debug("nandhu authenticate" +userCred.getPassword());
    return User
    		.withUsername(userCred.getLoginName())
    		.password(userCred.getPassword())
    		.roles("USER")
    		.build();
}
}
*/
