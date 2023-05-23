package controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.PatientRecordDTO;
import model.PatientRecord;
import service.PatientRecordService;

@RestController
@RequestMapping("/patientRecords")
public class PatientRecordController {

  private final PatientRecordService patientRecordService;

  public PatientRecordController(PatientRecordService patientRecordService) {
    this.patientRecordService = patientRecordService;
  }

  @GetMapping
  public List<PatientRecordDTO> getAllPatientRecords() {
    return patientRecordService.getAllPatientRecords();
  }

  @GetMapping("/{id}")
  public ResponseEntity<PatientRecordDTO> getPatientRecordById(@PathVariable("id") int id) {
    PatientRecordDTO patientRecord = patientRecordService.getPatientRecordById(id);
    if (patientRecord != null) {
      return ResponseEntity.ok(patientRecord);
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  @PostMapping
  public ResponseEntity<PatientRecordDTO> createPatientRecord(@RequestBody PatientRecord patientRecord) {
    PatientRecordDTO createdPatientRecord = patientRecordService.createPatientRecord(patientRecord);
    return ResponseEntity.created(URI.create("/patientRecords/" + createdPatientRecord.getPatientId())).body(createdPatientRecord);
  }

  @PutMapping("/{id}")
  public ResponseEntity<PatientRecordDTO> updatePatientRecord(@PathVariable("id") int id, @RequestBody PatientRecord patientRecord) {
    PatientRecordDTO updatedPatientRecord = patientRecordService.updatePatientRecord(id, patientRecord);
    if (updatedPatientRecord != null) {
      return ResponseEntity.ok(updatedPatientRecord);
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deletePatientRecord(@PathVariable("id") int id) {
    if (patientRecordService.deletePatientRecord(id)) {
      return ResponseEntity.noContent().build();
    } else {
      return ResponseEntity.notFound().build();
    }
  }
}
