package edunext;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class GradeCalculator {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Scanner kb = new Scanner(System.in);
		int cases = kb.nextInt();
		int temp0, temp1;
		for(int i = 0; i < cases; i++) {
			temp0 = kb.nextInt();
			temp1 = kb.nextInt();
			map.put(temp0, temp1);
		}
		Map<Integer, String> gradeMap = GradeCalculator.calculateGrade(map);
		Map<Integer, String> treeMap = new TreeMap<>(gradeMap);
		for(Map.Entry<Integer, String> entry: gradeMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
	public static Map<Integer, String> calculateGrade(Map<Integer, Integer> scores)
	{
		if(scores == null) return null;
		Map<Integer, String> newMap = new TreeMap<Integer, String>();
		int key, value;
		for(Map.Entry<Integer, Integer> score : scores.entrySet()) {
			key = score.getKey();
			value = score.getValue();
			if(!(value >= 100)) {
				String grade = (value >= 80) ? "A" : (value >= 60) ? "B" : (value >= 45) ? "C" : "D";
				newMap.put(key, grade);
			}
		
		}
		return newMap;

}
	}
