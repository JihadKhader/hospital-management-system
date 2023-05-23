package serviceImpl;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import dto.PatientDTO;
import mapper.PatientMapper;
import model.Patient;
import repository.PatientRepository;
import service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;
    private final PatientMapper patientMapper;

    public PatientServiceImpl(PatientRepository patientRepository, PatientMapper patientMapper) {
        this.patientRepository = patientRepository;
        this.patientMapper = patientMapper;
    }

    @Override
    public PatientDTO getPatientById(Integer patientId) throws NotFoundException {
        Patient patient = patientRepository.findById(patientId)
                .orElseThrow(() -> new NotFoundException());
        return patientMapper.toDTO(patient);
    }

    @Override
    public List<PatientDTO> getAllPatients() {
        List<Patient> patients = patientRepository.findAll();
        return patientMapper.toDTOList(patients);
    }

    @Override
    public PatientDTO createPatient(PatientDTO patientDTO) {
        Patient patient = patientMapper.toEntity(patientDTO);
        Patient savedPatient = patientRepository.save(patient);
        return patientMapper.toDTO(savedPatient);
    }

    @Override
    public PatientDTO updatePatient(Integer patientId, PatientDTO patientDTO) throws NotFoundException {
        Patient existingPatient = patientRepository.findById(patientId)
                .orElseThrow(() -> new NotFoundException());
        patientMapper.updateEntity(patientDTO, existingPatient);
        Patient updatedPatient = patientRepository.save(existingPatient);
        return patientMapper.toDTO(updatedPatient);
    }

    @Override
    public void deletePatient(Integer patientId) throws NotFoundException {
        if (!patientRepository.existsById(patientId)) {
            throw new NotFoundException();
        }
        patientRepository.deleteById(patientId);
    }
}
