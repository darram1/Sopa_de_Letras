package main;

import java.util.Scanner;

import sopaLetras.Coordenada;
import sopaLetras.Sentido;
import sopaLetras.SopaLetras;
import sopaLetras.TableroException;

public class Main {
	public static void main(String[] args) throws TableroException {
		int n; 
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el tamaño NxN: ");
		n=Integer.parseInt(sc.nextLine());
		
		SopaLetras sopa = new SopaLetras(n);
		
		sopa.generarCasillas();	
		
		Coordenada coord = new Coordenada(0,4,Sentido.NORMAL);
		
		sopa.colocarPalabraVertical("heey", coord);
		
		sopa.print();
	}
}
