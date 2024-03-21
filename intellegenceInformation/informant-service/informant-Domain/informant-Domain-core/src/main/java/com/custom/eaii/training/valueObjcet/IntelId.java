package com.custom.eaii.training.valueObjcet;

import com.custom.eaii.training.domain.valueobject.BaseId;

import java.util.UUID;

public class IntelId extends BaseId<UUID> {
    public IntelId(UUID value) {
        super(value);
    }
}
