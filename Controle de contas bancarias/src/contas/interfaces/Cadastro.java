package contas.interfaces;

import contas.entity.Information;

public interface Cadastro {
	void cadastrar(Information info);
	void atualizarSaldo(int id, double saldo);

}
