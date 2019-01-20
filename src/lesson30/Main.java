package lesson30;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        User user1 = new User (1,"one");
        User user2 = new User(2,"two");
        User user3 = new User(3,"three");
        Article article1 = new Article (1,"first",user1);
        Article article2 = new Article (2,"second",user3);
        Article article3 = new Article (3,"third",user1);

        UserDao userDao = new UserDao ();
        userDao.createTable ();
//        userDao.add (user1);
//        userDao.add (user2);
//        userDao.add (user3);
        userDao.getAll (user1);
        userDao.getById (1);

        ArticleDao articleDao = new ArticleDao ();
//        articleDao.createTable ();
//        articleDao.add (article1);
//        articleDao.add (article2);
//        articleDao.add (article3);
        articleDao.getAll (article1);
        articleDao.getById (2);
    }
}
