package com.marash.general.simpleWebService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.marash.general.simpleWebService.data.authResponse;

@Controller
public class authController {


    @RequestMapping("/authorize")
    public authResponse authorize(@RequestParam(value="username", required=true) String username, @RequestParam(value="password", required=true) String password) {
        authResponse AuthResponse = new authResponse();
        AuthResponse.setMessage("Success");
        AuthResponse.setToShow(false);
    	return AuthResponse;
    }
    
    @RequestMapping("/login")
    public String loginPage(ModelAndView  modelAndView ){
    	return "login";
    }

}
