package treeSumme;


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
		
		int Sum;
		boolean Run = true;
		
		while(Run == true) {
			
			
		}
		
		/*
		Sum = theTree.root.getValue();
		Sum = Sum + theTree.root.getLeftSubValue() + theTree.root.getRightSubValue();
		Sum = Sum + theTree.root.leftSub.getRightSubValue() + theTree.root.leftSub.getLeftSubValue();
		Sum = Sum + theTree.root.leftSub.getLeftSubValue();
		*/
		System.out.println(Sum);
		//System.out.println("Sum of all nodes is  " + theTree.Sum(theTree.root));
		//System.out.println("The sum of all Nodes is: " + theTree.NodesSum(sum));
		
	}

/*
int Sum(Node selected) {
	
	if (selected != null ) {
		return Sum(selected.leftSub) + Sum(selected.rightSub) + selected.getValue();
	}else {
		return 0;
	}
}
*/

	
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
