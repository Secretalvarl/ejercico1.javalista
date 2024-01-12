package Servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OperativaImplementacion implements OperativaInterfaz
{
	
	public List<Integer> añadirNumero() 
	{
        List<Integer> numeros = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese números para añadirlos a la lista, escriba una letra para dejar de introducir numeros: ");
        
        while (scanner.hasNextInt()) 
        {
            int numero = scanner.nextInt();
            numeros.add(numero);
        }
        
        return numeros;
        
	}

}
