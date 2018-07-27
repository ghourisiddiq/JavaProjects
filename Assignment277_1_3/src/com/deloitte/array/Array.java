package com.deloitte.array;
import java.util.Arrays;


public class Array{

	public static boolean checkTripplets( int arr[])
	{
		int x = arr.length;
        for (int i = 0; i < x-1; i++)
            for (int j = 0; j < x-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    
        
    int flag=0;
	int counter=0;
	
		for(int i=0;i<x-3;i++)
		{
			int j=i+1;		
				while(arr[i]==arr[j])
				{
					counter=counter+1;
							j=j+1;
					
							if(counter==2)
							{
								flag=1;
								break;
							}
							
				}
				
				}
		
		if(flag==1)
			return true;
		else
		return false;
		
	}
}	
	
	