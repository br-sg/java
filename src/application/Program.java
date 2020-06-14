package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

public class Program {
	public static void main(String args[]) throws ParseException {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");	

Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));


System.out.println(sdf.format(d));

Calendar cal = Calendar.getInstance();
cal.setTime(d);
cal.add(Calendar.YEAR,  (int) (100
		* Math.random()));
d = cal.getTime();

System.out.println(sdf.format(d));





		sc.close();
	
		
	
		
	}


	}

