package com.custom.eaii.training;
import com.custom.eaii.training.entity.InformantProfile;
import com.custom.eaii.training.entity.IntelligenceInformation;
import com.custom.eaii.training.event.InformantProfileCreatedEvent;
import com.custom.eaii.training.event.IntelInfoCreatedEvent;
import lombok.extern.slf4j.Slf4j;

import java.time.ZoneId;
import java.time.ZonedDateTime;



public class IntelInfoDomainServiceImpl implements IntelInformationDomainService{
    public static final String UTC = "UTC";


    @Override
    public InformantProfileCreatedEvent validateAndInitiateInformantProfile(InformantProfile informantProfile) {
        informantProfile.validateInitialInformantProfile();
        informantProfile.initializeInformantProfile();



//        log.info("Informant Profile with id: {} is initialized" , informantProfile.getId().getValue());
        return new InformantProfileCreatedEvent(
                informantProfile,
                ZonedDateTime.now(ZoneId.of(UTC)));
    }


    public IntelInfoCreatedEvent validateAndInitiateIntelligenceInformation(IntelligenceInformation intelligenceInformation) {
       intelligenceInformation.validateIntelligenceInformation();
       intelligenceInformation.initializeIntelligenceInformation();

//        log.info("Informant Profile with id: {} is initialized" , intelligenceInformation.getId().getValue());
        return new IntelInfoCreatedEvent(intelligenceInformation,   ZonedDateTime.now(ZoneId.of(UTC)));
    }





}
