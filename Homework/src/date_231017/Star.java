package date_231017;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		다음과 같이 출력하세요.
			    *
			   ***
			  *****
			 *******
			*********
		*/
		
		int num=5;
		for(int i=1; i<=num; i++) {
			for(int j=0; j<num-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
