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
import com.brand4impact.client.model.PlatformNgoAddress;
import com.brand4impact.client.model.PlatformNgoLegal;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * PlatformNgo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-31T15:35:43.909+02:00[Europe/Paris]")
public class PlatformNgo {
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

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private PlatformNgoAddress address;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_ESTABLISHMENT = "establishment";
  @SerializedName(SERIALIZED_NAME_ESTABLISHMENT)
  private OffsetDateTime establishment;

  public static final String SERIALIZED_NAME_WEBSITE = "website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  private String website;

  public static final String SERIALIZED_NAME_LEGAL = "legal";
  @SerializedName(SERIALIZED_NAME_LEGAL)
  private PlatformNgoLegal legal;

  public static final String SERIALIZED_NAME_FILES = "files";
  @SerializedName(SERIALIZED_NAME_FILES)
  private List<String> files = null;


  public PlatformNgo token(String token) {
    
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


  public PlatformNgo id(String id) {
    
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


  public PlatformNgo name(String name) {
    
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


  public PlatformNgo vat(String vat) {
    
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


  public PlatformNgo address(PlatformNgoAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PlatformNgoAddress getAddress() {
    return address;
  }


  public void setAddress(PlatformNgoAddress address) {
    this.address = address;
  }


  public PlatformNgo status(String status) {
    
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


  public PlatformNgo establishment(OffsetDateTime establishment) {
    
    this.establishment = establishment;
    return this;
  }

   /**
   * Get establishment
   * @return establishment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEstablishment() {
    return establishment;
  }


  public void setEstablishment(OffsetDateTime establishment) {
    this.establishment = establishment;
  }


  public PlatformNgo website(String website) {
    
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWebsite() {
    return website;
  }


  public void setWebsite(String website) {
    this.website = website;
  }


  public PlatformNgo legal(PlatformNgoLegal legal) {
    
    this.legal = legal;
    return this;
  }

   /**
   * Get legal
   * @return legal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PlatformNgoLegal getLegal() {
    return legal;
  }


  public void setLegal(PlatformNgoLegal legal) {
    this.legal = legal;
  }


  public PlatformNgo files(List<String> files) {
    
    this.files = files;
    return this;
  }

  public PlatformNgo addFilesItem(String filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getFiles() {
    return files;
  }


  public void setFiles(List<String> files) {
    this.files = files;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlatformNgo platformNgo = (PlatformNgo) o;
    return Objects.equals(this.token, platformNgo.token) &&
        Objects.equals(this.id, platformNgo.id) &&
        Objects.equals(this.name, platformNgo.name) &&
        Objects.equals(this.vat, platformNgo.vat) &&
        Objects.equals(this.address, platformNgo.address) &&
        Objects.equals(this.status, platformNgo.status) &&
        Objects.equals(this.establishment, platformNgo.establishment) &&
        Objects.equals(this.website, platformNgo.website) &&
        Objects.equals(this.legal, platformNgo.legal) &&
        Objects.equals(this.files, platformNgo.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, id, name, vat, address, status, establishment, website, legal, files);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatformNgo {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    establishment: ").append(toIndentedString(establishment)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    legal: ").append(toIndentedString(legal)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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
