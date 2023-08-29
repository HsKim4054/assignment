package Chapter06;
class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int getTotal() {
		return kor+eng+math;
	}
	
	float getAverage() {
		float average = (float)getTotal()/3;
		return Math.round(average*10.0)/10.0f;
	}
	
	String info() {
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
	}
}

public class Ex6_03_04_05 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;

		System.out.println(s.info());
	}

}
