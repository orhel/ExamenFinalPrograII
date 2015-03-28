import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;


public class Evaluador {

	@Test
	public void sonPares() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(4);
		al.add(30);
		al.add(8);
		al.add(40);
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(2);
		al2.add(4);
		al2.add(3);
		al2.add(1);
		al2.add(4);
		
		assertEquals("Error ejecutando getPromedio(al)", true, Ejercicios.sonPares(al));
		assertEquals("Error ejecutando getPromedio(al2)", false, Ejercicios.sonPares(al2));
	}
	
	@Test
	public void escribir3Numeros() {
		
		Ejercicios.escribir3Numeros("test",10,43,54);
		Scanner s;
		try {
			s = new Scanner(new File("test"));
			assertEquals("Error", "10 43 54", s.nextLine());
			s.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail();
		}
		
		Ejercicios.escribir3Numeros("test2",54,234,652);
		try {
			s = new Scanner(new File("test2"));
			assertEquals("Error", "54 234 652", s.nextLine());
			s.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void existenRepetidas() {
		try
		{
			PrintWriter pw = new PrintWriter("test1");
			pw.write("hola test hola mundo");
			pw.flush();
			pw.close();
			
			
		}catch(Exception e)
		{
			
		}
		
		try
		{
			PrintWriter pw = new PrintWriter("test2");
			pw.write("hola test mundo");
			pw.flush();
			pw.close();
			
			
		}catch(Exception e)
		{
			
		}
		
		try
		{
			PrintWriter pw = new PrintWriter("test3");
			pw.write("hola test mundo mundo tribilin");
			pw.flush();
			pw.close();
			
			
		}catch(Exception e)
		{
			
		}
		
		try
		{
			PrintWriter pw = new PrintWriter("test4");
			pw.write("hola");
			pw.flush();
			pw.close();
			
			
		}catch(Exception e)
		{
			
		}
		
		
		
		assertEquals("Error ejecutando existe(nombre_archivo)", true, Ejercicios.existenRepetidas("test1"));
		assertEquals("Error ejecutando existe(nombre_archivo)", false, Ejercicios.existenRepetidas("test2"));
	
		
	}
	
	@Test
	public void testMedioDeTransporte()
	{
		MedioDeTransporte m = new MedioDeTransporte(12, 200);
		assertEquals("Error", 0, m.getCantidadDeLLantas());
		assertEquals("Error", 12, m.getCantidadPasajeros());
		assertEquals("Error", 200, (int)m.getVelocidadMaxima());
		
		m = new MedioDeTransporte(7, 120);
		assertEquals("Error", 0, m.getCantidadDeLLantas());
		assertEquals("Error", 7, m.getCantidadPasajeros());
		assertEquals("Error", 120, (int)m.getVelocidadMaxima());
	}
	
	@Test
	public void testMoto()
	{
		Moto m = new Moto(2,100);
		if(m instanceof MedioDeTransporte==false)
		{
			fail();
		}
		assertEquals("Error", 2, m.getCantidadDeLLantas());
		assertEquals("Error", 2, m.getCantidadPasajeros());
		assertEquals("Error", 100, (int)m.getVelocidadMaxima());
		
		m = new Moto(3,150);
		if(m instanceof MedioDeTransporte==false)
		{
			fail();
		}
		assertEquals("Error", 2, m.getCantidadDeLLantas());
		assertEquals("Error", 3, m.getCantidadPasajeros());
		assertEquals("Error", 150, (int)m.getVelocidadMaxima());
	}
	
	@Test
	public void testCarro()
	{
		Carro c = new Carro(4,250);
		if(c instanceof MedioDeTransporte==false)
		{
			fail();
		}
		assertEquals("Error", 4, c.getCantidadDeLLantas());
		assertEquals("Error", 4, c.getCantidadPasajeros());
		assertEquals("Error", 250, (int)c.getVelocidadMaxima());
		
		c = new Carro(6,300);
		if(c instanceof MedioDeTransporte==false)
		{
			fail();
		}
		assertEquals("Error", 4, c.getCantidadDeLLantas());
		assertEquals("Error", 6, c.getCantidadPasajeros());
		assertEquals("Error", 300, (int)c.getVelocidadMaxima());
	}

}
