package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/university_management";
    private static final String USER = "root";
    private static final String PASSWORD = "Shitlamaa@8989";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
