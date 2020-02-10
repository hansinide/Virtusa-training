package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import modal.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
