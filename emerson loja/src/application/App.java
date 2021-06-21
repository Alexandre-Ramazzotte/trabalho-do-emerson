package application;
import entities.*;
import relations.*;
import java.util.Date;

public class App {

	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua Tiradentes", "Vila República", 666, "São Paulo", "São Paulo", "Brasil", "000.000.000-00");
		String [] numeros = {"12345678", "987654321"};
		Cliente cliente1 = new Cliente("Emerson", "000-000-000", numeros, endereco1);
		Peça peca1 = new Peça("Processador", "Peça de computador", 500.99);
		Vendedor vendedor1 = new Vendedor("Daniel", "000-000-000", 5.0);
		
		Date date = new Date(System.currentTimeMillis());
		
		Venda venda1 = new Venda(date, 20, peca1, cliente1, vendedor1); 
	}

}
