# AssetApi

All URIs are relative to *http://localhost:8080/backend*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAsset**](AssetApi.md#getAsset) | **GET** /rest/platform/asset/{token} | Get a single asset
[**getAssets**](AssetApi.md#getAssets) | **GET** /rest/platform/asset | Get a set of assets


<a name="getAsset"></a>
# **getAsset**
> PlatformAsset getAsset(token)

Get a single asset

This method returns a specific asset within your tenant (asset refers to static files, like images, pdf, ...)  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.AssetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    AssetApi apiInstance = new AssetApi(defaultClient);
    String token = "token_example"; // String | The unique token for the asset.
    try {
      PlatformAsset result = apiInstance.getAsset(token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetApi#getAsset");
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
 **token** | **String**| The unique token for the asset. |

### Return type

[**PlatformAsset**](PlatformAsset.md)

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
**200** | An asset file |  -  |
**401** | Unauthorized |  -  |

<a name="getAssets"></a>
# **getAssets**
> PlatformAssetItemWrapper getAssets(page, size, sort)

Get a set of assets

This method returns a set of assets within your tenant (asset refers to static files, like images, pdf, ...)    [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)[![pagination](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/brackets.png &#39;pagination&#39;)](http://localhost:8080/backend/blog/home#pagination)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.AssetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    AssetApi apiInstance = new AssetApi(defaultClient);
    Integer page = 56; // Integer | The number of the page. Possible values: 0 to unlimited
    Integer size = 56; // Integer | The number of items inside a page. Possible values: 1 to 100
    String sort = "sort_example"; // String | The order direction for sorted results. Possible values: ASC or DESC
    try {
      PlatformAssetItemWrapper result = apiInstance.getAssets(page, size, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetApi#getAssets");
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
 **page** | **Integer**| The number of the page. Possible values: 0 to unlimited | [optional]
 **size** | **Integer**| The number of items inside a page. Possible values: 1 to 100 | [optional]
 **sort** | **String**| The order direction for sorted results. Possible values: ASC or DESC | [optional]

### Return type

[**PlatformAssetItemWrapper**](PlatformAssetItemWrapper.md)

### Authorization

[BearerAuthentication](../README.md#BearerAuthentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**403** | Forbidden |  -  |
**200** | An array of assets files |  -  |
**409** | Validation exception |  -  |
**500** | Generic exception |  -  |
**401** | Unauthorized |  -  |

