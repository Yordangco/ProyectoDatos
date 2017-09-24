
package bingo;

public class Pila {
    
    private int[] _items;
    int _tope;
    int _tamaño;
    
    public Pila(int tam){
        _tamaño = tam;
        _items = new int[_tamaño];
        _tope = -1;
    }
    
    public boolean estaVacia(){
        return _tope == -1;
    }
    
    public void push(int numero){
        if(!estaVacia()){
            _items[++_tope] = numero;
        }
    }
    
    public Integer pop(){
        if(!estaVacia()){
            return _items[_tope--];
        }
        return null;
    }
}
    
    
    
    
    
    
    
    
