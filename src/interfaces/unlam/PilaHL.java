package interfaces.unlam;

public class PilaHL<T> extends Lista implements Pila {
	
	
	public PilaHL() {
		super();
	}

	@Override//poner
	public void push(Dato dato) {
		pushBack(dato);
	}

	@Override
	public T pop() {
		return (T)popBack();
	}

	@Override
	public T peek() {
		return (T)getUltimo().getInfo();
	}
	
}
