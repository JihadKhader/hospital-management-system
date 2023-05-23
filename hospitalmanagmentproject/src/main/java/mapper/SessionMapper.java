package mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import dto.SessionDTO;
import model.Session;

@Component
public class SessionMapper {

    public SessionDTO toDTO(Session entity) {
        SessionDTO dto = new SessionDTO();
        dto.setSessionId(entity.getSessionId());
        dto.setSessionTime(entity.getSessionTime());
        dto.setRoomNumber(entity.getRoomNumber());
        return dto;
    }

    public List<SessionDTO> toDTOList(List<Session> entities) {
        return entities.stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    public Session toEntity(SessionDTO dto) {
        Session entity = new Session();
        entity.setSessionId(dto.getSessionId());
        entity.setSessionTime(dto.getSessionTime());
        entity.setRoomNumber(dto.getRoomNumber());
        return entity;
    }

    public List<Session> toEntityList(List<SessionDTO> dtos) {
        return dtos.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

	public void updateEntity(SessionDTO sessionDTO, Session existingSession) {
		// TODO Auto-generated method stub
		
	}
}
