# ProjectApi

All URIs are relative to *http://localhost:8080/backend*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProject**](ProjectApi.md#createProject) | **POST** /rest/platform/project | Create a new project
[**getProject**](ProjectApi.md#getProject) | **GET** /rest/platform/project/{token} | Get a single project
[**getProjects**](ProjectApi.md#getProjects) | **GET** /rest/platform/project | Get a set of projects
[**switchProject**](ProjectApi.md#switchProject) | **PUT** /rest/platform/project/{token}/switch | Switch project status
[**updateProject**](ProjectApi.md#updateProject) | **PUT** /rest/platform/project/{token} | Update a project


<a name="createProject"></a>
# **createProject**
> PlatformProject createProject(project, primaryImage, secondaryImage)

Create a new project

This method creates a new project within a NGO  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.ProjectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    ProjectApi apiInstance = new ProjectApi(defaultClient);
    PlatformProjectCreate project = new PlatformProjectCreate(); // PlatformProjectCreate | 
    File primaryImage = new File("/path/to/file"); // File | 
    File secondaryImage = new File("/path/to/file"); // File | 
    try {
      PlatformProject result = apiInstance.createProject(project, primaryImage, secondaryImage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#createProject");
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
 **project** | [**PlatformProjectCreate**](PlatformProjectCreate.md)|  |
 **primaryImage** | **File**|  |
 **secondaryImage** | **File**|  |

### Return type

[**PlatformProject**](PlatformProject.md)

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
**201** | A summary of a new project&#39;s settings and content |  -  |
**401** | Unauthorized |  -  |

<a name="getProject"></a>
# **getProject**
> PlatformProject getProject(token)

Get a single project

This method returns a specific project within your tenant  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.ProjectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    ProjectApi apiInstance = new ProjectApi(defaultClient);
    String token = "token_example"; // String | The unique token for the campaign.
    try {
      PlatformProject result = apiInstance.getProject(token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#getProject");
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

[**PlatformProject**](PlatformProject.md)

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
**200** | A summary of a project&#39;s settings and content |  -  |
**401** | Unauthorized |  -  |

<a name="getProjects"></a>
# **getProjects**
> PlatformProjectItemWrapper getProjects(descriptionLike, country, topicToken, page, size, sort)

Get a set of projects

This method returns a set of projects within your tenant    [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)[![pagination](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/brackets.png &#39;pagination&#39;)](http://localhost:8080/backend/blog/home#pagination)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.ProjectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    ProjectApi apiInstance = new ProjectApi(defaultClient);
    String descriptionLike = "descriptionLike_example"; // String | 
    String country = "country_example"; // String | The country
    String topicToken = "topicToken_example"; // String | The topicToken
    Integer page = 56; // Integer | The number of the page. Possible values: 0 to unlimited
    Integer size = 56; // Integer | The number of items inside a page. Possible values: 1 to 100
    String sort = "sort_example"; // String | The order direction for sorted results. Possible values: ASC or DESC
    try {
      PlatformProjectItemWrapper result = apiInstance.getProjects(descriptionLike, country, topicToken, page, size, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#getProjects");
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
 **descriptionLike** | **String**|  | [optional]
 **country** | **String**| The country | [optional]
 **topicToken** | **String**| The topicToken | [optional]
 **page** | **Integer**| The number of the page. Possible values: 0 to unlimited | [optional]
 **size** | **Integer**| The number of items inside a page. Possible values: 1 to 100 | [optional]
 **sort** | **String**| The order direction for sorted results. Possible values: ASC or DESC | [optional]

### Return type

[**PlatformProjectItemWrapper**](PlatformProjectItemWrapper.md)

### Authorization

[BearerAuthentication](../README.md#BearerAuthentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An array of projects |  -  |
**403** | Forbidden |  -  |
**409** | Validation exception |  -  |
**500** | Generic exception |  -  |
**401** | Unauthorized |  -  |

<a name="switchProject"></a>
# **switchProject**
> PlatformProject switchProject(token)

Switch project status

This method switch the status of a specific project  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.ProjectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    ProjectApi apiInstance = new ProjectApi(defaultClient);
    String token = "token_example"; // String | 
    try {
      PlatformProject result = apiInstance.switchProject(token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#switchProject");
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

[**PlatformProject**](PlatformProject.md)

### Authorization

[BearerAuthentication](../README.md#BearerAuthentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A summary of a project&#39;s settings and content, updated by status |  -  |
**403** | Forbidden |  -  |
**409** | Validation exception |  -  |
**500** | Generic exception |  -  |
**401** | Unauthorized |  -  |

<a name="updateProject"></a>
# **updateProject**
> PlatformProject updateProject(token, project, primaryImage, secondaryImage)

Update a project

This method updates an existing project  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.ProjectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    ProjectApi apiInstance = new ProjectApi(defaultClient);
    String token = "token_example"; // String | 
    PlatformProjectUpdate project = new PlatformProjectUpdate(); // PlatformProjectUpdate | 
    File primaryImage = new File("/path/to/file"); // File | 
    File secondaryImage = new File("/path/to/file"); // File | 
    try {
      PlatformProject result = apiInstance.updateProject(token, project, primaryImage, secondaryImage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#updateProject");
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
 **project** | [**PlatformProjectUpdate**](PlatformProjectUpdate.md)|  |
 **primaryImage** | **File**|  |
 **secondaryImage** | **File**|  |

### Return type

[**PlatformProject**](PlatformProject.md)

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
**200** | A summary of a project&#39;s settings and content |  -  |
**401** | Unauthorized |  -  |

