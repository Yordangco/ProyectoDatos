
package bingo;

import java.util.Scanner;

public class Aplicación {
   
    public static void main(String[] args) {
        
        System.out.println("Digite la cantidad de jugadores participantes: ");
        Scanner s = new Scanner(System.in);
        int cantidadJugadores = s.nextInt();
        Juego juego = new JuegoLineaCompleta(cantidadJugadores);
        System.out.println("Digite la cantidad de cartones por jugador: ");
        int cantidadCartones = s.nextInt();
        juego.asignarCartones(cantidadCartones);
    }
    
}