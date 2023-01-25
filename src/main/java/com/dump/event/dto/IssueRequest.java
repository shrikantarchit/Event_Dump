package com.dump.event.dto;

 
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"CREATE_AUTHOR_LOGIN",
"STRIP_ACRONYM",
"EISSN",
"VOLUME",
"ISSN",
"JOURNAL_NAME",
"EDITOR_VENDOR",
"SUBMISSION_SYSTEM",
"REFERENCE_FORMAT",
"OFFERING",
"ACRONYM",
"ISSUE",
"EMAIL_ADDRESS",
"DL_DATE",
"EPUB",
"TEMPLATE",
"ISSUE_MONTH"
})
@Generated("jsonschema2pojo")
public class IssueRequest {

@JsonProperty("CREATE_AUTHOR_LOGIN")
private Boolean createAuthorLogin;
@JsonProperty("STRIP_ACRONYM")
private String stripAcronym;
@JsonProperty("EISSN")
private String eissn;
@JsonProperty("VOLUME")
private Integer volume;
@JsonProperty("ISSN")
private String issn;
@JsonProperty("JOURNAL_NAME")
private String journalName;
@JsonProperty("EDITOR_VENDOR")
private String editorVendor;
@JsonProperty("SUBMISSION_SYSTEM")
private String submissionSystem;
@JsonProperty("REFERENCE_FORMAT")
private String referenceFormat;
@JsonProperty("OFFERING")
private Integer offering;
@JsonProperty("ACRONYM")
private String acronym;
@JsonProperty("ISSUE")
private Integer issue;
@JsonProperty("EMAIL_ADDRESS")
private String emailAddress;
@JsonProperty("DL_DATE")
private String dlDate;
@JsonProperty("EPUB")
private Boolean epub;
@JsonProperty("TEMPLATE")
private String template;
@JsonProperty("ISSUE_MONTH")
private String issueMonth;

@JsonProperty("CREATE_AUTHOR_LOGIN")
public Boolean getCreateAuthorLogin() {
return createAuthorLogin;
}

@JsonProperty("CREATE_AUTHOR_LOGIN")
public void setCreateAuthorLogin(Boolean createAuthorLogin) {
this.createAuthorLogin = createAuthorLogin;
}

@JsonProperty("STRIP_ACRONYM")
public String getStripAcronym() {
return stripAcronym;
}

@JsonProperty("STRIP_ACRONYM")
public void setStripAcronym(String stripAcronym) {
this.stripAcronym = stripAcronym;
}

@JsonProperty("EISSN")
public String getEissn() {
return eissn;
}

@JsonProperty("EISSN")
public void setEissn(String eissn) {
this.eissn = eissn;
}

@JsonProperty("VOLUME")
public Integer getVolume() {
return volume;
}

@JsonProperty("VOLUME")
public void setVolume(Integer volume) {
this.volume = volume;
}

@JsonProperty("ISSN")
public String getIssn() {
return issn;
}

@JsonProperty("ISSN")
public void setIssn(String issn) {
this.issn = issn;
}

@JsonProperty("JOURNAL_NAME")
public String getJournalName() {
return journalName;
}

@JsonProperty("JOURNAL_NAME")
public void setJournalName(String journalName) {
this.journalName = journalName;
}

@JsonProperty("EDITOR_VENDOR")
public String getEditorVendor() {
return editorVendor;
}

@JsonProperty("EDITOR_VENDOR")
public void setEditorVendor(String editorVendor) {
this.editorVendor = editorVendor;
}

@JsonProperty("SUBMISSION_SYSTEM")
public String getSubmissionSystem() {
return submissionSystem;
}

@JsonProperty("SUBMISSION_SYSTEM")
public void setSubmissionSystem(String submissionSystem) {
this.submissionSystem = submissionSystem;
}

@JsonProperty("REFERENCE_FORMAT")
public String getReferenceFormat() {
return referenceFormat;
}

@JsonProperty("REFERENCE_FORMAT")
public void setReferenceFormat(String referenceFormat) {
this.referenceFormat = referenceFormat;
}

@JsonProperty("OFFERING")
public Integer getOffering() {
return offering;
}

@JsonProperty("OFFERING")
public void setOffering(Integer offering) {
this.offering = offering;
}

@JsonProperty("ACRONYM")
public String getAcronym() {
return acronym;
}

@JsonProperty("ACRONYM")
public void setAcronym(String acronym) {
this.acronym = acronym;
}

@JsonProperty("ISSUE")
public Integer getIssue() {
return issue;
}

@JsonProperty("ISSUE")
public void setIssue(Integer issue) {
this.issue = issue;
}

@JsonProperty("EMAIL_ADDRESS")
public String getEmailAddress() {
return emailAddress;
}

@JsonProperty("EMAIL_ADDRESS")
public void setEmailAddress(String emailAddress) {
this.emailAddress = emailAddress;
}

@JsonProperty("DL_DATE")
public String getDlDate() {
return dlDate;
}

@JsonProperty("DL_DATE")
public void setDlDate(String dlDate) {
this.dlDate = dlDate;
}

@JsonProperty("EPUB")
public Boolean getEpub() {
return epub;
}

@JsonProperty("EPUB")
public void setEpub(Boolean epub) {
this.epub = epub;
}

@JsonProperty("TEMPLATE")
public String getTemplate() {
return template;
}

@JsonProperty("TEMPLATE")
public void setTemplate(String template) {
this.template = template;
}

@JsonProperty("ISSUE_MONTH")
public String getIssueMonth() {
return issueMonth;
}

@JsonProperty("ISSUE_MONTH")
public void setIssueMonth(String issueMonth) {
this.issueMonth = issueMonth;
}

@Override
public String toString() {
	return "IssueRequest [createAuthorLogin=" + createAuthorLogin + ", stripAcronym=" + stripAcronym + ", eissn="
			+ eissn + ", volume=" + volume + ", issn=" + issn + ", journalName=" + journalName + ", editorVendor="
			+ editorVendor + ", submissionSystem=" + submissionSystem + ", referenceFormat=" + referenceFormat
			+ ", offering=" + offering + ", acronym=" + acronym + ", issue=" + issue + ", emailAddress=" + emailAddress
			+ ", dlDate=" + dlDate + ", epub=" + epub + ", template=" + template + ", issueMonth=" + issueMonth + "]";
}

}