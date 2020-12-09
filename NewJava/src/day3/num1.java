package day3;

/*
 * 	类和对象
 * 		重载
 */
public class num1 {
	String name;
	float hp;

	public static void main(String[] args) {
		num1 yase = new num1();
		yase.name = "亚瑟";
		num1 houyi = new num1();
		houyi.name = "后羿";
		num1 yvji = new num1();
		yvji.name = "虞姬";
		num1 hanxin = new num1();
		hanxin.name = "韩信";

		yase.Attack(houyi);

		yase.Attack(houyi, yvji);

		yase.Attack(houyi, yvji, hanxin);
	}

	// 重载
	public void Attack(num1 hero) {
		System.out.println(name + " 单杀了 " + hero.name);
	}

	public void Attack(num1 hero, num1 hero1) {
		System.out.println(name + " 双杀了 " + hero.name + " 和 " + hero1.name);
	}

	// 可变参数
	public void Attack(num1... heros) {
		for (num1 hero : heros) {
			System.out.println(name + " 杀了 " + hero.name);
		}

	}
}
