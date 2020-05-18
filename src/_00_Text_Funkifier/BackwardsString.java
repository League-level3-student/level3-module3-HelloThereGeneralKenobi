package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
		
	}

	@Override
	public String funkifyText(String s) {
		String backwardsWord = "";
		char temp;
		for(int i = 0; i < s.length(); i++) {
			temp = s.charAt(s.length() - 1 - i);
			backwardsWord = backwardsWord + "" + temp;
		}
		return backwardsWord;
	}

}
