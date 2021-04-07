package problemsolving;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static long birthdayCakeCandles(List<Long> candles) {
    // Write your code here

    	
    	if(candles == null || candles.isEmpty()) {
    		return 0;
    	}
    	
    	Collections.sort(candles, Collections.reverseOrder());
    	long maxValue = candles.get(0);
    	long count = 1;
        for(long i = 1; i<candles.size(); i++) {
        	if(maxValue != candles.get((int) i)) {
        		break;
        	}
        	count++;
        }
        return count;
    }

}

public class CakeCandles {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long candlesCount = Long.parseLong(bufferedReader.readLine().trim());

        List<Long> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Long::parseLong)
            .collect(toList());

        long result = Result.birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
