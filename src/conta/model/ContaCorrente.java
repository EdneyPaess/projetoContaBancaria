package conta.model;

public class ContaCorrente extends Conta {
	
	private float limite;

	
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
	this.limite= limite;
	
	}
	
	//métodos get e set

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	//método sacar
	@Override //Foi adicionado na assinatura do Método a anotação @Override, indicando que o Método foi sobrescrito
	public boolean sacar(float valor) {
		if(this.getSaldo()+this.getLimite() < valor) {
			System.out.println("\n Saldo insuficiente!");
			return false;
		}
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}
	
	//método visualizar
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Limite de Créditos: "+ this.limite);
	}
	//Foi adicionado o comando super.visualizar(), que executa o Método visualizar da Classe Conta. O comando super pode ser utilizado na Classe filha pra chamar qualquer Método da Classe pai.
	
}
