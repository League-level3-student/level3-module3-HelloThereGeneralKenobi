package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String funkyWord = "";
		char temp;
		for(int i = 0; i < s.length(); i++) {
			temp = s.charAt(i);
			String upperTemp = "" + temp;
			if(i == 0) {
				funkyWord = funkyWord + "" + upperTemp.toLowerCase();
				}
			else if(i%2 == 1) {
			funkyWord = funkyWord + "" + upperTemp.toUpperCase();
			}
			else {
				funkyWord = funkyWord + "" + upperTemp;
			}
		}
		return funkyWord;
	}

}
