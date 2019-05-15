package interfaces.unlam;

public interface Pila <T>{
	public void push( Dato  dato ); //apila un dato en el tope de la pila
	public T pop( );//desapila el dato apuntado por el tope de la pila
	public T peek( );//devuelve el dato apuntado por el tope de la pila, pero no lo desapila.
	public boolean isEmpty( );// verificar si la pila esta o no vacia.
	public void empty( ); //vaciar la pila
	
}
