package by.itacademy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class User {

    public int user_id;
    public String username;
    public String password;
    public String email;
    public String last_login;

}
