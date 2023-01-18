package org.example.Examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExampleExternalScript extends AbstractExampleClass {

	 public static int executeExternalScript(String path) 	 {
		 
		 int exitVal = 0;
		 
		 try { 

			ProcessBuilder proc = new ProcessBuilder(path); 
			proc.redirectErrorStream(true);
		  
		  	Process process = proc.start();
		  
		  	BufferedReader brStdout = new BufferedReader(new InputStreamReader(process.getInputStream()));
		 
		  	String line = null;
		  	while((line = brStdout.readLine()) != null) {   System.out.println(line);   }
		   
		  	exitVal = process.waitFor();
		  	
		  	brStdout.close();

		 }
		 catch (InterruptedException | IOException e ) { e.printStackTrace(); }
		  	return exitVal;
	 }

	@Override
	public void runContent() {
		System.out.println("ничего не делаем, см только код в классе");
	}
}