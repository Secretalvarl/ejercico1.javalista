package Controladores;

import java.util.ArrayList;
import java.util.List;

import Servicios.OperativaImplementacion;
import Servicios.OperativaInterfaz;

public class InicioAplicacion {

	public static void main(String[] args) 
	{
		OperativaInterfaz alpha = new OperativaImplementacion();
		
		List<Integer> numeros = alpha.añadirNumero();
		
		mostrarListaSinModificar(numeros);
		intercambiarNumeros(numeros);
		mostrarListaModificada(numeros);
	}
	
	public static void mostrarListaSinModificar(List<Integer> lista) 
	{
		System.out .println("Estos son los numeros que hay en la lista:");
		for (Integer numeros : lista) {
			
			System.out .println(numeros);
		}
		
	}
	
	public static void intercambiarNumeros(List<Integer> lista)
	{
		if (lista.size() >= 5) 
		{
            int cambio = lista.get(2);
            
            lista.set(2, lista.get(4));
            
            lista.set(4, cambio);
        }
		
	}
	
	public static void mostrarListaModificada(List<Integer> lista) 
	{
		
		System.out.println("Esta es la nueva lista:");
		
        for (int i = 0; i < lista.size(); i++) 
        {
            System.out.println(lista.get(i));
        }
		
	}

}
