# NgoApi

All URIs are relative to *http://localhost:8080/backend*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNgo**](NgoApi.md#createNgo) | **POST** /rest/platform/ngo | Create a new NGO
[**getNgo**](NgoApi.md#getNgo) | **GET** /rest/platform/ngo | Get your NGO
[**updateNgo**](NgoApi.md#updateNgo) | **PUT** /rest/platform/ngo | Update NGO data
[**updateNgoBank**](NgoApi.md#updateNgoBank) | **PUT** /rest/platform/ngo/bank | Update bank NGO info
[**updateNgoLegal**](NgoApi.md#updateNgoLegal) | **PUT** /rest/platform/ngo/legal | Update legal NGO info
[**uploadNgoFiles**](NgoApi.md#uploadNgoFiles) | **PUT** /rest/platform/ngo/upload | Upload NGO files


<a name="createNgo"></a>
# **createNgo**
> PlatformNgo createNgo(ngo, legal, admin)

Create a new NGO

Register a new NGO allows you to have visibiliy that your NGO deserves, being visible to brand4impact users, and opting for their donations

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.NgoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");

    NgoApi apiInstance = new NgoApi(defaultClient);
    PlatformNgoCreate ngo = new PlatformNgoCreate(); // PlatformNgoCreate | 
    PlatformNgoCreateLegal legal = new PlatformNgoCreateLegal(); // PlatformNgoCreateLegal | 
    PlatformNgoCreateAdmin admin = new PlatformNgoCreateAdmin(); // PlatformNgoCreateAdmin | 
    try {
      PlatformNgo result = apiInstance.createNgo(ngo, legal, admin);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NgoApi#createNgo");
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
 **ngo** | [**PlatformNgoCreate**](PlatformNgoCreate.md)|  |
 **legal** | [**PlatformNgoCreateLegal**](PlatformNgoCreateLegal.md)|  |
 **admin** | [**PlatformNgoCreateAdmin**](PlatformNgoCreateAdmin.md)|  |

### Return type

[**PlatformNgo**](PlatformNgo.md)

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
**401** | Unauthorized |  -  |
**201** | A summary of a new NGO&#39;s settings and content |  -  |

<a name="getNgo"></a>
# **getNgo**
> PlatformNgo getNgo()

Get your NGO

This method returns the NGO inside your tenant (theres no need to know the NGO token)  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.NgoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    NgoApi apiInstance = new NgoApi(defaultClient);
    try {
      PlatformNgo result = apiInstance.getNgo();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NgoApi#getNgo");
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

[**PlatformNgo**](PlatformNgo.md)

### Authorization

[BearerAuthentication](../README.md#BearerAuthentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A summary of a NGO&#39;s settings and content |  -  |
**403** | Forbidden |  -  |
**409** | Validation exception |  -  |
**500** | Generic exception |  -  |
**401** | Unauthorized |  -  |

<a name="updateNgo"></a>
# **updateNgo**
> PlatformNgo updateNgo(ngo, logo)

Update NGO data

This method updates any data for the NGO  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.NgoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    NgoApi apiInstance = new NgoApi(defaultClient);
    PlatformNgoUpdate ngo = new PlatformNgoUpdate(); // PlatformNgoUpdate | 
    File logo = new File("/path/to/file"); // File | 
    try {
      PlatformNgo result = apiInstance.updateNgo(ngo, logo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NgoApi#updateNgo");
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
 **ngo** | [**PlatformNgoUpdate**](PlatformNgoUpdate.md)|  |
 **logo** | **File**|  |

### Return type

[**PlatformNgo**](PlatformNgo.md)

### Authorization

[BearerAuthentication](../README.md#BearerAuthentication)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A summary of a NGO&#39;s settings and content |  -  |
**403** | Forbidden |  -  |
**409** | Validation exception |  -  |
**500** | Generic exception |  -  |
**401** | Unauthorized |  -  |

<a name="updateNgoBank"></a>
# **updateNgoBank**
> PlatformNgo updateNgoBank(bank)

Update bank NGO info

This method updates the bank info for your NGO  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.NgoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    NgoApi apiInstance = new NgoApi(defaultClient);
    PlatformNgoUpdateBank bank = new PlatformNgoUpdateBank(); // PlatformNgoUpdateBank | 
    try {
      PlatformNgo result = apiInstance.updateNgoBank(bank);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NgoApi#updateNgoBank");
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
 **bank** | [**PlatformNgoUpdateBank**](PlatformNgoUpdateBank.md)|  |

### Return type

[**PlatformNgo**](PlatformNgo.md)

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
**200** | A summary of a NGO&#39;s settings and content, updated by bank info |  -  |
**401** | Unauthorized |  -  |

<a name="updateNgoLegal"></a>
# **updateNgoLegal**
> PlatformNgo updateNgoLegal(legal)

Update legal NGO info

This method updates the legal info for your NGO  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.NgoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    NgoApi apiInstance = new NgoApi(defaultClient);
    PlatformNgoUpdateLegal legal = new PlatformNgoUpdateLegal(); // PlatformNgoUpdateLegal | 
    try {
      PlatformNgo result = apiInstance.updateNgoLegal(legal);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NgoApi#updateNgoLegal");
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
 **legal** | [**PlatformNgoUpdateLegal**](PlatformNgoUpdateLegal.md)|  |

### Return type

[**PlatformNgo**](PlatformNgo.md)

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
**200** | A summary of a NGO&#39;s settings and content, updated by legal info |  -  |
**401** | Unauthorized |  -  |

<a name="uploadNgoFiles"></a>
# **uploadNgoFiles**
> PlatformNgo uploadNgoFiles(file)

Upload NGO files

This method uploads documentation (files, images, ...) of a NGO  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.NgoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    NgoApi apiInstance = new NgoApi(defaultClient);
    File file = new File("/path/to/file"); // File | 
    try {
      PlatformNgo result = apiInstance.uploadNgoFiles(file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NgoApi#uploadNgoFiles");
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
 **file** | **File**|  |

### Return type

[**PlatformNgo**](PlatformNgo.md)

### Authorization

[BearerAuthentication](../README.md#BearerAuthentication)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**403** | Forbidden |  -  |
**200** | A summary of a NGO&#39;s settings and content, updated by files |  -  |
**409** | Validation exception |  -  |
**500** | Generic exception |  -  |
**401** | Unauthorized |  -  |

