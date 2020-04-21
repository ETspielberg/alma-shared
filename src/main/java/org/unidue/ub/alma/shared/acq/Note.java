/*
 * Ex Libris APIs
 * For more information on how to use these APIs, including how to create an API key required for authentication, see [Alma REST APIs](https://developers.exlibrisgroup.com/alma/apis).
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.unidue.ub.alma.shared.acq;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.*;
import javax.xml.bind.annotation.*;

/**
 * Specific PO line related note.
 */
@ApiModel(description = "Specific PO line related note.")
@JsonPropertyOrder({
  Note.JSON_PROPERTY_NOTE_TEXT
})

@XmlRootElement(name = "note")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "note")
public class Note implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NOTE_TEXT = "note_text";
  @XmlElement(name = "note_text")
  private String noteText;


  public Note noteText(String noteText) {
    
    this.noteText = noteText;
    return this;
  }

   /**
   * The note&#39;s text.
   * @return noteText
  **/
  
  @ApiModelProperty(example = "Created by: John Smith", value = "The note's text.")
  @JsonProperty(JSON_PROPERTY_NOTE_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "note_text")

  public String getNoteText() {
    return noteText;
  }


  public void setNoteText(String noteText) {
    this.noteText = noteText;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Note note = (Note) o;
    return Objects.equals(this.noteText, note.noteText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(noteText);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Note2 {\n");
    sb.append("    noteText: ").append(toIndentedString(noteText)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

