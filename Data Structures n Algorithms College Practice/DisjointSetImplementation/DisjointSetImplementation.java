public class DisjointSetImplementation{
	public static void main(String [] args){
		DisjointSet set = new DisjointSet(5);
		try{
			set.makeSet(0);
			set.makeSet(1);
			set.makeSet(2);
			set.makeSet(3);
			set.makeSet(4);

			System.out.println(set.find(0));
			System.out.println(set.find(1));
			System.out.println(set.find(2));
			System.out.println(set.find(3));
			System.out.println(set.find(4));
		
			set.union(4,3);
			System.out.println(set.find(4));
			System.out.println(set.find(3));
	
			set.union(0,1);
			System.out.println(set.find(1));
			System.out.println(set.find(0));

			set.union(1,2);
			System.out.println(set.find(2));
			System.out.println(set.find(1));

			set.union(2,3);
			System.out.println(set.find(3));
			System.out.println(set.find(2));

			System.out.println(set.find(0));
			System.out.println(set.find(1));
			System.out.println(set.find(2));
			System.out.println(set.find(3));
			System.out.println(set.find(5));
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}