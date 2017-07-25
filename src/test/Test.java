/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author Ayo
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate.now();
        Date silly  = new Date();
        Mul mo = new Mul (); mo.set (15);
		mo.table ();
       Mul poo = new Mul ();
            poo.set (0);
		poo.table ();
      Calendar.getInstance(); // TODO code application logic here
    System.out.println(LocalDate.now());
    System.out.println(silly);
    System.out.println(Calendar.getInstance());
    simpleFrameTest testa = new simpleFrameTest();
    simpleFrameTest testb = new simpleFrameTest();
    NewJFrame testc = new NewJFrame();
    testa.activate();
    testb.activate2();
    testc.activate();}
}





class Mul //Business Logic Class (BLC)
{
	int n;
	void set (int x)
	{
		n=x;
	}
	void table ()
	{
		for (int i=1; i<=10; i++)
		{
			int res=n*i;
			System.out.println (n + "*" + i + "=" + res);
		}
	}
};
