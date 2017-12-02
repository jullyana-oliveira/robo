package br.com.robo.aula;

public class Robo {

	private int x;
	private int y;

	private int limitex;
	private int limitey;
	private PlanoCartesiano planoCartesiano;

	public Robo(int valX, int valY) {

		limitex = valX;
		limitey = valY;

		x = 0;
		y = 0;
	}

	public void direita() {
		int t = x + 1;
		if (t < limitex) {
			x = x + 1;
		}
	}

	public void esquerda() {

		int r = x - 1;
		if (r > 0) {
			x = x - 1;
		}
	}

	public void acima() {
		int a = y + 1;
		if (a < limitey) {
			y = y + 1;
		}

	}

	public void abaixo() {
		int b = y - 1;
		if (b > 0) {
			y = y - 1;
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	

}
