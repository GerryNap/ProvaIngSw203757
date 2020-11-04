package it.unical.Prova2020_11_04;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	MyListUtil test = new MyListUtil();
    	ArrayList<Integer> list = test.ordina(1, Arrays.asList(56, 18, 33, 1, 17));
    	System.out.println(list);
    	list = test.ordina(2, Arrays.asList(56, 18, 33, 1, 17));
    	System.out.println(list);
    }
}
