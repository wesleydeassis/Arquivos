package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class FileController implements IFilesController {  

	
	
	public FileController() {							
		super();
		
	}

	@Override
	public void readDir(String path) throws IOException {
		File dir = new File(path);
		if (dir.exists() && dir.isDirectory()) {   
			File[] files = dir.listFiles();         
			for(File f: files) {
				if (f.isFile()) {
					System.out.println("     \t" + f.getName()); 
				}
				else {
					System.out.println("<DIR> \t" + f.getName());
				}
			}
		}
		else {
			throw new IOException("Diretório Inválido");
		}
		
	}

	@Override
	public void createFile(String path, String name) throws IOException {
		
		
	}

	@Override
	public void readFile(String path, String name) throws IOException {
		
		File arq = new File(path, name);
		if (arq.exists() && arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while (linha != null) {
				if(linha.contains("fruits"))
					System.out.println(linha);
					linha = buffer.readLine();
				
	
				
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
		} else {
			throw new IOException("Arquivo Inválido");
		}
		
	}

	@Override
	public void openFile(String path, String name) throws IOException {
	
		
	}

	
}