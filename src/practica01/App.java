
package practica01;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {  
    Scanner consola=new Scanner(System.in);
    Tarjeta1 DatTarjeta=new Tarjeta1();
    Usuario DatUsuario=new Usuario();
    JOptionPane.showMessageDialog(null,"Bienvenido, proporcione los datos correspondientes: \n");
    String Paterno=JOptionPane.showInputDialog("Ingrese apellido paterno: \n");
    String Materno=JOptionPane.showInputDialog("Ingrese apellido materno: \n");
    String Nombres=JOptionPane.showInputDialog("Ingrese sus nombres: \n");
    String TipoDocumento=JOptionPane.showInputDialog("Especifique el tipo de documento: \n");
    String Documento=JOptionPane.showInputDialog("Ingrese el número del documento seleccionado: \n");

    System.out.flush();

    JOptionPane.showMessageDialog(null,"Registro de nueva tarjeta: \n");
    int Numero=Integer.parseInt(JOptionPane.showInputDialog("Digite 4 dígitos identificadores de la tarjeta: \n"));
    boolean Activo=Boolean.parseBoolean(JOptionPane.showInputDialog("¿Desea que se encuentre activa la tarjeta?: \n"));
    System.out.flush();
    if(Activo=true){
    JOptionPane.showMessageDialog(null,"Apellido paterno: " +Paterno+"\n"+"Apellido materno: " +Materno+"\n"+"Nombres: " +Nombres+"\n"+"Tipo de documento: " +TipoDocumento+"\n"+"Número de documento: " +Documento+"\n\n"+"Número de tarjeta: "+Documento+Numero+"\n"+"Saldo: "+0+"\n"+"Estado: Activo");
    }else{
    JOptionPane.showMessageDialog(null,"Apellido paterno: " +Paterno+"\n"+"Apellido materno: " +Materno+"\n"+"Nombres: " +Nombres+"\n"+"Tipo de documento: " +TipoDocumento+"\n"+"Número de documento: " +Documento+"\n\n"+"Número de tarjeta: "+Documento+Numero+"\n"+"Saldo: "+0+"\n"+"Estado: Inactivo");    
    }
    }
   
}
