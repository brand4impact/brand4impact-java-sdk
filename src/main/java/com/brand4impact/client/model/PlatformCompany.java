/*
 * Total API Reference
 * Este contrato se usara para generar los clientes con todos los servicios necesarios.  `!Uso exclusivo interno!`               --- 
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: support@brand4impact.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.brand4impact.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.brand4impact.client.model.PlatformCompanyAddress;
import com.brand4impact.client.model.PlatformCompanyLegal;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PlatformCompany
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-31T15:35:43.909+02:00[Europe/Paris]")
public class PlatformCompany {
  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VAT = "vat";
  @SerializedName(SERIALIZED_NAME_VAT)
  private String vat;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private PlatformCompanyAddress address;

  public static final String SERIALIZED_NAME_LEGAL = "legal";
  @SerializedName(SERIALIZED_NAME_LEGAL)
  private PlatformCompanyLegal legal;

  public static final String SERIALIZED_NAME_SECTOR_TOKEN = "sectorToken";
  @SerializedName(SERIALIZED_NAME_SECTOR_TOKEN)
  private String sectorToken;

  public static final String SERIALIZED_NAME_TOPICS_TOKEN = "topicsToken";
  @SerializedName(SERIALIZED_NAME_TOPICS_TOKEN)
  private List<String> topicsToken = null;


  public PlatformCompany token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public PlatformCompany id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PlatformCompany name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PlatformCompany vat(String vat) {
    
    this.vat = vat;
    return this;
  }

   /**
   * Get vat
   * @return vat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVat() {
    return vat;
  }


  public void setVat(String vat) {
    this.vat = vat;
  }


  public PlatformCompany status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public PlatformCompany address(PlatformCompanyAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PlatformCompanyAddress getAddress() {
    return address;
  }


  public void setAddress(PlatformCompanyAddress address) {
    this.address = address;
  }


  public PlatformCompany legal(PlatformCompanyLegal legal) {
    
    this.legal = legal;
    return this;
  }

   /**
   * Get legal
   * @return legal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PlatformCompanyLegal getLegal() {
    return legal;
  }


  public void setLegal(PlatformCompanyLegal legal) {
    this.legal = legal;
  }


  public PlatformCompany sectorToken(String sectorToken) {
    
    this.sectorToken = sectorToken;
    return this;
  }

   /**
   * Get sectorToken
   * @return sectorToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSectorToken() {
    return sectorToken;
  }


  public void setSectorToken(String sectorToken) {
    this.sectorToken = sectorToken;
  }


  public PlatformCompany topicsToken(List<String> topicsToken) {
    
    this.topicsToken = topicsToken;
    return this;
  }

  public PlatformCompany addTopicsTokenItem(String topicsTokenItem) {
    if (this.topicsToken == null) {
      this.topicsToken = new ArrayList<>();
    }
    this.topicsToken.add(topicsTokenItem);
    return this;
  }

   /**
   * Get topicsToken
   * @return topicsToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTopicsToken() {
    return topicsToken;
  }


  public void setTopicsToken(List<String> topicsToken) {
    this.topicsToken = topicsToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlatformCompany platformCompany = (PlatformCompany) o;
    return Objects.equals(this.token, platformCompany.token) &&
        Objects.equals(this.id, platformCompany.id) &&
        Objects.equals(this.name, platformCompany.name) &&
        Objects.equals(this.vat, platformCompany.vat) &&
        Objects.equals(this.status, platformCompany.status) &&
        Objects.equals(this.address, platformCompany.address) &&
        Objects.equals(this.legal, platformCompany.legal) &&
        Objects.equals(this.sectorToken, platformCompany.sectorToken) &&
        Objects.equals(this.topicsToken, platformCompany.topicsToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, id, name, vat, status, address, legal, sectorToken, topicsToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatformCompany {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    legal: ").append(toIndentedString(legal)).append("\n");
    sb.append("    sectorToken: ").append(toIndentedString(sectorToken)).append("\n");
    sb.append("    topicsToken: ").append(toIndentedString(topicsToken)).append("\n");
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

