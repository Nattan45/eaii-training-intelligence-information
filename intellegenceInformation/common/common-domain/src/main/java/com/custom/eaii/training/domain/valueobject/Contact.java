package com.custom.eaii.training.domain.valueobject;

import java.util.Objects;
import java.util.UUID;

public class Contact {
    private final UUID id;


    private final String StreetAddress;
    private final String  PhoneNumber;

    private final Boolean isActive;

    public Contact(UUID id,  String streetAddress, String phoneNumber, Boolean isActive) {
        this.id = id;

        this.StreetAddress = streetAddress;
        this.PhoneNumber = phoneNumber;
        this.isActive = isActive;
    }

    public UUID getId() {
        return id;
    }


    public String getStreetAddress() {
        return StreetAddress;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public Boolean getActive() {
        return isActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact contact)) return false;
        return Objects.equals(id, contact.id) && Objects.equals(StreetAddress, contact.StreetAddress) && Objects.equals(PhoneNumber, contact.PhoneNumber) && Objects.equals(isActive, contact.isActive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, StreetAddress, PhoneNumber, isActive);
    }
}
