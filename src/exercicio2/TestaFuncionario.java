package exercicio2;

import java.util.Locale;

public class TestaFuncionario {

		public static void main(String[] args) {

	        Locale.setDefault(Locale.US);
	        
	        Funcionario funcionario1 = new Funcionario("Rebeca","010523",
	                "Desenvolvedora backEnd jr",4000.00,00);

	        Funcionario funcionario2 = new Funcionario("Oscar","010524",
	                "Quality Assurance",6000.00,00);

	        funcionario1.visulizar();
	        funcionario2.visulizar();
	    }
	}
