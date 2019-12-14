package com.smart.iee.uz.smart.home;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

        @GetMapping("/")
        public String home(Model model) {
            logger.info("show home page");
            model.addAttribute("content", "home/home");
            return "layout";
        }

}
