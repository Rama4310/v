import java.util.Scanner;
public class CountOfPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int []arr = new int[scan.nextInt()];
		
		for(int l=0;l<arr.length;l++)
		{
			arr[l]=scan.nextInt();
		}
		
		int countNum = 0;
		System.out.print("Positive number:"+" ");
		for(int k=0;k<arr.length;k++)
		{
			if(arr[k]>=0)
			{
				System.err.print(arr[k]+" ");
				countNum++;
			}
		}
		System.out.println(" ");
		System.out.println("Count of positive number: "+countNum);
		
		
	}

}
