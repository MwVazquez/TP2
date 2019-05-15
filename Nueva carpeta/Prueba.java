package interfaces.unlam;



public class Prueba {
	public static void main(String[] args) {
//		PilaEstatica <String> pila= new PilaEstatica<String>(3);//cantidad de elementos
//		System.out.println(pila.isEmpty());
//		pila.push((String)"nada1");
//		pila.push((String)"nada2");
//		pila.push("nada3");
//		pila.push((String)"nada4");
//		System.out.println(pila.isEmpty());
//		System.out.println("veo tope :  "+(String)pila.peek());
//		System.out.prpintln(pila.pop());
//		System.out.println(pila.pop());
//		System.out.println(pila.pop());
//		System.out.println(pila.pop());
//		System.out.println(pila.isEmpty());
		Lista<String> lista =new Lista<String>();
		lista.pushBack(new Dato<String>("aaaa"));
		lista.pushBack(new Dato<String>("bbbb"));
		lista.pushBack(new Dato<String>("cccc"));
		lista.pushBack(new Dato<String>("dddd"));
		lista.pushBack(new Dato<String>("eeee"));
		lista.pushFront(new Dato<String>("1111"));
		lista.pushFront(new Dato<String>("222"));
		System.out.println(lista.popBack());
		System.out.println(lista.popBack());
		System.out.println(lista.popBack());
		System.out.println(lista.popBack());
		System.out.println(lista.popBack());
		System.out.println(lista.popBack());
		System.out.println(lista.popBack());
		System.out.println(lista.popBack());
		
	}
}
