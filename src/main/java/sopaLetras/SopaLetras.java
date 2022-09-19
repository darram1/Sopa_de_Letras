package sopaLetras;

import java.util.ArrayList;
import java.util.List;

public class SopaLetras {
	private int n;
	private List<Character> filas;
	private List<ArrayList<Character>> tablero;
	
	public SopaLetras(int n){
		this.n= n;
		this.filas = new ArrayList<Character>();
		this.tablero= new ArrayList <ArrayList<Character>>();
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public void generarCasillas() {
		 for(int i=0;i<n;i++){

	            this.tablero.add(new ArrayList<Character>());

	            for(int j=0;j<n;j++) {
	                this.tablero.get(i).add('*');
	            }

	            this.tablero.get(0).get(0);

	        }
	}
	
	public void colocarPalabraHorizontal(String palabra, Coordenada coordenada) throws TableroException{
		if(palabra == null || palabra.isEmpty()) {
			throw new TableroException("Palabra nula o vacia");
		}else if(palabra.length() > this.n) {
			throw new TableroException("El tamaño de la palabra es superior a la dimension");
		}
	}

	
}
