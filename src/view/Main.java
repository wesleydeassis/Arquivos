package view;

import java.io.IOException;

import controller.FileController;
import controller.IFilesController;



public class Main{

	public static void main(String[] args) {

		IFilesController arqC = new FileController();
	
		String path = "C:\\TEMP";
		String name= "generic_food.csv";
		
		try {
			arqC.readFile(path, name);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
			
	}

}