package repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Receptionist;

@Repository
public interface ReceptionistRepository extends JpaRepository<Receptionist, Integer> {
    Optional<Receptionist> findById(int id);
}
