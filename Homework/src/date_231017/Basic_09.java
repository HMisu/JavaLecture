package date_231017;

public class Basic_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		
		int num=0;
		int index=0;
		while(index<10) {
			num++;
			if(num%3==0) {
				arr[index]=num;
				index++;

			}
		}

		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		
	}
}