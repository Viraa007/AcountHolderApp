/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ilkomunila.oop;

import java.util.ArrayList;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author didik
 */
public class CorporateHolder extends AccountHolder{
    StringProperty contact;

    public CorporateHolder(Integer holderID, String name, String address, String contact, ArrayList<Account> accounts) {
        super(holderID, name, address, accounts);
        this.contact=new SimpleStringProperty(contact);
    }

    public CorporateHolder(Integer holderID, String name, String address, String contact, Account account) {
        super(holderID, name, address, account);
        this.contact.set(contact);
    }

    public String getContact() {
        return contact.get();
    }

    public void setContact(String contact) {
        this.contact.set(contact);
    }
    public StringProperty contactProperty() {
        return contact;
    }
}
