package gsonSample;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		
		Persona a=new Persona();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre : ");
		String nombre = scanner.nextLine();
		
		System.out.print("Introduce tu apellido : ");
		String apellido = scanner.nextLine();
		
		System.out.print("Introduce tu edad : ");
		int edad = scanner.nextInt();
		
		scanner.close();
		
		a.setNombre(nombre);
		a.setApellido(apellido);
		a.setEdad(edad);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(a);
		System.out.println(json);
	}

}
