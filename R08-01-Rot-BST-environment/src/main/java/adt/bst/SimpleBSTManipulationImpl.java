package adt.bst;

import adt.bt.BTNode;

/**
 * - Esta eh a unica classe que pode ser modificada 
 * @author adalbertocajueiro
 *
 * @param <T>
 */
public class SimpleBSTManipulationImpl<T extends Comparable<T>> implements SimpleBSTManipulation<T> {

	@Override
	public boolean equals(BST<T> tree1, BST<T> tree2) {
		return equals(tree1.getRoot(), tree2.getRoot());
	}

	private boolean equals(final BTNode<T> root1, final BTNode<T> root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		if (root1 == null) {
			return false;
		}
		if (root2 == null) {
			return false;
		}
		if (!root1.equals(root2)) {
			return false;
		}
		return equals(root1.getLeft(), root2.getLeft()) && equals(root1.getRight(), root2.getRight());
	}

	@Override
	public boolean isSimilar(BST<T> tree1, BST<T> tree2) {
		return isSimilar(tree1.getRoot(), tree2.getRoot());
	}

	private boolean isSimilar(final BTNode<T> node1, final BTNode<T> node2) {
		if (node1 == null && node2 == null) {
			return true;
		}
		if (node1 == null) {
			return false;
		}
		if (node2 == null) {
			return false;
		}
		return isSimilar(node1.getLeft(), node2.getLeft()) && isSimilar(node1.getRight(), node2.getRight());
	}

	@Override
	public T orderStatistic(BST<T> tree, int k) {
		BSTNode<T> number = tree.minimum();

		while (k > 1) {
			if (number == null) {
				return null;
			}
			number = tree.sucessor(number.getData());
			--k;
		}

		return number.getData();
	}

}
