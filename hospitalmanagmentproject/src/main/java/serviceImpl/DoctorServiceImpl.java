package serviceImpl;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import dto.DoctorDTO;
import mapper.DoctorMapper;
import model.Doctor;
import repository.DoctorRepository;
import service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {

    private final DoctorRepository doctorRepository;
    private final DoctorMapper doctorMapper;

    public DoctorServiceImpl(DoctorRepository doctorRepository, DoctorMapper doctorMapper) {
        this.doctorRepository = doctorRepository;
        this.doctorMapper = doctorMapper;
    }

    @Override
    public DoctorDTO getDoctorById(Integer doctorId) throws NotFoundException {
        Doctor doctor = doctorRepository.findById(doctorId)
                .orElseThrow(() -> new NotFoundException());
        return doctorMapper.toDTO(doctor);
    }

    @Override
    public List<DoctorDTO> getAllDoctors() {
        List<Doctor> doctors = doctorRepository.findAll();
        return doctorMapper.toDTOList(doctors);
    }

    @Override
    public DoctorDTO createDoctor(DoctorDTO doctorDTO) {
        Doctor doctor = doctorMapper.toEntity(doctorDTO);
        Doctor savedDoctor = doctorRepository.save(doctor);
        return doctorMapper.toDTO(savedDoctor);
    }

    @Override
    public DoctorDTO updateDoctor(Integer doctorId, DoctorDTO doctorDTO) throws NotFoundException {
        Doctor existingDoctor = doctorRepository.findById(doctorId)
                .orElseThrow(() -> new NotFoundException());
        doctorMapper.updateEntity(doctorDTO, existingDoctor);
        Doctor updatedDoctor = doctorRepository.save(existingDoctor);
        return doctorMapper.toDTO(updatedDoctor);
    }

    @Override
    public void deleteDoctor(Integer doctorId) throws NotFoundException {
        if (!doctorRepository.existsById(doctorId)) {
            throw new NotFoundException();
        }
        doctorRepository.deleteById(doctorId);
    }


}
