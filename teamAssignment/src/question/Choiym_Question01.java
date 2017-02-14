package question;

public class Choiym_Question01 {
/*
		1. 다음 중 아래의 메서드를 올바르게 오버로딩 한 것을 모두 고르고 이유를 설명해 주세요.
			long add(int a, int b) { return a+b;}
			a. long add(int x, int y) { return x+y;}
			b. long add(long a, long b) { return a+b;}
			c. int add(byte a, byte b) { return a+b;}
			d. int add(long a, int b) { return (int)(a+b);}

			a : 매개변수의 이름이 다르기때문에 오버로딩된 것이 아니다.
			b : 매개변수의 타입만 변했기때문에 오버로딩이다.
			c : 리턴타입과 매개변수의 타입만 변했기 때문에 오버로딩이다.
			d : c와 같은이유로 오버로딩이다. 리턴값의 형태는 오버로딩의 유무에 영향을 주지않는다.
	
		2.다음 중 초기화에 대한 설명으로 옳지 않은 것을 모두 고르고 이유를 설명해 주세요.
			a.  멤버변수는 자동 초기화되므로 초기화하지 않고도 값을 참조할 수 있다
			b.  지역변수는 사용하기 전에 반드시 초기화해야 한다
			c.  초기화 블럭보다 생성자가 먼저 수행된다 → 초기화 블럭이 먼저 수행된다.
			d.  명시적 초기화를 제일 우선적으로 고려해야 한다
			e.  클래스변수보다 인스턴스변수가 먼저 초기화된다 → 클래스변수가 먼저 초기화됨

			c, e 
			
			class {
				[초기화블럭]
				
				class(){
				생성자영역
				}
			
			}
			따라서 초기화가 먼저 수행됨
			
			위와 마찬가지로 클래스변수는 class내부의 가장 위에 위치하기때문에 클래스변수가
			가장먼저 읽힘
	*/
	
	
}
