package com.learn_spring_boot.learnspringboot

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/courses")
class CourseController {
	
	
	@GetMapping
	fun retrieveAllCourses(): List<Course> = listOf(
		Course(1, "Learn AWS", "in28minutes"),
		Course(2, "Learn DevOps", "in28minutes"),
		Course(3, "Learn Azure", "in28minutes"),
	)
}