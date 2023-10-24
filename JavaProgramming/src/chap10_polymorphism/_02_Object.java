package chap10_polymorphism;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import chap10_polymorphism.tv.MiTv;

public class _02_Object {
	public static void main(String[] args) {
		// 1. Java의 모든 클래스들은 Object를 상속받아 만들어짐
		MiTv miTv = new MiTv();

		miTv.equals(miTv);

		Object obj = new MiTv();
		List<Object> list = new ArrayList<>();

		Object obj2 = new ArrayList<>();

		// Map<String, Object> => value의 타입을 Object로 정했기 때문에 value에는 모든 클래스가 들어갈 수 있다.
		Map<String, Object> map = new HashMap<>();
		map.put("a", "b");
		map.put("b", 1);
		map.put("c", new ArrayList<String>());
	}
}
