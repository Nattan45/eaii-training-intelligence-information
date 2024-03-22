package com.custom.eaii.training.event;

import com.custom.eaii.training.domain.event.DomainEvent;
import com.custom.eaii.training.entity.InformantProfile;




public class InformantProfileEvent<p>implements DomainEvent<InformantProfile>{
    private final InformantProfile informantProfile;

    public InformantProfileEvent(InformantProfile informantProfile){
        this.informantProfile= informantProfile;
    }

    public InformantProfile getInformantProfile() {
        return informantProfile;
    }
}
