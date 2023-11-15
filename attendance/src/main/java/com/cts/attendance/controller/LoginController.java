/*package com.cts.attendance.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.attendance.dto.LoginRequest;
import com.cts.attendance.service.AuthenticationService;

@RestController

public class LoginController {
	
	@Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private AuthenticationService authenticationService;

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
    @GetMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
    	logger.debug("nandhu warning");
       UserDetails userDetails = authenticationService.loadUserByUsername(loginRequest.getLoginName());
       UsernamePasswordAuthenticationToken authenticationToken =
               new UsernamePasswordAuthenticationToken(userDetails, loginRequest.getPassword(), userDetails.getAuthorities());
       logger.debug("nandhu ui password" +loginRequest.getPassword());
        Authentication authentication = authenticationManager.authenticate(authenticationToken);

       
    	//Authentication authentication= SecurityContextHolder.getContext().getAuthentication();

        return ResponseEntity.ok("Login successful. Welcome, " + authentication.getName() + "!");
    }
}
*/