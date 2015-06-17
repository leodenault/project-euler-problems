package util.triangleSum;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

public class TriangleParser {
	
	private String file;
	
	public TriangleParser(String file) {
		this.file = file;
	}
	
	public int[][] parse() throws IOException {
		FileInputStream in = new FileInputStream(file);
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));

		LinkedList<String> lines = new LinkedList<String>();
		String current;
		while ((current = reader.readLine()) != null) {
			lines.add(current);
		}
		reader.close();
		
		int[][] triangle = new int[lines.size()][];
		Iterator<String> it = lines.iterator();
		for (int i = 0; it.hasNext(); i++) {
			triangle[i] = parseLine(it.next());
		}
		return triangle;
	}
	
	private int[] parseLine(String line) {
		String[] textValues = line.split(" ");
		int[] values = new int[textValues.length];
		for (int i = 0; i < values.length; i++) {
			values[i] = Integer.parseInt(textValues[i]);
		}
		return values;
	}
}
