package com.custom.eaii.training.event;

import com.custom.eaii.training.entity.IntelligenceInformation;

import java.time.ZonedDateTime;

public class IntelInfoCreatedEvent extends IntelInfoEvent<IntelligenceInformation>{

    public IntelInfoCreatedEvent(IntelligenceInformation intelligenceInformation, ZonedDateTime createdAt) {
        super(intelligenceInformation, createdAt);
    }
}
