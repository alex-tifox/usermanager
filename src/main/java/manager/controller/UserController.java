package manager.controller;

import manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserController {

    @Autowired
    UserService userService;

}
