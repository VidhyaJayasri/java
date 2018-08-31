package DBconnection;

import java.sql.*;

/**
 * Created by expert on 30/7/18.
 */
public class DBconnection
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "ROOT");
        Statement statement = connection.createStatement();

        statement.executeUpdate("insert into student values(1,'Ammu')");
        statement.executeUpdate("update student set  id=2 where name ='Vidhya'");
        statement.executeUpdate("delete from student where name='Achu'");
        ResultSet rs = statement.executeQuery("select * from student");

        while (rs.next()) {
            System.out.println(rs.getInt("id") + " " + rs.getString("name"));
        }

        PreparedStatement ps = connection.prepareStatement("insert into student values(?,?)");
        ps.setInt(1, 12);
        ps.setString(2, "Aabc");
        ps.executeUpdate();




    }
}
