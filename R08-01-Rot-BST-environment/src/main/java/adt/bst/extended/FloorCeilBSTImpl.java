package adt.bst.extended;

import adt.bst.BSTImpl;
import adt.bt.BTNode;

/**
 * Note que esta classe estende sua implementacao de BST (BSTImpl).
 * Dependendo do design que voce use, sua BSTImpl precisa ter apenas funcionando
 * corretamente o metodo insert para que voce consiga testar esta classe.
 */
public class FloorCeilBSTImpl extends BSTImpl<Integer> implements FloorCeilBST {

	@Override
	public Integer floor(Integer[] array, double numero) {
		for (Integer num : array) {
			super.insert(num);
		}

		return floor(super.getRoot(), numero);
	}

	private Integer floor(BTNode<Integer> node, Double numero) {
		if (isNull(node)) {
			return null;
		}
		if (numberIsEqualNode(node, numero)) {
			return node.getData();
		}
		if (isLeaf(node) && elementIsLessThanNode(numero, node)) {
			return null;
		}
		if (isLeaf(node)) {
			return node.getData();
		}
		if (elementIsLessThanNode(numero, node)) {
			return floor(node.getLeft(), numero);
		}
		return max(node, floor(node.getRight(), numero));
	}

	@Override
	public Integer ceil(Integer[] array, double numero) {
		for (Integer num : array) {
			super.insert(num);
		}

		return ceil(super.getRoot(), numero);
	}

	private Integer ceil(BTNode<Integer> node, Double numero) {
		if (isNull(node)) {
			return null;
		}
		if (numberIsEqualNode(node, numero)) {
			return node.getData();
		}
		if (isLeaf(node) && elementIsGreaterThanNode(numero, node)) {
			return null;
		}
		if (isLeaf(node)) {
			return node.getData();
		}
		if (elementIsGreaterThanNode(numero, node)) {
			return ceil(node.getRight(), numero);
		}
		return (min(node, ceil(node.getLeft(), numero)));
	}

	private boolean numberIsEqualNode(BTNode<Integer> node, Double numero) {
		return numero.compareTo(Double.valueOf(node.getData())) == 0;
	}

	private boolean elementIsGreaterThanNode(Double numero, BTNode<Integer> node) {
		return numero.compareTo(Double.valueOf(node.getData())) > 0;
	}

	private boolean isNull(Object obj) {
		return obj == null;
	}

	private boolean isLeaf(BTNode<Integer> node) {
		return isNull(node.getLeft()) && isNull(node.getRight());
	}


	private Integer max(BTNode<Integer> node1, Integer num) {
		if (isNull(node1)) {
			return num;
		}
		if (isNull(num)) {
			return node1.getData();
		}
		if (node1.getData().compareTo(num) > 0) {
			return node1.getData();
		}
		return num;
	}

	private Integer min(BTNode<Integer> node1, Integer num) {
		if (isNull(node1)) {
			return num;
		}
		if (isNull(num)) {
			return node1.getData();
		}
		if (node1.getData().compareTo(num) < 0) {
			return node1.getData();
		}
		return num;
	}

	private boolean elementIsLessThanNode(Double numero, BTNode<Integer> node) {
		return numero.compareTo(Double.valueOf(node.getData())) < 0;
	}
}
