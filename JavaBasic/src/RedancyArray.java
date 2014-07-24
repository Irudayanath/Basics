
public class RedancyArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={10,4,9,7,7,234,24,4};
for(int i=0;i<a.length;i++)
{
	int j=i++;
	System.out.print(a[i]);
	if(a[i]==a[j])
	{
		System.out.print(a[i]);
	}
}

	}

}
