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

public class PostfixProcessing{
	
	public static void main(String args[]){
	
		Scanner scan = new Scanner(new File("datos.txt"));
		Stack<String> myStack = new StackVector<String>();
		String car= "3";
		
		switch (car){
			case "+":
				myStack.push(Integer.toString(Integer.parseInt(myStack.pop())+Integer.parseInt(myStack.pop())));
				break;
			case "-":
				myStack.push(Integer.toString(Integer.parseInt(myStack.pop())-Integer.parseInt(myStack.pop())));
				break;
			case "*":
				myStack.push(Integer.toString(Integer.parseInt(myStack.pop())*Integer.parseInt(myStack.pop())));
				break;
			case "/":
				int temp =Integer.parseInt(myStack.pop());
				myStack.push(Integer.toString(Integer.parseInt(myStack.pop())/temp));
				break;
			default:
				myStack.push(car);
				break;
		}
	}
	
}