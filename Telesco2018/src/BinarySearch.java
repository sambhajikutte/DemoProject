
public class BinarySearch {
	public int search(int [] arr,int value)
	{
	int start=0,end=arr.length-1;
		while(end>=start) 
		{
			int mid=(start+end)/2;
			if(value==arr[mid])
			{
				return mid;
			}
			if(value<arr[mid]) 
			{
				end=mid-1;
			}
			else 
			{
				start=mid-1;
			}
		}
	return -1;
	}
	public static void main(String[] args) 
	{
		int []arr= {1,2,3,4,5,6};
		int value=5;
		BinarySearch obj=new BinarySearch();
		
		
		System.out.println(obj.search(arr, value));
		System.out.println(value);
		
	}

}
