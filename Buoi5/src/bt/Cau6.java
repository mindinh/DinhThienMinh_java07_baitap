package bt;

public class Cau6 {

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
		
		System.out.print("\nCác số âm trong mảng là ");
		for (int i=0; i<10; i++) {
			if (arr[i] < 0) {
				System.out.printf("%f ", arr[i]);
			}
		}
	}

}
