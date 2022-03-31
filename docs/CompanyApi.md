# CompanyApi

All URIs are relative to *http://localhost:8080/backend*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCompany**](CompanyApi.md#createCompany) | **POST** /rest/platform/company | Create a new Company
[**getCompany**](CompanyApi.md#getCompany) | **GET** /rest/platform/company | Get your Company
[**updateCompany**](CompanyApi.md#updateCompany) | **PUT** /rest/platform/company | Update Company data
[**updateCompanyLegal**](CompanyApi.md#updateCompanyLegal) | **PUT** /rest/platform/company/legal | Update legal Company info
[**updateCompanyTopic**](CompanyApi.md#updateCompanyTopic) | **PUT** /rest/platform/company/topic | Update selected topics for your Company


<a name="createCompany"></a>
# **createCompany**
> PlatformCompany createCompany(company, legal, admin)

Create a new Company

Register a new company allows you to start to have visibility that your deserves, being visible to brand4impact users and opting to donate among a bunch of projects

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.CompanyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");

    CompanyApi apiInstance = new CompanyApi(defaultClient);
    PlatformCompanyCreate company = new PlatformCompanyCreate(); // PlatformCompanyCreate | 
    PlatformCompanyCreateLegal legal = new PlatformCompanyCreateLegal(); // PlatformCompanyCreateLegal | 
    PlatformCompanyCreateAdmin admin = new PlatformCompanyCreateAdmin(); // PlatformCompanyCreateAdmin | 
    try {
      PlatformCompany result = apiInstance.createCompany(company, legal, admin);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#createCompany");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company** | [**PlatformCompanyCreate**](PlatformCompanyCreate.md)|  |
 **legal** | [**PlatformCompanyCreateLegal**](PlatformCompanyCreateLegal.md)|  |
 **admin** | [**PlatformCompanyCreateAdmin**](PlatformCompanyCreateAdmin.md)|  |

### Return type

[**PlatformCompany**](PlatformCompany.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**403** | Forbidden |  -  |
**409** | Validation exception |  -  |
**500** | Generic exception |  -  |
**201** | A summary of a new company&#39;s settings and content |  -  |
**401** | Unauthorized |  -  |

<a name="getCompany"></a>
# **getCompany**
> PlatformCompany getCompany()

Get your Company

This method returns the Company inside your tenant (theres no need to know the Company token)  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.CompanyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    CompanyApi apiInstance = new CompanyApi(defaultClient);
    try {
      PlatformCompany result = apiInstance.getCompany();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getCompany");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PlatformCompany**](PlatformCompany.md)

### Authorization

[BearerAuthentication](../README.md#BearerAuthentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**403** | Forbidden |  -  |
**409** | Validation exception |  -  |
**500** | Generic exception |  -  |
**200** | A summary of a company&#39;s settings and content |  -  |
**401** | Unauthorized |  -  |

<a name="updateCompany"></a>
# **updateCompany**
> PlatformCompany updateCompany(company, logo)

Update Company data

This method updates any data for the Company  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.CompanyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    CompanyApi apiInstance = new CompanyApi(defaultClient);
    PlatformCompanyUpdate company = new PlatformCompanyUpdate(); // PlatformCompanyUpdate | 
    File logo = new File("/path/to/file"); // File | 
    try {
      PlatformCompany result = apiInstance.updateCompany(company, logo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#updateCompany");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company** | [**PlatformCompanyUpdate**](PlatformCompanyUpdate.md)|  |
 **logo** | **File**|  |

### Return type

[**PlatformCompany**](PlatformCompany.md)

### Authorization

[BearerAuthentication](../README.md#BearerAuthentication)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**403** | Forbidden |  -  |
**409** | Validation exception |  -  |
**500** | Generic exception |  -  |
**200** | A summary of an updated company&#39;s settings and content |  -  |
**401** | Unauthorized |  -  |

<a name="updateCompanyLegal"></a>
# **updateCompanyLegal**
> PlatformCompany updateCompanyLegal(legal)

Update legal Company info

This method updates the legal info for your Company  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.CompanyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    CompanyApi apiInstance = new CompanyApi(defaultClient);
    PlatformCompanyUpdateLegal legal = new PlatformCompanyUpdateLegal(); // PlatformCompanyUpdateLegal | 
    try {
      PlatformCompany result = apiInstance.updateCompanyLegal(legal);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#updateCompanyLegal");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **legal** | [**PlatformCompanyUpdateLegal**](PlatformCompanyUpdateLegal.md)|  |

### Return type

[**PlatformCompany**](PlatformCompany.md)

### Authorization

[BearerAuthentication](../README.md#BearerAuthentication)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A summary of a company&#39;s settings and content, updated by legal settings |  -  |
**403** | Forbidden |  -  |
**409** | Validation exception |  -  |
**500** | Generic exception |  -  |
**401** | Unauthorized |  -  |

<a name="updateCompanyTopic"></a>
# **updateCompanyTopic**
> PlatformCompany updateCompanyTopic(sdg)

Update selected topics for your Company

This method updates to which topics they can donate the vouchers of their campaigns  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.CompanyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    CompanyApi apiInstance = new CompanyApi(defaultClient);
    PlatformCompanyUpdateTopic sdg = new PlatformCompanyUpdateTopic(); // PlatformCompanyUpdateTopic | 
    try {
      PlatformCompany result = apiInstance.updateCompanyTopic(sdg);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#updateCompanyTopic");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sdg** | [**PlatformCompanyUpdateTopic**](PlatformCompanyUpdateTopic.md)|  |

### Return type

[**PlatformCompany**](PlatformCompany.md)

### Authorization

[BearerAuthentication](../README.md#BearerAuthentication)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**403** | Forbidden |  -  |
**409** | Validation exception |  -  |
**500** | Generic exception |  -  |
**200** | A summary of a company&#39;s settings and content, updated by topic |  -  |
**401** | Unauthorized |  -  |

