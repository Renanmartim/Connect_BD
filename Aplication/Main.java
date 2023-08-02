package Aplication;

import Src.DBConnect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws SQLException {

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = DBConnect.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("select * from car");

            while (rs.next()){
                System.out.println(rs.getInt("id") + " , " + rs.getDate("entry_time"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
