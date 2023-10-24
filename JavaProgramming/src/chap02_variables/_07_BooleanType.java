package chap02_variables;

public class _07_BooleanType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 사용자 id 지정
		String userId = "javabasic";
		
		// 2. 유효성 검사 플래그 변수 선언
		boolean isValidated = false;
		
		// 3. 사용자 id의 유효성 검사
		if(userId.length() > 8 && userId.length() <=20)
			isValidated = true;
		
		//if(isValidated) == if(isValidated == true)
		//if(!isValidated) == if(isValidated == false)
		if(isValidated == true)
			System.out.println("사용할 수 있는 아이디입니다.");
		else
			System.out.println("아이디는 8자 이상 20자 이하로 지정해주세요");
		
		
	}

}
