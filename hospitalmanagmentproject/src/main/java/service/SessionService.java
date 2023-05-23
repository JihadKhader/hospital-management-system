package service;

import java.util.List;

import dto.SessionDTO;
import model.Session;

public interface SessionService {
	SessionDTO getSessionById(Integer sessionId);

	List<SessionDTO> getAllSessions();

	SessionDTO createSession(Session session);

	SessionDTO updateSession(Integer sessionId, Session session);

	boolean deleteSession(Integer sessionId);
}
