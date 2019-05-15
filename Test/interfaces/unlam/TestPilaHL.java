package interfaces.unlam;

import org.junit.Assert;
import org.junit.Test;

public class TestPilaHL {
	PilaHL<String> pila;
	
	
	
	@Test
	public void insertar() {
		pila =new PilaHL<String>();
		
		pila.push(new Dato<String>("aaaa"));
		pila.push(new Dato<String>("bbbb"));
		pila.push(new Dato<String>("cccc"));
		Assert.assertEquals(pila.getCantidad(), 3);
	}
	@Test
	public void sacar() {
		pila =new PilaHL<String>();
		pila.push(new Dato<String>("aaaa"));
		pila.push(new Dato<String>("bbbb"));
		pila.push(new Dato<String>("cccc"));
		Assert.assertEquals("cccc",pila.pop());
	}
	@Test
	public void sacar2() {
		pila =new PilaHL<String>();
		pila.push(new Dato<String>("aaaa"));
		pila.push(new Dato<String>("bbbb"));
		pila.push(new Dato<String>("cccc"));
		pila.pop();
		Assert.assertEquals("bbbb",pila.pop());
	}
	@Test
	public void sacar3() {
		pila =new PilaHL<String>();
		pila.push(new Dato<String>("aaaa"));
		pila.push(new Dato<String>("bbbb"));
		pila.push(new Dato<String>("cccc"));
		pila.pop();
		pila.pop();
		Assert.assertEquals("aaaa",pila.pop());
	}
	
	@Test
	public void verTope1() {
		pila =new PilaHL<String>();
		pila.push(new Dato<String>("aaaa"));
		pila.push(new Dato<String>("bbbb"));
		pila.push(new Dato<String>("cccc"));
		
		Assert.assertEquals("cccc",pila.peek());
	}
	
	@Test
	public void verTope2() {
		pila =new PilaHL<String>();
		pila.push(new Dato<String>("aaaa"));
		Assert.assertEquals("aaaa",pila.pop());
	}
	
	@Test
	public void verTope3() {
		pila =new PilaHL<String>();
		pila.push(new Dato<String>("aaaa"));
		pila.push(new Dato<String>("bbbb"));
		Assert.assertEquals("bbbb",pila.pop());
	}
	
}
