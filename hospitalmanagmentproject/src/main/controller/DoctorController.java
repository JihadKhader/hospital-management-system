package controller;

import java.net.URI;
import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.DoctorDTO;
import model.Doctor;
import service.DoctorService;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

  private final DoctorService doctorService;

  public DoctorController(DoctorService doctorService) {
    this.doctorService = doctorService;
  }

  @GetMapping
  public List<DoctorDTO> getAllDoctors() {
    return doctorService.getAllDoctors();
  }

  @GetMapping("/{id}")
  public ResponseEntity<DoctorDTO> getDoctorById(@PathVariable("id") int id) throws NotFoundException {
    DoctorDTO doctor = doctorService.getDoctorById(id);
    if (doctor != null) {
      return ResponseEntity.ok(doctor);
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  @PostMapping
  public ResponseEntity<DoctorDTO> createDoctor(@RequestBody Doctor doctor) {
    DoctorDTO createdDoctor = doctorService.createDoctor(doctor);
    return ResponseEntity.created(URI.create("/doctors/" + createdDoctor.getId())).body(createdDoctor);
  }

  @PutMapping("/{id}")
  public ResponseEntity<DoctorDTO> updateDoctor(@PathVariable("id") int id, @RequestBody Doctor doctor) throws NotFoundException {
    DoctorDTO updatedDoctor = doctorService.updateDoctor(id, doctor);
    if (updatedDoctor != null) {
      return ResponseEntity.ok(updatedDoctor);
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteDoctor(@PathVariable("id") int id) throws NotFoundException {
    if (doctorService.deleteDoctor(id)) {
      return ResponseEntity.noContent().build();
    } else {
      return ResponseEntity.notFound().build();
    }
  }
}
