package lesson30;

import java.lang.reflect.Field;
import java.sql.*;

abstract class GenlDao<T> implements IDao<T> {

    @Override
    public void add(T t) {

    }

    @Override
    public void getAll(T t) {
        StringBuilder inConsole = new StringBuilder ();
        Class<?> tClass = t.getClass ();
        String nameTable = tClass.getSimpleName ();
        String getAll = "SELECT * FROM " + nameTable.toUpperCase () + ";";
        try (Connection connection =
                     DriverManager.getConnection("jdbc:sqlite:lesson30:UserArt.db")){
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(getAll);

            while (resultSet.next()){
                Field[] declaredFields = tClass.getDeclaredFields ();
                String[] nameField = new String[declaredFields.length];
                Object[] objFields = new Object[declaredFields.length];
                for (int i = 0; i < declaredFields.length; i++) {
                    declaredFields[i].setAccessible (true);
                    nameField[i] = declaredFields[i].getName ();
                    try {
                            objFields[i] = declaredFields[i].get (t);
                    } catch (IllegalAccessException e) {
                            e.printStackTrace ();
                    }
                    if(objFields[i].getClass ().equals (Integer.class)){
                        inConsole.append (nameField[i]).append (" = ").append (resultSet.getInt (nameField[i])).append ("\n");
                    }else if(objFields[i].getClass ().equals (String.class)){
                        inConsole.append (nameField[i]).append (" = ").append (resultSet.getString (nameField[i])).append ("\n");
                    }
                }
            }
        }catch (SQLException e) {
            e.printStackTrace ();
        }
        System.out.println (inConsole.toString ());
    }

    @Override
    public void getById(int id) {

    }
}
