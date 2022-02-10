package sorting;
import java.util.Arrays;
public class Bubblesort {

	public static void main(String[] args) {
	int[] arr=new int[10];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=((int)(Math.random()*100+1));
	}
	System.out.println(Arrays.toString(arr));
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			int k;
            if (arr[i] > arr[j]) 
            {
                k = arr[i];
                arr[i] = arr[j];
                arr[j] = k;
            }
		}
	}
	System.out.println(Arrays.toString(arr));
	}
}
