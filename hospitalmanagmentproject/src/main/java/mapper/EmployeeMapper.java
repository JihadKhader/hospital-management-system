package mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import dto.EmployeeDTO;
import model.Employee;

@Component
public class EmployeeMapper {

    public EmployeeDTO toDTO(Employee employee) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmployeeId(employee.getEmployeeId());
        employeeDTO.setEmployeeFirstName(employee.getFirstName());
        employeeDTO.setEmployeeLastName(employee.getLastName());
        employeeDTO.setEmployeeBranch(employee.getBranch());
        employeeDTO.setEmployeeNumber(employee.getEmployeeNumber());
        employeeDTO.setEmployeeShift(employee.getShift());
        employeeDTO.setEmployeeIsDoctor(employee.isDoctor());
        return employeeDTO;
    }
    public List<EmployeeDTO> toDTOList(List<Employee> entities) {
        return entities.stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    public Employee toEntity(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setEmployeeId(employeeDTO.getEmployeeId());
        employee.setFirstName(employeeDTO.getEmployeeFirstName());
        employee.setLastName(employeeDTO.getEmployeeLastName());
        employee.setBranch(employeeDTO.getEmployeeBranch());
        employee.setEmployeeNumber(employeeDTO.getEmployeeNumber());
        employee.setShift(employeeDTO.getEmployeeShift());
        employee.setDoctor(employeeDTO.getEmployeeIsDoctor());
        return employee;
    }

    public void updateEntity(EmployeeDTO employeeDTO, Employee employee) {
        employee.setFirstName(employeeDTO.getEmployeeFirstName());
        employee.setLastName(employeeDTO.getEmployeeLastName());
        employee.setBranch(employeeDTO.getEmployeeBranch());
        employee.setEmployeeNumber(employeeDTO.getEmployeeNumber());
        employee.setShift(employeeDTO.getEmployeeShift());
        employee.setDoctor(employeeDTO.getEmployeeIsDoctor());
    }
}
