package lab.controlstms;

public class Capital {

	public static void main(String[] args) {
		String txt = "the Hindu";
        int h = 0;
		boolean capitalize = true;
		StringBuilder sb = new StringBuilder(txt);
		while (h < sb.length()) {
		    if (sb.charAt(h) == ' ') {
		        capitalize = true;
		    } 
		    else if (capitalize && !Character.isWhitespace(sb.charAt(h)))
		    {
		      sb.setCharAt(h, Character.toUpperCase(sb.charAt(h)));
		      capitalize = false;
		    }
		    h++;
		}
		System.out.println(sb.toString());

	}}
