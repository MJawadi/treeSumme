package treeSumme;

public class Node{
	
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
	
	int getRightSubValue() {
		return rightSub.value;
	}
	
	int getLeftSubValue() {
		return leftSub.value;
	}
}