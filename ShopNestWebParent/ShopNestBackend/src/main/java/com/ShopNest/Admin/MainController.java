package com.ShopNest.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.service.annotation.GetExchange;

@Controller
public class MainController {
    @GetExchange("/")
    public String viewHomePage() {
        return "index";
    }
}
