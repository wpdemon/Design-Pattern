package com.templatemethod;

import static java.lang.System.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Àà×¢ÊÍ
 * @author JZ
 *
 */
public class Employee implements Cloneable,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 723664050106487606L;

	@Override
	public Employee clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Employee)super.clone();
	}
	
	public Employee deepClone() throws IOException, ClassNotFoundException{
		ByteArrayOutputStream os=new ByteArrayOutputStream();
		ObjectOutputStream oo=new ObjectOutputStream(os);
		oo.writeObject(this);
		ByteArrayInputStream is=new ByteArrayInputStream(os.toByteArray());
		ObjectInputStream oi=new ObjectInputStream(is);
		return (Employee) oi.readObject();
	}

	private static int nextId;
	private int id;
	private String name;
	private double salary;
	private static int value;
	
	{//³õÊ¼»¯¿é
		id=nextId;
		nextId++;
	}
	
	static{
		value=1;
	}
	
	public Employee(String n,double s) {
		// TODO Auto-generated constructor stub
		name=n;
		salary=s;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
		name="";
		salary=0;
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub		
		super.finalize();		
		System.out.println("begin gc");
	}
	
	public static void triple(Integer... e) {
		e[0]=128;
	}

	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		ArrayList<Integer> a1=new ArrayList<>();
		Employee e1=new Employee();
		Integer b=129;
		Class cl=Double.class;
		Field[] fields=cl.getDeclaredFields();
		AccessibleObject.setAccessible(fields, true);
		for (Field field : fields) {
			try {				
				System.out.println(Modifier.toString(field.getModifiers())+" "+field.getType()+" "+field.getName()+" "+field.get(new Double(1.0)));
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		out.println("change before"+b);
		triple(b);
		out.println("change after"+b);
		int[] a={1,2,3,4};
		int[] c={2,3,4,5};
		out.println(e1.salary);
		Employee e2=e1.deepClone();
		e2.name="wp";
		out.println(e2.name+" "+e1.name);
		System.out.println(null instanceof Object);
		System.out.println(Arrays.toString(Arrays.copyOf(a, a.length*2)));
		System.arraycopy(a, 0, c, 0,c.length);
		System.out.println(Arrays.toString(c));
		
	}
}
