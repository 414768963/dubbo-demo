/** 
 * @Title: BootStart.java 
 * @Package com.wenqi 
 * @Description: TODO(��һ�仰�������ļ���ʲô) 
 * @author ���� 
 * @date 2020��2��23�� 
 * @version V1.0 
 */ 

package com.wenqi;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
 * @Title: BootStart.java 
 * @Package com.wenqi 
 * @Description: TODO(��һ�仰�������ļ���ʲô) 
 * @author ���� 
 * @date 2020��2��23�� 
 * @version V1.0 
 */

public class BootStart {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		//���ط�������
		context.start();
		
		//��������״̬
		System.in.read();
	}
}
