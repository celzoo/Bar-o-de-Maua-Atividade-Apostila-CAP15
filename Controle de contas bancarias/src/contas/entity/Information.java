package contas.entity;

public class Information {
	double id;
	String agencia;
	double saldo;
	String name;
	String cpf;
	String tipoDeConta;
	public void setId(double id) {
		this.id = id;
	}
	public double getId() {
		return id;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Information(double id, String agencia, double saldo, String name, String cpf, String tipoDeConta) {
		super();
		this.id = id;
		this.agencia = agencia;
		this.saldo = saldo;
		this.name = name;
		this.cpf = cpf;
		this.tipoDeConta = tipoDeConta;
	}
	
	

}
