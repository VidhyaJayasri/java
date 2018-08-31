package DBconnection;

import java.sql.*;

/**
 * Created by expert on 31/7/18.
 */
public class DBEx
        {

            public static void main(String[] args) throws ClassNotFoundException, SQLException
            {
                 Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "ROOT");
                PreparedStatement ps=connection.prepareStatement("select * from student where id=?");
                ps.setInt(1,2);
              //  ps.setString(1,"Vidhya");
             ResultSet rs=   ps.executeQuery();
                if(rs.next())
                {
                    System.out.println(rs.getString(1)+" " +rs.getString(2));
                }


            }
}
