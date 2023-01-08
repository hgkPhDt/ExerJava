package torres.philip.main;

import torres.philip.entities.Funcionario;

public class Main {
	public static void main(String[] args) {
		Funcionario f01 = new Funcionario();
		Funcionario f02 = new Funcionario();
		
		f01.nome = "Philip";
		f01.idade = 26;
		f01.salario = 5.000;
		
		f02.nome = "Amanda";
		f02.idade = 94;
		f02.salario = 10.000;
		
		imprimir(f01,f02);
		System.out.println();
		System.out.println();
		System.out.println("A média salarial é de: "+mediaSalarial(f01.salario, f02.salario)+" Reais");
		
	}
	
	public static double mediaSalarial(double... salario) {
		double somar = 0;
		for(double d : salario) {
			somar += d;
		}
		
		return somar / salario.length;
	}
	
	public static void imprimir(Funcionario... funcionario) {
		for (Funcionario x : funcionario) {
			System.out.println("##############");
			System.out.println(x.nome+"\n"+x.idade +"\n"+ x.salario);
		}
	}
}
