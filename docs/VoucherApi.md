# VoucherApi

All URIs are relative to *http://localhost:8080/backend*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadVoucherQr**](VoucherApi.md#downloadVoucherQr) | **GET** /rest/platform/voucher/{token}/qr | Download the voucher QR image
[**downloadVouchersFile**](VoucherApi.md#downloadVouchersFile) | **GET** /rest/platform/voucher/campaign/{campaignToken}/file | Download a set of voucher&#39;s links file
[**downloadVouchersQr**](VoucherApi.md#downloadVouchersQr) | **GET** /rest/platform/voucher/campaign/{campaignToken}/qr | Download a set of voucher QR images
[**getVoucher**](VoucherApi.md#getVoucher) | **GET** /rest/platform/voucher/{token} | Get a single voucher
[**getVouchers**](VoucherApi.md#getVouchers) | **GET** /rest/platform/voucher/campaign/{campaignToken} | Get a set of vouchers


<a name="downloadVoucherQr"></a>
# **downloadVoucherQr**
> String downloadVoucherQr(token)

Download the voucher QR image

This method returns a QR image of the voucher within your tenant to be able to access the donation graphically  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.VoucherApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    VoucherApi apiInstance = new VoucherApi(defaultClient);
    String token = "token_example"; // String | 
    try {
      String result = apiInstance.downloadVoucherQr(token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoucherApi#downloadVoucherQr");
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

**String**

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
**204** | No a QR file |  -  |
**200** | A QR file |  -  |
**401** | Unauthorized |  -  |

<a name="downloadVouchersFile"></a>
# **downloadVouchersFile**
> String downloadVouchersFile(campaignToken, status, min, max)

Download a set of voucher&#39;s links file

This method returns a set of voucher&#39;s links file within your tenant    [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)[![pagination](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/brackets.png &#39;pagination&#39;)](http://localhost:8080/backend/blog/home#pagination)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.VoucherApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    VoucherApi apiInstance = new VoucherApi(defaultClient);
    String campaignToken = "campaignToken_example"; // String | The unique token for the campaign.
    String status = "status_example"; // String | The status of the voucher. Possible values: Active or Inactive
    Integer min = 56; // Integer | Min value of the voucher
    Integer max = 56; // Integer | Max value of the voucher
    try {
      String result = apiInstance.downloadVouchersFile(campaignToken, status, min, max);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoucherApi#downloadVouchersFile");
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
 **campaignToken** | **String**| The unique token for the campaign. |
 **status** | **String**| The status of the voucher. Possible values: Active or Inactive | [optional]
 **min** | **Integer**| Min value of the voucher | [optional]
 **max** | **Integer**| Max value of the voucher | [optional]

### Return type

**String**

### Authorization

[BearerAuthentication](../README.md#BearerAuthentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No a link |  -  |
**403** | Forbidden |  -  |
**200** | A link |  -  |
**409** | Validation exception |  -  |
**500** | Generic exception |  -  |
**401** | Unauthorized |  -  |

<a name="downloadVouchersQr"></a>
# **downloadVouchersQr**
> String downloadVouchersQr(campaignToken, status, min, max)

Download a set of voucher QR images

This method returns a set of voucher QR images within your tenant    [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)[![pagination](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/brackets.png &#39;pagination&#39;)](http://localhost:8080/backend/blog/home#pagination)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.VoucherApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    VoucherApi apiInstance = new VoucherApi(defaultClient);
    String campaignToken = "campaignToken_example"; // String | The unique token for the campaign.
    String status = "status_example"; // String | The status of the voucher. Possible values: Active or Inactive
    Integer min = 56; // Integer | Min value of the voucher
    Integer max = 56; // Integer | Max value of the voucher
    try {
      String result = apiInstance.downloadVouchersQr(campaignToken, status, min, max);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoucherApi#downloadVouchersQr");
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
 **campaignToken** | **String**| The unique token for the campaign. |
 **status** | **String**| The status of the voucher. Possible values: Active or Inactive | [optional]
 **min** | **Integer**| Min value of the voucher | [optional]
 **max** | **Integer**| Max value of the voucher | [optional]

### Return type

**String**

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
**204** | No a QR file |  -  |
**200** | A QR file |  -  |
**401** | Unauthorized |  -  |

<a name="getVoucher"></a>
# **getVoucher**
> PlatformVoucher getVoucher(token)

Get a single voucher

This method returns a specific voucher within your tenant  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.VoucherApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    VoucherApi apiInstance = new VoucherApi(defaultClient);
    String token = "token_example"; // String | 
    try {
      PlatformVoucher result = apiInstance.getVoucher(token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoucherApi#getVoucher");
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

[**PlatformVoucher**](PlatformVoucher.md)

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
**200** | A summary of a voucher&#39;s settings and content |  -  |
**401** | Unauthorized |  -  |

<a name="getVouchers"></a>
# **getVouchers**
> PlatformVoucherItemWrapper getVouchers(campaignToken, status, min, max, page, size)

Get a set of vouchers

This method returns a set of vouchers within your tenant    [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)[![pagination](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/brackets.png &#39;pagination&#39;)](http://localhost:8080/backend/blog/home#pagination)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.VoucherApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    VoucherApi apiInstance = new VoucherApi(defaultClient);
    String campaignToken = "campaignToken_example"; // String | The unique token for the campaign.
    String status = "status_example"; // String | The status of the voucher. Possible values: Active or Inactive
    Integer min = 56; // Integer | Min value of the voucher
    Integer max = 56; // Integer | Max value of the voucher
    Integer page = 56; // Integer | The number of the page. Possible values: 0 to unlimited
    Integer size = 56; // Integer | The number of items inside a page. Possible values: 1 to 100
    try {
      PlatformVoucherItemWrapper result = apiInstance.getVouchers(campaignToken, status, min, max, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoucherApi#getVouchers");
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
 **campaignToken** | **String**| The unique token for the campaign. |
 **status** | **String**| The status of the voucher. Possible values: Active or Inactive | [optional]
 **min** | **Integer**| Min value of the voucher | [optional]
 **max** | **Integer**| Max value of the voucher | [optional]
 **page** | **Integer**| The number of the page. Possible values: 0 to unlimited | [optional]
 **size** | **Integer**| The number of items inside a page. Possible values: 1 to 100 | [optional]

### Return type

[**PlatformVoucherItemWrapper**](PlatformVoucherItemWrapper.md)

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
**200** | A list of vouchers associated to a campaign |  -  |
**401** | Unauthorized |  -  |

