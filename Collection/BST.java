package Collection;

import java.util.ArrayList;
import java.util.Spliterator;

class Node {
	int key;
	Node left,right;
	
	Node (int key) {
		this.key = key;
		left = right = null;
	}
}

public class BST {	
		
	Node constructTree(ArrayList<Integer> al, int low, int high) {
			
		int next,lefti;
		if (low > high) {
			return null;
		}
		Node root = new Node((Integer)al.get(low));
		
		if (low == high) {
			return root;
		}		
		next = BST.getIndex(root,al,low+1,high);	
		root.left = constructTree(al,low+1,next-1);	
		root.right = constructTree(al,next,high);
		return root;		
	}
	
	static int getIndex(Node root, ArrayList<Integer> al, int i, int high) {
		int j = i;
		while(j<=high) {
			if ((Integer)al.get(j) > root.key) {
				break;
			}
			j+=1;
		}
		return j;
	}
	void inorderTraversal(Node root) {
		if (root == null) {
			return;
		}
		
		inorderTraversal(root.left);
		System.out.println(root.key);
		inorderTraversal(root.right);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST b = new BST();
		Node root;
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(5);
		al.add(1);
		al.add(7);
		al.add(40);
		al.add(35);
		al.add(50);
		
        root = b.constructTree(al, 0, al.size()-1);
        b.inorderTraversal(root);
       // System.out.println(root.right.left.key);
        
	}

}
