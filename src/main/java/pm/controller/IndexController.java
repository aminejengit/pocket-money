/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pm.controller;

import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Amine Jendoubi
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "home.html";
    }
    
    @RequestMapping("/private")
    public String privateArea() {
        return "private";
    }
}
