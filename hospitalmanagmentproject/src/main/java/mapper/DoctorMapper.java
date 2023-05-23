package mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import dto.DoctorDTO;
import model.Doctor;
import model.Employee;

@Component
public class DoctorMapper {

    private final EmployeeMapper employeeMapper;

    public DoctorMapper(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    public DoctorDTO toDTO(Doctor doctor) {
        DoctorDTO doctorDTO = new DoctorDTO();
        doctorDTO.setDoctorId(doctor.getDoctorId());
        doctorDTO.setEmployeeId(doctor.getEmployee().getEmployeeId());
        doctorDTO.setDoctorIsAvailable(doctor.isAvailable());
        doctorDTO.setDoctorSection(doctor.getSection());
        doctorDTO.setDoctorRoomNumber(doctor.getRoomNumber());
        return doctorDTO;
    }

    public Doctor toEntity(DoctorDTO doctorDTO) {
        Doctor doctor = new Doctor();
        doctor.setDoctorId(doctorDTO.getDoctorId());
        Employee employee = new Employee();
        employee.setEmployeeId(doctorDTO.getEmployeeId());
        doctor.setEmployee(employee);
        doctor.setAvailable(doctorDTO.getDoctorIsAvailable());
        doctor.setSection(doctorDTO.getDoctorSection());
        doctor.setRoomNumber(doctorDTO.getDoctorRoomNumber());
        return doctor;
    }

    public void updateEntity(DoctorDTO doctorDTO, Doctor doctor) {
        doctor.setAvailable(doctorDTO.getDoctorIsAvailable());
        doctor.setSection(doctorDTO.getDoctorSection());
        doctor.setRoomNumber(doctorDTO.getDoctorRoomNumber());
    }

    public Doctor toEntity(DoctorDTO doctorDTO, Employee employee) {
        Doctor doctor = toEntity(doctorDTO);
        doctor.setEmployee(employee);
        return doctor;
    }

	 public List<DoctorDTO> toDTOList(List<Doctor> entities) {
        return entities.stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }
}
