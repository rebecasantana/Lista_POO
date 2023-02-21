package exercicio4;

import java.util.Locale;

public class TestaFarmacia {

	public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        
        Farmacia Farmacia1 = new Farmacia("DORFLEX","Medicamentos",
                "006036","SANOFI-AVENTIS", 5.30);

        Farmacia Farmacia2 = new Farmacia("SABONETE DOVE","Higiene",
                "021238","UNILEVER BRASIL", 6.00);
  
        Farmacia1.visulizar();
        Farmacia2.visulizar();
    }

}
