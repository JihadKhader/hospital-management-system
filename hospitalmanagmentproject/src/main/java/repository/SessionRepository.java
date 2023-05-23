package repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.websocket.Session;

@Repository
public interface SessionRepository extends JpaRepository<Session, Integer> {
    Optional<Session> findBySessionId(int sessionId);

	<S> model.Session saveAll(S existingSession);
}
