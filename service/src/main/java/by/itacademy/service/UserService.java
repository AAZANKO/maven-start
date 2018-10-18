package by.itacademy.service;

import by.itacademy.dao.UserDAO;
import by.itacademy.entity.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserService {

    public User getUserService(int id){

        User user = new User();

        UserDAO userDAO = new UserDAO();

        user = userDAO.getUserDAO(id);

        return user;
    }

}
