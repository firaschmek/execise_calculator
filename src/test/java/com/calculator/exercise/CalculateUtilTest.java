package com.calculator.exercise;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.SoftAssertions;
import org.hamcrest.collection.IsIterableContainingInOrder;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import junit.framework.Assert;

public class CalculateUtilTest {
	CalculateUtil calculateUtil;
	final SoftAssertions soft = new SoftAssertions();

	@Before

	public void setUp() {
		calculateUtil = new CalculateUtil("Test2.txt");
	}

	@Test
	public void testreadGivenFile() {
		List<Element> list_test = new ArrayList<Element>() {
			{
				add(new Element("multiply", 9));
				add(new Element("apply", 5));
				;
			}
		};
		List<Element> list_origin = calculateUtil.readGivenFile();

		int pos = 0;
		for (Element element : list_origin) {

			assertEquals(list_test.get(pos).toString(), element.toString());
			pos++;

		}

	}

	@Test
	public void testcalcule() {
		float sum1 = calculateUtil.calcule(7, 8, "add");
		float sum2 = calculateUtil.calcule(7, 8, "subtract");
		float sum3 = calculateUtil.calcule(7, 8, "multiply");
		float sum4 = calculateUtil.calcule(9, 3, "divide");

		soft.assertThat(sum1).isEqualTo(15);
		soft.assertThat(sum2).isEqualTo(-1);
		soft.assertThat(sum3).isEqualTo(56);
		soft.assertThat(sum4).isEqualTo(3);
		soft.assertAll();

	}

	@Test
	public void testCalculateTotal() throws Exception {

		float sum = calculateUtil.calculateTotal();
		assertEquals(45.0, sum, 0);

	}

}
