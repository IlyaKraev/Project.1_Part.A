package privateSchool;

import java.sql.*;
import models.Menu;

public class PrivateSchool {

    
    private static Statement statement = null;
    private static Connection connect = null;
    private static ResultSet resultSet = null;

    public static void main(String[] args) {
        
//        Menu menu = new Menu();
        String url = "jdbc:mysql://localhost:3306/classcb12";

        String user = "root";
        String password = "54298346Ik";
        try{
// Loads Mysql driver
            Class.forName("com.mysql.cj.jdbc.Driver");

// Setup connection with db
            connect = DriverManager.getConnection(url, user, password);

// Allow to query db
            statement = connect.createStatement();

            resultSet = statement.executeQuery("select * from classcb12.people");

            while (resultSet.next()){
                System.out.println(
                        resultSet.getInt(1) + " "
                        + resultSet.getString(2) + " "
                        + resultSet.getString(3) + " "
                        + resultSet.getString(4) + " "
                        + resultSet.getString(5) + " ");

            }
            connect.close();

        }catch (Exception e){
                    System.out.println(e);
        }
    }
}
