package BTJDBC;

import java.util.*;
import java.sql.*;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		//Danh sach ban dau
		List<Category> dsbd = Category.before();
		for (Category item : dsbd)
			System.out.println(item.toString());
		
		//Lay danh sach cac danh muc (Category) sap xep theo Alphabet
//		List<Category> ls = Category.getListCategory();
//		for(Category item : ls) {
//			System.out.println(item.toString());
//		}
		//Lay danh sach cac san pham(Product) theo 1 danh muc nao do
		// Sap xep theo gia giam dan
//		List<Product> lspd = Product.getListProductOfCategory(1);
//		for(Product item : lspd) {
//			System.out.println(item.toString());
//		}
		
		//Tao moi 1 danh muc (Neu danh muc da ton tai thi khong tao
		// Thong bao loi cho user
//		try {
//			Category.createCategory("new category");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			System.out.println("Đã tồn tại danh mục này");
//		}
		//Chinh sua 1 danh muc
		//Neu danh muc khong ton tai thi thong bao loi
//		int rs = Category.editCategory(5, "edited");
//		if(rs==0) {
//			System.out.println("khong ton tai danh muc");
//		}
//		else {
//			System.out.println("Cap nhat danh muc thanh cong");
//		}
		
		
		// Xoa 1 danh muc
		//Neu khong ton tai hoac con san pham thi bao loi cho user
//		int rs = Category.deleteCategory(4);
//		if(rs==0) {
//			System.out.println("khong ton tai danh muc");
//		}
//		else if(rs==-1) {
//			System.out.println("Khong the xoa danh muc vi con san pham trong he thong");
//		}
//		else {
//			System.out.println("Xoa danh muc thanh cong!");
//		}
		
		//Them moi 1 san pham
		//Neu ten san pham da co thi bao loi cho user
//		int rs = Product.createProduct("new product3", 10000, 50, 6);
//		if(rs ==0) {
//			System.out.println("San pham da ton tai trong he thong");
//		}
//		else {
//			System.out.println("Them moi san pham thanh cong!");
//		}
		
		//Chinh sua 1 san pham
//		int rs = Product.editProduct(12,"neww", 10000, 50, 6);
//		if(rs ==0) {
//			System.out.println("khong tim thay san pham");
//		}
//		else if(rs == -1) {
//			System.out.println("Ten san pham moi muon thay doi da ton tai");
//		}
//		else {
//			System.out.println("Chinh sua san pham thanh cong!");
//		}
		
		
		//Xoa 1 san pham
//		int rs = Product.deleteProduct(15);
//		if(rs ==0) {
//			System.out.println("khong tim thay san pham");
//		}
//		else {
//			System.out.println("Xoa san pham thanh cong!");
//		}

		//Thong ke so luong san pham cua tung danh muc
//		Category.ThongKe();
		
	}

}
