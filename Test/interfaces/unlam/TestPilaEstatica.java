package interfaces.unlam;

import org.junit.Assert;
import org.junit.Test;

public class TestPilaEstatica {
	PilaEstatica<String> pila;
	
	
	@Test
	public void insertar() {
		pila=new PilaEstatica<String>(5);
		pila.push(new Dato<String>("aaaa"));
		pila.push(new Dato<String>("bbbb"));
		pila.push(new Dato<String>("cccc"));
		pila.push(new Dato<String>("dddd"));
		pila.push(new Dato<String>("eeee"));
		pila.push(new Dato<String>("ffff"));
		Assert.assertEquals(pila.peek(), "eeee");
	}
	
	@Test
	public void sacar() {
		pila=new PilaEstatica<String>(5);
		pila.push(new Dato<String>("aaaa"));
		pila.push(new Dato<String>("bbbb"));
		pila.push(new Dato<String>("cccc"));
		pila.push(new Dato<String>("dddd"));
		pila.push(new Dato<String>("eeee"));
		Assert.assertEquals(pila.pop(), "eeee");
	}
	
	@Test
	public void sacarYUltimo() {
		pila=new PilaEstatica<String>(5);
		pila.push(new Dato<String>("aaaa"));
		pila.push(new Dato<String>("bbbb"));
		pila.push(new Dato<String>("cccc"));
		pila.push(new Dato<String>("dddd"));
		pila.push(new Dato<String>("eeee"));
		pila.pop();
		Assert.assertEquals(pila.peek(), "dddd");
	}
	
	@Test
	public void sacarUnivo() {
		pila=new PilaEstatica<String>(5);
		pila.push(new Dato<String>("aaaa"));
		Assert.assertEquals(pila.pop(), "aaaa");
	}
	
	@Test
	public void sacarVacio() {
		pila=new PilaEstatica<String>(5);
		Assert.assertEquals(pila.pop(), null);
	}
}
