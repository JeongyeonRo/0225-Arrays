package index;

//�������� �����͸� ��� �ϳ��� ǥ���ϱ� ���� DTO Ŭ������ ����
//DTO(Data Transfer Object) = VO(Variable Object)
public class Product {
	//Product Ŭ���� ���ο����� ���ٰ����� ���� ����
	private int num;
	private String name;
	private int price;
	//�ܺο��� �����͸� ����� �� �ֵ��� getter, setter ����
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [num=" + num + ", name=" + name + ", price=" + price + "]";
	}
	
	

}
