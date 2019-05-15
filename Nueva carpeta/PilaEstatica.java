package interfaces.unlam;


public class PilaEstatica <T> implements Pila{
	private int tope,cantMaxima;
	private Object vecObjetos[];
	 
	
	public PilaEstatica( int cantElementos) {
		tope=0;
		this.cantMaxima=cantElementos;
		vecObjetos=new Object [cantElementos];
	} 
	////apila un dato en el tope de la pila
	@Override  
	public boolean push(Object dato) {
		if(cantMaxima == tope)
			return false;
		vecObjetos[tope]=dato;
		tope++;
		return true;
	}
	
	////desapila el dato apuntado por el tope de la pila
	@Override
	public Object pop() {
		if(tope<=0)
			return null;
		tope--;
		return vecObjetos[tope];
	}

	//devuelve el dato apuntado por el tope de la pila, pero no lo desapila.
	@Override
	public Object peek() {
		if(tope<=0)
			return null;
		return vecObjetos[tope-1];
	}

	@Override
	public boolean isEmpty() {
		return tope == 0;
	}

	@Override
	public void empty() {
		tope=0;	
	}
	
}
