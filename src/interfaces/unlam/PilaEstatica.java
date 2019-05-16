package interfaces.unlam;

public  class PilaEstatica <T>implements Pila
{
	/*
	 * Ver si funca los branchs y todo eso
	 * 
	 */
	
	
	
	public T [] vector;
	public int cantidad;
	public int cap;
	public Dato act;
	
	public PilaEstatica(int canti) {
		//arreglo = (T[]) new Object[capacidad];
		//(T[]) Array.newInstance(clazz, capacidad);
		vector=(T[])new Object [canti];
		cap=canti;
		act=null;
		cantidad=0;
	}
	
	
	@Override
	public void push(Dato dato) {
		if(cantidad!=0)
			dato.setReferencia(act);
		if(cantidad<cap)
		act=dato;
		cantidad++;
	}

	@Override
	public T pop() {
		if(cantidad>0)
		{
			Dato aux=act;
			act=act.getReferencia();
			cantidad--;
			return (T)aux.getInfo();
		}
		return  null;
	}

	@Override
	public Object peek() {
		return (T)act.getInfo();
	}

	@Override
	public boolean isEmpty() {
		return  cantidad==0;
	}

	@Override
	public void empty() {
		act=null;
		cantidad=0;
	}

}
