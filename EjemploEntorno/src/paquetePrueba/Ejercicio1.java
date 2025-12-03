package paquetePrueba;
import java.util.Scanner;
public class Ejercicio1 {
	@SuppressWarnings("resource")
	public void excercise1() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Introduce un número entero");
		int num1 = keyboard.nextInt();
		if (num1 % 2 == 0) {
			System.out.println("Tu número es par");
		} else {
			System.out.println("Tu número es impar");
		}
	}
	public static void main(String[] args) {
		new Ejercicio1().excercise1();
	}
}
//MODIFICACION 1