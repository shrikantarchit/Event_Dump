package com.dump.event.dto;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
 
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"SUPPLEMENTS",
"PAPER_ID",
"THEIRNUMBER",
"OPEN_ACCESS",
"SUBTITLE",
"OFFERING",
"CHOSEN_FORM_TYPE",
"ISSUE",
"STATUS",
"CORRES_AUTHOR",
"CORRES_AUTHOR_EMAIL",
"CC_LICENSE_ICON_URL",
"DOI",
"PAPER_TYPE",
"AUTHORRIGHTSCHOICE",
"COPYRIGHT_HOLDER",
"CC_LICENSE_URL",
"VOLUME",
"AUTHORS",
"STATUS_DATE",
"CC_LICENSE",
"DL_DATE",
"TITLE",
"PERMISSION_STATEMENT",
"TDSTAMP"
})
@Generated("jsonschema2pojo")
public class Request {

@JsonProperty("SUPPLEMENTS")
private List<Supplement> supplements =new ArrayList<Supplement>();
@JsonProperty("PAPER_ID")
private Integer paperId;
@JsonProperty("THEIRNUMBER")
private String theirnumber;
@JsonProperty("OPEN_ACCESS")
private String openAccess;
@JsonProperty("SUBTITLE")
private String subtitle;
@JsonProperty("OFFERING")
private Integer offering;
@JsonProperty("CHOSEN_FORM_TYPE")
private String chosenFormType;
@JsonProperty("ISSUE")
private String issue;
@JsonProperty("STATUS")
private String status;
@JsonProperty("CORRES_AUTHOR")
private String corresAuthor;
@JsonProperty("CORRES_AUTHOR_EMAIL")
private String corresAuthorEmail;
@JsonProperty("CC_LICENSE_ICON_URL")
private String ccLicenseIconUrl;
@JsonProperty("DOI")
private String doi;
@JsonProperty("PAPER_TYPE")
private String paperType;
@JsonProperty("AUTHORRIGHTSCHOICE")
private String authorrightschoice;
@JsonProperty("COPYRIGHT_HOLDER")
private String copyrightHolder;
@JsonProperty("CC_LICENSE_URL")
private String ccLicenseUrl;
@JsonProperty("VOLUME")
private Integer volume;
@JsonProperty("AUTHORS")
private List<Authors> authors=new ArrayList<Authors>();
@JsonProperty("STATUS_DATE")
private String statusDate;
@JsonProperty("CC_LICENSE")
private String ccLicense;
@JsonProperty("DL_DATE")
private String dlDate;
@JsonProperty("TITLE")
private String title;
@JsonProperty("PERMISSION_STATEMENT")
private String permissionStatement;
@JsonProperty("TDSTAMP")
private String tdstamp;

@JsonProperty("SUPPLEMENTS")
public List<Supplement> getSupplements() {
return supplements;
}

@JsonProperty("SUPPLEMENTS")
public void setSupplements(List<Supplement> supplements) {
this.supplements = supplements;
}

@JsonProperty("PAPER_ID")
public Integer getPaperId() {
return paperId;
}

@JsonProperty("PAPER_ID")
public void setPaperId(Integer paperId) {
this.paperId = paperId;
}

@JsonProperty("THEIRNUMBER")
public String getTheirnumber() {
return theirnumber;
}

@JsonProperty("THEIRNUMBER")
public void setTheirnumber(String theirnumber) {
this.theirnumber = theirnumber;
}

@JsonProperty("OPEN_ACCESS")
public String getOpenAccess() {
return openAccess;
}

@JsonProperty("OPEN_ACCESS")
public void setOpenAccess(String openAccess) {
this.openAccess = openAccess;
}

@JsonProperty("SUBTITLE")
public String getSubtitle() {
return subtitle;
}

@JsonProperty("SUBTITLE")
public void setSubtitle(String subtitle) {
this.subtitle = subtitle;
}

@JsonProperty("OFFERING")
public Integer getOffering() {
return offering;
}

@JsonProperty("OFFERING")
public void setOffering(Integer offering) {
this.offering = offering;
}

@JsonProperty("CHOSEN_FORM_TYPE")
public String getChosenFormType() {
return chosenFormType;
}

@JsonProperty("CHOSEN_FORM_TYPE")
public void setChosenFormType(String chosenFormType) {
this.chosenFormType = chosenFormType;
}

@JsonProperty("ISSUE")
public String getIssue() {
return issue;
}

@JsonProperty("ISSUE")
public void setIssue(String issue) {
this.issue = issue;
}

@JsonProperty("STATUS")
public String getStatus() {
return status;
}

@JsonProperty("STATUS")
public void setStatus(String status) {
this.status = status;
}

@JsonProperty("CORRES_AUTHOR")
public String getCorresAuthor() {
return corresAuthor;
}

@JsonProperty("CORRES_AUTHOR")
public void setCorresAuthor(String corresAuthor) {
this.corresAuthor = corresAuthor;
}

@JsonProperty("CORRES_AUTHOR_EMAIL")
public String getCorresAuthorEmail() {
return corresAuthorEmail;
}

@JsonProperty("CORRES_AUTHOR_EMAIL")
public void setCorresAuthorEmail(String corresAuthorEmail) {
this.corresAuthorEmail = corresAuthorEmail;
}

@JsonProperty("CC_LICENSE_ICON_URL")
public String getCcLicenseIconUrl() {
return ccLicenseIconUrl;
}

@JsonProperty("CC_LICENSE_ICON_URL")
public void setCcLicenseIconUrl(String ccLicenseIconUrl) {
this.ccLicenseIconUrl = ccLicenseIconUrl;
}

@JsonProperty("DOI")
public String getDoi() {
return doi;
}

@JsonProperty("DOI")
public void setDoi(String doi) {
this.doi = doi;
}

@JsonProperty("PAPER_TYPE")
public String getPaperType() {
return paperType;
}

@JsonProperty("PAPER_TYPE")
public void setPaperType(String paperType) {
this.paperType = paperType;
}

@JsonProperty("AUTHORRIGHTSCHOICE")
public String getAuthorrightschoice() {
return authorrightschoice;
}

@JsonProperty("AUTHORRIGHTSCHOICE")
public void setAuthorrightschoice(String authorrightschoice) {
this.authorrightschoice = authorrightschoice;
}

@JsonProperty("COPYRIGHT_HOLDER")
public String getCopyrightHolder() {
return copyrightHolder;
}

@JsonProperty("COPYRIGHT_HOLDER")
public void setCopyrightHolder(String copyrightHolder) {
this.copyrightHolder = copyrightHolder;
}

@JsonProperty("CC_LICENSE_URL")
public String getCcLicenseUrl() {
return ccLicenseUrl;
}

@JsonProperty("CC_LICENSE_URL")
public void setCcLicenseUrl(String ccLicenseUrl) {
this.ccLicenseUrl = ccLicenseUrl;
}

@JsonProperty("VOLUME")
public Integer getVolume() {
return volume;
}

@JsonProperty("VOLUME")
public void setVolume(Integer volume) {
this.volume = volume;
}

@JsonProperty("AUTHORS")
public List<Authors> getAuthors() {
return authors;
}

@JsonProperty("AUTHORS")
public void setAuthors(List<Authors> authors) {
this.authors = authors;
}

@JsonProperty("STATUS_DATE")
public String getStatusDate() {
return statusDate;
}

@JsonProperty("STATUS_DATE")
public void setStatusDate(String statusDate) {
this.statusDate = statusDate;
}

@JsonProperty("CC_LICENSE")
public String getCcLicense() {
return ccLicense;
}

@JsonProperty("CC_LICENSE")
public void setCcLicense(String ccLicense) {
this.ccLicense = ccLicense;
}

@JsonProperty("DL_DATE")
public String getDlDate() {
return dlDate;
}

@JsonProperty("DL_DATE")
public void setDlDate(String dlDate) {
this.dlDate = dlDate;
}

@JsonProperty("TITLE")
public String getTitle() {
return title;
}

@JsonProperty("TITLE")
public void setTitle(String title) {
this.title = title;
}

@JsonProperty("PERMISSION_STATEMENT")
public String getPermissionStatement() {
return permissionStatement;
}

@JsonProperty("PERMISSION_STATEMENT")
public void setPermissionStatement(String permissionStatement) {
this.permissionStatement = permissionStatement;
}

@JsonProperty("TDSTAMP")
public String getTdstamp() {
return tdstamp;
}

@JsonProperty("TDSTAMP")
public void setTdstamp(String tdstamp) {
this.tdstamp = tdstamp;
}

@Override
public String toString() {
	return "Request [supplements=" + supplements + ", paperId=" + paperId + ", theirnumber=" + theirnumber
			+ ", openAccess=" + openAccess + ", subtitle=" + subtitle + ", offering=" + offering + ", chosenFormType="
			+ chosenFormType + ", issue=" + issue + ", status=" + status + ", corresAuthor=" + corresAuthor
			+ ", corresAuthorEmail=" + corresAuthorEmail + ", ccLicenseIconUrl=" + ccLicenseIconUrl + ", doi=" + doi
			+ ", paperType=" + paperType + ", authorrightschoice=" + authorrightschoice + ", copyrightHolder="
			+ copyrightHolder + ", ccLicenseUrl=" + ccLicenseUrl + ", volume=" + volume + ", authors=" + authors
			+ ", statusDate=" + statusDate + ", ccLicense=" + ccLicense + ", dlDate=" + dlDate + ", title=" + title
			+ ", permissionStatement=" + permissionStatement + ", tdstamp=" + tdstamp + "]";
}

}