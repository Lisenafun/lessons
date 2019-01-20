package lesson30;

import java.sql.*;

class UserDao extends GenlDao<User> {
    User user;

    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS User (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
                "login TEXT NOT NULL);";
        try {
            new SqlConnection ().doConnection (sql);
        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }

    @Override
    public void add(User user) {
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
    public void getAll(User user) {
        super.getAll (user);
    }

    @Override
    public void getById(int id) {
        String getById = "SELECT * FROM User WHERE id=" + id;
        try (Connection connection = DriverManager.getConnection ("jdbc:sqlite:lesson30:UserArt.db")) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(getById);
            while (resultSet.next()){
                System.out.println ("id= " + id + "\n" + "login= " + resultSet.getString ("login"));
            }
        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }
}
