import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicios {
	
	//Devuelve true si todos los elementos de mi_lista (dada) son pares, de lo contrario devuelve false
	static boolean sonPares(ArrayList<Integer> mi_lista)
	{
		int num=0;
			for(int i=0;i<mi_lista.size();i++)
			{
					if(mi_lista.get(i)%2==0)
					{
						num++;
					}
					if(num==mi_lista.size())
					{
						return true;
					}
			}
		return false;
	}
	
	//Escribe n1, n2 y n3 (dados) en un archivo con nombre nombre_archivo (dado) separados por espacios
	static void escribir3Numeros(String nombre_archivo,int n1, int n2,int n3)
	{
		try
		{
			PrintWriter entrada = new PrintWriter((nombre_archivo));
			entrada.println(+n1+" "+n2+" "+n3);
			entrada.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
	
	//Devuelve true si el archivo con nombre nombre_archivo (dado) contiene al menos 2 palabras repetidas
	static boolean existenRepetidas(String nombre_archivo)
	{
		String repetida1="";
		String repetida2="";
		try
			{
			Scanner lector = new Scanner(new File(nombre_archivo));
				while(lector.hasNext())
				{
					repetida1 = lector.next();
					while(lector.hasNext())
					{
						repetida2 = lector.next();
						if(repetida1.equals(repetida2)) return true;
					}
				}
			lector.close();
		}
		catch (FileNotFoundException e)
		{
		e.printStackTrace();
		}
		return false;
	}
}
