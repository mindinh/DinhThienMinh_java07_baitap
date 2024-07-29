package buoi9.baitap;

public class DieuHoa extends ThietBiDien {
	double coolingArea;
	
	public DieuHoa() {
		this.chucNang = "làm lạnh";
	}
	
	@Override
	public void on() {
		// TODO Auto-generated method stub
		super.on();
		System.out.println("Thiết bị đang tỏa ra hơi lạnh");
	}
	
	
	@Override
	public void off() {
		// TODO Auto-generated method stub
		super.off();
		System.out.println("Điều hòa đã tắt");
	}
	
}
