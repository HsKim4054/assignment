package Chapter6;

public class Ex6_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
class Marine {
int x=0, y=0; // Marine의 위치좌표(x,y)
int hp = 60; // 현재 체력
int weapon = 6; // 공격력
int armor = 0; // 방어력
void weaponUp() {
weapon++;
}
void armorUp() {
armor++;
}
void move(int x, int y) {
this.x = x;
this.y = y;
}
}
이 클래스의 멤버
중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?

weapon, armor - 모든 Marine인스턴스에 대해 동일한 값이어야 하므로.
weaponUp(),armorUp() - static변수에 대한 작업을 하는 메서드이므로.
*/