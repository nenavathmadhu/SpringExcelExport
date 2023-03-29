package in.madhu.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.madhu.Course;

public interface CourseRepository extends JpaRepository<Course, Serializable> {

}
