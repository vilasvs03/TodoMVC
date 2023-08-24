package com.assignment.model.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Builder
public class Control
{
    private String timeTaken;
    private Integer responseCode;
    private String responseMessage;
}