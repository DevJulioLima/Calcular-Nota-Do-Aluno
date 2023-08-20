import java.util.Locale;
import java.util.Scanner;

import util.Aluno;

public class projetoaluno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("digite o nome do aluno: ");
		aluno.aluno = sc.nextLine();
		System.out.println("digite a primeira nota do aluno");
		aluno.nota1 = sc.nextDouble();
		System.out.println("digite a segunda nota do aluno");
		aluno.nota2 = sc.nextDouble();
		System.out.println("digite a terceira nota do aluno");
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("NOTA FINAL: %.2f%n", aluno.notaFinal());
		if (aluno.notaFinal() < 60.0) {
		System.out.println("RECUPERACAO");
		System.out.printf("FALTA %.2f POINTS%n", aluno.pontosRestantes());
		}
		else {
		System.out.println("APROVADO");
		sc.close();

	}
		

	}

}
