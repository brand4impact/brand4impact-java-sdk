# SecurityApi

All URIs are relative to *http://localhost:8080/backend*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getJWTToken**](SecurityApi.md#getJWTToken) | **GET** /security/jwt | get JWT token


<a name="getJWTToken"></a>
# **getJWTToken**
> SecurityUser getJWTToken()

get JWT token

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP basic authorization: BasicAuthentication
    HttpBasicAuth BasicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuthentication");
    BasicAuthentication.setUsername("YOUR USERNAME");
    BasicAuthentication.setPassword("YOUR PASSWORD");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    try {
      SecurityUser result = apiInstance.getJWTToken();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#getJWTToken");
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

[**SecurityUser**](SecurityUser.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**403** | forbidden |  -  |
**409** | validation exception |  -  |
**500** | generic exception |  -  |
**200** | security user info |  -  |
**401** | unauthorized |  -  |

