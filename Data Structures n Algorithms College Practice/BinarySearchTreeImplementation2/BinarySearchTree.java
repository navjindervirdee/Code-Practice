public class BinarySearchTree{
	static class Node{
		int key;
		Node parent;
		Node left;
		Node right;
		
		public Node(int data){
			this.key=data;
			this.parent=null;
			this.left=null;
			this.right=null;
		}

	}

	static Node root;

	public BinarySearchTree(){
		root=null;
	}

	public static Node find(int data){
		if(root==null){
			System.out.println("Empty Tree");
		}
		
		Node temp=root;
		Node prev=null;
		
		while(temp!=null){
			prev=temp;
			
			if(temp.key==data){
				return prev;
			}
			if(temp.key>data){
				temp=temp.left;
			}
			else{
				temp=temp.right;
			}
		}
		return prev;
	}

	public static void add(int data){
		Node node = new Node(data);
		Node positionNode = find(data);
		if(positionNode==null){
			root=node;
			return;
		}
	
		node.parent=positionNode;

		if(node.key>positionNode.key){
			positionNode.right=node;
		}
		else{
			positionNode.left=node;
		}
	}

	public static Node next(int data){
		if(root==null){
			return null;
		}
		
		Node node = find(data);
		if(node.right!=null){
			return leftDecesdant(node.right);
		}
		else{
			return rightAncestor(node);
		}
	}

	private static Node leftDecesdant(Node node){
		Node temp=node;
		while(temp.left!=null){
			temp=temp.left;
		}
		return temp;
	}

	private static Node rightAncestor(Node node){
		Node temp=node.parent;
		while(temp!=null){
			if(temp.key>node.key){
				break;
			}
			temp=temp.parent;
		}
		if(temp==null){
			System.out.println("Max Element");
			return node;
		}
		else{
			return temp;
		}
	}
	
	private static Node remove(int data){
		Node node = find(data);
		if(node.right==null){
			if(root==node){
				root=node.left;
				return node;
			}
			if(node.parent.left==node){
				node.parent.left=node.left;
			}
			else{
				node.parent.right=node.left;
			}
			return node;
		}
		
		else{
			Node temp = next(data);
			node.key=temp.key;
			if(temp.parent.left==temp){
				temp.parent.left=temp.right;
			}
			if(temp.parent.right==temp){
				temp.parent.right=temp.right;
			}
		}
		return node;
	}

	public static Node maxNode(){
		if(root==null){
			return null;
		}
		Node temp=root;
		while(temp.right!=null){
			temp=temp.right;
		}
		return temp;
	}

	public static Node minNode(){
		if(root==null){
			return null;
		}
		Node temp = root;
		while(temp.left!=null){
			temp=temp.left;
		}
		return temp;
	}

	private static void inorderTraversal(Node rootNode){
		if(rootNode==null){
			return;
		}
		inorderTraversal(rootNode.left);
		System.out.print(rootNode.key + " ");
		inorderTraversal(rootNode.right);
	}

	private static void preorderTraversal(Node rootNode){
		if(rootNode==null){
			return;
		}
		System.out.print(rootNode.key + " " );
		preorderTraversal(rootNode.left);
		preorderTraversal(rootNode.right);
	}

	private static void postorderTraversal(Node rootNode){
		if(rootNode==null){
			return;
		}
		postorderTraversal(rootNode.left);
		postorderTraversal(rootNode.right);
		System.out.print(rootNode.key + " ");
	}

	public static void display(){
		System.out.println();
		System.out.println("Inorder Traversal");
		inorderTraversal(root);

		System.out.println();
		System.out.println("PreOrder Traversal");
		preorderTraversal(root);

		System.out.println();
		System.out.println("PostOrder Traversal");
		postorderTraversal(root);

		System.out.println();
	}

	public static void main(String [] args){
		BinarySearchTree tree = new BinarySearchTree();
		tree.add(10);
		tree.add(6);
		tree.add(14);
		tree.add(8);
		tree.add(12);
		tree.add(4);
		tree.add(16);

		tree.display();

		System.out.println();
		Node maxNode = tree.maxNode();
		System.out.println("max" + maxNode.key);
		Node minNode = tree.minNode();
		System.out.println("min" + minNode.key);
	
		System.out.println();	
		Node node1 = tree.find(8);
		System.out.println(node1.key);
		Node node2 = tree.find(16);
		System.out.println(node2.key);
		Node node3 = tree.find(10);
		System.out.println(node3.key);
		Node node4 = tree.find(4);
		System.out.println(node4.key);

		System.out.println();
		tree.display();

		Node next1 = tree.next(16);
		Node next2 = tree.next(10);
		Node next3 = tree.next(4);
		Node next4 = tree.next(8);
		Node next5 = tree.next(14);
		Node next6 = tree.next(12);
		Node next7 = tree.next(6);

		System.out.println();	
		System.out.println("next1" + " " + next1.key);
		System.out.println("next2" + " " + next2.key);
		System.out.println("next3" + " " + next3.key);
		System.out.println("next4" + " " + next4.key);
		System.out.println("next5" + " " + next5.key);
		System.out.println("next6" + " " + next6.key);
		System.out.println("next7" + " " + next7.key);

		Node del1 = tree.remove(14);
		Node del2 = tree.remove(10);
		Node del3 = tree.remove(4);
		Node del4 = tree.remove(6);
		Node del5 = tree.remove(16);
		
		System.out.println();		
		System.out.println();
		System.out.println("del1" + " " + del1.key);
		System.out.println("del2" + " " + del2.key);
		System.out.println("del3" + " " + del3.key);
		System.out.println("del4" + " " + del4.key);
		System.out.println("del5" + " " + del5.key);
		
		System.out.println();
		tree.display();
		
		System.out.println();
		Node max = tree.maxNode();
		System.out.println("max" + max.key);
		Node min = tree.minNode();
		System.out.println("min" + min.key);
		
	}
}

		

		
		
			
			

			
			

		
		






























							