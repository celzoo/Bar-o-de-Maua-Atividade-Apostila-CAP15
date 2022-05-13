package entity;

public class Conta {
	int saldo;
	String name;



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Conta(int saldo, String name) {
		super();
		this.saldo = saldo;
		this.name = name;
	}
	
	public  String toString() {
		return "" + saldo ;
	}

	

}
