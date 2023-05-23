package service;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import dto.DoctorDTO;

public interface DoctorService {
	DoctorDTO getDoctorById(Integer doctorId) throws NotFoundException;

	List<DoctorDTO> getAllDoctors();

	DoctorDTO createDoctor(DoctorDTO doctorDTO);

	DoctorDTO updateDoctor(Integer doctorId, DoctorDTO doctorDTO) throws NotFoundException;

	void deleteDoctor(Integer doctorId) throws NotFoundException;
}
