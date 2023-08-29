package chapter05;

public class Ex5_12 {

	public static void main(String[] args) {
		// 3m 우물 바닥에 달팽이가 있다.
		// 달팽이는 낮동안 55cm 올라올 수 있다. 하지만 날이 지면 잠을 자야 한다.
		// 자는 동안 3cm 미끄러져 내려온다.
		// 달팽이가 우물 밖으로 나오는데 몇일이 걸릴까?
		// 반복문과 조건문을 이용하여 프로그램을 작성하시오.
		int dis = 0;
		int day = 0;
		
		while(true)
		{
			day += 1;
			dis += 55;
			
			if(dis>=300)
				break;
			
			dis -= 3;
		}
		System.out.println(day+"일 소요");
		
	}

}
