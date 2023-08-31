package chapter11;

class Student implements Comparable<Student> {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int total; // 총점
	int schoolRank; // 전교등수
	int classRank; // 반등수
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		total = kor+eng+math;
	}

	int getTotal() {
		return total;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() {
		return name 
				+ "," + ban 
				+ "," + no 
				+ "," + kor 
				+ "," + eng 
				+ "," + math 
				+ "," + getTotal() 
				+ "," + getAverage()
				+ "," + schoolRank // 새로추가;
				+ "," + classRank; // 새로추가;
	}

//	public int compareTo(Object o) {
//		if (o instanceof Student) {
//			Student tmp = (Student) o;
//			return name.compareTo(tmp.name);
//		} else {
//			return -1;
//		}
//	}

	@Override
	public int compareTo(Student o) {
//		if(getTotal() != o.getTotal()) {
			return o.getTotal() - getTotal();
//		}
//		else {
//			return this.name.compareTo(o.name);
//		}
	}
}