package com.templatemethod;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.PushbackInputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


class StringComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		if (o1.compareTo(o2)>0) {
			return 1;
		}else if (o1.compareTo(o2)<0) {
			return -1;
		}
		return 0;
	}
	
}

class Pair<T>{//泛型类
	private T first;
	private T second;
	
	public Pair() {
		// TODO Auto-generated constructor stub
		first=null;
		second=null;
	}
	
	public Pair(T first,T second){
		this.first=first;
		this.second=second;
	}

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public T getSecond() {
		return second;
	}

	public void setSecond(T second) {
		this.second = second;
	}	
}

enum Weekday{
	MONDAY,
	TUESDAY,
	WEDESFAY,
	THUESDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY
}

public class PropertyTest {

	private static final Logger mylLogger=Logger.getLogger("main");
	public static int times(int n) {
		try {
			return n * n;
		} finally {
			if (n == 2) {
				return 0;
			}
		}
	}
	
	public static <T extends Number&Comparable<T>> T getMiddle(T... a) {//泛型方法
		return a[a.length/2];
	}

	
	public static <T> void addAll(Collection<T> col,T... ts) {
		for (T t : ts) {
			col.add(t);
		}
	}
	
	public static void main(String[] args) throws IOException, InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		// TODO Auto-generated method stub
		Logger.getLogger("main").setLevel(Level.FINEST);
		mylLogger.info("File->open the files");
		Properties setting = new Properties();		
		try (FileOutputStream fo = new FileOutputStream("program.properties")){
			setting.put("width", "200");
			setting.put("title", "Hello World");
			setting.store(fo, "Program Properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// System.out.println(System.getProperties());
		try(FileInputStream fi = new FileInputStream("ram.properties")){
			setting.load(fi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			mylLogger.throwing("com.template.method", "main", e);		
			mylLogger.warning("文件不存在");
		}		
		System.out.println(setting.getProperty("width"));
	/*	Preferences root = Preferences.userRoot();
		final Preferences node = root.node("/com/templatemethod");// Preferences.systemNodeForPackage(PropertyTest.class);
		// node.put("width", "200");
		// node.put("title", "Hello World");
		// fo=new FileOutputStream("config.xml");
		// node.exportNode(fo);
		fi = new FileInputStream("config.xml");
		Preferences.importPreferences(fi);
		System.out.println(Arrays.toString(node.keys()));*/			
		Random random=new Random(){

			@Override
			public double nextDouble() {
				// TODO Auto-generated method stub
				double result= super.nextDouble();
				Logger.getGlobal().info("next double is "+result);
				return result;
			}
			
		};
		String[] words={"Mary","has","a","little","lamb"};
	//	Arrays.sort(words, new StringComparator());
		Pair<String> pairs=new Pair<>(words[0], words[1]);
		Collection<Pair<String>> table=new ArrayList<Pair<String>>();		
		Pair<String> pair1=new Pair<String>();
		Pair<String> pair2=new Pair<String>();
		addAll(table, pair1,pair2);
/*		DataInputStream data=new DataInputStream(new PushbackInputStream(new BufferedInputStream(new FileInputStream(""))));
		FileWriter writer=new FileWriter("");
		BufferedReader reader=new BufferedReader(new InputStreamReader(new FileInputStream("")));
		PrintWriter writer2=new PrintWriter("");
		Scanner scanner=new Scanner(new FileInputStream(""),"UTF-8");*/
		//FileReader fileReader=new FileReader(reader);
		RandomAccessFile file=new RandomAccessFile("", "rw");
	/*	Charset cset=Charset.forName("ISO-8859-1");		
		System.out.println(cset.encode("123"));
		System.out.println(cset.decode(cset.encode("123")));*/
		FileOutputStream of=new FileOutputStream("test.zip");
		ZipOutputStream zo=new ZipOutputStream(of);
		InputStream is=new FileInputStream("program.properties");
		ZipEntry entry=new ZipEntry("program.properties");
		//ObjectInputStream oi=new ObjectInputStream(new FileInputStream(""));
		//oi.readObject();
		zo.putNextEntry(entry);
		Path absolute=Paths.get("D:\\workspace\\Design Pattern\\config.xml");
		System.out.println(Files.readAllBytes(absolute));
		for (Path path : Files.newDirectoryStream(Paths.get("D:\\"))){	
			System.out.println(path.getFileName());
		}
		int temp=0;
		while ((temp=is.read())!=-1) {
			zo.write(temp);
		}
		is.close();
		zo.closeEntry();
		zo.close();
		System.out.println(String.class.getConstructor(String.class).newInstance("123"));
		System.out.println(pairs.getFirst()+" "+pairs.getSecond());
		Queue<String> queue=new PriorityQueue<String>();
		Vector<String> vector=new Vector<String>();
		Map<Integer, String> map=new WeakHashMap<Integer, String>();
		map.put(123, "123");
		map.put(123, "456");
		map.put(456, "456");
	/*	for (Entry<Integer, String> entry : map.entrySet()) {
			int key=entry.getKey();
			String val=entry.getValue();
			System.out.println(key+":"+val);
		}
		queue.add("456");
		queue.add("123");
		System.out.println(queue);*/
		EnumSet<Weekday> always=EnumSet.allOf(Weekday.class);
		EnumSet<Weekday> never=EnumSet.noneOf(Weekday.class);
		EnumSet<Weekday> workday=EnumSet.range(Weekday.MONDAY, Weekday.FRIDAY);
		EnumSet<Weekday> mwf=EnumSet.of(Weekday.MONDAY, Weekday.WEDESFAY, Weekday.FRIDAY);
		Collections.synchronizedSet(mwf);		
		Weekday[] weekdays=(Weekday[]) Array.newInstance(Weekday.class, workday.size());
		Arrays.fill(weekdays, Weekday.FRIDAY);
		Collections.sort(Arrays.asList(words),Collections.reverseOrder());//归并排序
		System.out.println(Arrays.toString(words));
//		Collections.shuffle(Arrays.asList(words));
//		Collections.fill(always, Weekday.MONDAY);
		Hashtable<Integer, String> map2=new Hashtable<Integer, String>();				
	}

}
