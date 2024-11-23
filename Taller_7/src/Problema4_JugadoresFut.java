/**
 * Generar una solución que permita ingresar jugadores de fútbol; por cada jugador se debe solicitar: 
 * Nombre el jugador     
 * Posición en el campo de juego     
 * Edad     
 * Estatura
 * El ciclo de ingreso de información deberá terminar cuando el usuario lo decida. 
 * Se debe imprimir el siguiente reporte (usar una cadena de acumulación):
 * Listado de Jugadores
 * 1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
 * 2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
 * 3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
 * 4. Ángel Mena -Delantero-, edad 32, estatura 1.75
 * 5. Michael Estrada -Delantero-, edad 27, estatura 1.93
 * Promedio de edades:  26.8
 * Promedio de estaturas: 1.87
 */
import java.util.Scanner;
public class Problema4_JugadoresFut {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nomJugador, posicion;
        double estatura, prom_Edad=0, prom_Est=0;
        int edad, cont = 0, continuar = 1;
        do{
            System.out.println("Ingrese el nombre del jugador: ");
            nomJugador = tcl.next();
            System.out.println("Posición en el campo de juego: ");
            posicion = tcl.next();
            System.out.println("Edad del jugador: ");
            edad = tcl.nextInt();
            System.out.println("Estatura del jugador: ");
            estatura = tcl.nextDouble();
            System.out.println("Quiere ingresar otro jugador? (1.Si / 2.No)");
            continuar = tcl.nextInt();
            prom_Edad = prom_Edad + edad;
            prom_Est = prom_Est + estatura;
            cont ++;
            System.out.print("\tNOMBRE\tPOSICION\tEDAD\tESTATURA");
            System.out.print(cont + ".\t" + nomJugador + "\t-" + posicion + "-\t" + "edad " + edad + "\testatura" + estatura);            
        }while(continuar == 1);
    }    
}
