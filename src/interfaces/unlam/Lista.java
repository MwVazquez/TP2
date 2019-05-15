package interfaces.unlam;

public class Lista <T>{
	
	private Dato primer;
	private Dato actual;
	private Dato ultimo;
	private int cantidad;
	
	public Dato getPrimer() {
		return primer;
	}


	public Dato getActual() {
		return actual;
	}
	
	public Dato getUltimo() {
		return ultimo;
	}

	public int getCantidad() {
		return cantidad;
	}


	public Lista (){
		cantidad=0;
	}
	

	public void pushBack(Dato nue){ //Inserta un elemento al final
		if (cantidad==0) {
			primer =nue;
			actual=nue;
			ultimo=nue;
		}
		else {
			ultimo.setReferencia(nue);
			ultimo = nue;
			ultimo.setReferencia(null);
			actual = nue;
		}	
		//nue.setReferencia(null); 
		cantidad++;
	}
	
	T popBack(){ // Retorna y borra el elemento al final
		Dato aux=ultimo;
		if(cantidad==1) {
			
			primer=actual=ultimo=null;
			cantidad--;
			return (T)aux.getInfo();
		}
		if(cantidad==0)
			return null;
		 aux=ultimo;
		Dato ant=null;
		Dato aux2=primer;
		while(aux2.getReferencia()!=null) {
			ant=aux2;
			aux2=aux2.getReferencia();
		}
		ant.setReferencia(null);
		actual=ant;
		ultimo=ant;
		cantidad--;
		return (T)aux.getInfo();
	}
	void pushFront(Dato nue){ // Inserta un elemento al comienzo
		
		if(cantidad==0) {
			actual=nue;
			primer=nue;
			ultimo=nue;
			return;
		}
		nue.setReferencia(primer);
		primer=nue;
		cantidad++;
	}
	public T popFront(){ // Retorna y borra el elemento al principio
		if(cantidad==0)
			return null;
		T aux=(T)primer.getInfo();
		primer=primer.getReferencia();
		cantidad--;
		return aux;
	}
	
	public void remove(T dato) { // Elimina un elemento de un valor determinado.
		
		if(cantidad==0)
			return;
		Dato ant=primer,act=primer;
		while(act.getInfo()!=dato && act.getReferencia()!=null ) {
			ant=act;
			act=act.getReferencia();
		}
		if( act.getInfo()==dato ) {
			if(primer==act && act!=ultimo)
				primer=primer.getReferencia();
			else 
				ant.setReferencia( (Dato<T>)act.getReferencia() );
				
			if(act==ultimo && act==primer) 
				ultimo=primer=actual=null;	
			else {
				ant.setReferencia(null);
				ultimo=ant;
			}
			cantidad--;
		}
	}
//	public void reverse() { //invierte el orden de los elementos en la lista
//		int cant=cantidad;
//		Dato aux=null;
//		aux.setInfo(popBack());
//		while(cant != 0) {
//			aux.setReferencia(ultimo);
//		}
//	}
	public void insertAt(int posicion, Dato dato ) {// inserta un dato en la posicion indicada.
		if(cantidad<posicion) {
			pushBack(dato);
			return;
		}
		Dato aux=actual=primer;
		for(int i=0 ; i< posicion ; i++) {
			actual=aux;
			aux=aux.getReferencia();
		}
		if(posicion==0) {
			dato.setReferencia(primer);
			primer=dato;
		}
		else
		{
			actual.setReferencia(dato);
			dato.setReferencia(aux);
		}
		cantidad++;
	}
	
	public void eraseAt(int posicion) {//Eliminar por posicion
		if(cantidad<posicion+1) {
			return;
		}
		Dato aux=actual=primer;
		for(int i=0 ; i< posicion ; i++) {
			actual=aux;
			aux=aux.getReferencia();
		}
		if(aux==actual)
			primer=primer.getReferencia();
		else
			actual.setReferencia(aux.getReferencia());
		if(aux==ultimo)
			ultimo=actual;
		cantidad--;
	}
	public boolean isEmpty( ) {// verificar si la lista esta o no vac ́ıa.
		return cantidad==0;
	}
	public void empty() { //vaciar la lista
		cantidad=0;
		primer=actual=ultimo=null;
	}
	public T search(T dato) {
		if(cantidad==0)
			return null;
		actual=primer;
		while(actual.getInfo()!=dato && actual.getReferencia()!=null)
			actual=actual.getReferencia();
		if( actual.getInfo()==dato )
			return(T) actual.getInfo();
		return null;
	}
	public T searchAt(int posicion) {
		if(cantidad<posicion+1) {
			return null;
		}
		actual=primer;
		for(int i=0 ; i< posicion ; i++) 
			actual=actual.getReferencia();
		return (T)actual.getInfo();
	}
	public int size() {//
		return cantidad;
	}
	
}
