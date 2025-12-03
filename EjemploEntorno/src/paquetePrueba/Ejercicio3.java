package paquetePrueba;
import java.util.Scanner;
public class Ejercicio3 {
	@SuppressWarnings("resource")
	public void excercise3 () {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Introduce la distancia en km a recorrer entre ida y vuelta");
		double distance = keyboard.nextDouble();
		System.out.println("Introduce el número de días de estancia");
		int days = keyboard.nextInt();
		if (distance > 1000 && days > 7) {
			distance *= 0.35;
			distance = distance - (distance*0.30);
			System.out.println("El precio es de " + distance + "€");
		} else  {
			distance *= 0.35;
			System.out.println("El precio es de " + distance + "€");
		}
	}
	public static void main(String[] args) {
		new Ejercicio3().excercise3();
	}
}