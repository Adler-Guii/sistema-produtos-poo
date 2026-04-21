package Loja;

import Loja.Produto;
import Loja.ProdutoComDesconto;

public class Program {

	public static void main(String[] args) {

		Produto p1 = new Produto("Teclado", 200.0);
		Produto p2 = new ProdutoComDesconto("MOUSE", 100.0,20.0);
		Produto p = new ProdutoComDesconto("Notebook", 3000.0, 500.0);
		
		System.out.println(p.precoFinal());
		
		System.out.println("Produto normal: " + p1.precoFinal());
		System.out.println("Produto com desconto:" + p2.precoFinal());

	}

}
