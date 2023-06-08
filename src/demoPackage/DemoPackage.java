package demoPackage;
import java.sql.*;
import java.util.Map;

public class DemoPackage {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url ="jdbc:mysql://localhost:3306/backdrop";
        String uname = System.getenv("DATABASE_USERNAME");

        String pasword= System.getenv("DATABASE_PASSWORD");


int id =9;
int isVerified = 0;
String name = "EMMANUEL DEREK ";
//        String query = "INSERT into user values (8,1,'DEREK EMMANUEL')";
        String query = "INSERT into user values (?,?,?)";
        Class.forName("com.mysql.cj.jdbc.Driver");

     Connection con =   DriverManager.getConnection(url,uname,pasword);

    PreparedStatement st =con.prepareStatement(query);
st.setInt(1,id);
st.setInt(2,isVerified);
st.setString(3,name);

        var count = st.executeUpdate();
        System.out.println(count+"row/s affected");
        st.close();
con.close();

    }

//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        String url = "jdbc:mysql://localhost:3306/backdrop";
//        String uname = "root";
//        String pasword = "Derek";
//          String query = "SELECT * FROM user ";
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection con = DriverManager.getConnection(url, uname, pasword);
//
//        Statement st = con.createStatement();
//        ResultSet rs = st.executeQuery(query);
//
//        while (rs.next()) {
//            String name = rs.getInt(1) + ":" + rs.getString(2) + ":" + rs.getString(3);
//            System.out.println(name);
//
//            st.close();
//            rs.close();
//        }
//    }
}