public class Ejercicios
{
	//devuelve true si "numero" es par y false de lo contrario
	//El if es la condicion que indica que si el numero es divisible entre dos el numero que se ingreso es par si no 
	//es falso
	static boolean esPar(int numero)
	{
		if(numero%2==0)
			return true;
		else
		return false;
	}
	
	//devuelve "paquetillo" si lempiras es menor que 50
	//devuelve "paquetin" si lempiras es menor que 100
	//devuelve "paquetote" si lempiras es menor que 200
	//de lo contrario devuelve paqueton
	//nota: solo aceptan minusculas
	
	//El if es la condicion que indica que si la cantidad ingresada en lempiras es menor que 50 devolvera 
	//el paquetillo y si es menor que 100 devolvera paquetin y lo mismo si es menor que 200 en caso de ser otra cantidad
	//devolvera paqueton
	static String churches(int lempiras)
	{
		if(lempiras<50)
			return "paquetillo";
		if(lempiras<100)
			return "paquetin";
		if(lempiras<200)
			return "paquetote";
		return "paqueton";
	}
	
	//devuelve el factorial de "num"
	
	//El factorial de un numero es el numero multiplicado desde 1 hasta el numero en si
	//if es la condicion que dice si la cantidad ingresada es 0 devuelve valor de 1
	//en caso de ser 1 multiplica el numero por factorial que almancena el mismo numero restandole uno hasta llegar a 
	//0
	static int factorial(int num)
	{
		if(num==0)
		{
			return 1;
			else
				return num*factorial(num-1);
		}
		

		}
	
	//devuelve el elemento de "arr" en la posicion "pos"
	
	//Devuelve el valor de pos en el arreglo de arr
	static int getElemento(int arr[],int pos)
	{
		return arr[pos];
	}
	
	//devuelve el elemento de "arr" en la posicion ["col"] ["fila"]
	
	//Devuelve la cantidad de columnas y filas en el arreglo de arr
	static int getElemento(int arr[][],int col,int fila)
	{
		return arr[col][fila];
	}
	
	//devuelve el atributo "x" de "MiClase"
	
	//Se manda a llamar desde Miclase el atributo x 
	static int getX(MiClase mi_clase)
	{
		return mi_clase.x;
	}
	
	//implementar la funcion "getXPor2()" descrita en la clase "MiClase"
	//No modificar esta funcion
	
	//Se modifico la funcio de getXPor2() en MiClase como x*2 y se devuelve el valor en esta clase 
	static int implementarGetXPor2(MiClase mi_clase)
	{
		return mi_clase.getXPor2();
	}
	
	//implementar la funcion "getXPor2()" descrita en la clase "MiClase"
	//No modificar esta funcion
	
	//Se modifico la funcion getXMasY en Miclase como la suma x+y y se devuelve el valor en esta clase
	static int implementarGetXMasY(MiClase mi_clase, int y)
	{
		return mi_clase.getXMasY(y);
	}
	
	//devuelve la funcion fibonacci de "num"
	//nota: puedes consultar la funcion en http://es.wikipedia.org/wiki/Sucesi%C3%B3n_de_Fibonacci
	
	//http://es.wikipedia.org/wiki/Sucesi%C3%B3n_de_Fibonacci la formula para resolver este ejercicio se
	//saco desde este link de wikipedia que nos indica que cada termino es la suma de los dos numero anteriores 
	//sumados.
	static int fibonacci(int num)
	{
		if(num==1)
			return 1;
		else if(num==0)
			return 0;
		else
			return fibonacci(num-1) + fibonacci(num+2);
	}
	
	//realizar la siguiente funcion recursiva:
	//funcionRecursiva(n) = funcionRecursiva(n-1)*2+1
	//donde: funcionRecursiva(0) = 0 y funcionRecursiva(1) = 2
	
	//En este caso de resivir la cantidad 0 la funcion Recursiva vale 0 
	//y en caso de ser 1 la cantidad la funcion vale 2
	//En donde la FuncionRecursiva es numero -1 por 2+1
	static int funcionRecursiva(int num)
	{
		if(num==0)
			return 0;
		if(num==1)
			return 2;
		else
			return funcionRecursiva(num-1)*2+1;
		
	}
	
	public static void main(String[] args)
	{

	}

}
