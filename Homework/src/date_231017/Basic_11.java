package date_231017;

public class Basic_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10)+1;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
		}
	}

}
