import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.*;

public class DB2 
{
    Connection con =null;
    public static Connection ConnectDB()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\RichaDesai\\Desktop\\IDF2.sqlite");
            JOptionPane.showMessageDialog(null, "ConnectionEstablished");
            return con;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        return null;    
    }
    public static void main(String args[])
    {
        ConnectDB();
    }
}
