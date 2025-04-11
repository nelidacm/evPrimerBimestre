package Castro2;

public class Ejercicio21 {
	public static void main(String[] args) throws InterruptedException {
		int bateriaCelular = 100;

		while (bateriaCelular > 0) {

			System.out.println("Bateria" + bateriaCelular + "%");
			Thread.sleep(20);

			if (bateriaCelular == 20) {

				System.out.println("Tienes bateria baja: " + bateriaCelular + "%");
				Thread.sleep(1000);
			}
			bateriaCelular--;

		}

		System.out.println("Te QUEDASTE SIN BATERIA");
	}
}
