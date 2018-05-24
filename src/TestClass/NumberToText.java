package TestClass;

public class NumberToText {
	
	static class Translating {
		private String[] units = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "ten", 
												"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		
		private String[] tens = new String[]{"", "", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
		
		public String TranslateNumber(int n){
			if (n < 20) {
				return units[n];
			}
			
			if (n < 100) {
				return tens[n/10] + ( ((n % 10) == 0) ? "" : " " + TranslateNumber(n % 10) );
			}
			
			if (n < 1000) {
				return units[n/100] + " hundred" + ( ((n % 100) == 0) ? "" : " " + TranslateNumber(n % 100) );
			}
			
			if (n < 10000) {
				return units[n/1000] + " thousand" + ( ((n % 1000) == 0) ? "" : " " + TranslateNumber(n % 1000) );
			}
			
			return "Not a number";
		}
	}
	
	public static void main(String [] args){
		Translating translate = new Translating();
		System.out.println("Number in text is: " + translate.TranslateNumber(99599));
	}
}
