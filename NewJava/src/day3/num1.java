package day3;

/*
 * 	��Ͷ���
 * 		����
 */
public class num1 {
	String name;
	float hp;

	public static void main(String[] args) {
		num1 yase = new num1();
		yase.name = "��ɪ";
		num1 houyi = new num1();
		houyi.name = "����";
		num1 yvji = new num1();
		yvji.name = "�ݼ�";
		num1 hanxin = new num1();
		hanxin.name = "����";

		yase.Attack(houyi);

		yase.Attack(houyi, yvji);

		yase.Attack(houyi, yvji, hanxin);
	}

	// ����
	public void Attack(num1 hero) {
		System.out.println(name + " ��ɱ�� " + hero.name);
	}

	public void Attack(num1 hero, num1 hero1) {
		System.out.println(name + " ˫ɱ�� " + hero.name + " �� " + hero1.name);
	}

	// �ɱ����
	public void Attack(num1... heros) {
		for (num1 hero : heros) {
			System.out.println(name + " ɱ�� " + hero.name);
		}

	}
}
