package by.itacademy.dao;

//import by.itacademy.dao.ConnectionManager;

import by.itacademy.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Data
@NoArgsConstructor
public class UserDAO {

    public User getUserDAO(int id){

        User user;
        user = null;

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            //Connection connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            Connection connection = ConnectionManager.getConnection();
            PreparedStatement preparedstatement = connection.prepareStatement("select user_id, username, password, email, last_login from home.account where user_id = ?");
            preparedstatement.setLong(1, id);
            ResultSet resultSet = preparedstatement.executeQuery();
            while (resultSet.next()) {
                user = new User();
                user.setUser_id(Integer.parseInt(resultSet.getString("user_id")));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                user.setEmail(resultSet.getString("email"));
                user.setLast_login(resultSet.getString("last_login"));
            }
            resultSet.close();
            preparedstatement.close();
            connection.close();
        } catch (
                SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

}
