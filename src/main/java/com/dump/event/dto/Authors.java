package com.dump.event.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"SUFFIX",
"COUNTRY",
"EMAIL_ADDRESS",
"ORCID",
"AFFILIATION",
"MIDDLE_NAME",
"LAST_NAME",
"FIRST_NAME",
"ACMPROFILEID"
})
@Generated("jsonschema2pojo")
public class Authors {

@JsonProperty("SUFFIX")
private String suffix;
@JsonProperty("COUNTRY")
private String country;
@JsonProperty("EMAIL_ADDRESS")
private String emailAddress;
@JsonProperty("ORCID")
private String orcid;
@JsonProperty("AFFILIATION")
private String affiliation;
@JsonProperty("MIDDLE_NAME")
private String middleName;
@JsonProperty("LAST_NAME")
private String lastName;
@JsonProperty("FIRST_NAME")
private String firstName;
@JsonProperty("ACMPROFILEID")
private String acmprofileid;

@JsonProperty("SUFFIX")
public String getSuffix() {
return suffix;
}

@JsonProperty("SUFFIX")
public void setSuffix(String suffix) {
this.suffix = suffix;
}

@JsonProperty("COUNTRY")
public String getCountry() {
return country;
}

@JsonProperty("COUNTRY")
public void setCountry(String country) {
this.country = country;
}

@JsonProperty("EMAIL_ADDRESS")
public String getEmailAddress() {
return emailAddress;
}

@JsonProperty("EMAIL_ADDRESS")
public void setEmailAddress(String emailAddress) {
this.emailAddress = emailAddress;
}

@JsonProperty("ORCID")
public String getOrcid() {
return orcid;
}

@JsonProperty("ORCID")
public void setOrcid(String orcid) {
this.orcid = orcid;
}

@JsonProperty("AFFILIATION")
public String getAffiliation() {
return affiliation;
}

@JsonProperty("AFFILIATION")
public void setAffiliation(String affiliation) {
this.affiliation = affiliation;
}

@JsonProperty("MIDDLE_NAME")
public String getMiddleName() {
return middleName;
}

@JsonProperty("MIDDLE_NAME")
public void setMiddleName(String middleName) {
this.middleName = middleName;
}

@JsonProperty("LAST_NAME")
public String getLastName() {
return lastName;
}

@JsonProperty("LAST_NAME")
public void setLastName(String lastName) {
this.lastName = lastName;
}

@JsonProperty("FIRST_NAME")
public String getFirstName() {
return firstName;
}

@JsonProperty("FIRST_NAME")
public void setFirstName(String firstName) {
this.firstName = firstName;
}

@JsonProperty("ACMPROFILEID")
public String getAcmprofileid() {
return acmprofileid;
}

@JsonProperty("ACMPROFILEID")
public void setAcmprofileid(String acmprofileid) {
this.acmprofileid = acmprofileid;
}

@Override
public String toString() {
	return "Authors [suffix=" + suffix + ", country=" + country + ", emailAddress=" + emailAddress + ", orcid=" + orcid
			+ ", affiliation=" + affiliation + ", middleName=" + middleName + ", lastName=" + lastName + ", firstName="
			+ firstName + ", acmprofileid=" + acmprofileid + "]";
}

}