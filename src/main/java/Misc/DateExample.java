package Misc;

import java.text.DateFormat;
import java.util.Calendar;

public class DateExample {

	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		//c.set(2024,4,28);
		DateFormat df=DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(c.getTime());
		System.out.println(df.format(c.getTime()));

	}

}
