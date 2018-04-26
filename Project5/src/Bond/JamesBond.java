package Bond;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JamesBond {

	public boolean bondRegex(String input) {
		/*
		 * Regex is roughly: 
		 * ([0-9]|([(]|[)]))\\s*(0\\s0\\s7)\\s*([0-9]|([(]|[)]))
		 */
		Pattern p = Pattern.compile("([0-9]|([(]|[)]))\\s*(0\\s0\\s7)\\s*([0-9]|([(]|[)]))");
		Matcher m = p.matcher(input);
		return m.find();
	}
}
