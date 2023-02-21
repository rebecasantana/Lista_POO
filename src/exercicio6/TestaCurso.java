package exercicio6;

import java.util.Locale;

public class TestaCurso {
	
	public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        
        Curso curso1 = new Curso("Análise e Desenvolvimento de Sistemas", "Tecnólogo", "2 anos e meio"
                ,"Puc Campinas", 759.09);

        Curso curso2 = new Curso("DATA SCIENCE","MBA","1,5 anos"
              ,"Fiap",790.00);
        
        curso1.visualizar();
        curso2.visualizar();
    }
}