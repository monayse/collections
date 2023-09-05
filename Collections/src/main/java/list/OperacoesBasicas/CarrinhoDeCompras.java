package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	private List<Item> itemList;
	
public CarrinhoDeCompras() {
	this.itemList = new ArrayList<>();
}

public void adicionarItem( String nome, double preco, int quantidade) {
	Item item = new Item(nome, preco, quantidade);
	this.itemList.add(item);
	
}
public void removerItem(String nome, double preco, int quantidade) {
	List<Item> itensParaRemover = new ArrayList<>();
	if (!itemList.isEmpty()) {
		for (Item i: itemList) {
			if (i.getNome().equalsIgnoreCase(nome)) {
				itensParaRemover.add(i);
					}
		}
		itemList.removeAll(itensParaRemover);}
		else {
			System.out.println("A lista está vazia");
		}
	}


public double calcularValorTotal() {
	double valorTotal = 0d;
	if (!itemList.isEmpty()) {
		for (Item item : itemList) {
			double valorItem = item.getPreco() * itemQuant();
			valorTotal += valorItem;
		}
		return valorTotal;
		}else {
			throw new RuntimeException("A lista está vazia.");
		}
	}

private int itemQuant() {
	// TODO Auto-generated method stub
	return 0;
}

private void exibirItens() {
	if (!itemList.isEmpty()) {
		System.out.println(this.itemList);
	}else  {
		System.out.println("A lista está vazia.");
	}
}
public static void main(String[] args) {
	CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
	
	carrinhoDeCompras.adicionarItem("caneta", 2d, 5);
	carrinhoDeCompras.adicionarItem("borracha", 4d, 7);
	carrinhoDeCompras.adicionarItem("lápis", 35d, 67);
	
	carrinhoDeCompras.exibirItens();
	
}
	
}