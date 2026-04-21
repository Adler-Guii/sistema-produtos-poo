package Loja;

public class ProdutoComDesconto extends Produto{

	private double desconto;
	
	public ProdutoComDesconto(String nome, double preco, double desconto) {
		super(nome, preco);
		this.desconto = desconto;
		
	}

	@Override
	public double precoFinal() {
		return super.precoFinal()- desconto;
	}

	
}
