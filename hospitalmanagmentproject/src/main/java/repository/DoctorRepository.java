package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
    List<Doctor> findByDoctorIsAvailable(boolean isAvailable);
    List<Doctor> findByDoctorSection(String section);
}