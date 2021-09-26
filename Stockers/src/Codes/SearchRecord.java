package Codes;

import java.util.ArrayList;
import java.util.Scanner;

import Driver.Company;

public class SearchRecord {
	double searchValue;
	int counter=0;
	
	public SearchRecord(ArrayList<Company> al)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the key value ");
		searchValue=sc.nextDouble();
		
		for(Company str:al)
		{
			if(str.stockPrice==searchValue)
			{
			counter=1;
			}
				
		}
		
		if(counter==1)
		{
			System.out.println("Stock of value "+searchValue+" present ");
		}
		else
		{
			System.out.println("Value not found ");
			
		}
		
	}

}
