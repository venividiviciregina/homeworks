
public class StringMutate {
	public static void main(String args[]) {
		
		String str1 = "4032005";
		String str2 = "12300";
		String str3 = "1002450004056";
		String str4 = "10024500040500000099";

		System.out.println("Mutate: "  + mutate (str1));
		System.out.println("Mutate: "  + mutate (str2));
		System.out.println("Mutate: "  + mutate (str3));
		System.out.println("Mutate: "  + mutate (str4));

	}

	public static String mutate(String str) {
		StringBuilder sb = new StringBuilder(str.length());
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '0') {
				sb.insert(0, '0');
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}
}
