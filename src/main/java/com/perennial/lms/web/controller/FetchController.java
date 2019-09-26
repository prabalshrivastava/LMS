package com.perennial.lms.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class FetchController {
    @RequestMapping("/")
    public String fetchLoginPage(){
        log.debug("Inside Home Controller Serving the login page");
        return "login";
    }
    @RequestMapping("/fetchSignUp")
    public String fetchSignUp(){
        log.debug("Inside Home Controller Serving the signup page");
        return "register";
    }

    @RequestMapping("/fetchLeavePage")
    public String fetchLeaveApplication(){
        log.debug("Inside Home Controller Serving the leave page");
        return "applyLeave";
    }
}
