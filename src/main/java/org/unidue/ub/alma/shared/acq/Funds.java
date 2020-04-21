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
 * A list of funds.
 */
@ApiModel(description = "A list of funds.")
@JsonPropertyOrder({
  Funds.JSON_PROPERTY_TOTAL_RECORD_COUNT,
  Funds.JSON_PROPERTY_FUND
})

@XmlRootElement(name = "funds")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "funds")
public class Funds implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TOTAL_RECORD_COUNT = "total_record_count";
  @XmlAttribute(name = "total_record_count")
  private Integer totalRecordCount;

  public static final String JSON_PROPERTY_FUND = "fund";
  // Is a container wrapped=false
  // items.name=fund items.baseName=fund items.xmlName= items.xmlNamespace=
  // items.example= items.type=Object
  @XmlElement(name = "fund")
  private List<Object> fund = null;


  public Funds totalRecordCount(Integer totalRecordCount) {
    
    this.totalRecordCount = totalRecordCount;
    return this;
  }

   /**
   * The total number of funds. This can be used when retrieving a long list of funds using pagination.
   * @return totalRecordCount
  **/

  @ApiModelProperty(value = "The total number of funds. This can be used when retrieving a long list of funds using pagination.")
  @JsonProperty(JSON_PROPERTY_TOTAL_RECORD_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(isAttribute = true, localName = "total_record_count")

  public Integer getTotalRecordCount() {
    return totalRecordCount;
  }


  public void setTotalRecordCount(Integer totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
  }


  public Funds fund(List<Object> fund) {
    
    this.fund = fund;
    return this;
  }

  public Funds addFundItem(Object fundItem) {
    if (this.fund == null) {
      this.fund = new ArrayList<Object>();
    }
    this.fund.add(fundItem);
    return this;
  }

   /**
   * Fund object.
   * @return fund
  **/

  @ApiModelProperty(value = "Fund object.")
  @JsonProperty(JSON_PROPERTY_FUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getFund() {
    return fund;
  }


  public void setFund(List<Object> fund) {
    this.fund = fund;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Funds funds = (Funds) o;
    return Objects.equals(this.totalRecordCount, funds.totalRecordCount) &&
        Objects.equals(this.fund, funds.fund);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalRecordCount, fund);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Funds {\n");
    sb.append("    totalRecordCount: ").append(toIndentedString(totalRecordCount)).append("\n");
    sb.append("    fund: ").append(toIndentedString(fund)).append("\n");
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
