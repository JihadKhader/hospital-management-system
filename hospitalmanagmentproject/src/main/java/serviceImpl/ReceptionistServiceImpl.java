package serviceImpl;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import dto.ReceptionistDTO;
import mapper.ReceptionistMapper;
import model.Receptionist;
import repository.ReceptionistRepository;
import service.ReceptionistService;

@Service
public class ReceptionistServiceImpl implements ReceptionistService {

    private final ReceptionistRepository receptionistRepository;
    private final ReceptionistMapper receptionistMapper;

    public ReceptionistServiceImpl(ReceptionistRepository receptionistRepository, ReceptionistMapper receptionistMapper) {
        this.receptionistRepository = receptionistRepository;
        this.receptionistMapper = receptionistMapper;
    }

    @Override
    public ReceptionistDTO getReceptionistById(Integer receptionistId) throws NotFoundException {
        Receptionist receptionist = receptionistRepository.findById(receptionistId)
                .orElseThrow(() -> new NotFoundException());
        return receptionistMapper.toDTO(receptionist);
    }

    @Override
    public List<ReceptionistDTO> getAllReceptionists() {
        List<Receptionist> receptionists = receptionistRepository.findAll();
        return receptionistMapper.toDTOList(receptionists);
    }

    @Override
    public ReceptionistDTO createReceptionist(ReceptionistDTO receptionistDTO) {
        Receptionist receptionist = receptionistMapper.toEntity(receptionistDTO);
        Receptionist savedReceptionist = receptionistRepository.save(receptionist);
        return receptionistMapper.toDTO(savedReceptionist);
    }

    @Override
    public ReceptionistDTO updateReceptionist(Integer receptionistId, ReceptionistDTO receptionistDTO) throws NotFoundException {
        Receptionist existingReceptionist = receptionistRepository.findById(receptionistId)
                .orElseThrow(() -> new NotFoundException());
        receptionistMapper.updateEntity(receptionistDTO, existingReceptionist);
        Receptionist updatedReceptionist = receptionistRepository.save(existingReceptionist);
        return receptionistMapper.toDTO(updatedReceptionist);
    }

    @Override
    public void deleteReceptionist(Integer receptionistId) throws NotFoundException {
        if (!receptionistRepository.existsById(receptionistId)) {
            throw new NotFoundException();
        }
        receptionistRepository.deleteById(receptionistId);
    }
}
