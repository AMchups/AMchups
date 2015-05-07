package org.cuatrovientos.operators;
/**
 * Simple class to make use of operators
 * @author Yeray García
 *
 */
public class Operators {
	public static void main (String [] args) {
		int a = 0;
		int b = 0;
		int result = 0;
		//Operators: + - * / %
		result = a + b; //para hacer suma
		System.out.println(result);
		result = a + 42;
		System.out.println(result);
		result = 10 /(2 - b);
		System.out.println(result);
		//tiene preferencia la división pero se pueden utilizar paréntesis para dar prioridad
		result = 10 / 3;
		System.out.println(result);
		result = 10 % 3;
		System.out.println(result); //para mostrarlo por pantalla
		
		//para que se muestre el resto de una división se utiliza %
		
		result = -result; //para convertir en negativo
		//operadores unarios (unary operators)
		result = a + 1;
		result = a++; // incrementar a "a" una unidad ( a+ 1)
		a = 5;
		a = a + 1;
		System.out.println ("a is " + a); // en lugar de sacar solo un número se concatena saldria en pantalla "a is __"
		a++;
		a--; //para restar a "a" una unidad
		System.out.println ("a is " + a); 
		++a; 
		a++;
		result = ++a; // al poner el "++" delante primero se hace el incremento y luego se asigna
		System.out.println (result + " " + a);
		result = a++;
		System.out.println (result + " " + a);
		// equivalentes
		a = a + 5;
		a += 5; // += -= *= /= %=
		
		
		
		
		
		
		

	}
	

}
