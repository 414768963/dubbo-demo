/** 
 * @Title: StudentServiceImpl.java 
 * @Package com.wenqi.service.impl 
 * @Description: TODO(��һ�仰�������ļ���ʲô) 
 * @author ���� 
 * @date 2020��2��23�� 
 * @version V1.0 
 */ 

package com.wenqi.service.impl;

import com.wenqi.entity.Student;
import com.wenqi.service.StudentService;

/** 
 * @Title: StudentServiceImpl.java 
 * @Package com.wenqi.service.impl 
 * @Description: TODO(��һ�仰�������ļ���ʲô) 
 * @author ���� 
 * @date 2020��2��23�� 
 * @version V1.0 
 */

public class StudentServiceImpl implements StudentService{

	@Override
	public Student getById(int id) {
		Student student = new Student();
		student.setAge(20);
		student.setId(id);
		student.setName("����   "+id);
		return student;
	}

	@Override
	public Student addAge(Student student, int age) {
		student.setAge(student.getAge()+age);
		return student;
	}

}
