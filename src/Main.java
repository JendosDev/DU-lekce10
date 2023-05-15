import java.awt.*;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Flowershop", "root", "Merinka2007!");

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM flower");

        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }
    }
}