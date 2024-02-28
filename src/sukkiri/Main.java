package sukkiri;

public class Main{
	public static void main(String argue[]) {
		public boolean isValidPlayerName(String name) {
			if(name.length() != 8) {
				return false;
			}
			char first = name.charAt(0);
			if(!(first >= 'A' && first <= 'Z')) {
				return false;
			}
			for (int i; i < 8; i++) {
				char c = name.charAt(i);
				if(!((c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
					return false;
				}
			}
	}
}