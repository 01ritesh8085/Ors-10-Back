package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_FEEDBACK")
public class FeedbackDTO extends BaseDTO {

    @Column(name = "FEEDBACK_FORM_ID")
    private Long feedbackFormId;

    @Column(name = "PARTICIPANT_NAME", length = 50)
    private String participantName;

    @Column(name = "RATING")
    private Integer rating;

    @Column(name = "COMMENTS", length = 255)
    private String comments;

    // Getter Setter

    public Long getFeedbackFormId() {
        return feedbackFormId;
    }

    public void setFeedbackFormId(Long feedbackFormId) {
        this.feedbackFormId = feedbackFormId;
    }

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    // BaseDTO methods

    @Override
    public String getValue() {
        return participantName;
    }

    @Override
    public String getUniqueKey() {
        return "feedbackFormId";
    }

    @Override
    public String getUniqueValue() {
        return String.valueOf(feedbackFormId);
    }

    @Override
    public String getLabel() {
        return "Feedback";
    }

    @Override
    public LinkedHashMap<String, String> orderBY() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("feedbackFormId", "asc");
        return map;
    }

    @Override
    public LinkedHashMap<String, Object> uniqueKeys() {
        LinkedHashMap<String, Object> map = new LinkedHashMap<>();
        map.put("feedbackFormId", feedbackFormId);
        return map;
    }
}