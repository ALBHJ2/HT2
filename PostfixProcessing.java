//*******************************************************************
//Autores: Diego Rosales y
//Seccion: 20
//
//Nobmbe de Archivo: StackVector.java
//Breve Descripcion: implementa un Sack utilizando la clase Vector
//*******************************************************************

import java.util.Scanner;
import java.io.File;
import java.lang.Integer;
import java.io.FileNotFoundException;

public class PostfixProcessing{
	
	public static void main(String args[]){
		
		//Inicializando el Scanner para leer el archivo
		Scanner scan = new Scanner(System.in);
		try{
			scan = new Scanner(new File("datos.txt"));
			System.out.println("**--");
		}
		catch(FileNotFoundException e){
			//Si el archivo no existe se lanza la excepcion
			e.printStackTrace();
		}
		//inicializando el Stack
		Stack<String> myStack = new StackVector<String>();
		int x=0;
		//Mientras aun haya lineas en el archivo
		while (scan.hasNextLine()){
			String car= scan.next();
			
			//Si es un operando se hacen dos pop y se pushea el resultado
			//de la respectiva operacion
			switch (car){
				case "+":
					myStack.push(Integer.toString(Integer.parseInt(myStack.pop())+Integer.parseInt(myStack.pop())));
					break;
				case "-":
					int temp1 = Integer.parseInt(myStack.pop());
					myStack.push(Integer.toString(Integer.parseInt(myStack.pop())-temp1));
					break;
				case "*":
					myStack.push(Integer.toString(Integer.parseInt(myStack.pop())*Integer.parseInt(myStack.pop())));
					break;
				case "/":
					int temp =Integer.parseInt(myStack.pop());
					myStack.push(Integer.toString(Integer.parseInt(myStack.pop())/temp));
					break;
				case"\n":
					System.out.println(myStack.peek());
					break;
				//Si se lee un dígito solo se pushea en el stack
				case "0":
				case "1":
				case "2":
				case "3":
				case "4":
				case "5":
				case "6":
				case "7":
				case "8":
				case "9":
					myStack.push(car);
				default:
					break;
			}
			
			
		}
		//Se imprimen los contenidos de Stack
		while (!myStack.empty()){
			System.out.println(myStack.pop());
		}
		
	}
	
}