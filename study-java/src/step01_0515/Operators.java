package step01_0515;

public class Operators {

	public static void main(String[] args) {
		int a=5;
		//���׿�����
		// ~(ƿ�忬����): ���������͸� �޾Ƽ� 1�� ����(���� ���� ���밪�� +-1)�� ���Ͽ� ����
		System.out.println("~a:" + ~a);
		//++,--: ����������,���� ���������� ��� �����ϸ� ���� ��/�ڿ� ���� �ٸ��� ����˴ϴ�.
		//���� �տ� ���� ��� ���� �����ϰ� �ڿ� ���� ��� ��ɹ� ���� �����մϴ�.
		a = 10;
		System.out.println("a++: " + (a++));
		System.out.println("++a: " + (++a));
		int b = 5;
		System.out.println("b--: " + (b--));
		System.out.println("--b: " + (--b));
		
		//���׿�����
		//��Ģ������: int�� �������� �� ���� �ڷ������� �����ϸ� int�� �����ؼ� ����
		//�ٸ� �ڷ������� �����ϴ� ��� ǥ�������� �� ū �ڷ������� �����ؼ� ����
		//boolean < byte < short < char < int < long < float < double
		//overflow, underflow�� ����
		//shift ������: int�� �����͸� ������ bit������ �о ����� int�� �����ϴ� ������
		System.out.println("a<<b: " + (a<<b));
		//a�� b bit��ŭ ù��° ��Ʈ�� �����ϰ� �̵�
		System.out.println("a<<<b: " + (a>>b));
		
		//���׿�����
		//���ǽ�?��1:��2 - ���ǽ��� true�̸� ��1, false�̸� ��2
		boolean result = a>b?true:false;
		System.out.println(result);
		
		

	}

}
