package Pessoas;

public interface Vendedor {
	
	public double porcentagem_comissao = 0.1;
	
	public double venderProduto (double valor_compra, double valor_recebido);
	
	public boolean comissaoPorVenda(double valor_compra);

}