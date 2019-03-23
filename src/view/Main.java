package view;

import controller.Tree;

public class Main {
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.inserir(tree.raiz, 10);
		tree.inserir(tree.raiz, 15);
		tree.inserir(tree.raiz, 13);
		tree.posOrdem(tree.raiz);
	}
}
