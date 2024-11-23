/**
 *Una empresa de comercialización de computadoras realiza el proceso de venta haciendo un descuento por tipo de cliente: 
 * Si es cliente tipo 1 hay un descuento del 10% Si es cliente tipo 2 hay un descuento del 20% 
 * En caso que sea otro tipo de cliente, no hay descuento. 
 * Generar un proceso que permita ingresar 7 ventas: por cada venta preguntar los siguiente datos: 
 * Nombre del cliente
 * Costo de la computadora (solo se vende una computadora por transacción)
 * Tipo de cliente Presentar el siguiente reporte: Cliente tipo 1, compra computadora con precio $100
 * @author kleiv
 */
import java.util.Scanner;
public class Problema6_Comercializacion {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nomcl;
        double costoPc, cont = 1, descuento = 0, costf;
        int tipocl;
        while (cont <= 7) {            
            System.out.print("DAME NOMBRE, COSTO PC, TIPO CLIENTE ( 1 o 2): ");
            nomcl = tcl.next();
            costoPc = tcl.nextDouble();
            tipocl = tcl.nextInt();
            if (tipocl == 1)
                descuento = costoPc * 0.1;
            else if (tipocl == 2)
                descuento = costoPc * 0.2;
            costf = costoPc-descuento;
            System.out.println("NOMBRE\t\tCOSTO PC\tTIPO CLIENTE\tCOSTO FINAL");
            System.out.println(nomcl + "\t\t$" + costoPc + "\t\t" + tipocl + "\t\t$" + costf);
            cont ++;
        }
    }
}
/***
 * run:
DAME NOMBRE, COSTO PC, TIPO CLIENTE ( 1 o 2): Kleiver 10 1
NOMBRE		COSTO PC	TIPO CLIENTE	COSTO FINAL
Kleiver		$10.0		1		$9.0
DAME NOMBRE, COSTO PC, TIPO CLIENTE ( 1 o 2): Jose 20 2
NOMBRE		COSTO PC	TIPO CLIENTE	COSTO FINAL
Jose		$20.0		2		$16.0
DAME NOMBRE, COSTO PC, TIPO CLIENTE ( 1 o 2): Fausto 15 1
NOMBRE		COSTO PC	TIPO CLIENTE	COSTO FINAL
Fausto		$15.0		1		$13.5
DAME NOMBRE, COSTO PC, TIPO CLIENTE ( 1 o 2): Alexandra 50 2
NOMBRE		COSTO PC	TIPO CLIENTE	COSTO FINAL
Alexandra		$50.0		2		$40.0
DAME NOMBRE, COSTO PC, TIPO CLIENTE ( 1 o 2): Angelita 60 1
NOMBRE		COSTO PC	TIPO CLIENTE	COSTO FINAL
Angelita		$60.0		1		$54.0
DAME NOMBRE, COSTO PC, TIPO CLIENTE ( 1 o 2): Agustin 50 2
NOMBRE		COSTO PC	TIPO CLIENTE	COSTO FINAL
Agustin		$50.0		2		$40.0
DAME NOMBRE, COSTO PC, TIPO CLIENTE ( 1 o 2): Josefina 35 1
NOMBRE		COSTO PC	TIPO CLIENTE	COSTO FINAL
Josefina		$35.0		1		$31.5
 */
