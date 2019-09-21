package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String converter="";
		for(int i=0; i<s.length(); i++) {
			String letter;
			letter=""+s.charAt(i);
			if(i%2==1) {
				converter+=letter.toUpperCase();
			}
			else {
				converter+=letter.toLowerCase();
			}
		}
		return converter;
	}

}
