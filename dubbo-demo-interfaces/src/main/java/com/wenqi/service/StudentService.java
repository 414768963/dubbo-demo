/** 
 * @Title: StudentService.java 
 * @Package com.wenqi.service 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 文琪 
 * @date 2020年2月23日 
 * @version V1.0 
 */ 

package com.wenqi.service;

import com.wenqi.entity.Student;

/** 
 * @Title: StudentService.java 
 * @Package com.wenqi.service 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 文琪 
 * @date 2020年2月23日 
 * @version V1.0 
 */

public interface StudentService {

	Student getById(int id);
	
	Student addAge(Student student,int age);
}
