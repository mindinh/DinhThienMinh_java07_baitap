package bt;

public class Cau4 {
	
	public static float giaTriDauTienLonHon2018(float n, float[] arr) {
	
		for (int i=0; i<n; i++) {
			if (arr[i] > 2018) {
				return arr[i];
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] arr = new float[10];
		
		for (int i=0; i<10; i++) {
			arr[i] = (float) (Math.random() * 5000 + 1);
		}
		
		System.out.print("Các phần tử: ");
		for (int i=0; i<10; i++) {
			System.out.printf("%f ", arr[i]);
		}
		
		float res = giaTriDauTienLonHon2018(10, arr);
		if (res != -1) 
			System.out.printf("\nGiá trị đầu tiên lớn hơn 2018 là %f", res);
		else
			System.out.println("\n-1");
	}

}
