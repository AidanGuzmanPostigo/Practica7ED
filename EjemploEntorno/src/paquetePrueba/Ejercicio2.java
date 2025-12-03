package paquetePrueba;
import java.util.Scanner;
public class Ejercicio2 {
	@SuppressWarnings("resource")
	public void excercise2() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Introduce 2 números enteros");
		int num1 = keyboard.nextInt();
		int num2 = keyboard.nextInt();
		if (num1 % num2 == 0) {
			System.out.println("El número " + num1 + " es múltiplo de " + num2);
		} else {
			System.out.println("El número " + num1 + " no es múltiplo de " + num2);
		}
	}
	public static void main(String[] args) {
		new Ejercicio2().excercise2();
	}
}//MODIFICACION 2