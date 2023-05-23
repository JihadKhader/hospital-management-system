package service;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import dto.ReceptionistDTO;

public interface ReceptionistService {
	ReceptionistDTO getReceptionistById(Integer receptionistId) throws NotFoundException;

	List<ReceptionistDTO> getAllReceptionists();

	ReceptionistDTO createReceptionist(ReceptionistDTO receptionistDTO);

	ReceptionistDTO updateReceptionist(Integer receptionistId, ReceptionistDTO receptionistDTO) throws NotFoundException;

	void deleteReceptionist(Integer receptionistId) throws NotFoundException;
}
