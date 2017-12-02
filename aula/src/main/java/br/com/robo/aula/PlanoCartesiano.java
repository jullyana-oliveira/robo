package br.com.robo.aula;

public class PlanoCartesiano {
	
private String[][] planoCartesiano = new String[7][7];
	
	
	public boolean validaPosicaoRobo(int linha, int coluna, String direcao){
		if("direita".equals(direcao) && coluna<6){			
			return true;			
		}else if("esquerda".equals(direcao) && coluna>0){			
			return true;
		}else if("tras".equals(direcao) && linha>0){
			return true;
		}else if("frente".equals(direcao) && linha<6){
			return true;
		}else{
			return false;
		}		
	}


	public String[][] getPlanoCartesiano() {
		return planoCartesiano;
	}

	public void setPlanoCartesiano(String[][] planoCartesiano) {
		this.planoCartesiano = planoCartesiano;
	}

}
