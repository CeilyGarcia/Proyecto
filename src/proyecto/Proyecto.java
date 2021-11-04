package proyecto;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Ceily
 */
public class Proyecto {
   Connection conectar = null;
   public Connection conexion()
   {
       try {
           Class.forName("com.mysql.jdbc.Driver");
           conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto", "root", "");
           System.out.print("Conexion aceptada");
       } catch (Exception e) {
           System.out.print("mesaje de error" + e);
           JOptionPane.showMessageDialog(null, "No se puede conectar");
       }
       return conectar;
   }

    java.sql.Connection conectar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
