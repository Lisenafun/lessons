package lesson30;

import org.sqlite.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlConnection {

    public SqlConnection() {
    }

    public void doConnection(String sql) throws SQLException {
        DriverManager.registerDriver (new JDBC ());

        try (Connection connection = DriverManager.getConnection ("jdbc:sqlite:lesson30:UserArt.db")) {
            Statement statement = connection.createStatement ();
            int row = statement.executeUpdate (sql);
            System.out.println (row);
        }
    }
}
