package BiggestV;

public class BiggestV {

	public static void main(String[] args) {

		int[]num={6,18,21,1,92,13};

		int largest=num[0];

		for(int i=0; i<6; i++){

			if(largest<num[i]){

				largest=num[i];
			}
		}
		
	System.out.println(largest);

		if(num[0]>num[1]&&num[0]>num[2]&&num[0]>num[3]&&num[0]>num[4]&&num[0]>num[5]){

			System.out.println(num[0]);
		}

		if(num[1]>num[0]&&num[1]>num[2]&&num[1]>num[3]&&num[1]>num[4]&&num[1]>num[5]){

			System.out.println(num[1]);
		}

		if(num[2]>num[1]&&num[2]>num[0]&&num[2]>num[3]&&num[2]>num[4]&&num[2]>num[5]){

			System.out.println(num[2]);
		}

		if(num[3]>num[1]&&num[3]>num[2]&&num[3]>num[0]&&num[3]>num[4]&&num[3]>num[5]){

			System.out.println(num[3]);
		}

		if(num[4]>num[1]&&num[4]>num[2]&&num[4]>num[3]&&num[4]>num[0]&&num[4]>num[5]){

			System.out.println(num[4]);
		}

		if(num[5]>num[1]&&num[5]>num[2]&&num[5]>num[3]&&num[5]>num[4]&&num[5]>num[0]){

			System.out.println(num[5]);
		}
	}
}