package Second_SmallestV;

public class Second_SmallestV {

	public static void main(String[] args) {

		int[]num={18,21,2,12,70,60};

		int smallest=num[0];

		int secondsmallest=num[0];

		for(int i=0; i<num.length; i++){

			if(smallest>num[i]){

				smallest=num[i];

			}
		}

		for(int i=0; i<num.length; i++){

			if(num[i]<secondsmallest && num[i]>smallest){

				secondsmallest=num[i];
			}
		}

		System.out.println(smallest);
		System.out.println(secondsmallest);
	}
}