package jdbc;

import java.sql.*;

public class Jdbc {

    private static final String URL = "jdbc:mysql://localhost:3306/pubs?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        Jdbc jdbc = new Jdbc();
        try {
            jdbc.jdbcBasic();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }


    }


    private void jdbcBasic() throws SQLException {
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM authors");
        while (result.next()) {
            String n = result.getString("AU_FNAME");
            System.out.println(n);
        }
        statement.close();
        connection.close();

    }


}
