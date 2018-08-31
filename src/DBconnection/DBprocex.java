package DBconnection;

import com.sun.xml.internal.ws.wsdl.writer.document.*;

import java.lang.reflect.Type;
import java.sql.*;
import java.sql.Types;

/**
 * Created by expert on 2/8/18.
 */
public class DBprocex
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "ROOT");
        CallableStatement cs= connection.prepareCall(""+"{call getEMPLOYEE(?,?,?)}");
        cs.setInt(1,250);
        cs.setString(2,"Vidhya");
        cs.registerOutParameter(3, Types.INTEGER);
        cs.execute();
        int x= cs.getInt(3);// for output parametre
       // ResultSet rsl= cs.getResultSet();
        //while (rsl.next())
       // {
            System.out.println(x);
        //}

connection.close();
    }
}
