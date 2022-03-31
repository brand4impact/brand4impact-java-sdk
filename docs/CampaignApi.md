# CampaignApi

All URIs are relative to *http://localhost:8080/backend*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCampaign**](CampaignApi.md#createCampaign) | **POST** /rest/platform/campaign | Create a new campaign
[**getCampaign**](CampaignApi.md#getCampaign) | **GET** /rest/platform/campaign/{token} | Get a single campaign
[**getCampaigns**](CampaignApi.md#getCampaigns) | **GET** /rest/platform/campaign | Get a set of campaigns
[**switchCampaign**](CampaignApi.md#switchCampaign) | **PUT** /rest/platform/campaign/{token}/switch | Switch campaign status
[**updateCampaign**](CampaignApi.md#updateCampaign) | **PUT** /rest/platform/campaign/{token} | Update a campaign


<a name="createCampaign"></a>
# **createCampaign**
> PlatformCampaign createCampaign(campaign, primaryImage, secondaryImage)

Create a new campaign

This method creates a new campaign within a Company  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    PlatformCampaignCreate campaign = new PlatformCampaignCreate(); // PlatformCampaignCreate | 
    File primaryImage = new File("/path/to/file"); // File | 
    File secondaryImage = new File("/path/to/file"); // File | 
    try {
      PlatformCampaign result = apiInstance.createCampaign(campaign, primaryImage, secondaryImage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#createCampaign");
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
 **campaign** | [**PlatformCampaignCreate**](PlatformCampaignCreate.md)|  |
 **primaryImage** | **File**|  |
 **secondaryImage** | **File**|  |

### Return type

[**PlatformCampaign**](PlatformCampaign.md)

### Authorization

[BearerAuthentication](../README.md#BearerAuthentication)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A summary of a new campaign&#39;s settings and content |  -  |
**403** | Forbidden |  -  |
**409** | Validation exception |  -  |
**500** | Generic exception |  -  |
**401** | Unauthorized |  -  |

<a name="getCampaign"></a>
# **getCampaign**
> PlatformCampaign getCampaign(token)

Get a single campaign

This method returns a specific campaign within your tenant  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String token = "token_example"; // String | The unique token for the campaign.
    try {
      PlatformCampaign result = apiInstance.getCampaign(token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getCampaign");
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
 **token** | **String**| The unique token for the campaign. |

### Return type

[**PlatformCampaign**](PlatformCampaign.md)

### Authorization

[BearerAuthentication](../README.md#BearerAuthentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**403** | Forbidden |  -  |
**200** | A summary of a campaign&#39;s settings and content |  -  |
**409** | Validation exception |  -  |
**500** | Generic exception |  -  |
**401** | Unauthorized |  -  |

<a name="getCampaigns"></a>
# **getCampaigns**
> PlatformCampaignItemWrapper getCampaigns(titleFilter, page, size, sort)

Get a set of campaigns

This method returns a set of campaigns within your tenant    [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)[![pagination](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/brackets.png &#39;pagination&#39;)](http://localhost:8080/backend/blog/home#pagination)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String titleFilter = "titleFilter_example"; // String | The name of the filter
    Integer page = 56; // Integer | The number of the page. Possible values: 0 to unlimited
    Integer size = 56; // Integer | The number of items inside a page. Possible values: 1 to 100
    String sort = "sort_example"; // String | The order direction for sorted results. Possible values: ASC or DESC
    try {
      PlatformCampaignItemWrapper result = apiInstance.getCampaigns(titleFilter, page, size, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getCampaigns");
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
 **titleFilter** | **String**| The name of the filter | [optional]
 **page** | **Integer**| The number of the page. Possible values: 0 to unlimited | [optional]
 **size** | **Integer**| The number of items inside a page. Possible values: 1 to 100 | [optional]
 **sort** | **String**| The order direction for sorted results. Possible values: ASC or DESC | [optional]

### Return type

[**PlatformCampaignItemWrapper**](PlatformCampaignItemWrapper.md)

### Authorization

[BearerAuthentication](../README.md#BearerAuthentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An array of campaigns |  -  |
**403** | Forbidden |  -  |
**409** | Validation exception |  -  |
**500** | Generic exception |  -  |
**401** | Unauthorized |  -  |

<a name="switchCampaign"></a>
# **switchCampaign**
> PlatformCampaign switchCampaign(token)

Switch campaign status

This method switch the status of a specific campaign  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String token = "token_example"; // String | 
    try {
      PlatformCampaign result = apiInstance.switchCampaign(token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#switchCampaign");
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
 **token** | **String**|  |

### Return type

[**PlatformCampaign**](PlatformCampaign.md)

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
**200** | A summary of an campaign&#39;s settings and content, updated by status |  -  |
**401** | Unauthorized |  -  |

<a name="updateCampaign"></a>
# **updateCampaign**
> PlatformCampaign updateCampaign(token, campaign, primaryImage, secondaryImage)

Update a campaign

This method updates an existing campaign  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String token = "token_example"; // String | 
    PlatformCampaignUpdate campaign = new PlatformCampaignUpdate(); // PlatformCampaignUpdate | 
    File primaryImage = new File("/path/to/file"); // File | 
    File secondaryImage = new File("/path/to/file"); // File | 
    try {
      PlatformCampaign result = apiInstance.updateCampaign(token, campaign, primaryImage, secondaryImage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#updateCampaign");
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
 **token** | **String**|  |
 **campaign** | [**PlatformCampaignUpdate**](PlatformCampaignUpdate.md)|  |
 **primaryImage** | **File**|  |
 **secondaryImage** | **File**|  |

### Return type

[**PlatformCampaign**](PlatformCampaign.md)

### Authorization

[BearerAuthentication](../README.md#BearerAuthentication)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A summary of an updated campaign&#39;s settings and content |  -  |
**403** | Forbidden |  -  |
**409** | Validation exception |  -  |
**500** | Generic exception |  -  |
**401** | Unauthorized |  -  |

