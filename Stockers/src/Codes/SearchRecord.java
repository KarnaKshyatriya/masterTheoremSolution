package Codes;

import java.util.ArrayList;
import java.util.Scanner;

import Driver.Company;

public class SearchRecord {
	double searchValue;
	int counter=0;
	Merge mr;
	double[] arr;
	int index=0;
	public SearchRecord(ArrayList<Company> al,int numbers)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the key value ");
		searchValue=sc.nextDouble();
		arr=new double[numbers];
		
		for(Company str:al)
		{
			arr[index]=str.stockPrice;
			index++;
				
		}
		
		mr=new Merge();
		mr.mergeSort(arr, 0, numbers-1);
		
		
		
		binarySearch(arr, 0, numbers-1, searchValue);
	}
	
	void binarySearch(double arr[], int first, int last, double key){  
		   int mid = (first + last)/2;  
		   while( first <= last ){  
		      if ( arr[mid] < key ){  
		        first = mid + 1;     
		      }else if ( arr[mid] == key ){  
		        System.out.println("Stock of value "+key+" is present");  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Value not found");  
		   }  
		 }  

}
