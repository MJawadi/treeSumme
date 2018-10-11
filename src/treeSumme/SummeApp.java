package treeSumme;

import java.util.ArrayList;
import java.util.List;

public class SummeApp {

	Node root;

	public static void main(String[] args) {

		SummeApp theTree = new SummeApp();

		theTree.makeNode(50, "eins");
		theTree.makeNode(28, "zwei");
		theTree.makeNode(32, "drei");
		theTree.makeNode(45, "vier");
		theTree.makeNode(64, "funf");
		theTree.makeNode(63, "sechs");
		theTree.makeNode(11, "sieben");
		theTree.makeNode(20, "acht");
		theTree.makeNode(51, "neun");
		theTree.makeNode(15, "zehn");

		
		//System.out.println("The recursive Sum of all nodes is " + theTree.Sum(theTree.root));
		//System.out.println("The iterative Sum of all nodes is " + theTree.SumIter(theTree.root));
		//System.out.println(theTree.Sum(theTree.root) == theTree.SumIter(theTree.root));
		//System.out.println("The sum of all Nodes is: " + theTree.NodesSum(sum));
		//System.out.println(theTree.RechnerNode(theTree.root));
	}
	
	int RechnerNode(Node Top) {
		int sum = 0;
		if (Top != null) {
			sum = (Top.getLeftSubValue() + Top.getRightSubValue());
			return sum;
		}else {
			return 0;
		}
	}

	int Sum(Node selected) {

		if (selected != null) {
			int sum = 0;
			for(Node child : selected.getChildren()) { // Java for-each loop
				sum+=child.value;
			}
			sum+=Sum(selected.leftSub);
			sum+=Sum(selected.rightSub);
			sum+= selected.getValue();
			return sum;
		} else {
			return 0;
		}
	}


	int SumIter(Node selected) { // Convert the tree to a list so we can count their value easily
		int sum = 0;
		List<Node> stack = new ArrayList<Node>();
		stack.add(selected);
		while (true) {
			if (stack.size() == 0) {
				return sum;
			}
			Node current = stack.get(0);
			stack.remove(0);
			sum += current.value;
			if (current.leftSub != null) {
				stack.add(current.leftSub);
			}
			if (current.rightSub != null) {
				stack.add(current.rightSub);
			}
			for(Node node : current.children) {
				stack.add(node);
			}
		}
	}

	public void makeNode(int key, String name) {

		Node newNode = new Node(key, name);

		if (root == null) {
			root = newNode;
		} else {
			Node currentNode = root;
			Node owner;

			while (true) {
				owner = currentNode;

				if (key < currentNode.value) {

					currentNode = currentNode.leftSub;

					if (currentNode == null) {

						owner.leftSub = newNode;
						return;

					}

				} else {
					currentNode = currentNode.rightSub;

					if (currentNode == null) {

						owner.rightSub = newNode;
						return;
					}
				}
			}
		}
	}
}
