package com.promptoven.reviewService.application.mapper;

import com.promptoven.reviewService.adaptor.out.mysql.entity.ReviewEntity;
import com.promptoven.reviewService.application.port.out.ReviewTransactionDto;
import com.promptoven.reviewService.domain.model.Review;
import org.springframework.stereotype.Component;

@Component
public class ReviewDtoMapper {

    public ReviewTransactionDto toDto(Review review) {
        return ReviewTransactionDto.builder()
                .id(review.getId())
                .productUuid(review.getProductUuid())
                .memberUuid(review.getMemberUuid())
                .star(review.getStar())
                .contents(review.getContents())
                .isDeleted(review.getIsDeleted())
                .createdAt(review.getCreatedAt())
                .updatedAt(review.getUpdatedAt())
                .build();
    }
}
