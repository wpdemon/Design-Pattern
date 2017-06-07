package com.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {//树枝节点

	private List<Component> childComponents = new ArrayList<Component>();
	private String name;

	public Composite(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public void addChild(Component child) {
		childComponents.add(child);
	}

	public void removeChild(int index) {
		childComponents.remove(index);
	}

	public List<Component> getChild() {
		return childComponents;
	}

	@Override
	public void printStruct(String preStr) {
		// TODO Auto-generated method stub
		System.out.println(preStr + "+" + this.name);
		// 如果还包含有子组件，那么就输出这些子组件对象
		if (childComponents != null) {
			// 添加两个空格，表示向后缩进两个空格
			preStr += "  ";
			// 输出当前对象的子对象
			for (Component c : childComponents) {
				// 递归输出每个子对象
				c.printStruct(preStr);
			}
		}
	}

}
