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
	

	public void print() {
		System.out.println();
		for(int l=0 ; l < n ; l++ ) {
			for(int e=0 ; e < n ; e++) {
				System.out.print(tablero.get(l).get(e));
			}
			System.out.println();
		}
		
		
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
		int comprobador;
	
		if(palabra == null || palabra.isEmpty()) {
			throw new TableroException("Palabra nula o vacia");
		}else if(palabra.length() > this.n) {
			throw new TableroException("El tama�o de la palabra es superi or a la dimension");
		}else if(coordenada.getFila() > this.n) {
            throw new TableroException("La coordenada X se sale del tablero");
        }else if(coordenada.getColumna() > this.n) {
            throw new TableroException("La coordenada Y se sale del tablero");
        }else if(coordenada.getSentido() == null) {
            throw new TableroException("El sentido no puede ser nulo");
        }else if(coordenada.getSentido() == Sentido.NORMAL) {
            if ((this.n - ( coordenada.getColumna()+palabra.length() ) < 0)) {
                throw new TableroException("El tamaÃ±o de la palabra supera el limite del tablero");
            }
            	comprobador=0;
            	for(int l=0 ; l < palabra.length() ; l++ ) {
            			if (this.tablero.get(coordenada.getFila()).get(coordenada.getColumna()+l) != '*') {
            				comprobador++;
            			}
    			}
            	
            	if(comprobador==0) {	
            	this.colocarPalabraHorizontalSentidoNormal(palabra, coordenada);
            	}else {
            		throw new TableroException("La palabra coincide con un otra palabra");
            	}
        }
	}
	
	public void colocarPalabraHorizontalSentidoNormal(String palabra, Coordenada coordenada) {
		char letra;
		for(int l=0 ; l < palabra.length() ; l++ ) {
			letra = palabra.charAt(l);
			
			tablero.get(coordenada.getFila()).set(coordenada.getColumna()+l,letra);
		}
	}
	
}
