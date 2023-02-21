package exercicio3;

import java.util.Locale;

public class TestaGame {

	public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        
        Produto produto1 = new Produto("FUNKO POP STAR WARS","colecionadores",
                "3DNXWFYXD", 1, 239.99);
        
        Produto produto2 = new Produto("PLAYSTATION 5","Consoles",
                "J6PUN3LSJ", 1, 6698.00);

        produto1.visulizar();
        produto2.visulizar();

    }
}

