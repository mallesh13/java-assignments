import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size;
		size = sc.nextInt();
		int array[] = new int[size];
		for (int i = 0; i < size; ++i) {
			array[i] = sc.nextInt();
		}
		int temp;
		for (int i = 0; i < size; ++i) {
			for(int j=i;j<size;++j) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		for(int i=0;i<size;++i) {
			System.out.println(array[i]+ " ");
		}
		sc.close();
	}

}
