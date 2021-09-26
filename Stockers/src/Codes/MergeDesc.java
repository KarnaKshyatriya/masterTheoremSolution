package Codes;

public class MergeDesc {
	private double arr[];
	public void mergeSort(double a[], int start, int end)  
	{  
	    int mid; 
	    arr=a;
	    if(start<end)  
	    {  
	        mid = (start+end)/2;  
	        mergeSort(arr,start,mid);  
	        mergeSort(arr,mid+1,end);  
	        merge(arr,start,mid,end);  
	    } 
	    
	   
	}  
	void merge(double a[], int start, int mid, int end)  
	{  
	    int i=start,j=mid+1,k,index = start;  
	    double[] temp=new double[a.length];
	    
	    while(i<=mid && j<=end)  
	    {  
	        if(a[i]>a[j])  
	        {  
	            temp[index] = a[i];  
	            i = i+1;  
	        }  
	        else   
	        {  
	            temp[index] = a[j];  
	            j = j+1;   
	        }  
	        index++;  
	    }  
	    if(i>mid)  
	    {  
	        while(j<=end)  
	        {  
	            temp[index] = a[j];  
	            index++;  
	            j++;  
	        }  
	    }  
	    else   
	    {  
	        while(i<=mid)  
	        {  
	            temp[index] = a[i];  
	            index++;  
	            i++;  
	        }  
	    }  
	    k = start;  
	    while(k<index)  
	    {  
	        a[k]=temp[k];  
	        k++;  
	    }  
	}  

	 public void printArray()
	    {
	        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	

}
