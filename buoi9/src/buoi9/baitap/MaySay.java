package buoi9.baitap;

public class MaySay extends ThietBiDien {
	double dungTich;
	
	public MaySay() {
		this.chucNang = "làm nóng";
	}
	
	@Override
	public void on() {
		// TODO Auto-generated method stub
		super.on();
		System.out.println("Thiết bị đang sấy");
	}
	
	@Override
	public void off() {
		// TODO Auto-generated method stub
		super.off();
		System.out.println("Máy sấy đã tắt");
	}
	
}
