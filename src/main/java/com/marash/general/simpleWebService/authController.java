package com.marash.general.simpleWebService;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.marash.general.simpleWebService.data.authResponse;

@RestController
public class authController {


    @RequestMapping("/authorize")
    public authResponse authorize(@RequestParam(value="username", required=true) String username, @RequestParam(value="password", required=true) String password) {
        authResponse AuthResponse = new authResponse();
        AuthResponse.setMessage("Success");
        AuthResponse.setToShow(false);
    	return AuthResponse;
    }
}
