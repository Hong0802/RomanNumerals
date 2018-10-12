
public class RomanNumerals {
		static int[] Roman_int   = {1000,  900, 500,   400, 100,   90,  50,   40,  10,    9,   5,    4,  1  };
	    static String[] Roman_string = { "M", "CM",  "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

	    public static String convertToString(int RomanNumber) {
	        String romanString = "";
	        for (int i = 0; i < Roman_int.length; i++) {
	            while (RomanNumber >= Roman_int[i]) {
	            	romanString += Roman_string[i];
	            	RomanNumber -= Roman_int[i];
	            }
	        }
	        return romanString;
	    }
	    
		public int convertToInteger(String romanNum) {
			// To be Implemented
			return 0;
			
		}

}
