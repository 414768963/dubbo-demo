/** 
 * @Title: ConsumerStart.java 
 * @Package com.wenqi 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 文琪 
 * @date 2020年2月23日 
 * @version V1.0 
 */ 

package com.wenqi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wenqi.entity.Student;
import com.wenqi.service.MathService;
import com.wenqi.service.StudentService;

/** 
 * @Title: ConsumerStart.java 
 * @Package com.wenqi 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 文琪 
 * @date 2020年2月23日 
 * @version V1.0 
 */

public class ConsumerStart {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//		StudentService studentService = context.getBean(StudentService.class);
//		Student student = studentService.getById(1);
//		System.out.println("根据ID查询学生:"+student);
//		Student student2 = studentService.addAge(student, 3);
//		System.out.println("增加年龄后:"+student2);
		int a=2;
		int b=3;
		MathService mathService = context.getBean(MathService.class);
		int i = mathService.add(a, b);
		System.out.println("相加后为:"+i);
		int j = mathService.multiply(a, b);
		System.out.println("相乘后为:"+j);
	}
}
