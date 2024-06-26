package cos.peerna.chat.room.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessageReceiveDto {

    private Integer roomId;
    private Long historyId;
    private String message;
}