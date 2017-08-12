import java.util.*;
public class BinarySearchTree{
	int data;
	BinarySearchTree parentNode;
	BinarySearchTree leftNode;
	BinarySearchTree rightNode;	

	static int numofElements=0;
	static BinarySearchTree rootNode;

	public BinarySearchTree(){
		parentNode=null;
		leftNode=null;
		rightNode=null;
	}

	
	public void add(int number){
		BinarySearchTree node = new BinarySearchTree();
		node.data=number;
		
		
		if(numofElements==0){
			rootNode=node;
		}
		else{
			BinarySearchTree temp = rootNode;
			while(temp!=null){
				if(temp.data<number){
					if(temp.rightNode==null){
						temp.rightNode=node;
						node.parentNode=temp;
						break;
					}
					else{
						temp=temp.rightNode;
						continue;
					}
				}
				if(temp.data>number){
					if(temp.leftNode==null){
						temp.leftNode=node;
						node.parentNode=temp;
						break;
					}
					else{
						temp=temp.leftNode;
						continue;
					}
				}
			}
		}
		numofElements++;
	}
	
	
	public void display(String pattern) throws Exception {
		if(rootNode==null){
			throw new Exception("Empty tree!");
		}
		if(pattern=="inOrder"){
			inOrderDisplay(rootNode);
			System.out.println();
		}
		else{
			if(pattern=="preOrder"){
				preOrderDisplay(rootNode);
				System.out.println();
			}
			else{
				if(pattern=="postOrder"){
					postOrderDisplay(rootNode);
					System.out.println();
				}
				else{
					levelOrderDisplay(rootNode);
					System.out.println();
				}
			}
		}
	}				

	private BinarySearchTree inOrderDisplay(BinarySearchTree root){
		if(root==null){
			return root;
		}
		inOrderDisplay(root.leftNode);
		System.out.print(root.data + " ");
		inOrderDisplay(root.rightNode);
		return root;
	}

	private BinarySearchTree preOrderDisplay(BinarySearchTree root){
		if(root==null){
			return root;
		}
		System.out.print(root.data + " ");
		inOrderDisplay(root.leftNode);
		inOrderDisplay(root.rightNode);
		return root;
	}

	private BinarySearchTree postOrderDisplay(BinarySearchTree root){
		if(root==null){
			return root;
		}
		inOrderDisplay(root.leftNode);
		inOrderDisplay(root.rightNode);
		System.out.print(root.data + " ");
		return root;
	}

	private BinarySearchTree levelOrderDisplay(BinarySearchTree root){
		if(root==null){
			 return root;
		}
		Queue<BinarySearchTree> queue = new LinkedList<BinarySearchTree>();
		queue.add(root);
		while(queue.isEmpty()!=true){
			BinarySearchTree temp = queue.remove();
			System.out.print(temp.data + " ");
			if(temp.leftNode!=null){
				queue.add(temp.leftNode);
			}
			if(temp.rightNode!=null){
				queue.add(temp.rightNode);
			}
		}
		return root;
	}

	public boolean findNode(int number)throws Exception{
		if(rootNode==null){
			throw new Exception("Empty tree!");
		}
		BinarySearchTree temp = rootNode;
		boolean result=false;
		while(temp!=null){
			if(temp.data==number){
				result=true;
				break;
			}
			if(temp.data>number){
				temp=temp.leftNode;
				continue;
			}
			if(temp.data<number){
				temp=temp.rightNode;
				continue;
			}
		}
		if(result==false){
			return false;
		}
		else{
			return true;
		}
	}
}
		
		
					
				

	
	