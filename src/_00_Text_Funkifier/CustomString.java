package _00_Text_Funkifier;

import java.util.ArrayList;

public class CustomString extends SpecialString{

	public CustomString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub
		String converted="";
		Character saved;
		ArrayList<Character> chars=new ArrayList<Character>();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!=32) {
			chars.add(s.charAt(i));
			}
		}
		for(int k=chars.size(); k>=0; k--) {
			for(int j=1; j<chars.size(); j++) {
				if(chars.get(j-1).compareTo(chars.get(j))>0) {
					saved=chars.get(j-1);
					chars.set(j-1, chars.get(j));
					chars.set(j, saved);
				}
			}
		}
		for(int i=0; i<chars.size(); i++) {
			converted+=chars.get(i);
		}
		return converted;
	}

}
