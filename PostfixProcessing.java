//*******************************************************************
//Autores: Diego Rosales y
//Seccion: 20
//
//Nobmbe de Archivo: StackVector.java
//Breve Descripcion: implementa un Sack utilizando la clase Vector
//*******************************************************************

import java.lang.Integer()

public class PostfixProcessing{
	Stack<int> myStack = new StackVector<int>();
	String car= "";
	
	switch (car){
		case "+":
			myStack.push(myStack.pop()+myStack.pop());
			break;
		case "-":
			myStack.push(myStack.pop()-myStack.pop());
			break;
		case "*":
			myStack.push(myStack.pop()*myStack.pop());
			break;
		case "/":
			int temp =myStack.pop();
			myStack.push(myStack.pop()/temp);
			break;
		default:
			myStack.push(Integer.parseInt(car));
			break;
	}
	
	
}