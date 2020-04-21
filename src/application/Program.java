package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		// Instancia uma nova classe FILE a partir de um documento já existente.
		File arquivo = new File("D://Documentos/ini.txt");
		
		Scanner sc = null;
		
		try {
			// O objeto sc é instanciado a partir de uma classe Scanner que recebe o objeto do tipo FILE como parametro para leitura.
			sc = new Scanner(arquivo);
			while(sc.hasNextLine()) {
				// Imprimindo o conteúdo do arquivo.
				System.out.println(sc.nextLine());
			}
		}catch(IOException e) {
			// Tratando um possível erro de acesso.
			System.out.println("Erro:"+  e.getMessage());
		}finally {
			if(sc != null) {
				// Encerramento do objeto sc.
				sc.close();
			}
		*/
		
		/*
		//Instanciando o objeto path com o diretório do arquivo existente.
		String path = "D://Documentos/ini.txt";
		
		//Declara os objetos de leitura de arquivo.
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			//Passando os parametros e instanciando os objetos.
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			//Método de leitura.
			String line = br.readLine();
			
			//Enquanto não chegar à ultima linha, leia a proxima linha 
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}finally {
			//Caso os leitores de arquivo não sejam nulos, feche-os.
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}*/
		
		/*
		String source = "D://Documentos/ini.txt";
		
		try(BufferedReader buff = new BufferedReader(new FileReader(source))){
			
			String txt = buff.readLine();
			
			while (txt != null) {
				System.out.println(txt);
				txt = buff.readLine();
			}
			
		}catch(IOException e) {
			System.out.println("Erro: "+ e.getMessage());
		}
		*/
	}

}
