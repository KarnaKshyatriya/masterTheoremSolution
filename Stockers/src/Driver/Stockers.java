package Driver;

import java.util.ArrayList;
import java.util.Scanner;

import Codes.BoolIncreaseTrue;
import Codes.BoolDecreaseFalse;
import Codes.Merge;
import Codes.MergeDesc;
import Codes.SearchRecord;

public class Stockers {
	ArrayList<Company> al=new ArrayList<>();
	int numbers;
	double companyStock[];
	boolean stockPrice[];
	Merge mg;
	MergeDesc md;
	BoolIncreaseTrue ba;
	BoolDecreaseFalse bd;
	SearchRecord sr;

	Stockers()
	{
		System.out.println("enter the no of companies");
		Scanner sc=new Scanner(System.in);
		numbers=sc.nextInt();
		companyStock=new double[numbers];
		stockPrice=new boolean[numbers];
		for(int i=1;i<=numbers;i++)
		{
			System.out.println("Enter current stock price of the company "+i);
			double stockPrice=sc.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday?"
					+ "true/false");
			boolean bool=sc.nextBoolean();
			Company c=new Company(stockPrice,bool);
			al.add(c);

		}

		int index=0;

		for(Company str:al)
		{
			//System.out.println(str.roll+" , "+str.nm+" , "+str.ph+" , "+str.b);
			//System.out.println(str.stockPrice+ "  :: "+str.bool);

			companyStock[index]=str.stockPrice;
			stockPrice[index]=str.bool;
			index++;
		}


		System.out.println("Enter the operation that you want to perform \n"
				+ "1. Display the companies stock prices in ascending order \n"
				+ "2. Display the companies stock prices in descending order \n"
				+ "3. Display the total no of companies for which stock prices rose today \n"
				+ "4. Display the total no of companies for which stock prices declined today \n"
				+ "5. Search a specific stock price\r\n"
				+ "6. press 0 to exit");

		int choice=sc.nextInt();

		mg=new Merge();
		md=new MergeDesc();

		switch(choice)
		{
		case 1: mg.mergeSort(companyStock,0,companyStock.length-1);
		System.out.println("Stock prices in ascending order are :");
		mg.printArray();
		break;

		case 2: 
			md.mergeSort(companyStock, 0, companyStock.length-1);
			System.out.println("Stock prices in descending order are :");
			md.printArray();
			break;

		case 3:System.out.print("Total no of companies whose stock price rose today : ");
		ba=new BoolIncreaseTrue(stockPrice);
		break;

		case 4:System.out.print("Total no of companies whose stock price declined today :");
		bd=new BoolDecreaseFalse(stockPrice);
		break;

		case 5:sr=new SearchRecord(al);
		break;

		default: System.out.println("You Have entered an Invalid option");


		}
	}
	public static void main(String args[])
	{
		new Stockers();
	}



}
