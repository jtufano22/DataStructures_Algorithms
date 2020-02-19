package bca.util;

public class BCATreeNode<E extends Comparable<E>> {
	protected E element;
	protected BCATreeNode<E> left = null;
	protected BCATreeNode<E> right = null;

	public BCATreeNode(E element) {
		this.element = element;
	}
}
