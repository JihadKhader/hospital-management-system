package service;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import dto.EmployeeDTO;

public interface EmployeeService {
	EmployeeDTO getEmployeeById(Integer employeeId) throws NotFoundException;

	List<EmployeeDTO> getAllEmployees();

	EmployeeDTO createEmployee(EmployeeDTO employeeDTO);

	EmployeeDTO updateEmployee(Integer employeeId, EmployeeDTO employeeDTO) throws NotFoundException;

	void deleteEmployee(Integer employeeId) throws NotFoundException;
}
