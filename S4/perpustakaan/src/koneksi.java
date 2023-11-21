
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author USER
 */
public class koneksi {
    Connection koneksi=null;
    public static Connection koneksiDb(){
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/dbperpus","root","");
            return koneksi;
        }
        catch(Exception e)
        {
         JOptionPane.showMessageDialog(null,e);
         return null;
        }
        }
}
