
package Frontend.jconnection;

import java.sql.*;

public class Connector {

    public static Connection con;
    public static PreparedStatement pst;
    private static ResultSet rs;

//    static {
//        try {
//            connect();
//        } catch (Exception e) {
//        }
//    }

    public static PreparedStatement connect(String query) throws Exception {
        String url = "jdbc:mysql://localhost:3306/javaproject";
        con = DriverManager.getConnection(url, "root", "");
        pst = con.prepareStatement(query);
        System.out.println("Connected");
        return pst;
    }

    public static ResultSet getData(PreparedStatement ps) {
        try {
            rs = ps.executeQuery();
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return rs;
    }

    public static void updateData(PreparedStatement ps) {
        try {
            System.out.println(ps.executeUpdate() + "Rows affected");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }

 
}
