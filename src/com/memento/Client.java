package com.memento;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

enum Size{
	Small,
	Medium,
	Big;
	private Size() {
		// TODO Auto-generated constructor stub
	}
}


public class Client {	
	
	public static strictfp void main(String[] args) {
		Originator o = new Originator();
		Originator o1=new Originator();
        Caretaker c = new Caretaker(o);
        //改变状态
        o.setState("state 0");
        //建立一个检查点
        c.createMemento();
        //改变状态
        o.setState("state 1");
        //建立一个检查点
        c.createMemento();
        //改变状态
        o.setState("state 2");
        //建立一个检查点
        c.createMemento();
        //改变状态
        o.setState("state 3");
        //建立一个检查点
        c.createMemento();
        //打印出所有检查点
        o.printStates();
        System.out.println("-----------------恢复检查点-----------------");
        //恢复到第二个检查点
        c.restoreMemento(2);
        //打印出所有检查点
        o.printStates();
  
		try {
			int a[]=new int[]{4,3,5,7,10,8};
			BigInteger integer=BigInteger.valueOf(100);
			System.out.println(integer);
			PrintWriter writer=new PrintWriter("myfile.txt");
			String dir=System.getProperty("user.dir");
			writer.write("123\n");
			writer.close();
			Scanner scanner=new Scanner(new File("myfile.txt"));
			while (scanner.hasNext()) {
				int value=scanner.nextInt();
				System.out.print(value);
			}
			scanner.close();
			System.out.println();
			Arrays.sort(a);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
