/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author krupa
 */
public class Person {
    
private String name;
private String geographicData;
private Date dateOfBirth;
private String phone;
private String faxNumber;
private String email;
private String ssn;
private String medicalRecordNumber;
private String healthPlanBeneficiaryNumber;
private String bankAccountNumbers;
private String licenseNumber;
private int vehicleIdentifiers;
private int deviceIdentifiers;
private String linkedInId;
private String ipAddresses;


private  String bioMetricUrl;
private String fullFaceUrl;
//Any unique identifying number, characteristic, or code

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeographicData() {
        return geographicData;
    }

    public void setGeographicData(String geographicData) {
        this.geographicData = geographicData;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(String medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public String getHealthPlanBeneficiaryNumber() {
        return healthPlanBeneficiaryNumber;
    }

    public void setHealthPlanBeneficiaryNumber(String healthPlanBeneficiaryNumber) {
        this.healthPlanBeneficiaryNumber = healthPlanBeneficiaryNumber;
    }

    public String getBankAccountNumbers() {
        return bankAccountNumbers;
    }

    public void setBankAccountNumbers(String bankAccountNumbers) {
        this.bankAccountNumbers = bankAccountNumbers;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getVehicleIdentifiers() {
        return vehicleIdentifiers;
    }

    public void setVehicleIdentifiers(int vehicleIdentifiers) {
        this.vehicleIdentifiers = vehicleIdentifiers;
    }

    public int getDeviceIdentifiers() {
        return deviceIdentifiers;
    }

    public void setDeviceIdentifiers(int deviceIdentifiers) {
        this.deviceIdentifiers = deviceIdentifiers;
    }

    public String getLinkedInId() {
        return linkedInId;
    }

    public void setLinkedInId(String linkedInId) {
        this.linkedInId = linkedInId;
    }

    public String getIpAddresses() {
        return ipAddresses;
    }

    public void setIpAddresses(String ipAddresses) {
        this.ipAddresses = ipAddresses;
    }
   
    
    public String getBioMetricUrl() {
        return bioMetricUrl;
    }

    public void setBioMetricUrl(String bioMetricUrl) {
        this.bioMetricUrl = bioMetricUrl;
    }

    public String getFullFaceUrl() {
        return fullFaceUrl;
    }

    public void setFullFaceUrl(String fullFaceUrl) {
        this.fullFaceUrl = fullFaceUrl;
    }
}
