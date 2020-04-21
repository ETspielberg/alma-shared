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
 * A list of purchase_requests.
 */
@ApiModel(description = "A list of purchase_requests.")
@JsonPropertyOrder({
  PurchaseRequests.JSON_PROPERTY_TOTAL_RECORD_COUNT,
  PurchaseRequests.JSON_PROPERTY_PURCHASE_REQUEST
})

@XmlRootElement(name = "purchase_requests")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "purchase_requests")
public class PurchaseRequests implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TOTAL_RECORD_COUNT = "total_record_count";
  @XmlAttribute(name = "total_record_count")
  private Integer totalRecordCount;

  public static final String JSON_PROPERTY_PURCHASE_REQUEST = "purchase_request";
  // Is a container wrapped=false
  // items.name=purchaseRequest items.baseName=purchaseRequest items.xmlName= items.xmlNamespace=
  // items.example= items.type=Object
  @XmlElement(name = "purchaseRequest")
  private List<Object> purchaseRequest = null;


  public PurchaseRequests totalRecordCount(Integer totalRecordCount) {
    
    this.totalRecordCount = totalRecordCount;
    return this;
  }

   /**
   * The total number of purchase_requests. This can be used when retrieving the list using pagination.
   * @return totalRecordCount
  **/

  @ApiModelProperty(value = "The total number of purchase_requests. This can be used when retrieving the list using pagination.")
  @JsonProperty(JSON_PROPERTY_TOTAL_RECORD_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(isAttribute = true, localName = "total_record_count")

  public Integer getTotalRecordCount() {
    return totalRecordCount;
  }


  public void setTotalRecordCount(Integer totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
  }


  public PurchaseRequests purchaseRequest(List<Object> purchaseRequest) {
    
    this.purchaseRequest = purchaseRequest;
    return this;
  }

  public PurchaseRequests addPurchaseRequestItem(Object purchaseRequestItem) {
    if (this.purchaseRequest == null) {
      this.purchaseRequest = new ArrayList<Object>();
    }
    this.purchaseRequest.add(purchaseRequestItem);
    return this;
  }

   /**
   * purchase_request object.
   * @return purchaseRequest
  **/

  @ApiModelProperty(value = "purchase_request object.")
  @JsonProperty(JSON_PROPERTY_PURCHASE_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getPurchaseRequest() {
    return purchaseRequest;
  }


  public void setPurchaseRequest(List<Object> purchaseRequest) {
    this.purchaseRequest = purchaseRequest;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseRequests purchaseRequests = (PurchaseRequests) o;
    return Objects.equals(this.totalRecordCount, purchaseRequests.totalRecordCount) &&
        Objects.equals(this.purchaseRequest, purchaseRequests.purchaseRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalRecordCount, purchaseRequest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseRequests {\n");
    sb.append("    totalRecordCount: ").append(toIndentedString(totalRecordCount)).append("\n");
    sb.append("    purchaseRequest: ").append(toIndentedString(purchaseRequest)).append("\n");
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

