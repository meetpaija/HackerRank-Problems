package interview.preparationkit.test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Currency;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Stream;

public class InvestStocks {
	
	public static void main(String[] args) {
		
		
		int saving = 250;
		int currValue[] = new int[]{175,133,109,210,97};
		int futureValue[] = new int[]{200,125,128,228,133};
		
		Map<Integer, Integer> currFutureVal = new HashMap<>();
		Map<Integer, Integer> currValProfit = new HashMap<>();
		Map<Integer, Double> currValRatio = new HashMap<>();
		
		for (int i = 0; i < currValue.length; i++) {
			
//			s1.setCurrValue(currValue[0]);
//			s1.setFutureValue(futureValue[0]);
//			s1.setProfit();
			
			int profit = futureValue[i] - currValue[i];
			currValProfit.put(currValue[i], profit);
			currFutureVal.put(currValue[i], futureValue[i]);
			double ratio = (double)(currValue[i]/profit);
			currValRatio.put(currValue[i], ratio);
		}
		
		Stream<Map.Entry<Integer, Double>> sorted =
				currValRatio.entrySet().stream()
			       .sorted(Map.Entry.comparingByValue());
		
		System.out.println(currValRatio);
	}

	
}


class Stock {
	
	int currValue;
	int futureValue;
	int profit;
	double ratio;
	public int getCurrValue() {
		return currValue;
	}
	public void setCurrValue(int currValue) {
		this.currValue = currValue;
	}
	public int getFutureValue() {
		return futureValue;
	}
	public void setFutureValue(int futureValue) {
		this.futureValue = futureValue;
	}
	public int getProfit() {
		return profit;
	}
	public void setProfit(int profit) {
		this.profit = profit;
	}
	public double getRatio() {
		return ratio;
	}
	public void setRatio(double ratio) {
		this.ratio = ratio;
	}
	
}