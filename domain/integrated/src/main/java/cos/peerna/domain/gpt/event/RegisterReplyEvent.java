package cos.peerna.domain.gpt.event;

import lombok.Builder;

@Builder
public record RegisterReplyEvent (
        Long historyId,
        Long replyId,
        Long problemId,
        Long likeCount,
        String question,
        String answer,
        String exampleAnswer,
        Long userId,
        String userName,
        String userImage,
        boolean alreadyLiked
) {
}
