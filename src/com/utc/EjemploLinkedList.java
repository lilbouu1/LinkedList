package com.utc;
import java.util.LinkedList;

public class EjemploLinkedList {

	public static void main(String[] args) {
		//Crear LinkedList en cadenas de texto
		LinkedList<String> lista = new LinkedList<>();
		
		//Agregar elementos
		lista.addLast("Nodo B");
		lista.addFirst("Nodo A");
		lista.addLast("Nodo C");
		
		//Mostrar estado actual
		System.out.println("Lista: "+lista);
		
		//Obtener elementos
		System.out.println("Primero: "+lista.getFirst());
		System.out.println("Ultimo: "+lista.getLast());
		
		//Eliminar elementos
		lista.removeFirst();
		
		//Mostrar estado actual
		System.out.println("Despues de removeFirst: "+lista);
		
	}

}
