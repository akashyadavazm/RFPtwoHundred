package day15problems;

public class BinarySearchTree {
	static Node root;
	static boolean flag = true;

	public void Insert(int data) {
		Node node = new Node(data);
		node.data = data;
		node.left = null;
		node.right = null;
		if (root == null) {
			root = node;
			return;
		} else {
			Node parent = root;
			Node current = root;
			while (current != null) {
				parent = current;
				if (node.data > current.data) {
					current = current.right;

				} else {
					current = current.left;
				}

			}
			if (node.data > parent.data) {
				parent.right = node;
			} else {
				parent.left = node;
			}
		}

	}

	public void inorderDisplay(Node node) {
		if (node.left != null) {
			inorderDisplay(node.left);
		}

		System.out.print(node.data + " ");

		if (node.right != null) {
			inorderDisplay(node.right);
		}

	}

	public void searchNode(Node node, int value) {

		if (root == null)
			System.out.println("Tree is empty");
		else {

			if (node.data == value) {
				flag = true;
				return;
			}
			if (flag == false && node.left != null) {
				searchNode(node.left, value);
			}
			if (flag == false && node.right != null) {
				searchNode(node.right, value);
			}
		}
	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();

		tree.Insert(56);
		tree.Insert(30);
		tree.Insert(70);
		
		System.out.println(root.data);
	}

}
