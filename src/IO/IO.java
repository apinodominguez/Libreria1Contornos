package IO;


import java.util.Scanner;
import javax.swing.JOptionPane;

public class IO {

public static final int CONSOLA = 1;
public static final int VENTANA = 2;
private static int numero;
private static String texto;
  
public static int introducir(int tipo, String msg, int num){
    Scanner ler = new Scanner(System.in); 
    switch (tipo){
       case CONSOLA:
        System.out.println(msg);
        num = ler.nextInt();
        break;
       case VENTANA:
        num = Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
return numero = num;    
}

public static String introducir(int tipo, String msg, String txt){
    Scanner ler = new Scanner(System.in); 
    switch (tipo){
       case CONSOLA:
        System.out.println(msg);
        txt = ler.next();
        break;
       case VENTANA:
        txt =JOptionPane.showInputDialog(msg);
    }
return texto = txt;    
}

public static void mostrar(int numero, int tipo){
    switch (tipo){
       case CONSOLA:
           System.out.println("Tu edad es la siguiente:: " + numero);
       break;
       case VENTANA:
           JOptionPane.showMessageDialog(null, "Tu edad es la siguiente: " + numero);
    }
}

public static void mostrar(String msg, int tipo){
    switch (tipo){
        case CONSOLA:
            System.out.println(msg);
        break;
        case VENTANA:
            JOptionPane.showMessageDialog(null, msg);
    }
}

}
