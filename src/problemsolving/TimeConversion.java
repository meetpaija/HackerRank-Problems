package problemsolving;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

	    static String timeConversion(String s) throws ParseException {
	    	
	    	SimpleDateFormat dt = new SimpleDateFormat("hh:mm:ssaa");
	        Date date = dt.parse(s);
	        System.out.println(new SimpleDateFormat("HH:mm:ss"). format(date));
			return s;
	    }

	    private static final Scanner scan = new Scanner(System.in);

	    public static void main(String[] args) throws IOException, ParseException {
//	        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//	        String s = scan.nextLine();

	        String result = timeConversion("07:05:45PM");

//	        bw.write(result);
//	        bw.newLine();
//
//	        bw.close();
	    }
	
}
