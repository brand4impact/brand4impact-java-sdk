# InvoiceApi

All URIs are relative to *http://localhost:8080/backend*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInvoice**](InvoiceApi.md#getInvoice) | **GET** /rest/platform/invoice/{token} | Get a single invoice
[**getInvoices**](InvoiceApi.md#getInvoices) | **GET** /rest/platform/invoice | Get a set of invoices


<a name="getInvoice"></a>
# **getInvoice**
> PlatformInvoice getInvoice(token)

Get a single invoice

This method returns a specific invoice within your tenant  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.InvoiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    InvoiceApi apiInstance = new InvoiceApi(defaultClient);
    String token = "token_example"; // String | 
    try {
      PlatformInvoice result = apiInstance.getInvoice(token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceApi#getInvoice");
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

[**PlatformInvoice**](PlatformInvoice.md)

### Authorization

[BearerAuthentication](../README.md#BearerAuthentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A summary of an invoice |  -  |
**403** | Forbidden |  -  |
**409** | Validation exception |  -  |
**500** | Generic exception |  -  |
**401** | Unauthorized |  -  |

<a name="getInvoices"></a>
# **getInvoices**
> PlatformInvoiceItemWrapper getInvoices(numberLike, page, size, sort)

Get a set of invoices

This method returns a set of invoices within your tenant    [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)[![pagination](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/brackets.png &#39;pagination&#39;)](http://localhost:8080/backend/blog/home#pagination)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.InvoiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    InvoiceApi apiInstance = new InvoiceApi(defaultClient);
    String numberLike = "numberLike_example"; // String | The name of the filter
    Integer page = 56; // Integer | The number of the page. Possible values: 0 to unlimited
    Integer size = 56; // Integer | The number of items inside a page. Possible values: 1 to 100
    String sort = "sort_example"; // String | The order direction for sorted results. Possible values: ASC or DESC
    try {
      PlatformInvoiceItemWrapper result = apiInstance.getInvoices(numberLike, page, size, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceApi#getInvoices");
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
 **numberLike** | **String**| The name of the filter | [optional]
 **page** | **Integer**| The number of the page. Possible values: 0 to unlimited | [optional]
 **size** | **Integer**| The number of items inside a page. Possible values: 1 to 100 | [optional]
 **sort** | **String**| The order direction for sorted results. Possible values: ASC or DESC | [optional]

### Return type

[**PlatformInvoiceItemWrapper**](PlatformInvoiceItemWrapper.md)

### Authorization

[BearerAuthentication](../README.md#BearerAuthentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A summary of an invoice |  -  |
**403** | Forbidden |  -  |
**409** | Validation exception |  -  |
**500** | Generic exception |  -  |
**401** | Unauthorized |  -  |

