package com.custom.eaii.training;

import com.custom.eaii.training.entity.InformantProfile;
import com.custom.eaii.training.entity.IntelligenceInformation;
import com.custom.eaii.training.event.InformantProfileCreatedEvent;
import com.custom.eaii.training.event.IntelInfoCreatedEvent;

public interface IntelInformationDomainService {
    InformantProfileCreatedEvent validateAndInitiateInformantProfile(InformantProfile informantProfile);
    IntelInfoCreatedEvent validateAndInitiateIntelligenceInformation(IntelligenceInformation intelligenceInformation);
}
