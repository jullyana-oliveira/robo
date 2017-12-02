package br.com.robo.aula;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class RoboTest2 {

	@Test
	public void naoDevePassarLimiteDireita(){		
		Robo robo = new Robo(5, 5);
		robo.direita();
		robo.direita();
		robo.direita();
		robo.direita();
		robo.direita();
		robo.direita();
    	Assert.assertEquals(4, robo.getX());
	}
	
	@Test
	public void naoDevePassarLimiteEsquerda(){		
		Robo robo = new Robo(5, 5);
		robo.esquerda();
		robo.esquerda();
		robo.esquerda();
		robo.esquerda();
		robo.esquerda();
		robo.esquerda();
    	Assert.assertEquals(1, robo.getX());
	}

	@Test
	public void naoDevePassarLimiteAcima(){		
		Robo robo = new Robo(5, 5);
		robo.acima();
		robo.acima();
		robo.acima();
		robo.acima();
		robo.acima();
			
    	Assert.assertEquals(4, robo.getY());
	}
	
	@Test
	public void naoDevePassarLimiteAbaixo(){		
		Robo robo = new Robo(5, 5);
		robo.abaixo();
		robo.abaixo();
		robo.abaixo();
		robo.abaixo();
		robo.abaixo();		
			
    	Assert.assertEquals(1, robo.getY());
	}
}
