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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.*;
import javax.xml.bind.annotation.*;

/**
 * A list of po_lines.
 */
@ApiModel(description = "A list of po_lines.")
@JsonPropertyOrder({
  PoLines.JSON_PROPERTY_TOTAL_RECORD_COUNT,
  PoLines.JSON_PROPERTY_PO_LINE
})

@XmlRootElement(name = "po_lines")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "po_lines")
public class PoLines implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TOTAL_RECORD_COUNT = "total_record_count";
  @XmlAttribute(name = "total_record_count")
  private Integer totalRecordCount;

  public static final String JSON_PROPERTY_PO_LINE = "po_line";
  // Is a container wrapped=false
  // items.name=poLine items.baseName=poLine items.xmlName= items.xmlNamespace=
  // items.example= items.type=Object
  @XmlElement(name = "poLine")
  private List<PoLine> poLine = null;


  public PoLines totalRecordCount(Integer totalRecordCount) {
    
    this.totalRecordCount = totalRecordCount;
    return this;
  }

   /**
   * The total number of po_lines. This can be used when retrieving the po_lines list using pagination.
   * @return totalRecordCount
  **/

  @ApiModelProperty(value = "The total number of po_lines. This can be used when retrieving the po_lines list using pagination.")
  @JsonProperty(JSON_PROPERTY_TOTAL_RECORD_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(isAttribute = true, localName = "total_record_count")

  public Integer getTotalRecordCount() {
    return totalRecordCount;
  }


  public void setTotalRecordCount(Integer totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
  }


  public PoLines poLine(List<PoLine> poLine) {
    
    this.poLine = poLine;
    return this;
  }

  public PoLines addPoLineItem(PoLine poLineItem) {
    if (this.poLine == null) {
      this.poLine = new ArrayList<PoLine>();
    }
    this.poLine.add(poLineItem);
    return this;
  }

   /**
   * po_line object.
   * @return poLine
  **/

  @ApiModelProperty(value = "po_line object.")
  @JsonProperty(JSON_PROPERTY_PO_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PoLine> getPoLine() {
    return poLine;
  }


  public void setPoLine(List<PoLine> poLine) {
    this.poLine = poLine;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoLines poLines = (PoLines) o;
    return Objects.equals(this.totalRecordCount, poLines.totalRecordCount) &&
        Objects.equals(this.poLine, poLines.poLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalRecordCount, poLine);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoLines {\n");
    sb.append("    totalRecordCount: ").append(toIndentedString(totalRecordCount)).append("\n");
    sb.append("    poLine: ").append(toIndentedString(poLine)).append("\n");
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

