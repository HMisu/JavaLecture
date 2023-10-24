package chap05_array;

public class _03_ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chArr = {'b','I','t','C'};
		char[] convertArr = new char[4];
		
		for(int i=0; i<chArr.length;i++) {
			char c = chArr[i];
			
			convertArr[i] = ('a'<=c||c>='z')?(char) (c-32):(char) (c+32);
		}
		
		for(int j=0; j<convertArr.length; j++) {
			System.out.println("convertArr["+j+"]: "+convertArr[j]);
		}
	}

}
