package com.example.api.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.api.dao.CourseDao;
import com.example.api.api.entities.Course;


@Service
public class CourseServiceImplemention implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	//List<Course>list;
	public CourseServiceImplemention() {
//	list=new ArrayList<>();
//	list.add(new Course(1, "java course", "this course contains about core java",5000));
	}
	
	
	@Override
	public List<Course> getCourses(){
		//return list;
		return courseDao.findAll();
	}
	
	@Override
	public Course getCourse(long courseId) {
//		Course c=null;
//		for(Course course:list) {
//			if(course.getId()==courseId)
//			{
//				c=course;
//				break;
//			}
//		}
//		return c;
		
	return	courseDao.getOne(courseId);
	}


	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
//		list.add(course);
//		return course;
		courseDao.save(course);
		return course;
	}


	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
//		list.forEach(e->{
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//				e.setPrice(course.getPrice());
//			}
//		});
//		return course;
		courseDao.save(course);
		return course;
	}


	@Override
	public void deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
		//list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Course entity=courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}
	
	
		
}
	



