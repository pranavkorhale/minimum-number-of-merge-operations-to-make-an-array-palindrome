
public class Main
{
	public static void main(String[] args) {
		int arr[] = {1,4,3,7,1};
		int n = arr.length;
		
		int i =0;
		int j = n-1;
		int ans = 0;
		while(i<j)
		{
		    if(arr[i]==arr[j])
		    {
		        i++;
		        j--;
		    }else if(arr[i]<arr[j])
		    {
		        arr[i+1] = arr[i]+arr[i+1];
		        i++;
		        ans++;
		    }else{
		        arr[j-1] = arr[j-1]+arr[j];
		        j--;
		        ans++;
		    }
		}
		System.out.println(ans);
	}
}
