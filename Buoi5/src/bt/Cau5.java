package bt;

public class Cau5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] arr = new float[10];
		
		for (int i=0; i<10; i++) {
			arr[i] = (float) ((Math.random() * (20)) - 10);
		}
		
		System.out.print("Các phần tử: ");
		for (int i=0; i<10; i++) {
			System.out.printf("%f ", arr[i]);
		}
		
		int i = 9;
		while (i >= 0) {
			if (arr[i] < 0 && Math.abs(arr[i]) < Math.abs(-1)) {
				System.out.printf("\nGiá trị âm cuối cùng lớn hơn -1 là %f", arr[i]);
				break;
			}
			i--;
		}
		if (i < 0)
			System.out.print("\n" + -1);
		
	}

}
