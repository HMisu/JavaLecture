package chap09_inherit;

import chap09_inherit.animal.Bird;
import chap09_inherit.animal.Tiger;

public class _02_Overrding {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();

		tiger.eat();
		tiger.sleep();

		Bird bird = new Bird();

		bird.eat();
		bird.sleep();
	}

}
