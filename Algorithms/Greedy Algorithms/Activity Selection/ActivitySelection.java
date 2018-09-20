import java.util.*;
public class ActivitySelection{
	static class Activity{
		int startTime;
		int finishTime;
		int activityNum;

		public Activity(int activityNum, int startTime, int finishTime){
			this.activityNum=activityNum;
			this.startTime = startTime;
			this.finishTime = finishTime;
		}
	}
	
	public static ArrayList<Activity> selectActivity(Activity [] activities){
		ArrayList<Activity> list = new ArrayList<Activity>();
		list.add(activities[0]);
		int last = 0;
		for(int i=1;i<activities.length;i++){
			if(activities[i].startTime>=activities[last].finishTime){
				list.add(activities[i]);
				last=i;
			}
		}

		return list;
	}

	public static void display(ArrayList<Activity> list){
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).activityNum + " " + list.get(i).startTime + " " + list.get(i).finishTime);
		}
	}

	public static void main(String [] args){
	 	Activity [] array = new Activity[11];
		  
		array[0] = new Activity(1,1,4);
		array[1] = new Activity(2,3,5);
		array[2] = new Activity(3,0,6);
		array[3] = new Activity(4,5,7);
		array[4] = new Activity(5,3,8);
		array[5] = new Activity(6,5,9);
		array[6] = new Activity(7,6,10);
		array[7] = new Activity(8,8,11);
		array[8] = new Activity(9,8,12);
	 	array[9] = new Activity(10,2,13);
		array[10] = new Activity(11,12,14);
		
		display(selectActivity(array));
	}
}
		
		
		



		
		 