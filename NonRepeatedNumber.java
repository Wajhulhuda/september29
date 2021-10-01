import java.util.Scanner;

public class NonRepeatedNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element of the array.");
		int arr[] = new int[5];
		int count;
		for(int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		for(int i=0; i<5; i++) {
			count =0;
			for(int j =0 ; j<5;j++) {
				if(arr[i]==arr[j] && i!=j)
					count++;
			}
			if(count==0)
				System.out.println(arr[i]+" ");
		}
		
	}

}
