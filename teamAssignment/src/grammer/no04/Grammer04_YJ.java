package grammer.no04;

//다음 프로그램 컴파일과 실행시 출력되는 결과는?
//컴파일시 에러가 발생한다면 라인번호와 그 원인과 해결책을 설명하시오.
//주석달기
public class Grammer04_YJ {
	public static void main(String[] args) {		
		TestYJ t1 = TestYJ.getInstance();		//getInstance()메소드는 하나의 인스턴스만 가지고 공유하기때 문에
		TestYJ t2 = TestYJ.getInstance();		//t1, t2에 값이 다르게 담겨있어도 t2.setX(10)의 값만 받는다 
		t1.setX(5);							//그러므로 10, 10 이출력된다
		t2.setX(10);
		System.out.println(t1.getX());
		System.out.println(t2.getX());
		//TestYJ a = new TestYJ();
	}
}

class TestYJ {
	private static TestYJ t;
	private int x;

	private TestYJ() {
	}

	public static TestYJ getInstance() {
		if (t == null) {
			t = new TestYJ();
		}
		return t;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

}
