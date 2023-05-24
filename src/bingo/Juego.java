package bingo;

import java.util.ArrayList;

public class Juego {

	public String Jugar(ArrayList<Carton> cartones) {
		Bombo bombo = new Bombo();
		boolean hayGanador = false;
		String ganador = "";
		while (!hayGanador) {
			int numeroRandom = bombo.numeroRandom();
			for (Carton carton : cartones) {
				for (int i = 0; i < carton.getCarton().size(); i++) {
					if (carton.getCarton().get(i) == numeroRandom) {
						carton.getCarton().remove(i);
					}
				}
				if (carton.getCarton().size() < 1) {
					ganador = carton.getNombre();
					hayGanador = true;
				}
			}
		}
		return ganador;
	}
}