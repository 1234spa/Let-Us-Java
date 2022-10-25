import java.util.*;
import java.lang.*;

public class GfG{

	public static void occurrenceDays(int n, String firstday)
	{
		String[] days = new String[]{ "Monday",
				"Tuesday", "Wednesday",
				"Thursday", "Friday",
				"Saturday", "Sunday" };
		
				int[] count = new int[7];
		for (int i = 0; i < 7; i++)
			count[i] = 4;
		
		int pos = 0;
		for (int i = 0; i < 7; i++)
		{
			if (firstday == days[i])
			{
				pos = i;
				break;
			}
		}
		
	    int inc = n - 28;
		
	    for (int i = pos; i < pos + inc; i++)
		{
			if (i > 6)
				count[i % 7] = 5;
			else
				count[i] = 5;
		}
		
		for (int i = 0; i < 7; i++)
		{
			System.out.println(days[i] + " " + count[i]);
		}
	}
	
	public static void main(String argc[]){
		int n = 31;
		String firstday = "Tuesday";
		occurrenceDays(n, firstday);
	}
}
