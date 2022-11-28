package LeetCodeEasyPrograms;


import java.util.HashMap;

public class Program3 {
	public static void main(String[] args) {
		Program3 pp = new Program3();
		System.out.println(pp.roman("MCMXCIV"));

	}

	public int roman(String x) {
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		hashmap.put("I", 1);
		hashmap.put("V", 5);
		hashmap.put("X", 10);
		hashmap.put("L", 50);
		hashmap.put("C", 100);
		hashmap.put("D", 500);
		hashmap.put("M", 1000);

		String[] s = x.split(""); // iv
		int sum = 0;
		boolean condition = false;

		for (int i = 0; i < x.length() - 1; i++) {

			if (hashmap.get(s[i]) >= hashmap.get(s[i + 1])) {
				condition = true;
			}
			if (condition == true) {
				sum = sum + hashmap.get(s[i]);
				condition = false;
			} else {
				sum = sum - hashmap.get(s[i]);
			}

		}

		sum = sum + hashmap.get(s[x.length() - 1]);

		return sum;
	}
}





