package interfaces.unlam;

public class Dato<T> {
	private T info;
	private Dato <T> referencia;
	
	public Dato(T obj){
		info=obj;
	}
	public T getInfo() {
		return info;
	}
	public void setInfo(T info) {
		this.info = info;
	}
	public Dato<T> getReferencia() {
		return referencia;
	}
	public void setReferencia(Dato<T> referencia) {
		this.referencia = referencia;
	}
	
	
	
	
	
	
}
