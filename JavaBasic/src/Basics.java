
public class Basics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println("HI");
int arr[]={10,50,50,56,98};
	
	int j=0;
	arr[j]=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[j]!=arr[i])
		{
			j++;
			arr[j]=arr[i];
			
		}
	}
	for(int i=0;i<j;i++)
	{
		System.out.println(arr[i]);
	}
	}}
	
