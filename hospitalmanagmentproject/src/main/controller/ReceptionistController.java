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

import dto.ReceptionistDTO;
import model.Receptionist;
import service.ReceptionistService;

@RestController
@RequestMapping("/receptionists")
public class ReceptionistController {

  private final ReceptionistService receptionistService;

  public ReceptionistController(ReceptionistService receptionistService) {
    this.receptionistService = receptionistService;
  }

  @GetMapping
  public List<ReceptionistDTO> getAllReceptionists() {
    return receptionistService.getAllReceptionists();
  }

  @GetMapping("/{id}")
  public ResponseEntity<ReceptionistDTO> getReceptionistById(@PathVariable("id") int id) throws NotFoundException {
    ReceptionistDTO receptionist = receptionistService.getReceptionistById(id);
    if (receptionist != null) {
      return ResponseEntity.ok(receptionist);
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  @PostMapping
  public ResponseEntity<ReceptionistDTO> createReceptionist(@RequestBody Receptionist receptionist) {
    ReceptionistDTO createdReceptionist = receptionistService.createReceptionist(receptionist);
    return ResponseEntity.created(URI.create("/receptionists/" + createdReceptionist.getReceptionistId())).body(createdReceptionist);
  }

  @PutMapping("/{id}")
  public ResponseEntity<ReceptionistDTO> updateReceptionist(@PathVariable("id") int id, @RequestBody Receptionist receptionist) throws NotFoundException {
    ReceptionistDTO updatedReceptionist = receptionistService.updateReceptionist(id, receptionist);
    if (updatedReceptionist != null) {
      return ResponseEntity.ok(updatedReceptionist);
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteReceptionist(@PathVariable("id") int id) throws NotFoundException {
    if (receptionistService.deleteReceptionist(id)) {
      return ResponseEntity.noContent().build();
    } else {
      return ResponseEntity.notFound().build();
    }
  }
}
