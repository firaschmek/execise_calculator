package com.calculator.exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		CalculateUtil calculateUtil = new CalculateUtil("Test2.txt");
		System.out.println(calculateUtil.calculateTotal());
	}
}