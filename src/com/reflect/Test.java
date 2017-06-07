package com.reflect;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test {

	public static void printFields(Class<?> cl){
	//	Field[] fields = cl.getFields();//公有域
		Field[] fields = cl.getDeclaredFields();//全部域
		for (Field f : fields) {
			Class<?> type = f.getType();
			String name = f.getName();			
			String modifiers = Modifier.toString(f.getModifiers());
			if (modifiers.length() > 0)
				System.out.print(modifiers + " ");
			System.out.println(type.getName() + " " + name + ";");
		}
	}

	public static void printMethods(Class<?> cl) {
		Method[] methods = cl.getDeclaredMethods();
		for (Method m : methods) {
			Class<?> retType = m.getReturnType();
			String name = m.getName();			
			String modifiers = Modifier.toString(m.getModifiers());
			if (modifiers.length() > 0)
				System.out.print(modifiers + " ");
			System.out.print(retType.getName() + " " + name + "(");
			Class<?>[] paramTypes = m.getParameterTypes();
			for (int j = 0; j < paramTypes.length; j++) {
				if (j > 0)
					System.out.print(",");
				System.out.print(paramTypes[j].getName());
			}
			System.out.println(")");
		}
	}

	public static void printConstructors(Class<?> cl) {

		Constructor<?>[] constructors = cl.getDeclaredConstructors();
		for (Constructor<?> c : constructors) {
			String name=c.getName();
			String modifiers=Modifier.toString(c.getModifiers());
			if(modifiers.length()>0)
				System.out.print(modifiers+" ");
			System.out.print(name+"(");
			Class<?>[] cls = c.getParameterTypes();
			for (int i = 0; i < cls.length; i++) {
				if(i>0)
					System.out.print(", ");
				System.out.print(cls[i].getName());
			}
			System.out.println(");");
		}

	}

	public static Object goodCopyOf(Object a,int newlength) {
		Class cl=a.getClass();
		if (!cl.isArray()) {
			return null;
		}
		int length=Array.getLength(a);
		Class type=cl.getComponentType();
		Object newarray=Array.newInstance(type, length);		
		System.arraycopy(a, 0, newarray, 0,Math.min(newlength, length));
		return newarray;
	}
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchMethodException, SecurityException, InvocationTargetException, ClassNotFoundException{
		// TODO Auto-generated method stub
		Employee e = new Employee(1);
		Class<?> cl = e.getClass();		
		Field[] fields=cl.getDeclaredFields();
		AccessibleObject.setAccessible(fields, true);	
		int[] a={1,2,3};
		a=(int[])goodCopyOf(a, 2);	
		Method method=Employee.class.getMethod("sum",int.class,int.class);
		System.out.println(method.invoke(e,4,5));		
		printConstructors(cl);
		printFields(cl);
		printMethods(cl);
		System.out.println(Object[][].class);
		
	}

}
