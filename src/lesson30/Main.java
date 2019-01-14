package lesson30;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        User user1 = new User (1,"one");
        User user2 = new User(2,"two");
        Article article1 = new Article (1,"first",user1.getId ());

        UserDao userDao = new UserDao (user2);
//        userDao.createTableUser ();
//        userDao.add ();
//        userDao.getAll ();
        userDao.getById (1);
    }
}
