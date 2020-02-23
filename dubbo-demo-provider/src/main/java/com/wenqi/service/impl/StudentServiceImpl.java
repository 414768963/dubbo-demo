/** 
 * @Title: StudentServiceImpl.java 
 * @Package com.wenqi.service.impl 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 文琪 
 * @date 2020年2月23日 
 * @version V1.0 
 */ 

package com.wenqi.service.impl;

import com.wenqi.entity.Student;
import com.wenqi.service.StudentService;

/** 
 * @Title: StudentServiceImpl.java 
 * @Package com.wenqi.service.impl 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 文琪 
 * @date 2020年2月23日 
 * @version V1.0 
 */

public class StudentServiceImpl implements StudentService{

	@Override
	public Student getById(int id) {
		Student student = new Student();
		student.setAge(20);
		student.setId(id);
		student.setName("李四   "+id);
		return student;
	}

	@Override
	public Student addAge(Student student, int age) {
		student.setAge(student.getAge()+age);
		return student;
	}

}
