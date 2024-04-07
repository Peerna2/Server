package cos.peerna.controller.history.response;

import cos.peerna.controller.reply.response.ReplyResponse;
import cos.peerna.domain.room.dto.ChatMessageSendDto;
import java.time.LocalDate;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DetailHistoryResponse {
    private LocalDate date;
    private List<ReplyResponse> replies;
    private List<String> keywords;
    private List<ChatMessageSendDto> chattings;
}