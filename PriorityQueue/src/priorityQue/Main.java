package priorityQue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		Queue<String> pri = new PriorityQueue<String>();
		pri.add("JAVA");
		pri.add("Dotnet");
		pri.add("JAVASCRIPT");
		pri.add("typescript");
		System.out.println(pri);
		
		pri.remove();
		System.out.println(pri);
		
		pri.add("c#");
		System.out.println(pri);
	}
}
