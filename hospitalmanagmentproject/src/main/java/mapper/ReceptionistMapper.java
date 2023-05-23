package mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import dto.ReceptionistDTO;
import model.Receptionist;
import model.Employee;

@Component
public class ReceptionistMapper {

	private final EmployeeMapper employeeMapper;

	public ReceptionistMapper(EmployeeMapper employeeMapper) {
		this.employeeMapper = employeeMapper;
	}

	public ReceptionistDTO toDTO(Receptionist receptionist) {
		ReceptionistDTO receptionistDTO = new ReceptionistDTO();
		receptionistDTO.setReceptionistId(receptionist.getReceptionistId());
		receptionistDTO.setEmployeeId(receptionist.getEmployee().getEmployeeId());
		return receptionistDTO;
	}

	public Receptionist toEntity(ReceptionistDTO receptionistDTO) {
		Receptionist receptionist = new Receptionist();
		receptionist.setReceptionistId(receptionistDTO.getReceptionistId());
		Employee employee = new Employee();
		employee.setEmployeeId(receptionistDTO.getEmployeeId());
		receptionist.setEmployee(employee);
		return receptionist;
	}

	public void updateEntity(ReceptionistDTO receptionistDTO, Receptionist receptionist) {
		// No specific fields to update
	}

	public Receptionist toEntity(ReceptionistDTO receptionistDTO, Employee employee) {
		Receptionist receptionist = toEntity(receptionistDTO);
		receptionist.setEmployee(employee);
		return receptionist;
	}

	public List<ReceptionistDTO> toDTOList(List<Receptionist> entities) {
		return entities.stream().map(this::toDTO).collect(Collectors.toList());
	}
}
