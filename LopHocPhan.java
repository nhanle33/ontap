package GK;

import java.time.LocalDate;

public class LopHocPhan {
	private String MaLop,TenLop,HoTenGV;
	private LocalDate NgayBatDau,NgayKetThuc;
	private int SiSo;
	private double HocPhi;
	//constructor
	public LopHocPhan() {
		MaLop="LXX";
		TenLop="chưa cập nhật";
		HoTenGV="giảng viên thỉnh giảng";
		NgayBatDau=LocalDate.now();
		NgayKetThuc=NgayBatDau;
		SiSo=1;
		HocPhi=1;		
	}
	public LopHocPhan(String ml, String tl, String ht, LocalDate nbd, LocalDate nkt, int ss, double hp) {
		setMaLop(ml);
		setTenLop(tl);
		setHoTenGV(ht);
		setNgayBatDau(nbd);
		setNgayKetThuc(nkt);
		setSiSo(ss);
		setHocPhi(hp);
	}
	//setter, getter
	public String getMaLop() {
		return MaLop;
	}
	public void setMaLop(String maLop) {
		if(maLop!=null) {
			this.MaLop=maLop;
		}else {
			throw new IllegalArgumentException("Mã lớp không được null.");
		}
	}
	public String getTenLop() {
		return TenLop;
	}
	public void setTenLop(String tenLop) {
		if(tenLop==null || tenLop.length()==0) {
			this.TenLop="chưa cập nhật";
		}else {
			this.TenLop=tenLop;
		}
	}
	public String getHoTenGV() {
		return HoTenGV;
	}
	public void setHoTenGV(String hoTenGV) {
		if(hoTenGV==null) {
			this.HoTenGV="giảng viên thỉnh giảng";
		}else {
			this.HoTenGV=hoTenGV;
		}
	}
	public LocalDate getNgayBatDau() {
		return NgayBatDau;
	}
	public void setNgayBatDau(LocalDate ngayBatDau) {
		if(ngayBatDau==null) {
			this.NgayBatDau=LocalDate.now();
		}else {
			this.NgayBatDau=ngayBatDau;
		}
	}
	public LocalDate getNgayKetThuc() {
		return NgayKetThuc;
	}
	public void setNgayKetThuc(LocalDate ngayKetThuc) {
		if(ngayKetThuc==null) {
			this.NgayKetThuc=NgayBatDau;
		}else {
			this.NgayKetThuc=ngayKetThuc;
		}
	}
	public int getSiSo() {
		return SiSo;
	}
	public void setSiSo(int siSo) {
		if(siSo<0) {
			throw new IllegalArgumentException("Mã lớp không được < 0!");
			
		}else {
			this.SiSo=siSo;
		}
	}
	public double getHocPhi() {
		return HocPhi;
	}
	public void setHocPhi(double hocPhi) {
		if(hocPhi<0) {
			throw new IllegalArgumentException("Học phí không được < 0!");
		}else {
			this.HocPhi=hocPhi;
		}
	}
	//doanh thu
	public double DoanhThu() {
		return SiSo*HocPhi;
	}
	@Override
	public String toString() {
		return "Mã Lớp: "+MaLop+"\tTên lớp: "+TenLop+"\tHọ tên giảng viên phụ trách: "+HoTenGV
				+"\tNgày bắt đầu: "+NgayBatDau+"\tNgày kết thúc: "+NgayKetThuc
				+"\tSĩ số: "+SiSo+"\tHọc phí: "+HocPhi+"\tDoanh thu: "+DoanhThu()+"\n";
	}
	
	
	

}
