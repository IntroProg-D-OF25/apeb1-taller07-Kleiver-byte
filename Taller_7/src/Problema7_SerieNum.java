/**
 *Generar e imprimir la siguiente serie:
 * sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 * @author kleiv
 */
import java.util.Scanner;
public class Problema7_SerieNum {
        public static void main(String[] args) {
        int cont = 1, limite;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Dame limite: ");
        limite = tcl.nextInt();
        while (cont <= limite) {  
            if ((cont%2)== 1) {
                System.out.print("-(1/"+cont+")");                
            }
            else
                System.out.print("+(1/"+cont+")");
            cont++;
        }
    }
}
