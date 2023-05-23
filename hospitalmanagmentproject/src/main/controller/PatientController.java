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

import dto.PatientDTO;
import model.Patient;
import service.PatientService;

@RestController
@RequestMapping("/patients")
public class PatientController {

	private final PatientService patientService;

	public PatientController(PatientService patientService) {
		this.patientService = patientService;
	}

	@GetMapping
	public List<PatientDTO> getAllPatients() {
		return patientService.getAllPatients();
	}

	@GetMapping("/{id}")
	public ResponseEntity<PatientDTO> getPatientById(@PathVariable("id") int id) throws NotFoundException {
		PatientDTO patient = patientService.getPatientById(id);
		if (patient != null) {
			return ResponseEntity.ok(patient);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping
	public ResponseEntity<PatientDTO> createPatient(@RequestBody Patient patient) {
		PatientDTO createdPatient = patientService.createPatient(patient);
		return ResponseEntity.created(URI.create("/patients/" + createdPatient.getPatientId())).body(createdPatient);
	}

	@PutMapping("/{id}")
	public ResponseEntity<PatientDTO> updatePatient(@PathVariable("id") int id, @RequestBody Patient patient) throws NotFoundException {
		PatientDTO updatedPatient = patientService.updatePatient(id, patient);
		if (updatedPatient != null) {
			return ResponseEntity.ok(updatedPatient);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletePatient(@PathVariable("id") int id) throws NotFoundException {
		if (patientService.deletePatient(id)) {
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
