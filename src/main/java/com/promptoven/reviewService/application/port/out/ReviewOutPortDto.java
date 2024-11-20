package com.promptoven.reviewService.application.port.out;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
public class ReviewOutPortDto {

    private Long id;
    private String productUuid;
    private String authorUuid;
    private int star;
    private String contents;
    private Boolean isDeleted;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Builder
    public ReviewOutPortDto(Long id, String productUuid, String authorUuid, int star, String contents,
            Boolean isDeleted, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.productUuid = productUuid;
        this.authorUuid = authorUuid;
        this.star = star;
        this.contents = contents;
        this.isDeleted = isDeleted;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
