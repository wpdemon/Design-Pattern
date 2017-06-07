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
        //�ı�״̬
        o.setState("state 0");
        //����һ������
        c.createMemento();
        //�ı�״̬
        o.setState("state 1");
        //����һ������
        c.createMemento();
        //�ı�״̬
        o.setState("state 2");
        //����һ������
        c.createMemento();
        //�ı�״̬
        o.setState("state 3");
        //����һ������
        c.createMemento();
        //��ӡ�����м���
        o.printStates();
        System.out.println("-----------------�ָ�����-----------------");
        //�ָ����ڶ�������
        c.restoreMemento(2);
        //��ӡ�����м���
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
