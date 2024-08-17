//Electricity Bill problem (Famous Problem)
//Given an integer input A which represents units of electricity consumed at your house
//Calculate and print the bill amount 
//units<=100 : price per unit is 1
//units>=100 : price per unit 2
//1)Input=50
//Output=100

class Ladder{
	public static void main(String[]args){
		int units=200;
		if(units<=100){
			System.out.println(units*1);
		}else{
			System.out.println(100*1 + (units-100)*2);
		}
	}
}



//Here we use logic where the units less than 1 is multiplied by 1 i.e.,(units*1)
//and if units more than 100 then we use logic  how many units more than 100 is multiflied by 2 i.e.,(units-100)*2 
//and the fisrt 100 units into it in else condition (units*1 + (units-100)*2)
