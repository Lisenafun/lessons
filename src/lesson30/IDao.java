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

public interface IDao<T> {

    void add(T t);
    void getAll(T t);
    void getById(int id);
    //    delete();
    //    update();
    }

