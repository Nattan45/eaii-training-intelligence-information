package com.custom.eaii.training.event;

import com.custom.eaii.training.domain.event.DomainEvent;
import com.custom.eaii.training.entity.IntelligenceInformation;

import java.time.ZonedDateTime;

public class IntelInfoEvent<p>implements DomainEvent<IntelligenceInformation>{
    private final IntelligenceInformation intelligenceInformation;
    private final ZonedDateTime createdAt;

    public IntelInfoEvent(IntelligenceInformation intelligenceInformation, ZonedDateTime createdAt){
        this.intelligenceInformation = intelligenceInformation;
        this.createdAt = createdAt;
    }

    public IntelligenceInformation getIntelligenceInformation() {
        return intelligenceInformation;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }
}
