# TopicApi

All URIs are relative to *http://localhost:8080/backend*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTopic**](TopicApi.md#getTopic) | **GET** /rest/platform/topic/{token} | Get a single topic
[**getTopics**](TopicApi.md#getTopics) | **GET** /rest/platform/topic | Get a set of topics


<a name="getTopic"></a>
# **getTopic**
> PlatformTopic getTopic(token)

Get a single topic

This method returns a specific topic  A topic refers to the 17th SDG objectives [(United Nations)](https://sdgs.un.org/goals)  

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.TopicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");

    TopicApi apiInstance = new TopicApi(defaultClient);
    String token = "token_example"; // String | The unique token for the topic.
    try {
      PlatformTopic result = apiInstance.getTopic(token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TopicApi#getTopic");
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
 **token** | **String**| The unique token for the topic. |

### Return type

[**PlatformTopic**](PlatformTopic.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**403** | Forbidden |  -  |
**409** | Validation exception |  -  |
**500** | Generic exception |  -  |
**200** | A topic |  -  |
**401** | Unauthorized |  -  |

<a name="getTopics"></a>
# **getTopics**
> PlatformTopicItemWrapper getTopics(titleLike, page, size, sort)

Get a set of topics

This method returns all the topics according the filters  A topic refers to the 17th SDG objectives [(United Nations)](https://sdgs.un.org/goals)    [![pagination](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/brackets.png &#39;pagination&#39;)](http://localhost:8080/backend/blog/home#pagination)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.TopicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");

    TopicApi apiInstance = new TopicApi(defaultClient);
    String titleLike = "titleLike_example"; // String | The name of the filter
    Integer page = 56; // Integer | The number of the page. Possible values: 0 to unlimited
    Integer size = 56; // Integer | The number of items inside a page. Possible values: 1 to 100
    String sort = "sort_example"; // String | The order direction for sorted results. Possible values: ASC or DESC
    try {
      PlatformTopicItemWrapper result = apiInstance.getTopics(titleLike, page, size, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TopicApi#getTopics");
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
 **titleLike** | **String**| The name of the filter | [optional]
 **page** | **Integer**| The number of the page. Possible values: 0 to unlimited | [optional]
 **size** | **Integer**| The number of items inside a page. Possible values: 1 to 100 | [optional]
 **sort** | **String**| The order direction for sorted results. Possible values: ASC or DESC | [optional]

### Return type

[**PlatformTopicItemWrapper**](PlatformTopicItemWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**403** | Forbidden |  -  |
**409** | Validation exception |  -  |
**500** | Generic exception |  -  |
**200** | An array of topics |  -  |
**401** | Unauthorized |  -  |

