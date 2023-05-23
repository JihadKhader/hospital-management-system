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

import dto.SessionDTO;
import model.Session;
import service.SessionService;

@RestController
@RequestMapping("/sessions")
public class SessionController {

  private final SessionService sessionService;

  public SessionController(SessionService sessionService) {
    this.sessionService = sessionService;
  }

  @GetMapping
  public List<SessionDTO> getAllSessions() {
    return sessionService.getAllSessions();
  }

  @GetMapping("/{id}")
  public ResponseEntity<SessionDTO> getSessionById(@PathVariable("id") int id) {
    SessionDTO session = sessionService.getSessionById(id);
    if (session != null) {
      return ResponseEntity.ok(session);
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  @PostMapping
  public ResponseEntity<SessionDTO> createSession(@RequestBody Session session) {
    SessionDTO createdSession = sessionService.createSession(session);
    return ResponseEntity.created(URI.create("/sessions/" + createdSession.getSessionId())).body(createdSession);
  }

  @PutMapping("/{id}")
  public ResponseEntity<SessionDTO> updateSession(@PathVariable("id") int id, @RequestBody Session session) {
    SessionDTO updatedSession = sessionService.updateSession(id, session);
    if (updatedSession != null) {
      return ResponseEntity.ok(updatedSession);
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteSession(@PathVariable("id") int id) {
    if (sessionService.deleteSession(id)) {
      return ResponseEntity.noContent().build();
    } else {
      return ResponseEntity.notFound().build();
    }
  }
}
