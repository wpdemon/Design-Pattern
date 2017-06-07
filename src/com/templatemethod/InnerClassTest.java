package com.templatemethod;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.Timer;

class TalkingClock implements TalkingInterface{
	
	private boolean beep;	
	@Override
	public void invite(List<String> friends){
		
	}
	
	public static class TimePrinter implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Date now=new Date();
			System.out.println("at the tone,time is "+now);			
			Toolkit.getDefaultToolkit().beep();			
		}
		
	}
	
	@Override
	public void start(int interval,final boolean beep){
		
		ActionListener listener=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Date now=new Date();
				System.out.println("at the tone,time is "+now);
				if (beep) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
		};
		Timer t=new Timer(interval,listener);
		t.start();
	}

}

public class InnerClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InfoProxy proxy=new InfoProxy();
		TalkingInterface clock=(TalkingInterface) proxy.bind(new TalkingClock());
		InputStream is=InnerClassTest.class.getResourceAsStream("method.txt");
		Scanner scanner=new Scanner(is);
		while (scanner.hasNext()) {
			int val=scanner.nextInt();
			System.out.print(val+" ");			
		}
		scanner.close();
		System.out.println();	
		clock.start(1000, true);
		clock.invite(new ArrayList<String>(){{add("Harry");add("Tony");}});
		List<String> array=new ArrayList<String>();
		array.add("h1");
		array.add("h2");
		array.add("h3");
		Iterator<?> iterator=array.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			iterator.remove();
			System.out.print(object+" ");
		}
		System.out.print(Arrays.toString(array.toArray()));
		//clock.start(2000, false);
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}

}
