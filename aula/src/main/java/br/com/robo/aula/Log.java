package br.com.robo.aula;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Log {
	public void escrever(String oquescrever) {
		FileWriter arquivo;  
        
        try {  
        	
            arquivo = new FileWriter(new File("Arquivo.txt"));  
            arquivo.write(oquescrever); 
            arquivo.close(); 
            
        	
            
        } catch (IOException e) {  
            e.printStackTrace();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
          
	}
	
	
}
