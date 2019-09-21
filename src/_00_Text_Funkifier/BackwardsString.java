package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String converted = "";
		for(int i=s.length()-1; i>=0; i--) {
			String chars="";
			chars=""+s.charAt(i);
			converted+=chars;
		}
		return converted;
	}

}
