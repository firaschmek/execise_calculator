package com.calculator.exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class CalculateUtil {

	List<Element> list_instruction = new ArrayList<Element>();
	String filename;

	public CalculateUtil(String filename) {
		super();
		this.filename = filename;
	}

	public List<Element> readGivenFile() {

		URL url = getClass().getResource(filename);

		BufferedReader br = null;
		FileReader fr = null;

		try {

			fr = new FileReader(url.getPath());
			br = new BufferedReader(fr);

			String sCurrentLine;

			br = new BufferedReader(new FileReader(url.getPath()));

			while ((sCurrentLine = br.readLine()) != null) {
				// Testing if tere is empty line

				if (!sCurrentLine.trim().isEmpty()) {
					String[] parts = sCurrentLine.split(" ");
					String keyword = parts[0];
					int number = Integer.parseInt(parts[1]);
					Element elt = new Element(keyword, number);
					list_instruction.add(elt);

				}
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

		return list_instruction;
	}

	public float calcule(float sum, float number, String operator) {

		switch (operator) {
		case "add":
			sum = sum + number;
			break;

		case "subtract":
			sum = sum - number;
			break;

		case "multiply":

			sum = (sum * number);

			break;

		case "divide":
			sum = (sum / number);
			break;

		default:
			break;
		}

		return sum;

	}

	public float calculateTotal() {
		List<Element> list_instructions = readGivenFile();

		int last_pos = list_instructions.size() - 1;
		float sum = list_instructions.get(last_pos).getNumber();
		list_instructions.remove(last_pos);
		for (Element element : list_instructions) {
			sum = calcule(sum, element.getNumber(), element.getKeyword());
		}

		return sum;
	}

	// Getters && Setters
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

}
