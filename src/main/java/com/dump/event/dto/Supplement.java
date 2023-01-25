package com.dump.event.dto;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"LABEL",
"CAPTION",
"URL",
"NAME"
})
@Generated("jsonschema2pojo")
public class Supplement {

@JsonProperty("LABEL")
private String label;
@JsonProperty("CAPTION")
private String caption;
@JsonProperty("URL")
private String url;
@JsonProperty("NAME")
private String name;

@JsonProperty("LABEL")
public String getLabel() {
return label;
}

@JsonProperty("LABEL")
public void setLabel(String label) {
this.label = label;
}

@JsonProperty("CAPTION")
public String getCaption() {
return caption;
}

@JsonProperty("CAPTION")
public void setCaption(String caption) {
this.caption = caption;
}

@JsonProperty("URL")
public String getUrl() {
return url;
}

@JsonProperty("URL")
public void setUrl(String url) {
this.url = url;
}

@JsonProperty("NAME")
public String getName() {
return name;
}

@JsonProperty("NAME")
public void setName(String name) {
this.name = name;
}

@Override
public String toString() {
	return "Supplement [label=" + label + ", caption=" + caption + ", url=" + url + ", name=" + name + "]";
}

}