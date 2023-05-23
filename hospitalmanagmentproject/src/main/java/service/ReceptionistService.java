package service;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import dto.ReceptionistDTO;
import model.Receptionist;

public interface ReceptionistService {
	ReceptionistDTO getReceptionistById(Integer receptionistId) throws NotFoundException;

	List<ReceptionistDTO> getAllReceptionists();

	ReceptionistDTO createReceptionist(Receptionist receptionist);

	ReceptionistDTO updateReceptionist(Integer receptionistId, Receptionist receptionist) throws NotFoundException;

	boolean deleteReceptionist(Integer receptionistId) throws NotFoundException;
}
