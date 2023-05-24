package bingo;

import java.util.ArrayList;

public class Carton {

	private String nombre;
	private ArrayList<Integer> carton;
	
	public Carton (String nombre) {
		this.nombre = nombre;
		this.carton= new ArrayList<Integer>();
		this.generateCarton();
	}
	
	private void generateCarton() {
		for (int i=0 ; i<9 ; i++) {
			int numeru = (int)(Math.random()*8+1+(i*10));
			carton.add(numeru);
			int numeru2 = (int)(Math.random()*8+1+(i*10));
			while (numeru2 == numeru) {
				numeru2 = (int)(Math.random()*8+1+(i*10));
			}
			carton.add(numeru2);
		}
	}
	public ArrayList<Integer> getCarton() {
		return carton;
	}
	
	public String toString() {
		return nombre + " = " + carton.toString();
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	
}
