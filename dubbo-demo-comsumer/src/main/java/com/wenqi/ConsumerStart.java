/** 
 * @Title: ConsumerStart.java 
 * @Package com.wenqi 
 * @Description: TODO(��һ�仰�������ļ���ʲô) 
 * @author ���� 
 * @date 2020��2��23�� 
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
 * @Description: TODO(��һ�仰�������ļ���ʲô) 
 * @author ���� 
 * @date 2020��2��23�� 
 * @version V1.0 
 */

public class ConsumerStart {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//		StudentService studentService = context.getBean(StudentService.class);
//		Student student = studentService.getById(1);
//		System.out.println("����ID��ѯѧ��:"+student);
//		Student student2 = studentService.addAge(student, 3);
//		System.out.println("���������:"+student2);
		int a=2;
		int b=3;
		MathService mathService = context.getBean(MathService.class);
		int i = mathService.add(a, b);
		System.out.println("��Ӻ�Ϊ:"+i);
		int j = mathService.multiply(a, b);
		System.out.println("��˺�Ϊ:"+j);
	}
}
