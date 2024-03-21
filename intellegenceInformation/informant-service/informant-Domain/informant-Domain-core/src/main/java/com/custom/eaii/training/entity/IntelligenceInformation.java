package com.custom.eaii.training.entity;

import com.custom.eaii.training.domain.entity.AggregateRoot;
import com.custom.eaii.training.domain.valueobject.Address;
import com.custom.eaii.training.valueObjcet.InformedWay;
import com.custom.eaii.training.valueObjcet.IntelDescription;
import com.custom.eaii.training.valueObjcet.IntelId;
import com.custom.eaii.training.valueObjcet.IntelStatus;

import java.util.List;

public class IntelligenceInformation extends AggregateRoot<IntelId> {
  private String referenceNumber;
  private InformantProfile informantProfile;
  private InformedWay informedWay;

  private IntelStatus intelStatus;
  private IntelDescription intelDescription;
  private List<Address> AddressList;
}
