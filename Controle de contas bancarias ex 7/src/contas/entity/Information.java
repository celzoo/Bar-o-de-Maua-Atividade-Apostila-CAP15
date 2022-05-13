package contas.entity;

import java.util.Objects;

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
	
	@Override
	public int hashCode() {
		return Objects.hash(agencia, cpf, id, name, saldo, tipoDeConta);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Information other = (Information) obj;
		return Objects.equals(agencia, other.agencia) && Objects.equals(cpf, other.cpf)
				&& Double.doubleToLongBits(id) == Double.doubleToLongBits(other.id) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(saldo) == Double.doubleToLongBits(other.saldo)
				&& Objects.equals(tipoDeConta, other.tipoDeConta);
	}
	
	

}
