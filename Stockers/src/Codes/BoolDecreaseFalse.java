package Codes;

public class BoolDecreaseFalse {
	int count=0;
 public BoolDecreaseFalse(boolean[] a)
	{
		int n=a.length;
		for(int i=0;i<n;i++)
		{
		if(a[i]==false)
			count++;
		}
		System.out.print(count+"\n");
		
	}

}
