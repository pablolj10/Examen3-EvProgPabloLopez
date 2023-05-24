package bingo;

import java.util.ArrayList;

public class Strart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Carton> cartones = new ArrayList();
		Carton carton1 = new Carton("Lucho");
		cartones.add(carton1);
		Carton carton2 = new Carton("Jandro");
		cartones.add(carton2);
		Carton carton3 = new Carton("Pablo");
		cartones.add(carton3);
		Carton carton4 = new Carton("Pablo");
		cartones.add(carton4);
		Carton carton5 = new Carton("Maciw");
		cartones.add(carton5);
		System.out.println(carton1);
		System.out.println(carton2);
		System.out.println(carton3);
		System.out.println(carton4);
		System.out.println(carton5);
		Juego juego = new Juego();
		System.out.println(juego.Jugar(cartones));
		System.out.println(carton1);
		System.out.println(carton2);
		System.out.println(carton3);
		System.out.println(carton4);
		System.out.println(carton5);

		
	}

}
