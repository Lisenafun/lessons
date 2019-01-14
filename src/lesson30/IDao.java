package lesson30;

import org.sqlite.JDBC;

import java.sql.*;

//    String sql = "CREATE TABLE IF NOT EXISTS User (" +
//            "id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
//            "login TEXT NOT NULL);";
//
//    String insert = "INSERT INTO User (id, login)" + "VALUES (?, ?);";
//    String getAll = "SELECT * FROM User;";
//    String getById = "SELECT * FROM User WHERE id=?;";
//    String update = "UPDATE User SET id=?, login=? WHERE id=?";
//    String delete = "DELETE FROM User WHERE id=?;";

public interface IDao {
    void add();
//    delete();
//    update();
    void getAll();
    void getById(int id);

}
class UserDao implements IDao{
    User user;

    public UserDao(User user) {
        this.user = user;
    }

    public void createTableUser() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS User (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
                "login TEXT NOT NULL);";

        // регистрируем драйвер
        DriverManager.registerDriver(new JDBC ());

        try (Connection connection =
                     DriverManager.getConnection("jdbc:sqlite:lesson30:UserArt.db")){
            Statement statement = connection.createStatement();
            int row = statement.executeUpdate(sql);
            System.out.println(row);
        }
    }

    @Override
    public void add() {
        String insert = "INSERT INTO User (id, login)" + "VALUES (?, ?);";
        try (Connection connection = DriverManager.getConnection ("jdbc:sqlite:lesson30:UserArt.db")) {
            PreparedStatement preparedStatement =
                    connection.prepareStatement (insert);
            preparedStatement.setInt (1, user.getId ());
            preparedStatement.setString (2, user.getLogin ());
            int row = preparedStatement.executeUpdate ();
            System.out.println (row);
        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }

    @Override
    public void getAll() {
        String getAll = "SELECT * FROM User;";
        try (Connection connection =
                     DriverManager.getConnection("jdbc:sqlite:lesson30:UserArt.db")){
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(getAll);
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String login = resultSet.getString ("login");
                System.out.println("id = " + id);
                System.out.println("login = " + login);
            }
        }catch (SQLException e) {
            e.printStackTrace ();
        }
    }

    @Override
    public void getById(int id) {
        String getById = "SELECT * FROM User WHERE id=?;";
        try (Connection connection = DriverManager.getConnection ("jdbc:sqlite:lesson30:UserArt.db")) {
            PreparedStatement preparedStatement =
                    connection.prepareStatement (getById);
            preparedStatement.setInt (1, id);
            ResultSet resultSet = preparedStatement.executeQuery ();
//            while (resultSet.next()){
//                user.setId (resultSet.getInt ("id"));
//                user.setLogin (resultSet.getString ("login"));
//                int id = resultSet.getInt("id");
//                String login = resultSet.getString("login");
//                System.out.println("id = " + id);
//                System.out.println("login = " + login);
//            }
        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }
}
class ArticleDao implements IDao {
    Article article;

    public void createTableArticle() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS Article (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
                "name TEXT NOT NULL," +
                "idUser TEXT NOT NULL);";

        // регистрируем драйвер
        DriverManager.registerDriver (new JDBC ());

        try (Connection connection = DriverManager.getConnection ("jdbc:sqlite:lesson30:UserArt.db")) {
            Statement statement = connection.createStatement ();
            int row = statement.executeUpdate (sql);
            System.out.println (row);
        }
    }

    public ArticleDao(Article article) {
        this.article = article;
    }

    @Override
    public void add() {
        String insert = "INSERT INTO Article (id, login, idUser)" + "VALUES (?, ?, ?);";
        try (Connection connection = DriverManager.getConnection ("jdbc:sqlite:lesson30:UserArt.db")) {
            PreparedStatement preparedStatement =
                    connection.prepareStatement (insert);
            preparedStatement.setInt (1, article.getId ());
            preparedStatement.setString (2, article.getName ());
            preparedStatement.setInt (3, article.getIdUser ());
            int row = preparedStatement.executeUpdate ();
            System.out.println (row);
        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }

    @Override
    public void getAll() {
        String getAll = "SELECT * FROM Article;";
        try (Connection connection =
                     DriverManager.getConnection("jdbc:sqlite:lesson30:UserArt.db")){
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(getAll);
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String login = resultSet.getString ("login");
                int idUser = resultSet.getInt ("idUser");
                System.out.println("id = " + id);
                System.out.println("login = " + login);
                System.out.println("idUser = " + idUser);
            }
        }catch (SQLException e) {
            e.printStackTrace ();
        }
    }

    @Override
    public void getById(int id) {

    }
}