package helloworld;

public class helloworld {
	public static void main(String[] args) {
		System.out.println("HELLO WORLD!");
		System.out.println(dec2bin(256.625));
		System.out.println(bin2dec("101010101010.1010"));
		String name = "James" + " Connell";
		System.out.println(name.charAt(0));
		
	}
	public static int len1;
	private static String dec2bin(double num1) {
		StringBuffer bin = new StringBuffer();
		StringBuffer test = new StringBuffer();
		int q = 1;
		int r;
		len1 = 0;
		String num = String.valueOf(num1);
		String[] rem = num.split("\\.");
		if  (Double.parseDouble(rem[1]) != 0) {
			int radix = num.indexOf(".");
			len1 = (num.length() - radix - 1);
		}
		double mult = Math.pow(2, len1);
		double num2 = num1 * mult;
		while (q != 0) {
			r = (int) (num2 % 2);
			q = (int) (num2 / 2);
			num2 = q;
			bin.append(r);	
		}
		if  (Double.parseDouble(rem[1]) != 0) {
			int lob = bin.length();
			double trunc = Double.parseDouble(rem[0]);
			q = 1;
			while (q!=0) {
				r = (int) (trunc % 2);
				q = (int) (trunc / 2);
				trunc = q;
				test.append(r);
			}
			int slen = test.length();
			bin.insert(lob - slen, ".");
		}
		bin.reverse();
		return bin.toString();
	}
	public static String n;
	public static String n2;
	public static double temp2;
	private static double bin2dec(String x) {
		double result = 0;
		if (x.indexOf(".") >= 0) {
			String[] s = x.split("\\.");
			n = s[0];
			n2 = s[1];
			for (int i = 0; i < n2.length(); i++) {
				int temp = Character.getNumericValue(n2.charAt(i));
				if (temp != 0) {
					temp2 = 1/(Math.pow(2,i+1));
					result+=temp2;
				}
			}
		} else
			n = x;
		for (int i = 0; i < n.length(); i++) {
			int temp = Character.getNumericValue(n.charAt(i));
			int temp2 = temp * (int) Math.pow(2,n.length()-1-i);
			result += temp2;
		}
		return result;
	}
}
