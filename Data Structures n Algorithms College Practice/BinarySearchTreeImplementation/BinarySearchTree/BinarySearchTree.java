import java.util.*;
public class BinarySearchTree{
	int size;
	Node root;

	public BinarySearchTree(){
		this.size=0;
		this.root=null;
	}

	public Node find(int data){
		Node temp = root;
		Node prev = null;
		if(temp==null){
			return temp;
		}
	
		while(temp!=null){
			if(temp.key==data){
				return temp;
			}			

			if(data>temp.key){
				prev=temp;
				temp=temp.right;
				continue;
			}
			if(data<temp.key){
				prev=temp;
				temp=temp.left;
				continue;
			}
		}
		return prev;
	}

	public void insert(int data){
		Node node = new Node(data);
		Node parent = find(data);
		if(parent==null){
			root=node;
			return;
		}
		node.parent=parent;
		node.height=node.parent.height + 1;
		size++;
	
		if(data>parent.key){
			parent.right=node;
		}
		else{
			parent.left=node;
		}
	}

	//finds just the next big node than the given node.Works correctlly only when the given node is actually in the tree.
	//if the given key is largest then it returns the same node;
	public Node findNext(int data){
		Node temp = find(data);
		Node right = temp.right;
		Node parent= temp.parent;
		
		if(right!=null){
			while(right.left!=null){
				right=right.left;
			}
			return right;
		}
	
		while(parent!=null){
			if(parent.key>temp.key){
				return parent;
			}
			parent=parent.parent;
		}
		
		return temp;
	}
	

	//return the numbers between data1 and data2, including data1 and data2 if they are present in the tree.
	public List<Node> rangeSearch(int data1, int data2){
		List<Node> list = new ArrayList<Node>();
		Node node1 = find(data1);
		if(node1==null){
			return list;
		}
		

		while(node1.key<=data2){
			if(node1.key>=data1){
				list.add(node1);
			}
			Node temp = findNext(node1.key);
			if(temp==node1){
				break;
			}
			node1=temp;
			
		}
		return list;
	}

	public void delete(int data){
		Node temp = find(data);
		if(temp.key!=data){
			return;
		}

		if(temp.right==null){
			if(temp.parent==null){
				root=temp.left;
				if(root!=null){
					root.parent=null;
				}
				temp=null;
				return;
			}
			if(temp.left!=null){
				temp.left.parent=temp.parent;	
			}
			if(temp.parent.right==temp){
				temp.parent.right=temp.left;
				temp=null;
				return;
			}
			else{
				temp.parent.left=temp.left;
				temp=null;
				return;
			}
		}
		
		Node nextTemp = findNext(temp.key);
		if(nextTemp.right!=null){
			nextTemp.right.parent=nextTemp.parent;
		}
		if(nextTemp.parent==null){
			root=nextTemp.right;
		}
		if(nextTemp.parent!=null && nextTemp.parent.left==nextTemp){
			nextTemp.parent.left=nextTemp.right;
		}
		if(nextTemp.parent!=null && nextTemp.parent.right==nextTemp){
			nextTemp.parent.right=nextTemp.right;
		}
			
		
		if(temp.left!=null){
			temp.left.parent=nextTemp;
		}
		if(temp.right!=null){
			temp.right.parent=nextTemp;
		}
		nextTemp.left=temp.left;
		nextTemp.right=temp.right;
		nextTemp.parent=temp.parent;
		
		
		if(temp.parent==null){
			root=nextTemp;
			temp=null;
			return;
		}
		if(temp.parent.right==temp){
			temp.parent.right=nextTemp;
			temp=null;
			return;
		}
		temp.parent.left=nextTemp;
		temp=null;
	}
		
} 
			
		

			