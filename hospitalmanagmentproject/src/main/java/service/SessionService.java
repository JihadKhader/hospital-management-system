package service;

import java.util.List;

import dto.SessionDTO;

public interface SessionService {
	SessionDTO getSessionById(Integer sessionId);

	List<SessionDTO> getAllSessions();

	SessionDTO createSession(SessionDTO sessionDTO);

	SessionDTO updateSession(Integer sessionId, SessionDTO sessionDTO);

	void deleteSession(Integer sessionId);
}
