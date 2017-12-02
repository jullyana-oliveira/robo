package br.com.robo.aula;

public class Robo {

	private int x;
	private int y;

	private int limitex;
	private int limitey;

	
	Log log = new Log();
	
	public Robo(int valX, int valY) {

		limitex = valX;
		limitey = valY;

		x = 2;
		y = 3;
	}

	public void direita() {
		int t = x + 1;
		if (t < limitex) {
			x = x + 1;
			log.escrever(x+" : "+ y);
			
			// System.out.println("andou para Direita - " +  "limite: " + limitex  + "Posição: " +  x);
		}
	}

	public void esquerda() {

		int r = x - 1;
		if (r > 0) {
			x = x - 1;
			log.escrever(x+" : "+ y);
			 //System.out.println("andou para Esquerda - " +  "limite: " + limitex  + "Posição: " +  x);
		}
	}

	public void acima() {
		int a = y + 1;
		if (a < limitey) {
			y = y + 1;
			log.escrever(x+" : "+ y);
			 //System.out.println("andou para Cima - " +  "limite: " + limitey  + "Posição: " +  y);
		}

	}

	public void abaixo() {
		int b = y - 1;
		if (b > 0) {
			y = y - 1;
			log.escrever(x+" : "+ y);
			// System.out.println("andou para Baixo - " +  "limite: " + limitey  + "Posição: " +  y);
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	

}
