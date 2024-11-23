/** 
 *Generar un programa Java que permita ingresar 4 estudiantes; por cada uno de 
 * ellos ingresar el nombre del estudiante, el promedio de ciclo. Presentar el siguiente reporte
 * Estudiante 1 	10 	Aprobado
 * Estudiante 2 	6.9 	Reprobado
 * Estudiante 3 	7 	Aprobado
 * Estudiante 4 	5 	Reprobado
 * @author kleiv
 */
import java.util.Scanner;
public class Problema5_PromedioEstudiante {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nomEstudiante, estado;
        double promedio, cont = 1;
        while (cont <= 4) {            
            System.out.print("DAME NOMBRE Y PROMEDIO: ");
            nomEstudiante = tcl.next();
            promedio = tcl.nextDouble();
            estado = (promedio>=7)? "APROBADO" : "REPROBADO" ;
            System.out.println("NOMBRE\tPROMEDIO\tESTADO");
            System.out.println(nomEstudiante + "\t" + promedio + "\t\t" + estado);
            cont ++;
        }
    }
}/***
 * DAME NOMBRE Y PROMEDIO: David 5
NOMBRE	PROMEDIO	ESTADO
David	5.0		REPROBADO
DAME NOMBRE Y PROMEDIO: Jose 8
NOMBRE	PROMEDIO	ESTADO
Jose	8.0		APROBADO
DAME NOMBRE Y PROMEDIO: Fausto 9
NOMBRE	PROMEDIO	ESTADO
Fausto	9.0		APROBADO
DAME NOMBRE Y PROMEDIO: Salome 3
NOMBRE	PROMEDIO	ESTADO
Salome	3.0		REPROBADO
 */