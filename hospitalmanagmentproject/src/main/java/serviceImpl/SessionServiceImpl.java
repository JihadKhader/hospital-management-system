package serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import dto.SessionDTO;
import mapper.SessionMapper;
import model.Session;
import repository.SessionRepository;
import service.SessionService;

@Service
public class SessionServiceImpl implements SessionService {

	@Override
	public SessionDTO getSessionById(Integer sessionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SessionDTO> getAllSessions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SessionDTO createSession(SessionDTO sessionDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SessionDTO updateSession(Integer sessionId, SessionDTO sessionDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSession(Integer sessionId) {
		// TODO Auto-generated method stub
		
	}

//    private final SessionRepository sessionRepository;
//    private final SessionMapper sessionMapper;
//
//    public SessionServiceImpl(SessionRepository sessionRepository, SessionMapper sessionMapper) {
//        this.sessionRepository = sessionRepository;
//        this.sessionMapper = sessionMapper;
//    }
//
//    @Override
//    public SessionDTO getSessionById(Integer sessionId) {
//        Session session = (Session) sessionRepository.findById(sessionId)
//                .orElseThrow();
//        return sessionMapper.toDTO(session);
//    }
//
//    @Override
//    public List<SessionDTO> getAllSessions() {
//        List<jakarta.websocket.Session> sessions = sessionRepository.findAll();
//        return sessionMapper.toDTOList(sessions);
//    }
//
//    @Override
//    public SessionDTO createSession(SessionDTO sessionDTO) {
//        Session session = sessionMapper.toEntity(sessionDTO);
//        Session savedSession = sessionRepository.save(session);
//        return sessionMapper.toDTO(savedSession);
//    }
//
//    @Override
//    public SessionDTO updateSession(Integer sessionId, SessionDTO sessionDTO) {
//        Session existingSession = sessionRepository.findById(sessionId)
//                .orElseThrow();
//        sessionMapper.updateEntity(sessionDTO, existingSession);
//        Session updatedSession = sessionRepository.save(existingSession);
//        return sessionMapper.toDTO(updatedSession);
//    }
//
//    @Override
//    public void deleteSession(Integer sessionId) {
//        if (!sessionRepository.existsById(sessionId)) {
//            throw new NotFoundException("Session not found with ID: " + sessionId);
//        }
//        sessionRepository.deleteById(sessionId);
//    }
}
