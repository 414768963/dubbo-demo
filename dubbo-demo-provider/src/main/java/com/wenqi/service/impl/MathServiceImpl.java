/** 
 * @Title: MathServiceImpl.java 
 * @Package com.wenqi.service.impl 
 * @Description: TODO(��һ�仰�������ļ���ʲô) 
 * @author ���� 
 * @date 2020��2��23�� 
 * @version V1.0 
 */ 

package com.wenqi.service.impl;

import com.wenqi.service.MathService;

/** 
 * @Title: MathServiceImpl.java 
 * @Package com.wenqi.service.impl 
 * @Description: TODO(��һ�仰�������ļ���ʲô) 
 * @author ���� 
 * @date 2020��2��23�� 
 * @version V1.0 
 */

public class MathServiceImpl implements MathService{

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public int multiply(int a, int b) {
		
		int i = (a*b);
		return i;
	}

}
