package com.springsource.samples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {

    private Logger logger = LoggerFactory.getLogger(WelcomeController.class);


    @RequestMapping(method = RequestMethod.GET)
    public void welcome() {

        logger.info("Welcome!");
    }
}
