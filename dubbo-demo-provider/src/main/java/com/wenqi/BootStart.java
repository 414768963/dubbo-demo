/** 
 * @Title: BootStart.java 
 * @Package com.wenqi 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 文琪 
 * @date 2020年2月23日 
 * @version V1.0 
 */ 

package com.wenqi;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
 * @Title: BootStart.java 
 * @Package com.wenqi 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 文琪 
 * @date 2020年2月23日 
 * @version V1.0 
 */

public class BootStart {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		//加载服务到容器
		context.start();
		
		//进入阻塞状态
		System.in.read();
	}
}
