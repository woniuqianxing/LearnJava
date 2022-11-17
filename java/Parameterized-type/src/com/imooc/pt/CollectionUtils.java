package com.imooc.pt;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//ʵ�����ѡ��list�е�Ԫ��,�����������ӷ��ͣ�<E>��������������Ŀɱ������
public class CollectionUtils<E> {
	// ����list����
	private List<E> data = new ArrayList();

	// ��ǰlist����Ԫ�أ�����Ҫ�Ͷ���ķ������ͱ���һ��
	public void add(E element) {
		data.add(element);
	}

	// ���ѡ��List�е����ݣ��������ͺͷ���һ�£�nextInt����ָ����Χ�ڵ��������
	public E randomSelect() {
		int idx = new Random().nextInt(data.size());
		E ret = data.get(idx);
		return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionUtils<String> utils = new CollectionUtils();
		utils.add("����");
		utils.add("����");
		utils.add("����");
		utils.add("����");
		String name = utils.randomSelect();
		System.out.println(name);
	}

}