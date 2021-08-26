package com.techment.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.techment.model.Student;

public class StudentApplication {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("object.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Student student = (Student)factory.getBean("stdObj");
		student.studentDetails();
		
		
		
	}

}
