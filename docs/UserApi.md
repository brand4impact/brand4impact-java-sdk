# UserApi

All URIs are relative to *http://localhost:8080/backend*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeUserPassword**](UserApi.md#changeUserPassword) | **PUT** /rest/platform/user/{token}/changepassword | Change user&#39;s password
[**confirmUser**](UserApi.md#confirmUser) | **POST** /rest/platform/user/{token} | Activate a user
[**getUser**](UserApi.md#getUser) | **GET** /rest/platform/user/{token} | Get a single user
[**getUsers**](UserApi.md#getUsers) | **GET** /rest/platform/user | Get a set of users
[**inviteUser**](UserApi.md#inviteUser) | **POST** /rest/platform/user/invite | Invite a new user
[**resetUserPassword**](UserApi.md#resetUserPassword) | **PUT** /rest/platform/user/resetpassword | Reset user&#39;s password
[**switchUser**](UserApi.md#switchUser) | **PUT** /rest/platform/user/{token}/switch | Switch user&#39;s status
[**updateUser**](UserApi.md#updateUser) | **PUT** /rest/platform/user/{token} | Update user data
[**updateUserExt**](UserApi.md#updateUserExt) | **PUT** /rest/platform/user/{token}/ext | Update sensitive user data


<a name="changeUserPassword"></a>
# **changeUserPassword**
> PlatformUser changeUserPassword(token, user)

Change user&#39;s password

This method updates the password of a specific user  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");

    UserApi apiInstance = new UserApi(defaultClient);
    String token = "token_example"; // String | 
    PlatformUserChangePassword user = new PlatformUserChangePassword(); // PlatformUserChangePassword | 
    try {
      PlatformUser result = apiInstance.changeUserPassword(token, user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#changeUserPassword");
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
 **user** | [**PlatformUserChangePassword**](PlatformUserChangePassword.md)|  |

### Return type

[**PlatformUser**](PlatformUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A summary of a user settings |  -  |
**403** | Forbidden |  -  |
**409** | Validation exception |  -  |
**500** | Generic exception |  -  |
**401** | Unauthorized |  -  |

<a name="confirmUser"></a>
# **confirmUser**
> PlatformUser confirmUser(token, user)

Activate a user

This method activate an invited user in the Company/NGO  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");

    UserApi apiInstance = new UserApi(defaultClient);
    String token = "token_example"; // String | 
    PlatformUserConfirm user = new PlatformUserConfirm(); // PlatformUserConfirm | 
    try {
      PlatformUser result = apiInstance.confirmUser(token, user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#confirmUser");
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
 **user** | [**PlatformUserConfirm**](PlatformUserConfirm.md)|  |

### Return type

[**PlatformUser**](PlatformUser.md)

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
**201** | A summary of a new user settings |  -  |
**401** | Unauthorized |  -  |

<a name="getUser"></a>
# **getUser**
> PlatformUser getUser(token)

Get a single user

This method returns a specific user within your tenant  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    UserApi apiInstance = new UserApi(defaultClient);
    String token = "token_example"; // String | 
    try {
      PlatformUser result = apiInstance.getUser(token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getUser");
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

[**PlatformUser**](PlatformUser.md)

### Authorization

[BearerAuthentication](../README.md#BearerAuthentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A summary of a user settings |  -  |
**403** | Forbidden |  -  |
**409** | Validation exception |  -  |
**500** | Generic exception |  -  |
**401** | Unauthorized |  -  |

<a name="getUsers"></a>
# **getUsers**
> PlatformUserItemWrapper getUsers(firstnameLike, page, size, sort)

Get a set of users

This method returns a set of users within your tenant    [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)[![pagination](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/brackets.png &#39;pagination&#39;)](http://localhost:8080/backend/blog/home#pagination)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    UserApi apiInstance = new UserApi(defaultClient);
    String firstnameLike = "firstnameLike_example"; // String | The name of the filter
    Integer page = 56; // Integer | The number of the page. Possible values: 0 to unlimited
    Integer size = 56; // Integer | The number of items inside a page. Possible values: 1 to 100
    String sort = "sort_example"; // String | The order direction for sorted results. Possible values: ASC or DESC
    try {
      PlatformUserItemWrapper result = apiInstance.getUsers(firstnameLike, page, size, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getUsers");
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
 **firstnameLike** | **String**| The name of the filter | [optional]
 **page** | **Integer**| The number of the page. Possible values: 0 to unlimited | [optional]
 **size** | **Integer**| The number of items inside a page. Possible values: 1 to 100 | [optional]
 **sort** | **String**| The order direction for sorted results. Possible values: ASC or DESC | [optional]

### Return type

[**PlatformUserItemWrapper**](PlatformUserItemWrapper.md)

### Authorization

[BearerAuthentication](../README.md#BearerAuthentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**403** | Forbidden |  -  |
**200** | An array of users |  -  |
**409** | Validation exception |  -  |
**500** | Generic exception |  -  |
**401** | Unauthorized |  -  |

<a name="inviteUser"></a>
# **inviteUser**
> PlatformUser inviteUser(user)

Invite a new user

This method invites a user to join a Company/NGO  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    UserApi apiInstance = new UserApi(defaultClient);
    PlatformUserInvite user = new PlatformUserInvite(); // PlatformUserInvite | 
    try {
      PlatformUser result = apiInstance.inviteUser(user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#inviteUser");
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
 **user** | [**PlatformUserInvite**](PlatformUserInvite.md)|  |

### Return type

[**PlatformUser**](PlatformUser.md)

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
**201** | A summary of a new user settings |  -  |
**401** | Unauthorized |  -  |

<a name="resetUserPassword"></a>
# **resetUserPassword**
> PlatformUser resetUserPassword(user)

Reset user&#39;s password

This method reset the password of a specific user by sending an email to the user with a link to reset the password  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");

    UserApi apiInstance = new UserApi(defaultClient);
    PlatformUserResetPassword user = new PlatformUserResetPassword(); // PlatformUserResetPassword | 
    try {
      PlatformUser result = apiInstance.resetUserPassword(user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#resetUserPassword");
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
 **user** | [**PlatformUserResetPassword**](PlatformUserResetPassword.md)|  |

### Return type

[**PlatformUser**](PlatformUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A summary of a user settings |  -  |
**403** | Forbidden |  -  |
**409** | Validation exception |  -  |
**500** | Generic exception |  -  |
**401** | Unauthorized |  -  |

<a name="switchUser"></a>
# **switchUser**
> PlatformUser switchUser(token)

Switch user&#39;s status

This method updates the user status, possible values are: active|inactive  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    UserApi apiInstance = new UserApi(defaultClient);
    String token = "token_example"; // String | 
    try {
      PlatformUser result = apiInstance.switchUser(token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#switchUser");
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

[**PlatformUser**](PlatformUser.md)

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
**200** | A summary of a user settings, updated by status |  -  |
**401** | Unauthorized |  -  |

<a name="updateUser"></a>
# **updateUser**
> PlatformUser updateUser(token, user)

Update user data

This method updates personal data for a user  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    UserApi apiInstance = new UserApi(defaultClient);
    String token = "token_example"; // String | 
    PlatformUserUpdate user = new PlatformUserUpdate(); // PlatformUserUpdate | 
    try {
      PlatformUser result = apiInstance.updateUser(token, user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateUser");
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
 **user** | [**PlatformUserUpdate**](PlatformUserUpdate.md)|  |

### Return type

[**PlatformUser**](PlatformUser.md)

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
**200** | A summary of an updated user settings |  -  |
**401** | Unauthorized |  -  |

<a name="updateUserExt"></a>
# **updateUserExt**
> PlatformUser updateUserExt(token, user)

Update sensitive user data

This method updates sensitive user data  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.auth.*;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");
    
    // Configure HTTP bearer authorization: BearerAuthentication
    HttpBearerAuth BearerAuthentication = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuthentication");
    BearerAuthentication.setBearerToken("BEARER TOKEN");

    UserApi apiInstance = new UserApi(defaultClient);
    String token = "token_example"; // String | 
    PlatformUserUpdateExt user = new PlatformUserUpdateExt(); // PlatformUserUpdateExt | 
    try {
      PlatformUser result = apiInstance.updateUserExt(token, user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateUserExt");
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
 **user** | [**PlatformUserUpdateExt**](PlatformUserUpdateExt.md)|  |

### Return type

[**PlatformUser**](PlatformUser.md)

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
**200** | A summary of an updated admin user settings |  -  |
**401** | Unauthorized |  -  |

