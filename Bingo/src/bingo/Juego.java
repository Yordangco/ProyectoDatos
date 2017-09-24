
package bingo;

import java.util.ArrayList;


public abstract class Juego {
    
    private ArrayList<Jugador> _jugadores;
    
    public Juego(int cantidadJugadores){
        _jugadores = new ArrayList();
        crearJugadores(cantidadJugadores);
    }
    
    public final void crearJugadores(int cantidadJugadores){
        for(int i = 1; i <= cantidadJugadores; i++){
            Jugador nuevoJugador = new Jugador(i);
            _jugadores.add(nuevoJugador);
        }
    }
    
    public void asignarCartones(int cantidadCartones){
        int i = 1;
        for(Jugador jugador : _jugadores){
            while(i <= cantidadCartones){
                Cartón c = new Cartón();
                jugador.agregarCarton(c);
                i++;
            }
            i = 1;
        }
    }
    
    public void jugar(){
        
    }
}
