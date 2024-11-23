/**
 * Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 * 1/10 , 2/11 , 3/12 , 4/13, 5/14 , 6/15 
 * @author kleiv
 */
import java.util.Scanner;
public class Problema1_SerieNumeros {
    public static void main(String[] args) {
        int cont = 1, limite;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Dame limite: ");
        limite = tcl.nextInt();
        while (cont <= limite) {            
            System.out.print(cont + "/" + (cont+9) + ", ");
            cont++;
        }
    }
    /***
     * Dame limite: 10
     1/10, 2/11, 3/12, 4/13, 5/14, 6/15, 7/16, 8/17, 9/18, 10/19,
     */
}
