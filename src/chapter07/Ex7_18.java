package chapter07;

class Robot {
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}

public class Ex7_18 {
	static void action(Robot arr) {
		if(arr instanceof DanceRobot) {
			DanceRobot dd = (DanceRobot)arr;
			dd.dance();
		}
		else if(arr instanceof SingRobot) {
			SingRobot ss = (SingRobot)arr;
			ss.sing();
		}
		else if(arr instanceof DrawRobot) {
			DrawRobot d = (DrawRobot)arr;
			d.draw();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		for (int i = 0; i < arr.length; i++)
			action(arr[i]);
	}

}
