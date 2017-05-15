/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pm.model.User;
import pm.service.UserService;
import pm.util.StatusMessage;

/**
 *
 * @author Amine Jendoubi
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST, value = "/users")
    public StatusMessage userSave(@RequestBody User user) {
        try{
        userService.save(user);
        }catch(Exception ex){
            return new StatusMessage(false,ex.getMessage());
        }
        return new StatusMessage(true);
    }
}
