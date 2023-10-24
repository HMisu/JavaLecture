package chap03_operator;

import java.util.*;

public class _practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2,1,3,4,1};
		int[] answer = {};
        
        List<Integer> resultList = new ArrayList<>();

        //numbers에서 서로 다른 인덱스에 있는 수 뽑아 더해 만들 수 있는 모든 수 배열에 넣기
        for(int i=0; i<numbers.length; i++){
       	 //System.out.println("i: " + numbers[i]);
           for(int j=i+1; j<numbers.length; j++){
               //System.out.println(numbers[i]+numbers[j]);
               if(!resultList.contains(numbers[i]+numbers[j]))
                   resultList.add(numbers[i]+numbers[j]);
           }
       }
        
        Collections.sort(resultList);
        //java8 이상 stream API 사용
        answer = resultList.stream().mapToInt(i->i).toArray();
        System.out.println(Arrays.toString(answer));
	}

}
