public class DisjointSet{
	
	int [] parent;
	int [] rank;
	int numofElements;

	public DisjointSet(int length){
		numofElements=length;
		parent= new int[numofElements];
		rank = new int[numofElements];
	}
	
	public void makeSet(int id)throws Exception{
		if(id>=numofElements){
			throw new Exception("SIze exceeded!");
		}
		parent[id]=id;
		rank[id]=0;
	}

	public int find(int id)throws Exception{
		if(id>=numofElements){
			throw new Exception("Invalid Id!");
		}
		if(id==parent[id]){
			return parent[id]; 
		}
		return find(parent[id]);
	}

	public void union(int id1, int id2)throws Exception{
		if(id1>=numofElements || id2>=numofElements){
			throw new Exception("Invalid Id!");
		}
		int parentid1 = find(id1);
		int parentid2 = find(id2);
		
		if(parentid1==parentid2){
			return;
		}

		if(rank[parentid1]>rank[parentid2]){
			parent[parentid2]=parentid1;
		}
		else{
			parent[parentid1]=parentid2;
			if(rank[parentid1]==rank[parentid2]){
				rank[parentid2]=rank[parentid2]+1;
			}
		}
	}
}
			
		
	