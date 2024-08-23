//Given an integer N
//Print all its digit reverse
//i/p=6531
//o/p=  1
//	3
//	5
//	6

class While{
	public static void main(String []args){
		int N=6531;
		while(N!=0){  //check the N!=0 then runs the loop
			System.out.println(N%10); 	//Gives the reminder
			N=N/10;		//divide the N but it is in float but he declared int 						//divide only gives o/p in integer
		}
	}
}


		//Dry Run=
//			SOP=(6531%10)=1
//			N=(N/10)=653
//
//			SOP=(653%10)=3
//			N=(N/10)=65
