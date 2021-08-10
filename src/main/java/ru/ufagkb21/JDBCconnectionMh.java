package ru.ufagkb21;

import java.sql.*;

public class JDBCconnectionMh {

    public static void main(String[] args) throws ClassNotFoundException {
        String userName = "root";
        String password = "#)1180Aidar";
        String connectionUrl = "jdbc:mysql://localhost:3306/medical_history";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
             Statement statement = connection.createStatement()) {
            //statement.executeUpdate("CREATE TABLE Mh_department (id_otd INTEGER NOT NULL AUTO_INCREMENT, otd_name VARCHAR(40) NOT NULL, otd_numberPhone VARCHAR(4), otd_zav VARCHAR(40), PRIMARY_key(id_otd))");

            ResultSet resultSet = statement.executeQuery("SELECT * FROM Mh_users");
            while (resultSet.next()) {
                System.out.print(resultSet.getInt(1) + " ");
                System.out.print(resultSet.getString(2) + " ");
                System.out.print(resultSet.getString(3) + " ");
                System.out.print(resultSet.getString(5) + " ");
                System.out.println();
            }

            System.out.println("we're connected");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
