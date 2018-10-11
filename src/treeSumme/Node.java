package treeSumme;

import java.util.HashSet;
import java.util.Set;

public class Node{
	
	int value;
	String name;
		
	Node leftSub;
	Node rightSub;
	
	Set<Node> children = new HashSet<Node>();
		
	Node(int data, String call){
			
		this.value = data;
		this.name = call;
	}
	
	
	
	int getValue() {
		return value;
	}
	
	int getRightSubValue() {
		return rightSub.value;
	}
	
	int getLeftSubValue() {
		return leftSub.value;
	}



	public Set<Node> getChildren() {
		return children;
	}

	public void addChild(Node node) {
		this.children.add(node);
	}
}