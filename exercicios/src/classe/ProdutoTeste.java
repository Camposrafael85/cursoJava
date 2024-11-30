package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		Produto p1 = new Produto("Notebook", 4326.89, 0.25);
				
		var p2 = new Produto();
		p2.nome = "Caneta Pret";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precofinal1 = p1.precoComDesconto();
		double precofinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precofinal1 + precofinal2) / 2;
		
		System.out.printf("Média do carrinho = R$%.2f. ", mediaCarrinho);
		/**/
		

	}

}