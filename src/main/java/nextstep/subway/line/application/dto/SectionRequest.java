package nextstep.subway.line.application.dto;

import nextstep.subway.line.domain.Line;
import nextstep.subway.line.domain.Section;

import javax.validation.constraints.Positive;

public class SectionRequest {
    @Positive(message = "상행역을 선택하세요")
    private Long upStationId;
    @Positive(message = "하행역을 선택하세요")
    private Long downStationId;
    @Positive(message = "구간거리를 입력하세요")
    private Integer distance;

    public SectionRequest() {
    }

    public SectionRequest(Long upStationId, Long downStationId, Integer distance) {
        this.upStationId = upStationId;
        this.downStationId = downStationId;
        this.distance = distance;
    }

    public Long getUpStationId() {
        return upStationId;
    }

    public Long getDownStationId() {
        return downStationId;
    }

    public Integer getDistance() {
        return distance;
    }

    public Section toSection(Line line) {
        return new Section(line, upStationId, downStationId, distance);
    }
}
