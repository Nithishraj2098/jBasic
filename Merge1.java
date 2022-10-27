import java.util.Scanner;
public class Merge1{
	public static void main(String[] agrs){
		int num;
		System.out.println("Enter the values BOSS : ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int[] arr=new int[num];
		for(int i=0;i<num;i++){
			arr[i]=sc.nextInt();
		}
		Sort(arr,0,arr.length-1); //sort(arr,0,arr.length-1);
		for(int x:arr)
			System.out.println(x);
	}
	private static void Sort(int[] arr,int i,int j) //private static void sort(int[] arr,int i,int j)
	{
		if(i<j)
		{
		int mid=(i+j)/2;
		Sort(arr,i,mid);
		Sort(arr,mid+1,j);
		Merge(arr,i,mid,j);
	}
}
	private static void Merge(int[] arr,int low,int mid,int high)
	{
		int i=low;
		int j=mid+1;
		int k=low;
		int[] b=new int[arr.length]; //int[] b=new int[arr.length];
		while(i<=mid&&j<=high) //while(i<=mid&&j<=high
		{
			if(arr[i]<arr[j]) //if(arr[i]<arr[j])
			{
				b[k]=arr[i]; //b[k]=arr[i];
				i++;
				k++;
			}
			else{
				b[k]=arr[j]; //b[k]=arr[j];
				j++;
				k++;
			}
		}
		while(i<=mid) //while(i<=mid)
		{
			b[k]=arr[i]; //b[k]=arr[i];
			i++;
			k++;
		}
		while(j<=high) //while(j<=high)
		{
			b[k]=arr[j]; //b[k]=arr[j];
			j++;
			k++;
		}
		for(i=low;i<=high;i++) //for(i=low;i<=high;i++)
			arr[i]=b[i]; //arr[i]=b[i];
	}
}
