package com.custom.eaii.training.entity;

import com.custom.eaii.training.domain.entity.BaseEntity;
import com.custom.eaii.training.domain.valueobject.Address;
import com.custom.eaii.training.domain.valueobject.Contact;
import com.custom.eaii.training.exception.IntelInfoDomainException;
import com.custom.eaii.training.valueObjcet.InformantId;

import java.util.List;

public class InformantProfile extends BaseEntity<InformantId> {
   private String firstName;
   private String lastName;
   private List<Contact> ContactList;
   private List<Address> AddressList;


   private InformantProfile(Builder builder){
      firstName = builder.firstName;
      lastName = builder.lastName;
      ContactList = builder.ContactList;
      AddressList = builder.AddressList;

   }

   public void validateInformantProfile(){
      validateInitialInformantProfile();
   }

   private void validateInitialInformantProfile(){
      if (getId() != null){
         throw new IntelInfoDomainException(
                 "Informant profile is not in correct state for initialization"
         );
      }
   }


   public String getFirstName() {
      return firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public List<Contact> getContactList() {
      return ContactList;
   }

   public List<Address> getAddressList() {
      return AddressList;
   }

   public static Builder builder(){
      return new Builder();
   }

   public static final class Builder{

         private String firstName;
         private String lastName;
         private List<Contact> ContactList;
         private List<Address> AddressList;

         public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
         }

         public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
         }

         public Builder setContactList(List<Contact> contactList) {
            ContactList = contactList;
            return this;
         }

         public Builder setAddressList(List<Address> addressList) {
            AddressList = addressList;
            return this;
         }

         public InformantProfile build(){
            return new InformantProfile(this);
         }
   }
}

