package application;

import java.io.BufferedReader;
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
}
