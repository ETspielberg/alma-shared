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
 * The main Reporting Codes. Possible values are listed in &#39;HFundsTransactionItem.reportingCode&#39; [code table](https://developers.exlibrisgroup.com/blog/Working-with-the-code-tables-API).
 */
@ApiModel(description = "The main Reporting Codes. Possible values are listed in 'HFundsTransactionItem.reportingCode' [code table](https://developers.exlibrisgroup.com/blog/Working-with-the-code-tables-API).")
@JsonPropertyOrder({
  InvoiceLineReportingCode.JSON_PROPERTY_DESC,
  InvoiceLineReportingCode.JSON_PROPERTY_VALUE
})

@XmlRootElement(name = "InvoiceLine2ReportingCode")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "InvoiceLine2ReportingCode")
public class InvoiceLineReportingCode implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DESC = "desc";
  @XmlAttribute(name = "desc")
  private String desc;

  public static final String JSON_PROPERTY_VALUE = "value";
  @XmlElement(name = "xml_value")
  private String value;


  public InvoiceLineReportingCode desc(String desc) {
    
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


  public InvoiceLineReportingCode value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  
  @ApiModelProperty(example = "b", value = "")
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
    InvoiceLineReportingCode invoiceLineReportingCode = (InvoiceLineReportingCode) o;
    return Objects.equals(this.desc, invoiceLineReportingCode.desc) &&
        Objects.equals(this.value, invoiceLineReportingCode.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(desc, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceLine2ReportingCode {\n");
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

