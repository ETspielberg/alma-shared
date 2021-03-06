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
 * The item&#39;s temporary override policy. Possible codes are listed in &#39;ItemPolicy&#39; [code table](https://developers.exlibrisgroup.com/blog/Working-with-the-code-tables-API). Relevant only if in_temp_location is True.
 */
@ApiModel(description = "The item's temporary override policy. Possible codes are listed in 'ItemPolicy' [code table](https://developers.exlibrisgroup.com/blog/Working-with-the-code-tables-API). Relevant only if in_temp_location is True.")
@JsonPropertyOrder({
  HoldingDataTempPolicy.JSON_PROPERTY_DESC,
  HoldingDataTempPolicy.JSON_PROPERTY_VALUE
})

@XmlRootElement(name = "HoldingData2TempPolicy")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "HoldingData2TempPolicy")
public class HoldingDataTempPolicy implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DESC = "desc";
  @XmlAttribute(name = "desc")
  private String desc;

  public static final String JSON_PROPERTY_VALUE = "value";
  @XmlElement(name = "xml_value")
  private String value;


  public HoldingDataTempPolicy desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * Get desc
   * @return desc
  **/

  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(isAttribute = true, localName = "desc")

  public String getDesc() {
    return desc;
  }


  public void setDesc(String desc) {
    this.desc = desc;
  }


  public HoldingDataTempPolicy value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/

  @ApiModelProperty(example = "09", value = "")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "xml_value")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HoldingDataTempPolicy holdingDataTempPolicy = (HoldingDataTempPolicy) o;
    return Objects.equals(this.desc, holdingDataTempPolicy.desc) &&
        Objects.equals(this.value, holdingDataTempPolicy.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(desc, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HoldingData2TempPolicy {\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

