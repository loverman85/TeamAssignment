package forTest.no07;

public class Question07_choiym {
/*
아래그리기
  *
 ***
*****
 ***
  *

*/
	public static void main(String[] args){
		
		for(int i = -2; i<3; i++){
			//5번 반복되는 for문 작성 (콘솔에 5줄 찍으려고)
			for(int j = 0; j < Math.abs(i) ;j++ ){
				//i=1일때 두번, i=2일때 1번 반복되는 포문
				System.out.print(" ");
			}
			for(int k = 0; k <5-Math.abs(i)*2; k++){
				//공백옆에 *을 붙여 출력
				//1번째 실행시 1개 출력, 2번째 실행시 3개출력, 3번째 실행시 5개 출력
				//4,2,0,2,4값이 들어와야함
				//규칙 : 실행횟수+2개만큼 별이 붙는다.
				//때문에 실행횟수*2-1 해주면 1번째일때 1, 2번째일때 3, 3번째일때 5개 출력
				System.out.print("*");
			}
			System.out.println();
			//줄바꿈
		}
	}
}
