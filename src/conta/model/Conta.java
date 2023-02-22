package conta.model;

public class Conta {
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;

	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
		// a palavra reservada this foi usada para diferenciar o Atributo da Classe
		// Conta do parâmetro do Método Construtor da Classe Conta.
		// this.numero Diferenciar os Atributos da classe
		// = numero; Parâmetro do método Construtor

		// com isso os valores atribuidos aos parametros do método construtor, será
		// passado para os atributos da classe

	}

	// Métodos get e set
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	// método sacar
	public boolean sacar(float valor) {
		if (this.getSaldo() < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}

	// método depositar
	public void depositar(float valor) {
		this.setSaldo(this.getSaldo() + valor);
	}

	// Método visualizar
	public void visualizar() {
		String tipo = " ";

		switch (this.tipo) {
		case 1:
			tipo = "Conta Corrente";
			break;
		case 2:
			tipo = "Conta Poupança";
			break;
		}
		System.out.println("\n\n*********************************************************** ");
		System.out.println("Dados da conta: ");
		System.out.println("\n\n*********************************************************** ");
		System.out.println("Numero da Conta: "+this.numero);
		System.out.println("Agência: "+this.agencia);
		System.out.println("Tipo da Conta: "+tipo);
		System.out.println("Titular: "+this.titular);
		System.out.println("Saldo: "+this.saldo);
		
	}
}
