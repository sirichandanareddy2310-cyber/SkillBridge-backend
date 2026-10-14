package SkillBridge.Backend.repository;

import SkillBridge.Backend.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    
    boolean existsByEmail(String email);
}