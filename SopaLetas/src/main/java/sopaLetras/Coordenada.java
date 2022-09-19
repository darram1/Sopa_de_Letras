package sopaLetras;

public class Coordenada {
	private final int fila;
	private final int columna;
	private final Sentido sentido;
	
	
	
	public Coordenada(int fila, int columna, Sentido sentido) throws TableroException{
		if(fila<0) {
			throw new TableroException("");
		}
		
		this.fila=fila;
		this.columna=columna;
		this.sentido=sentido;
	}

	protected int getFila() {
		return fila;
	}

	protected int getColumna() {
		return columna;
	}

	protected Sentido getSentido() {
		return sentido;
	}
	
}
