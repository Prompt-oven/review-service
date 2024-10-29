package com.promptoven.reviewService.application.port.out;

import com.promptoven.reviewService.adaptor.out.mysql.entity.ReviewEntity;
import com.promptoven.reviewService.application.port.in.ReviewPaginationDto;
import com.promptoven.reviewService.global.common.utils.CursorPage;
import java.util.List;
import java.util.Optional;

public interface ReviewRepositoryPort {

    void save(ReviewOutPortDto reviewOutPortDto);

    void update(ReviewOutPortDto reviewOutPortDto);

    void delete(ReviewOutPortDto reviewOutPortDto);

    Optional<ReviewOutPortDto> getReviewByReviewId(Long reviewId);

    List<ReviewOutPortDto> getReviewsByProductUuid(String productUuid);

    // CursorPage<ReviewOutPortDto> getReviewByProductUuid(String productUuid, Long lastId, Integer pageSize, Integer page);

    CursorPage<ReviewOutPortDto> getReviewByProductUuid(ReviewPaginationDto reviewPaginationDto);
}
