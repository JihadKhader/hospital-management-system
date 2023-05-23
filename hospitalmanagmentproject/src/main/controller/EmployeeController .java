package controller;

import java.net.URI;
import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.EmployeeDTO;
import service.EmployeeService;
import model.Employee;
@RestController
@RequestMapping("/employees")
public class EmployeeController {

  private final EmployeeService employeeService;

  public EmployeeController(EmployeeService employeeService) {
    this.employeeService = employeeService;
  }

  @GetMapping
  public List<Employee> getAllEmployees() {
    return employeeService.getAllEmployees();
  }

  @GetMapping("/{id}")
  public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable("id") int id) throws NotFoundException {
    EmployeeDTO employee = employeeService.getEmployeeById(id);
    if (employee != null) {
      return ResponseEntity.ok(employee);
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  @PostMapping
  public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody Employee employee) {
    EmployeeDTO createdEmployee = employeeService.createEmployee(employee);
    return ResponseEntity.created(URI.create("/employees/" + createdEmployee.getEmployeeId())).body(createdEmployee);
  }

  @PutMapping("/{id}")
  public ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable("id") int id, @RequestBody Employee employee) throws NotFoundException {
    EmployeeDTO updatedEmployee = employeeService.updateEmployee(id, employee);
    if (updatedEmployee != null) {
      return ResponseEntity.ok(updatedEmployee);
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteEmployee(@PathVariable("id") int id) throws NotFoundException {
    if (employeeService.deleteEmployee(id)) {
      return ResponseEntity.noContent().build();
    } else {
      return ResponseEntity.notFound().build();
    }
  }
}
