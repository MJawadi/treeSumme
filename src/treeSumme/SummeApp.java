package treeSumme;


public class SummeApp {
	
	
	Node root;

	public static void main(String[] args) {
		
		SummeApp theTree = new SummeApp();
		
		theTree.makeNode(1, "eins");
		theTree.makeNode(2, "zwei");
		theTree.makeNode(3, "drei");
		theTree.makeNode(4, "vier");
		theTree.makeNode(5, "funf");
		theTree.makeNode(6, "sechs");
		theTree.makeNode(7, "sieben");
		theTree.makeNode(8, "acht");
		theTree.makeNode(9, "neun");
		theTree.makeNode(10, "zehn");
		
		theTree.NodesSum(theTree.root);
		System.out.println(theTree.NodesSum(theTree.root));
		
		//System.out.println("The sum of all Nodes is: " + theTree.NodesSum(sum));
		
	}

int NodesSum(Node currentNode) {
	
	if (currentNode != null ) {
		return NodesSum(currentNode.leftSub) + NodesSum(currentNode.rightSub) + currentNode.getValue();
	}else {
		return 0;
	}
}

	
public void makeNode(int key, String name) {
	
	Node newNode = new Node(key , name);
	
	if (root == null) {
		root = newNode;
	}else {
		Node currentNode = root;
		Node owner;
		
		while(true) {
			owner = currentNode;
			
			if(key < currentNode.value) {
				
			  currentNode = currentNode.leftSub;
			
			  if (currentNode == null) {
				  
				  owner.leftSub = newNode;
				  return;
				
			  }
			  
			}else {
				currentNode = currentNode.rightSub;
				
				if(currentNode == null) {
					
					owner.rightSub = newNode;
					return;
				}
			}
		}
	}
}
}
	
class Node{
		
	int value;
	String Name;
		
	Node leftSub;
	Node rightSub;
		
	Node(int data, String call){
			
		this.value = data;
		this.Name = call;
	}
	
	int getValue() {
		return value;
	}
}

