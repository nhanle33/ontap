package GK;

public class DSLopHoc {
	private LopHocPhan[] lhp;
	private int count;
	//constructor
	public DSLopHoc(int n) {
		lhp=new LopHocPhan[n];
		count =0;
	}
	//ktra trung ma
	public boolean check(String MaLop) {
		for(int i=0;i<count;i++) {
			if(lhp[i].getMaLop().equalsIgnoreCase(MaLop)) {
				return true;//trung ma
			}
		}
		return false;
	}
	//them lop hoc
	public boolean Add(LopHocPhan lophoc) {
		if(count < lhp.length && !check(lophoc.getMaLop())) {
			lhp[count]=lophoc;
			count++;
			return true;			
		}else {
			return false;
		}			
	}
	//sap xep tang dan theo siso
	public void SapXep() {
		for(int i=0;i<count-1;i++) {
			for(int j=1;j<=count-1;j++) {
				if(lhp[i].getSiSo()>lhp[j].getSiSo()) {
					LopHocPhan tmp=lhp[i];
					lhp[i]=lhp[j];
					lhp[j]=tmp;
					
				}
			}
			
		}
	}
	//tinh tong doanh thu
	public double TongDoanhThu() {
		double tong=0;		
		for(int i=0;i<count;i++) {
			if(lhp[i].getNgayBatDau().getMonthValue()>=6 && lhp[i].getNgayBatDau().getMonthValue()<=8) {
				tong+=lhp[i].DoanhThu();
			}
			
		}
		return tong;
	}
	//xuat danh sach theo gv phu trach
	public void XuatDSTheoGV(String GiangVien) {
		for(int i=0;i<count;i++) {
			if(lhp[i].getHoTenGV().equalsIgnoreCase(GiangVien)) {
				System.out.println("\n"+lhp[i]);		
		}
		
	}
	}
	//danh sach in lop hoc
	public void HienDS() {
		for(int i=0;i<count;i++) {
			System.out.println(lhp[i]);
		}
	}
	
	
	

}
