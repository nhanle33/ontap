package GK;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		DSLopHoc lh= new DSLopHoc(3);
		lh.Add(new LopHocPhan("L01", "Lớp 01", "Nguyễn Trung Kiên", LocalDate.of(2024, 6, 12), LocalDate.of(2024, 7, 12), 44, 1500000));
		lh.Add(new LopHocPhan("L03", "Lớp 03", "Nguyễn Văn A", LocalDate.of(2024, 8, 5), LocalDate.of(2024, 9, 5), 40, 1000000));
		lh.Add(new LopHocPhan("L02", "Lớp 02", "Lê Thị B", LocalDate.of(2024, 9, 26), LocalDate.of(2024, 10, 26), 49, 2000000));
		System.out.println("Danh sách các lớp trước khi sắp xếp:\n");
		lh.HienDS();
		lh.SapXep();
		System.out.println("Danh sách các lớp sau khi sắp xếp:\n");
		lh.HienDS();
		System.out.print("Tổng doanh thu:"+lh.TongDoanhThu()+" VND"+"\n");
		//nhap ten giang vien
		System.out.print("\nNhập tên giảng viên:");
		Scanner scanner = new Scanner(System.in);
		String TenGV= scanner.nextLine();
		System.out.println("Lớp học do "+TenGV+" phụ trách là:");
		lh.XuatDSTheoGV(TenGV);
		
		
		

	}

}
