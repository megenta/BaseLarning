//best solution for finding the max profit made


public class StockBuySell2 {
	
	private int[] arr;
	
	public StockBuySell2(int[] arr){
		this.arr = arr;
	}
	
	
	public int proces() { 

		int max_profit = -1;
		int buy_price = 0;
		int sell_price = 0;

		// this allows our loop to keep iterating the buying
		// price until a cheap stock price is found
		boolean change_buy_index = true;

		// loop through list of stock prices once
		for (int i = 0; i < arr.length-1; i++) {

			// selling price is the next element in list
			sell_price = arr[i+1]; 
			// if we have not found a suitable cheap buying price yet
			// we set the buying price equal to the current element
			if (change_buy_index) { buy_price = arr[i]; }

			// if the selling price is less than the buying price
			// we know we cannot make a profit so we continue to the 
			// next element in the list which will be the new buying price
			if (sell_price < buy_price) {
				change_buy_index = true; 
				continue;
			}
			// if the selling price is greater than the buying price
			// we check to see if these two indices give us a better 
			// profit then what we currently have
			else { 
				int temp_profit = sell_price - buy_price;
				if (temp_profit > max_profit) { max_profit = temp_profit; }
				change_buy_index = false;
			}
		}
		return max_profit;
	}
	
	
	public static void main(String[] args) {
		 int price[] = {4,2,6,7,5,3,9};
		 StockBuySell2 sb1 = new StockBuySell2(price);
		 int proces = sb1.proces();
		 System.out.println(proces);
	}

}
