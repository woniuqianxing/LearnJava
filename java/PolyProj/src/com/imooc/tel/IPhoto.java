package com.imooc.tel;

/**
 * �������������Ľӿ�
 * 
 * @author Lenovo
 *
 */
public interface IPhoto {
	// �������յ�����
	public void photo();

	default void connection() {
		System.out.println("����IPhoto��connection");
	}
}
