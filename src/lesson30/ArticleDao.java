package lesson30;

import java.sql.*;

class ArticleDao extends GenlDao<Article> {
    Article article;

    public void createTable(){
        String sql = "CREATE TABLE IF NOT EXISTS Article (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
                "name TEXT NOT NULL," +
                "idUser TEXT NOT NULL);";
        try {
            new SqlConnection ().doConnection (sql);
        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }

    @Override
    public void add(Article article) {
        String insert = "INSERT INTO Article (id, name, idUser)" + "VALUES (?, ?, ?);";
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
    public void getAll(Article article) {
        super.getAll (article);
    }

    @Override
    public void getById(int id) {
        String getById = "SELECT * FROM Article WHERE id=" + id;
        try (Connection connection = DriverManager.getConnection ("jdbc:sqlite:lesson30:UserArt.db")) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(getById);
            while (resultSet.next()){
                System.out.println ("id= " + id + "\n" + "name= " + resultSet.getString ("name") +
                "\n" + "idUser= " + resultSet.getInt ("idUser"));
            }
        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }
}
