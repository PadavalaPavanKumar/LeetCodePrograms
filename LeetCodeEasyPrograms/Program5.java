package LeetCodeEasyPrograms;

public class Program5 {
	public static void main(String[] args) {

		Program5 pp = new Program5();
		System.out.println(pp.isValid("(){}}{"));
	}

	public boolean isValid(String ss) {
		String s = "({[)}]";

		boolean condition = false;

		for (int i = 0; i < ss.length() - 1; i++) {
			switch (ss.charAt(i)) {
			case '(':
				if (ss.charAt(i + 1) == s.charAt(3) || ss.charAt(ss.length() - 1) == s.charAt(3)) {
					condition = true;

				}
				break;
			case '{':
				if (ss.charAt(i + 1) == s.charAt(4) || ss.charAt(ss.length() - 1) == s.charAt(4)) {
					condition = true;

				}
				break;
			case '[':
				if (ss.charAt(i + 1) == s.charAt(5) || ss.charAt(ss.length() - 1) == s.charAt(5)) {
					condition = true;

				}
				break;    //(){}}{
//			case ')':
//				if (ss.charAt(i + 1) == s.charAt(2) || ss.charAt(ss.length() - 1) == s.charAt(0)) {
//					condition = true;
//
//				}
//				break;
//			case '}':
//				if (ss.charAt(i + 1) == s.charAt(1) || ss.charAt(ss.length() - 1) == s.charAt(1)) {
//					condition = true;
//
//				}
//				break;
//			case ']':
//				if (ss.charAt(i + 1) == s.charAt(0) || ss.charAt(ss.length() - 1) == s.charAt(2)) {
//					condition = true;
//
//				}
//				break;
			}

			if (condition == false) {
				break;
			}

		}
		return condition;

	}
}
