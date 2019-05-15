package interfaces.unlam;

public interface Cola <T> {
	void offer(Object dato); // acola un dato en la cola.
	Object poll(); // desacola el dato de la cola.
	Object peek(); // devuelva el dato proximo a desacolarse, pero no lo desacola.
	boolean isEmpty( );// verificar si la cola esta o no vacia.
	void empty( );//vaciar la cola
}
