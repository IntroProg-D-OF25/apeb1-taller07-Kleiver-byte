/**
 *Realizar un programa Java que permita pedir por teclado el nombre de 5 empleados. 
 * Por cada empleado se debe solicitar el nombre, numero de días trabajados y costo del día trabajo. 
 * Calcular el valor a cancelar por la empresa para cada empleado. Presentar un reporte como el siguiente:
 * Nombre 1 	10 	$2.5 	$25
 * Nombre 2 	11 	$2 	$22
 * Nombre 3 	9 	$3 	$27
 * Nombre 4 	5 	$4 	$20
 * Nombre 5 	12 	$2 	$24
 * @author Kleiver Pasaca
 */
import java.util.Scanner;
public class Problema3_Empleados {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nomEmplaeado;
        double costoDia, valorCancelar, numdia;
        int cont = 1;
        while (cont <= 5) {            
            System.out.println("INGRESE NOMBRE, NUMERO DE DIAS TRABAJADOS Y COSTO POR DIA: ");
            nomEmplaeado = tcl.next();
            numdia = tcl.nextDouble();
            costoDia = tcl.nextDouble();
            valorCancelar = numdia * costoDia;
            System.out.println("NOMBRE\t\tDIAS_TRABAJADOS\t\tCOSTO_DIA\tVALOR_CANCELAR");
            System.out.println(nomEmplaeado + "\t\t" + numdia + "\t\t\t$" + costoDia + "\t\t$" + valorCancelar);
            cont ++;
        }
    }/***
     * run:
INGRESE NOMBRE, NUMERO DE DIAS TRABAJADOS Y COSTO POR DIA: 
David 10 2.5
NOMBRE		DIAS_TRABAJADOS		COSTO_DIA	VALOR_CANCELAR
David		10.0			$2.5		$25.0
INGRESE NOMBRE, NUMERO DE DIAS TRABAJADOS Y COSTO POR DIA: 
Kleiver 5 3
NOMBRE		DIAS_TRABAJADOS		COSTO_DIA	VALOR_CANCELAR
Kleiver		5.0			$3.0		$15.0
INGRESE NOMBRE, NUMERO DE DIAS TRABAJADOS Y COSTO POR DIA: 
Jose 7 2.5
NOMBRE		DIAS_TRABAJADOS		COSTO_DIA	VALOR_CANCELAR
Jose		7.0			$2.5		$17.5
INGRESE NOMBRE, NUMERO DE DIAS TRABAJADOS Y COSTO POR DIA: 
Eimer 3 5
NOMBRE		DIAS_TRABAJADOS		COSTO_DIA	VALOR_CANCELAR
Eimer		3.0			$5.0		$15.0
INGRESE NOMBRE, NUMERO DE DIAS TRABAJADOS Y COSTO POR DIA: 
Agustin 10 5
NOMBRE		DIAS_TRABAJADOS		COSTO_DIA	VALOR_CANCELAR
Agustin		10.0			$5.0		$50.0
     */
}

