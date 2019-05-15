package interfaces.unlam;

public interface Pila <T>{
	boolean push( Object dato ); //apila un dato en el tope de la pila
	Object pop( );//desapila el dato apuntado por el tope de la pila
	Object peek( );//devuelve el dato apuntado por el tope de la pila, pero no lo desapila.
	boolean isEmpty( );// verificar si la pila esta o no vacia.
	void empty( ); //vaciar la pila
}
