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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.*;
import javax.xml.bind.annotation.*;

/**
 * A list of invoices.
 */
@ApiModel(description = "A list of invoices.")
@JsonPropertyOrder({
  Invoices.JSON_PROPERTY_TOTAL_RECORD_COUNT,
  Invoices.JSON_PROPERTY_INVOICE
})

@XmlRootElement(name = "invoices")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "invoices")
public class Invoices implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TOTAL_RECORD_COUNT = "total_record_count";
  @XmlAttribute(name = "total_record_count")
  private Integer totalRecordCount;

  public static final String JSON_PROPERTY_INVOICE = "invoice";
  // Is a container wrapped=false
  // items.name=invoice items.baseName=invoice items.xmlName= items.xmlNamespace=
  // items.example= items.type=Object
  @XmlElement(name = "invoice")
  private List<Invoice> invoice = null;


  public Invoices totalRecordCount(Integer totalRecordCount) {
    
    this.totalRecordCount = totalRecordCount;
    return this;
  }

   /**
   * The total number of invoices. This can be used when retrieving the invoices list using pagination.
   * @return totalRecordCount
  **/
  
  @ApiModelProperty(value = "The total number of invoices. This can be used when retrieving the invoices list using pagination.")
  @JsonProperty(JSON_PROPERTY_TOTAL_RECORD_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(isAttribute = true, localName = "total_record_count")

  public Integer getTotalRecordCount() {
    return totalRecordCount;
  }


  public void setTotalRecordCount(Integer totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
  }


  public Invoices invoice(List<Invoice> invoice) {
    
    this.invoice = invoice;
    return this;
  }

  public Invoices addInvoiceItem(Invoice invoiceItem) {
    if (this.invoice == null) {
      this.invoice = new ArrayList<>();
    }
    this.invoice.add(invoiceItem);
    return this;
  }

   /**
   * invoice object.
   * @return invoice
  **/
  
  @ApiModelProperty(value = "invoice object.")
  @JsonProperty(JSON_PROPERTY_INVOICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Invoice> getInvoice() {
    return invoice;
  }


  public void setInvoice(List<Invoice> invoice) {
    this.invoice = invoice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoices invoices = (Invoices) o;
    return Objects.equals(this.totalRecordCount, invoices.totalRecordCount) &&
        Objects.equals(this.invoice, invoices.invoice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalRecordCount, invoice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoices {\n");
    sb.append("    totalRecordCount: ").append(toIndentedString(totalRecordCount)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
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

