package dao;

import index.Product;

//Ŭ���̾�Ʈ�� �䱸 ������ �޼ҵ� ������ �ۼ��� �������̽� ����
public interface ProductDao {
	//public ����Ÿ�� �̸�(�Ű�����)
	//����Ÿ���� �۾��� ����� Ȯ���� �� �ִ� ������ ����
	//�̸��� � �۾��� �����ϴ��� �� �� �ֵ��� �ۼ�
	
	//�����͸� �����ϴ� �޼ҵ�
	public int insertProduct(Product product);
	//����, ����, ���� ���� ����Ÿ���� int�� ����
}
