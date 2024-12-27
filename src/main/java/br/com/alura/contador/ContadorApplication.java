package br.com.alura.contador;

import br.com.alura.contador.service.GeradorSequencia;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ContadorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ContadorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/**
		 * 1 - Crie um novo projeto com Spring Boot, usando o site start.spring.io. Esse projeto será o contador,
		 * e funcionará na linha de comando. Você deve pedir para um usuário digitar um número e depois imprimir
		 * na tela uma contagem de 1 até o número digitado pelo usuário.
		 */

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um número inteiro maior que zero: ");
			int numero = scan.nextInt();
			System.out.println("Sequência gerada: ");
			var gerador = new GeradorSequencia();
			var list = gerador.geraSequencia(numero);
			System.out.println(list);
		}

	}
}
