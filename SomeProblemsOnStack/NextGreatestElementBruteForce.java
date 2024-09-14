public class NextGreatestElementBruteForce
{
	public static void main(String[] args)
	{
		int[] a1 = {6,8,0,1,3};
		int[] a2 =  new int[a1.length];
		nextGreatest(a1,a2);
		printArray(a2);
		
	}
	
	public static void printArray(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
	}
	
	public static void nextGreatest(int[] a1, int[] a2)
	{
		boolean flag1;
		for(int i=0;i<a1.length;i++)
		{
			int max = a1[i];
			flag1 = true;
			for(int j = i+1;j<a1.length;j++)
			{
				if(max < a1[j])
				{
					flag1 = false;
					a2[i] = a1[j];
					break;
				}				
			}
			if(flag1)
				{
					a2[i] = -1;
				} 
		}
	}
}
