package application;

import java.io.BufferedReader;
<<<<<<< HEAD
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		
		String pathR = "D://Documentos/"; 
		String pathW;
		List<String> lista = new ArrayList<String>();
		lista.add("txt");
		lista.add("ini");
		lista.add("SQL");
		
		System.out.println("Digite o nome do arquivo que deseja criar");
		Scanner sc = new Scanner(System.in);
		
		pathW = sc.nextLine();
		
		System.out.println("Escolha uma extensão:");
		System.out.println("txt,ini,SQL");
		
		String tipos = sc.nextLine();	
		
		while(pathW.indexOf(".") < 0){
			for(String x: lista) {
				if(tipos.equals(x))pathW = pathW + "." + tipos;
				}
			if(pathW.indexOf(".") < 0) { 
				System.out.println("Extensão inválida, por favor tente novamente.");
				System.out.println("txt,ini,SQL");
				tipos = sc.nextLine();
			}
		}
		
		File arq= new File(pathR + pathW);
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(arq,true))){
			System.out.println("Escreva o que achar melhor!");
			bw.write(sc.nextLine());
			bw.write("\n");
		}catch(IOException e){
			e.printStackTrace();
		}

		try(BufferedReader br = new BufferedReader(new FileReader(arq))){
			String conteudo = br.readLine();
			while(conteudo != null ) {			
				System.out.println(conteudo);
				conteudo = br.readLine();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
=======
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

>>>>>>> dbd7bcf86b21f3714969a4fafe13389f149ef6db
}
