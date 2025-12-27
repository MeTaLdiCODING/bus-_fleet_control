package ru.control.busfleet.model;

import ru.control.busfleet.model.enumiration.Citizenship;

import java.math.BigDecimal;

public abstract class Staff {

    private  String FullName;

    private byte PhoneNumber;

    private String HireDate;//дат.приема

    private String DateOfBirth;

    private BigDecimal wages;//зп

    private Citizenship citizenship;


    public BigDecimal getWages() {
        return wages;
    }

    public void setWages(BigDecimal wages) {
        this.wages = wages;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public byte getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(byte phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getHireDate() {
        return HireDate;
    }

    public void setHireDate(String hireDate) {
        HireDate = hireDate;
    }

    public Citizenship getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(Citizenship citizenship) {
        this.citizenship = citizenship;
    }
}
