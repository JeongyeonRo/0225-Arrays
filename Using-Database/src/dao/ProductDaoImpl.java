package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import index.Product;
//ProductDao�� ������ ProductDaoImpl Ŭ������ ����
public class ProductDaoImpl implements ProductDao {
	//�̱��� ������ ���� �ڵ� ����
	private static ProductDao productDao = null;
	private ProductDaoImpl() {}
	//�����ڸ� �ܺο��� ȣ���Ҽ� ������ private���� �����ڸ� ����
	public static ProductDao getInstance() {
		//�ܺο��� �ѹ� ������ ȣ��� �����ϵ��� �ν��Ͻ��� ������ Ȯ��
		if(productDao == null) {
			productDao = new ProductDaoImpl();
		}
		return productDao;
	}
	@Override
	public int insertProduct(Product product) {
		int result = -1;
		//������ ������ �����ϸ� ����� �����ϱ� ������ ����� ������ ������ ������ ����
		try (
			//������ ���� ����
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521/ORCLPDB","SYSTEM","0000");
			PreparedStatement pstmt = con.prepareStatement(
					"insert into sample(num, name, price) values(?,?,?)");
			){
			//?�� ���� �����͸� ���ε�
			pstmt.setInt(2, product.getNum());
			pstmt.setString(3, product.getName());
			pstmt.setInt(4,product.getPrice());
			//sal�� �����ϰ� �� ����� result�� ����
			System.out.println(result);
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println("Insert Exception: "+e.getMessage());
			e.printStackTrace();
		}
		return result;
	}
}
