package Dates_calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();  
		// syntax -> then import Date from util package of java i.e. java.util.Date
		
		
		// documentation for the formating of text.
		// https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("m/d/yyyy hh:mm:ss");
		// formating the date according to our need
		
		System.out.println(d.toString());
		// converting to string format
		System.out.println(sdf1.format(d)); // syntax changed
		System.out.println(sdf2.format(d));
	}

}
