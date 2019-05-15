package interfaces.unlam;

import org.junit.Assert;
import org.junit.Test;



public class TestLista {
	Lista<String> lista;
	//un elemento en una lista vacia
	@Test
	public void InsertarAlFinalPrimer() {
		lista =new Lista<String>();
		lista.pushBack(new Dato<String>("aaaa"));
		Assert.assertEquals("aaaa", lista.getPrimer().getInfo());
	}
	@Test
	public void InsertarAlFinalActual() {
		lista =new Lista<String>();
		lista.pushBack(new Dato<String>("aaaa"));
		Assert.assertEquals("aaaa", lista.getActual().getInfo());
	}
	
	@Test
	public void InsertarAlFinalUltimo() {
		lista =new Lista<String>();
		lista.pushBack(new Dato<String>("aaaa"));
		Assert.assertEquals("aaaa", lista.getUltimo().getInfo());
	}
	@Test
	public void InsertarAlFinalCantidad() {
		lista =new Lista<String>();
		lista.pushBack(new Dato<String>("aaaa"));
		Assert.assertEquals(1, lista.getCantidad());
	}
	
	
	//dos elementos en una lista vacia
		@Test
		public void InsertarAlFinalPrimer2() {
			lista =new Lista<String>();
			lista.pushBack(new Dato<String>("aaaa"));
			lista.pushBack(new Dato<String>("bbbb"));
			Assert.assertEquals("aaaa", lista.getPrimer().getInfo());
		}
		@Test
		public void InsertarAlFinalActual2() {
			lista =new Lista<String>();
			lista.pushBack(new Dato<String>("aaaa"));
			lista.pushBack(new Dato<String>("bbbb"));
			Assert.assertEquals("bbbb", lista.getActual().getInfo());
		}
		
		@Test
		public void InsertarAlFinalUltimo2() {
			lista =new Lista<String>();
			lista.pushBack(new Dato<String>("aaaa"));
			lista.pushBack(new Dato<String>("bbbb"));
			Assert.assertEquals("bbbb", lista.getUltimo().getInfo());
		}
		@Test
		public void InsertarAlFinalCantidad2() {
			lista =new Lista<String>();
			lista.pushBack(new Dato<String>("aaaa"));
			lista.pushBack(new Dato<String>("bbbb"));
			Assert.assertEquals(2, lista.getCantidad());
		}
		
		//tres elementos en una lista vacia
				@Test
				public void InsertarAlFinalPrimer3() {
					lista =new Lista<String>();
					lista.pushBack(new Dato<String>("aaaa"));
					lista.pushBack(new Dato<String>("bbbb"));
					lista.pushBack(new Dato<String>("cccc"));
					Assert.assertEquals("aaaa", lista.getPrimer().getInfo());
				}
				@Test
				public void InsertarAlFinalActual3() {
					lista =new Lista<String>();
					lista.pushBack(new Dato<String>("aaaa"));
					lista.pushBack(new Dato<String>("bbbb"));
					lista.pushBack(new Dato<String>("cccc"));
					Assert.assertEquals("cccc", lista.getActual().getInfo());
				}
				
				@Test
				public void InsertarAlFinalUltimo3() {
					lista =new Lista<String>();
					lista.pushBack(new Dato<String>("aaaa"));
					lista.pushBack(new Dato<String>("bbbb"));
					lista.pushBack(new Dato<String>("cccc"));
					Assert.assertEquals("cccc", lista.getUltimo().getInfo());
				}
				@Test
				public void InsertarAlFinalCantidad3() {
					lista =new Lista<String>();
					lista.pushBack(new Dato<String>("aaaa"));
					lista.pushBack(new Dato<String>("bbbb"));
					lista.pushBack(new Dato<String>("cccc"));
					Assert.assertEquals(3, lista.getCantidad());
				}
				
				
				
				//Saco el ultimo////////////////////////////////////////////////
				@Test
				public void sacarYBorrarUltimoResultado() {
					lista =new Lista<String>();
					lista.pushBack(new Dato<String>("aaaa"));
					lista.pushBack(new Dato<String>("bbbb"));
					lista.pushBack(new Dato<String>("cccc"));
					Assert.assertEquals("cccc", lista.popBack());
				}
				@Test
				public void sacarYBorrarUltimoPrimer() {
					lista =new Lista<String>();
					lista.pushBack(new Dato<String>("aaaa"));
					lista.pushBack(new Dato<String>("bbbb"));
					lista.pushBack(new Dato<String>("cccc"));
					lista.popBack();
					Assert.assertEquals("aaaa", lista.getPrimer().getInfo());
				}
				@Test
				public void sacarYBorrarUltimoActual() {
					lista =new Lista<String>();
					lista.pushBack(new Dato<String>("aaaa"));
					lista.pushBack(new Dato<String>("bbbb"));
					lista.pushBack(new Dato<String>("cccc"));
					lista.popBack();
					Assert.assertEquals("bbbb", lista.getActual().getInfo());
				}
				
				@Test
				public void sacarYBorrarUltimoUltimo() {
					lista =new Lista<String>();
					lista.pushBack(new Dato<String>("aaaa"));
					lista.pushBack(new Dato<String>("bbbb"));
					lista.pushBack(new Dato<String>("cccc"));
					lista.popBack();
					Assert.assertEquals("bbbb", lista.getUltimo().getInfo());
				}
				@Test
				public void sacarYBorrarUltimoCantidad() {
					lista =new Lista<String>();
					lista.pushBack(new Dato<String>("aaaa"));
					lista.pushBack(new Dato<String>("bbbb"));
					lista.pushBack(new Dato<String>("cccc"));
					lista.popBack();
					Assert.assertEquals(2, lista.getCantidad());
				}
				
				public void sacarYBorrarUltimo2() {
					lista =new Lista<String>();
					lista.pushBack(new Dato<String>("aaaa"));
					lista.pushBack(new Dato<String>("bbbb"));
					lista.pushBack(new Dato<String>("cccc"));
					lista.popBack();
					Assert.assertEquals("bbbb", lista.popBack());
				}
				public void sacarYBorrarUltimo3() {
					lista =new Lista<String>();
					lista.pushBack(new Dato<String>("aaaa"));
					lista.pushBack(new Dato<String>("bbbb"));
					lista.pushBack(new Dato<String>("cccc"));
					lista.popBack();
					lista.popBack();
					Assert.assertEquals("aaaa", lista.popBack());
				}
				
////////////////   Insertar un elemento al comienzo	
				
				@Test
				public void InsertarElementoAlComenzoPrimer() {
					lista =new Lista<String>();
					lista.pushBack(new Dato<String>("aaaa"));
					lista.pushBack(new Dato<String>("bbbb"));
					lista.pushBack(new Dato<String>("cccc"));
					lista.pushFront(new Dato<String>("0000"));
					Assert.assertEquals("0000", lista.getPrimer().getInfo());
				}
				@Test
				public void InsertarElementoAlComenzoActual() {
					lista =new Lista<String>();
					lista.pushBack(new Dato<String>("aaaa"));
					lista.pushBack(new Dato<String>("bbbb"));
					lista.pushBack(new Dato<String>("cccc"));
					lista.pushFront(new Dato<String>("0000"));
					Assert.assertEquals("cccc", lista.getActual().getInfo());
				}
				
				@Test
				public void InsertarElementoAlComenzoFinal() {
					lista =new Lista<String>();
					lista.pushBack(new Dato<String>("aaaa"));
					lista.pushBack(new Dato<String>("bbbb"));
					lista.pushBack(new Dato<String>("cccc"));
					lista.pushFront(new Dato<String>("0000"));
					Assert.assertEquals("cccc", lista.getUltimo().getInfo());
				}
				@Test
				public void InsertarElementoAlComenzoCantidad() {
					lista =new Lista<String>();
					lista.pushBack(new Dato<String>("aaaa"));
					lista.pushBack(new Dato<String>("bbbb"));
					lista.pushBack(new Dato<String>("cccc"));
					lista.pushFront(new Dato<String>("0000"));
					Assert.assertEquals(4, lista.getCantidad());
				}

///////////// borrarElemento
				@Test
				public void BorrarElementoPrimer() {
					lista =new Lista<String>();
					lista.pushBack(new Dato<String>("aaaa"));
					lista.pushBack(new Dato<String>("bbbb"));
					lista.pushBack(new Dato<String>("cccc"));
					lista.pushFront(new Dato<String>("0000"));
					lista.remove("0000");
					Assert.assertEquals("aaaa", lista.getPrimer().getInfo());
				}
				@Test
				public void BorrarElementoMedio() {
					lista =new Lista<String>();
					lista.pushBack(new Dato<String>("aaaa"));
					lista.pushBack(new Dato<String>("bbbb"));
					lista.pushBack(new Dato<String>("cccc"));
					lista.pushFront(new Dato<String>("0000"));
					lista.remove("aaaa");
					Assert.assertEquals("0000", lista.getPrimer().getInfo());
				}
				
				@Test
				public void BorrarElementoUltimo() {
					lista =new Lista<String>();
					lista.pushBack(new Dato<String>("aaaa"));
					lista.pushBack(new Dato<String>("bbbb"));
					lista.pushBack(new Dato<String>("cccc"));
					lista.pushFront(new Dato<String>("0000"));
					lista.remove("cccc");
					Assert.assertEquals("bbbb", lista.getUltimo().getInfo());
				}
				@Test
				public void BorrarElementoCantidad() {
					lista =new Lista<String>();
					lista.pushBack(new Dato<String>("aaaa"));
					lista.pushBack(new Dato<String>("bbbb"));
					lista.pushBack(new Dato<String>("cccc"));
					lista.pushFront(new Dato<String>("0000"));
					lista.remove("cccc");
					Assert.assertEquals(3, lista.getCantidad());
				}
				
				@Test
				public void BorrarElementoTodos() {
					lista =new Lista<String>();
					lista.pushBack(new Dato<String>("aaaa"));
					lista.pushBack(new Dato<String>("bbbb"));
					lista.pushBack(new Dato<String>("cccc"));
					lista.pushFront(new Dato<String>("0000"));
					lista.remove("0000");
					lista.remove("cccc");
					lista.remove("bbbb");
					lista.remove("aaaa");
					Assert.assertEquals(0, lista.getCantidad());
				}
				@Test
				public void BorrarElementoNinguno() {
					lista =new Lista<String>();
					lista.pushBack(new Dato<String>("aaaa"));
					lista.pushBack(new Dato<String>("bbbb"));
					lista.pushBack(new Dato<String>("cccc"));
					lista.pushFront(new Dato<String>("0000"));
					lista.remove("zzzz");	
					Assert.assertEquals(4, lista.getCantidad());
				}
				
				///InsertarEnPosicion
				//Fallan
				@Test
				public void insertAtFinal() {
					lista =new Lista<String>();
					lista.insertAt(5,new Dato<String>("cccc"));
					lista.insertAt(0,new Dato<String>("aaaa"));
					lista.insertAt(1,new Dato<String>("bbbb"));
					Assert.assertEquals("cccc", lista.getUltimo().getInfo());
				}
				@Test
				public void insertAtInicial() {
					lista =new Lista<String>();
					lista.insertAt(5,new Dato<String>("cccc"));
					lista.insertAt(0,new Dato<String>("aaaa"));
					lista.insertAt(1,new Dato<String>("bbbb"));
					Assert.assertEquals("aaaa", lista.getPrimer().getInfo());
				}
				
				@Test
				public void insertAtCantidad() {
					lista =new Lista<String>();
					lista.insertAt(5,new Dato<String>("aaaa"));
					lista.insertAt(0,new Dato<String>("bbbb"));
					lista.insertAt(0,new Dato<String>("cccc"));
					Assert.assertEquals(3,lista.getCantidad());
				}
				
				////////////Eliminar por posicion
				@Test
				public void EliminarPosicionInicial() {
					lista =new Lista<String>();
					lista.insertAt(5,new Dato<String>("aaaa"));
					lista.insertAt(0,new Dato<String>("bbbb"));
					lista.insertAt(0,new Dato<String>("cccc"));
					lista.eraseAt(0);
					Assert.assertEquals("bbbb",lista.getPrimer().getInfo());
				}
				
				@Test
				public void EliminarPosicionFinal() {
					lista =new Lista<String>();
					lista.insertAt(5,new Dato<String>("aaaa"));
					lista.insertAt(0,new Dato<String>("bbbb"));
					lista.insertAt(0,new Dato<String>("cccc"));
					lista.eraseAt(2);
					Assert.assertEquals("bbbb",lista.getUltimo().getInfo());
				}
				
				@Test
				public void EliminarPosicion2() {
					lista =new Lista<String>();
					lista.insertAt(5,new Dato<String>("aaaa"));
					lista.insertAt(0,new Dato<String>("bbbb"));
					lista.insertAt(0,new Dato<String>("cccc"));
					lista.eraseAt(3);
					Assert.assertEquals(3,lista.getCantidad());
				}
				
				@Test
				public void EliminarPosicion21P() {
					lista =new Lista<String>();
					lista.insertAt(5,new Dato<String>("aaaa"));
					lista.insertAt(0,new Dato<String>("bbbb"));
					lista.insertAt(0,new Dato<String>("cccc"));
					lista.eraseAt(2);
					lista.eraseAt(1);
					Assert.assertEquals("cccc",lista.getPrimer().getInfo());
				}
				
				@Test
				public void EliminarPosicion21U() {
					lista =new Lista<String>();
					lista.insertAt(5,new Dato<String>("aaaa"));
					lista.insertAt(0,new Dato<String>("bbbb"));
					lista.insertAt(0,new Dato<String>("cccc"));
					lista.eraseAt(2);
					lista.eraseAt(1);
					Assert.assertEquals("cccc",lista.getUltimo().getInfo());
				}
				
				
				///////////Buscar dato
				@Test
				public void Buscar() {
					lista =new Lista<String>();
					lista.insertAt(5,new Dato<String>("aaaa"));
					lista.insertAt(0,new Dato<String>("bbbb"));
					lista.insertAt(0,new Dato<String>("cccc"));
					Assert.assertEquals("cccc",lista.search("cccc"));
				}	
				
				@Test
				public void Buscar2() {
					lista =new Lista<String>();
					lista.insertAt(5,new Dato<String>("aaaa"));
					lista.insertAt(0,new Dato<String>("bbbb"));
					lista.insertAt(0,new Dato<String>("cccc"));
					Assert.assertEquals("bbbb",lista.search("bbbb"));
				}	
				
				@Test
				public void Buscar3() {
					lista =new Lista<String>();
					lista.insertAt(5,new Dato<String>("aaaa"));
					lista.insertAt(0,new Dato<String>("bbbb"));
					lista.insertAt(0,new Dato<String>("cccc"));
					Assert.assertEquals("aaaa",lista.search("aaaa"));
				}
				
				@Test
				public void Buscar4() {
					lista =new Lista<String>();
					lista.insertAt(5,new Dato<String>("aaaa"));
					lista.insertAt(0,new Dato<String>("bbbb"));
					lista.insertAt(0,new Dato<String>("cccc"));
					Assert.assertEquals(null,lista.search("zzzz"));
				}
			
				
				///////// buscar posicion
				@Test
				public void buscarpos0() {
					lista =new Lista<String>();
					lista.insertAt(5,new Dato<String>("aaaa"));
					lista.insertAt(0,new Dato<String>("bbbb"));
					lista.insertAt(0,new Dato<String>("cccc"));
					Assert.assertEquals("cccc",lista.searchAt(0));
				}
				
				@Test
				public void buscarpos1() {
					lista =new Lista<String>();
					lista.insertAt(5,new Dato<String>("aaaa"));
					lista.insertAt(0,new Dato<String>("bbbb"));
					lista.insertAt(0,new Dato<String>("cccc"));
					Assert.assertEquals("bbbb",lista.searchAt(1));
				}
				
				@Test
				public void buscarpos2() {
					lista =new Lista<String>();
					lista.insertAt(5,new Dato<String>("aaaa"));
					lista.insertAt(0,new Dato<String>("bbbb"));
					lista.insertAt(0,new Dato<String>("cccc"));
					Assert.assertEquals("aaaa",lista.searchAt(2));
				}
				
				@Test
				public void buscarpos3() {
					lista =new Lista<String>();
					lista.insertAt(5,new Dato<String>("aaaa"));
					lista.insertAt(0,new Dato<String>("bbbb"));
					lista.insertAt(0,new Dato<String>("cccc"));
					Assert.assertEquals(null,lista.searchAt(3));
				}
}
