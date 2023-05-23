package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	List<Employee> findByEmployeeBranch(String branch);

	List<Employee> findByEmployeeIsDoctor(boolean isDoctor);
}
