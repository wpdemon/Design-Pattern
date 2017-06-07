package com.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {//��֦�ڵ�

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
		// ��������������������ô�������Щ���������
		if (childComponents != null) {
			// ��������ո񣬱�ʾ������������ո�
			preStr += "  ";
			// �����ǰ������Ӷ���
			for (Component c : childComponents) {
				// �ݹ����ÿ���Ӷ���
				c.printStruct(preStr);
			}
		}
	}

}
