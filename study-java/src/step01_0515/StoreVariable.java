package step01_0515;

public class StoreVariable {

	public static void main(String[] args) {
		//������ �� ���� ����
		//������ �������� ���� ����
		int num = 100;
		//������ ���� �ϸ� ������ �Ҵ���� �ʴ´�.
		int su;
		//������ ������ �ʱⰪ�� ����
		su=50;
		//������ �ڽ��� ������ �� �ִ� ũ�⺸�� �� ū ���ڴ� ������ �� �����ϴ�.
		//int: 4byte ������ �����ϴ� �ڷ���, �⺻��, +-21����� ���� ����
		//overflow, underflow �߻�
		//�Ǽ��� �����ϴ� �ڷ����� float�� double�� �ֽ��ϴ�
		//float: 4byte �Ǽ�
		float f = 3.7f;
		System.out.println("f: "+f);
		//double: 8byte �Ǽ�
		double d = 3.7;
		System.out.println("d: "+d);
		
		//������ ���ǰ� �ִ� �������� ��ġ Ȯ��
		int a = 10;
		int b = 20;
		System.out.println("a:"+System.identityHashCode(a));
		System.out.println("b:"+System.identityHashCode(b));
	}

}
