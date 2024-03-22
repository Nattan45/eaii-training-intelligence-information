package com.custom.eaii.training.event;


import com.custom.eaii.training.entity.InformantProfile;

import java.time.ZonedDateTime;

public class InformantProfileCreatedEvent extends InformantProfileEvent<InformantProfile>{

    public InformantProfileCreatedEvent(InformantProfile informantProfile, ZonedDateTime now){
        super(informantProfile);
    }
}











