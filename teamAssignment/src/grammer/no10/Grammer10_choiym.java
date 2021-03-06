package grammer.no10;

import java.util.*;
/*
	실행결과는? 이유는?
*/
public class Grammer10_choiym {
	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();
		//데이터를 저장하는 방식. stack은 후입선출 Queue는 선입선출 방식
		st.push("0");
		st.push("1");
		st.push("2");
		//Stack타입변수 st에 3개의 data를 insert 해준다. 0/1/2
		q.offer("0");
		q.offer("1");
		q.offer("2");
		//Queue 객체에 data를 insert 해줌. 0/1/2
		while (!st.empty()) {
			System.out.print(st.pop());
			//st.empty는 스택에 데이터가 없으면 true를 리턴 ! 이기때문에 데이터가
			//비어있지않으면 현재 스택의 top을 출력하고 stack을 하나씩 마이너스 해주는 while문을 작성한다.
			//2/1/0 순서로 데이터를 꺼내옴
		}
		System.out.print("/");
		while (!q.isEmpty()) {
			System.out.print(q.poll());
			//q.isEmpty는 현재 링크드리스트에 데이터가 없으면 true !이기 때문에 데이터가 비어있지 않으면
			// Queue에서 데이터를 꺼내온다.
			//0/1/2 순서로 데이터를 꺼내옴
		}
		
		System.out.println();
		
		Stack stack = new Stack();
		stack.push("최");
		stack.push("유");
		stack.push("민");
		//새로운 stack 객체 생성하고 data로 "최","유","민" 스택을 쌓는다
		Stack stack2 = new Stack();
		while(!stack.empty()){
			stack2.push(stack.pop());
			//민,유,최 로 꺼내온 스택을 다시 새로운 스택에 쌓는다.
		}
		while(!stack2.empty()){
		System.out.print(stack2.pop());
		//새로 생성된 스택을 더이상 스택이없을때까지(스택이 -1이 될 때 까지) 꺼내온다.
		}
	
		
	}
}
