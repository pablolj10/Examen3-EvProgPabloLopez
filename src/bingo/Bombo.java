package bingo;

import java.util.ArrayList;

public class Bombo {

	private ArrayList<Integer> bomboNumerico;
	
	public Bombo () {
		this.bomboNumerico = new ArrayList<Integer>();
		rellenarBombo();
	}
	
	private void rellenarBombo() {
		for (int i = 0 ; i<90 ; i++)  {
			bomboNumerico.add(i+1);
		}
	}
	
	public int numeroRandom() {
		int posicion = (int)(Math.random()*(bomboNumerico.size()-1));
		int numero = bomboNumerico.get(posicion);
		bomboNumerico.remove(posicion);
		return numero;
	}
	
}
