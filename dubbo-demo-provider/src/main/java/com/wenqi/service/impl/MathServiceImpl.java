/** 
 * @Title: MathServiceImpl.java 
 * @Package com.wenqi.service.impl 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 文琪 
 * @date 2020年2月23日 
 * @version V1.0 
 */ 

package com.wenqi.service.impl;

import com.wenqi.service.MathService;

/** 
 * @Title: MathServiceImpl.java 
 * @Package com.wenqi.service.impl 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 文琪 
 * @date 2020年2月23日 
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
