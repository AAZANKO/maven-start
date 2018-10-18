package by.itacademy.web;

import by.itacademy.entity.User;
import by.itacademy.service.UserService;

public class Start {

    public static void main(String[] args) {

        UserService userService = new UserService();

        User user = new User();

        user = userService.getUserService(1);

        System.out.println(user.getUser_id()+" "+user.getUsername()+" "+user.getPassword());

    }
}
