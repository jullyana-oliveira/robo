package br.com.robo.aula;


import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

public class RoboTest extends TestCase {
	
	@Test
	public void naoDevePassarLimiteDireita(){		
		Robo robo = new Robo(5, 5);
		robo.direita();
    	Assert.assertEquals(1, robo.getX());
	}
}
