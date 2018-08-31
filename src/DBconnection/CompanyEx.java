package DBconnection;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.math.BigDecimal;
import java.sql.*;
import java.text.DecimalFormat;

/**
 * Created by expert on 3/8/18.
 */
public class CompanyEx
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {


        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Company", "root", "ROOT");
        Statement statement = connection.createStatement();

        System.out.println("asc order of product name");

        ResultSet rs = statement.executeQuery("select * from Product order by name asc");
        while (rs.next()) {
            System.out.println(rs.getInt("idproduct") + " " + rs.getString("name"));
        }

        ResultSet rs1 = statement.executeQuery("select * from EMployee where salary>15000 and gender='Male'");

        System.out.println("\n"+"Salary grater than 15000: -");
        while (rs1.next())
        {
            System.out.println(rs1.getInt("id") + " " + rs1.getString("name"));
        }


        statement.executeUpdate("update Product set  name='newXYZ' where idproduct =2");

        ResultSet rs2 = statement.executeQuery("select * from Product");

        System.out.println("\n"+"Product filed updation: -");
        while (rs2.next())
        {
            System.out.println(rs2.getInt("idproduct") + " " + rs2.getString("name"));
        }




        CallableStatement cs= connection.prepareCall(""+"{call MAXsal(?,?)}");
        cs.registerOutParameter(1, Types.DECIMAL);
        cs.registerOutParameter(2, Types.DECIMAL);
        cs.execute();
        System.out.println("\n"+"Maximum Salary from employee");
        BigDecimal x= cs.getBigDecimal(1);// for output parametre
        System.out.println(x);
        System.out.println("\n"+"Minimum Salary from employee");
        BigDecimal y= cs.getBigDecimal(2);// for output parametre
            System.out.println(y);



    }
}
