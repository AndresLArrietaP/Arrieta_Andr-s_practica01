
package practica01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {  
    Scanner consola=new Scanner(System.in);
    Tarjeta1 DatTarjeta=new Tarjeta1();
    Usuario DatUsuario=new Usuario();
    System.out.println("Bienvenido, proporcione los datos correspondientes: \n");
    System.out.println("Ingrese apellido paterno: \n");
        DatUsuario.setPaterno(consola.nextLine());
    System.out.println("Ingrese apellido materno: \n");
        DatUsuario.setMaterno(consola.nextLine());
    System.out.println("Ingrese sus nombres: \n");
        DatUsuario.setNombres(consola.nextLine());
    System.out.println("Especifique el tipo de documento: \n");
        DatUsuario.setTipoDocumento(consola.nextLine());
    System.out.println("Ingrese el número del documento seleccionado: \n");
        DatUsuario.setDocumento(consola.nextLine());
    System.out.println("\n");
    System.out.flush();
    System.out.println("\n");
    System.out.println("Registro de nueva tarjeta \n");
    System.out.println("Digite 4 dígitos identificadores de la tarjeta: ");
        DatTarjeta.setNumero(consola.nextInt());
    }
   
}
