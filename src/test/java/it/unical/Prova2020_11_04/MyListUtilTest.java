package it.unical.Prova2020_11_04;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.joda.time.DateTime;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {
	private static MyListUtil listUtil;
	
	@BeforeClass
	public static void prepare() {
		listUtil = new MyListUtil();
		System.out.println(DateTime.now());
	}
	
	@AfterClass
	public static void finish() {
		System.out.println(DateTime.now());
	}
	
	@Test
	public void ordinaWorks() {
		assertEquals(Arrays.asList(1, 17, 18, 33, 56), listUtil.ordina(1, Arrays.asList(56, 18, 33, 1, 17)));
		assertEquals(Arrays.asList(1, 2, 3, 4, 5), listUtil.ordina(1, Arrays.asList(5, 4, 3, 2, 1)));
		assertEquals(Arrays.asList(56, 33, 18, 17, 1), listUtil.ordina(2, Arrays.asList(56, 18, 33, 1, 17)));
		assertEquals(Arrays.asList(5, 4, 3, 2, 1), listUtil.ordina(2, Arrays.asList(1, 2, 3, 4, 5)));
		assertEquals(Arrays.asList(1, 2, 3, 4, 5), listUtil.ordina(3, Arrays.asList(1, 2, 3, 4, 5)));
		assertEquals(Arrays.asList(1, 2, 3, 4, 5), listUtil.ordina(66, Arrays.asList(1, 2, 3, 4, 5)));
	}
	
	@Test
	public void crescenteWorks() {
		assertEquals(Arrays.asList(1, 19, 36, 77, 109, 193), listUtil.crescente(Arrays.asList(77, 1, 193, 19, 109, 36)));
		assertEquals(Arrays.asList(1, 2, 3, 4, 5), listUtil.crescente(Arrays.asList(5, 4, 3, 2, 1)));
	}
	
	@Test
	public void descrescenteWorks() {
		assertEquals(Arrays.asList(193, 109, 77, 36, 19, 1), listUtil.decrescente(Arrays.asList(77, 1, 193, 19, 109, 36)));
		assertEquals(Arrays.asList(5, 4, 3, 2, 1), listUtil.decrescente(Arrays.asList(1, 2, 3, 4, 5)));
	}
}
