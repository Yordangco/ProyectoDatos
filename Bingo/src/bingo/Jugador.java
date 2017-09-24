
package bingo;

import java.util.ArrayList;


public class Jugador {
    
    private int _numero;
    private ArrayList<Cartón> _cartones;

    public Jugador(int numero) {
        establecerNumero(numero);
        _cartones = new ArrayList<>();
    }

    public int obtenerNumero() {
        return _numero;
    }
    
    public final void establecerNumero(int numero){
        _numero = numero;
    }
    
    public ArrayList<Cartón> obtenerCartones(){
        return _cartones;    
    
    }
    
    public void agregarCarton(Cartón c){
        _cartones.add(c);
    }
   
}
