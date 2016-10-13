package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else if(text.contains(",")){
			String [] numbers = text.split(",");
			return toInt(number[0]+Integer.parseInt(number[1]);
		}
		else
			return 1;
	}

	private static int toInt(String text){
		return Integer.parseInt(text);
	}

}