package bt;

public class Cau3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] arr = new float[10];
		
		for (int i=0; i<10; i++) {
			arr[i] = (float) (Math.random() * 50 + 1);
		}
		
		System.out.print("Các phần tử: ");
		for (int i=0; i<10; i++) {
			System.out.printf("%f ", arr[i]);
		}
		
		float max = Float.MIN_NORMAL, min = Float.MAX_VALUE;
		
		for (int i=0; i<10; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		
		System.out.printf("\n[a, b] cần tìm là [%f, %f] ", min, max);
	}

}
