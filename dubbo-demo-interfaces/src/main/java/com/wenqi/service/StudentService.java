/** 
 * @Title: StudentService.java 
 * @Package com.wenqi.service 
 * @Description: TODO(��һ�仰�������ļ���ʲô) 
 * @author ���� 
 * @date 2020��2��23�� 
 * @version V1.0 
 */ 

package com.wenqi.service;

import com.wenqi.entity.Student;

/** 
 * @Title: StudentService.java 
 * @Package com.wenqi.service 
 * @Description: TODO(��һ�仰�������ļ���ʲô) 
 * @author ���� 
 * @date 2020��2��23�� 
 * @version V1.0 
 */

public interface StudentService {

	Student getById(int id);
	
	Student addAge(Student student,int age);
}
