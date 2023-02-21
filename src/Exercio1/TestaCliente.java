package Exercio1;

public class TestaCliente {

	public static void main(String[] arg) {

 Cliente cliente1 = new Cliente("Bruna", "(82) 99114-1074", "559.051.534-34", "bruna.amanda@gmail.com",
 "Distrito Baixa da Onças,Povoado Baixa da Onça");

 Cliente cliente2 = new Cliente("Roberto Joaquim da Cunha", "(82) 98855-0596", "420.685.304-57", "roberto_joaquim_dacunha@gmail.com",
 "Avenida Silvestre Péricles, s/n,Centro");

		cliente1.visualizar();
		cliente2.visualizar();
	}
}