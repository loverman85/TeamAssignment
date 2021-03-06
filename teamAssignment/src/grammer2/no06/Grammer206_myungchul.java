package grammer2.no06;
/*
	다음 자바 코드를 컴파일시 오류가 발생되는 이유를 적으시옹~
	parent.a와 parent.x는 private로 제한되어 있기 때문에 외부에서 호출이 불가능
	부모클래스로 선언된 변수는 자식 클래스의 객체를 담고 있더라도
	자식클래스에서 구현된 맴버를 호출할수 없다.
*/

public class Grammer206_myungchul {
	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		parent = child;
		child = (Child) parent;
		parent.superMethod();
		//parent.subMethod();
		child.superMethod();
		System.out.println(parent.a);
		System.out.println(parent.b);
		System.out.println(parent.c);
		/*System.out.println(parent.x);
		System.out.println(parent.y);
		System.out.println(parent.z);*/
		System.out.println("child~~~");
		System.out.println(child.a);
		System.out.println(child.b);
		System.out.println(child.c);
		System.out.println(child.x);
		System.out.println(child.y);
		System.out.println(child.z);
	}
}

class Parent {
	/*private*/ int a = 1;
	protected int b = 2;
	public int c = 3;

	public void superMethod() {
		System.out.println("superMethod");
	}
}

class Child extends Parent {
	/*private*/ int x = 4;
	protected int y = 5;
	public int z = 6;

	public void subMethod() {
		System.out.println("subMethod");
	}
}
