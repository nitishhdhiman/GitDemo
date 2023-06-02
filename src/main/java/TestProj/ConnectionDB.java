package TestProj;

import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ConnectionDB {
    public static void main(String[] args) throws SQLException {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        String url="URL of database/dbName";
        String username="defaultUsername";
        String password="password";
        Connection connection= DriverManager.getConnection(url,username,password);
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("select * from tableName");
        while(resultSet.next()){
            System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2));
        }
        connection.close();
    }
}