package service;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import dto.DoctorDTO;
import model.Doctor;

public interface DoctorService {
	DoctorDTO getDoctorById(Integer doctorId) throws NotFoundException;

	List<DoctorDTO> getAllDoctors();

	DoctorDTO createDoctor(Doctor doctor);

	DoctorDTO updateDoctor(Integer doctorId, Doctor doctor) throws NotFoundException;

	boolean deleteDoctor(Integer doctorId) throws NotFoundException;
}
