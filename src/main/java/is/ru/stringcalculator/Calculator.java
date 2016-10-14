package is.ru.stringcalculator;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Calculator {

	public static int add(String text)throws Exception{
		if(text.equals("")){
			return 0;
		}
		else if(text.contains("\n")|text.contains(",")){
			return sum(splitNumbers(text));
		}
		
		else
			return toInt(text);
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers){
	    return numbers.split(",|\n");
	}
      
    private static int sum(String[] numbers) throws Exception{
    	negativeNumbers(numbers);
 	    int total = 0;
        for(String number : numbers){
		    total += toInt(number);
		}
		return total;
    }

    private static void negativeNumbers(String[] numbers) throws Exception{
    	List<String> negative = new ArrayList<String>();
        for(String number : numbers){
		    if(toInt(number)<0){
		    	negative.add(number);
		    }
		}
		if(negative.size()>0){
			throw new Exception ("Negatives not allowed: " + negative);
		}
    }
}


