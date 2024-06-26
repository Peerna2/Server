package cos.peerna.match.event;

import cos.peerna.domain.match.event.MatchWebSocketDisconnectEvent;
import cos.peerna.match.service.MatchService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Slf4j
@Component
@RequiredArgsConstructor
public class MatchEventListener {

    private final MatchService matchService;

    @EventListener
    public void webSocketDisconnectEventHandler(MatchWebSocketDisconnectEvent event) {
        log.debug("MatchWebSocketDisconnectEvent ---> {}", event);
        try {
            matchService.cancelTicket(event.userId());
        } catch (ResponseStatusException ignored) {}
    }
}
