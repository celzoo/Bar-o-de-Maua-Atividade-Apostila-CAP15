import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		
		Map	mapaDeContas	=	new	HashMap();
		
		mapaDeContas.put("diretor",	10);
		mapaDeContas.put("gerente",	20);
		
		System.out.println(mapaDeContas.get(mapaDeContas));

	}

}
