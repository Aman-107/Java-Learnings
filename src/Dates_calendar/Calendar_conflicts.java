package Dates_calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendar_conflicts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sdf1 = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		
		System.out.println(cal.getTime());
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.MINUTE));
		// above feature are not present in the dates hence we are using calendar features.
	}

}
