package serviceImpl;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import dto.EmployeeDTO;
import mapper.EmployeeMapper;
import model.Employee;
import repository.EmployeeRepository;
import service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository, EmployeeMapper employeeMapper) {
        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
    }

    @Override
    public EmployeeDTO getEmployeeById(Integer employeeId) throws NotFoundException {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new NotFoundException());
        return employeeMapper.toDTO(employee);
    }

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employeeMapper.toDTOList(employees);
    }

    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        Employee employee = employeeMapper.toEntity(employeeDTO);
        Employee savedEmployee = employeeRepository.save(employee);
        return employeeMapper.toDTO(savedEmployee);
    }

    @Override
    public EmployeeDTO updateEmployee(Integer employeeId, EmployeeDTO employeeDTO) throws NotFoundException {
        Employee existingEmployee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new NotFoundException());
        employeeMapper.updateEntity(employeeDTO, existingEmployee);
        Employee updatedEmployee = employeeRepository.save(existingEmployee);
        return employeeMapper.toDTO(updatedEmployee);
    }

    @Override
    public void deleteEmployee(Integer employeeId) throws NotFoundException {
        if (!employeeRepository.existsById(employeeId)) {
            throw new NotFoundException();
        }
        employeeRepository.deleteById(employeeId);
    }
}
