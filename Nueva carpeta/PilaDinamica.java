package interfaces.unlam;

public class PilaDinamica implements Pila {
	private int id_Nodo;
	static int cantNodos=0;
	
	public PilaDinamica() {
		cantNodos++;
		id_Nodo=cantNodos;
	}
	
	@Override
	public boolean push (Object dato) {
		Object nuevo=new Object(dato);
		
		
		return true;
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void empty() {
		// TODO Auto-generated method stub
		
	}

}
