package ru.ufagkb21;

import java.sql.*;

public class JDBCconnectionMh {
    private String userName = "root";
    private String password = "#)1180Aidar";
    private String connectionUrl = "jdbc:mysql://localhost:3306/medical_history";


    public void addUser (String login, String userPassword, String userEmail, String userFullName) throws ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
             Statement statement = connection.createStatement()) {
            statement.executeUpdate("INSERT INTO users () values (login, userPassword)")
            //INSERT INTO users (login, pass) values('TestUser', '123456')




            statement.executeUpdate("drop TABLE mh_casehistory " );


//            ResultSet resultSet = statement.executeQuery("SELECT * FROM Mh_users");
//            while (resultSet.next()) {
//                System.out.print(resultSet.getInt(1) + " ");
//                System.out.print(resultSet.getString(2) + " ");
//                System.out.print(resultSet.getString(3) + " ");
//                System.out.print(resultSet.getString(5) + " ");
//                System.out.println();
//            }

            System.out.println("have a connect");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
