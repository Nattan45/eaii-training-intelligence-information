package com.custom.eaii.training.valueObjcet;

import com.custom.eaii.training.domain.entity.BaseEntity;
import com.custom.eaii.training.domain.valueobject.BaseId;

import java.util.UUID;

public class InformantId extends BaseId<UUID> {
    public InformantId(UUID id) {
        super(id);
    }
}
