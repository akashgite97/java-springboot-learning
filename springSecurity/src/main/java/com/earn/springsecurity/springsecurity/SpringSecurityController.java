package com.earn.springsecurity.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityController {
    
    @GetMapping("/home")
    public String home(){
        return("<h1>Spring Security Learning</h1>");
    }
}
