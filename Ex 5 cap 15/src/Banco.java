import java.util.ArrayList;
import java.util.List;

public class Banco {
	int i;
	
	List<Conta> list  = new ArrayList();
	
	public void adicionaConta(Conta c) {
		list.add(c);
		i++;
	}
	
	public void pegaConta(int x) {
	System.out.println(list.get(x));	
	}
	
	public void pegaQuantidade() {
		System.out.println(i);
	}
	
	

}
