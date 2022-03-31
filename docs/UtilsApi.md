# UtilsApi

All URIs are relative to *http://localhost:8080/backend*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCountries**](UtilsApi.md#getCountries) | **GET** /rest/platform/utils/country | Get countries
[**getCurrencies**](UtilsApi.md#getCurrencies) | **GET** /rest/platform/utils/currency | Get currencies
[**getLanguages**](UtilsApi.md#getLanguages) | **GET** /rest/platform/utils/language | Get languages
[**getRoles**](UtilsApi.md#getRoles) | **GET** /rest/platform/utils/roles | Get roles
[**getZones**](UtilsApi.md#getZones) | **GET** /rest/platform/utils/zone | Get zones


<a name="getCountries"></a>
# **getCountries**
> List&lt;PlatformCountry&gt; getCountries(language)

Get countries

This method returns all the countries available, you can indicate a locale to do the search

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.UtilsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");

    UtilsApi apiInstance = new UtilsApi(defaultClient);
    String language = "ab"; // String | List of countries
    try {
      List<PlatformCountry> result = apiInstance.getCountries(language);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilsApi#getCountries");
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
 **language** | **String**| List of countries | [enum: ab, aa, af, ak, sq, am, ar, an, hy, as, av, ae, ay, az, bm, ba, eu, be, bn, bh, bi, bs, br, bg, my, ca, ch, ce, zh, cu, cv, kw, co, cr, hr, cs, da, dv, nl, dz, en, eo, et, ee, fo, fj, fi, fr, fy, ff, gl, lg, ka, de, el, kl, gn, gu, ht, ha, he, hz, hi, ho, hu, is, io, ig, id, ia, ie, iu, ik, ga, it, ja, jv, kn, kr, ks, kk, km, ki, rw, ky, kv, kg, ko, ku, kj, lo, la, lv, li, ln, lt, lu, lb, mk, mg, ms, ml, mt, gv, mi, mr, mh, mo, mn, na, nv, ng, ne, nd, se, no, nb, nn, ny, oc, oj, or, om, os, pi, pa, fa, pl, pt, ps, qu, rm, ro, rn, ru, sm, sg, sa, sc, gd, sr, sn, ii, sd, si, sk, sl, so, nr, st, es, su, sw, ss, sv, tl, ty, tg, ta, tt, te, th, bo, ti, to, ts, tn, tr, tk, tw, ug, uk, ur, uz, ve, vi, vo, wa, cy, wo, xh, ji, yo, za, zu]

### Return type

[**List&lt;PlatformCountry&gt;**](PlatformCountry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A summary of countries |  -  |
**403** | Forbidden |  -  |
**409** | Validation exception |  -  |
**500** | Generic exception |  -  |
**401** | Unauthorized |  -  |

<a name="getCurrencies"></a>
# **getCurrencies**
> List&lt;PlatformCurrency&gt; getCurrencies(language)

Get currencies

This method returns all the currencies available, you can indicate a locale to do the search

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.UtilsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");

    UtilsApi apiInstance = new UtilsApi(defaultClient);
    String language = "ab"; // String | List of currencies
    try {
      List<PlatformCurrency> result = apiInstance.getCurrencies(language);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilsApi#getCurrencies");
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
 **language** | **String**| List of currencies | [enum: ab, aa, af, ak, sq, am, ar, an, hy, as, av, ae, ay, az, bm, ba, eu, be, bn, bh, bi, bs, br, bg, my, ca, ch, ce, zh, cu, cv, kw, co, cr, hr, cs, da, dv, nl, dz, en, eo, et, ee, fo, fj, fi, fr, fy, ff, gl, lg, ka, de, el, kl, gn, gu, ht, ha, he, hz, hi, ho, hu, is, io, ig, id, ia, ie, iu, ik, ga, it, ja, jv, kn, kr, ks, kk, km, ki, rw, ky, kv, kg, ko, ku, kj, lo, la, lv, li, ln, lt, lu, lb, mk, mg, ms, ml, mt, gv, mi, mr, mh, mo, mn, na, nv, ng, ne, nd, se, no, nb, nn, ny, oc, oj, or, om, os, pi, pa, fa, pl, pt, ps, qu, rm, ro, rn, ru, sm, sg, sa, sc, gd, sr, sn, ii, sd, si, sk, sl, so, nr, st, es, su, sw, ss, sv, tl, ty, tg, ta, tt, te, th, bo, ti, to, ts, tn, tr, tk, tw, ug, uk, ur, uz, ve, vi, vo, wa, cy, wo, xh, ji, yo, za, zu]

### Return type

[**List&lt;PlatformCurrency&gt;**](PlatformCurrency.md)

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
**200** | A summary of currencies |  -  |
**401** | Unauthorized |  -  |

<a name="getLanguages"></a>
# **getLanguages**
> List&lt;PlatformLanguage&gt; getLanguages(language)

Get languages

This method returns all the languages available, you can indicate a locale to do the search

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.UtilsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");

    UtilsApi apiInstance = new UtilsApi(defaultClient);
    String language = "ab"; // String | List of languages
    try {
      List<PlatformLanguage> result = apiInstance.getLanguages(language);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilsApi#getLanguages");
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
 **language** | **String**| List of languages | [enum: ab, aa, af, ak, sq, am, ar, an, hy, as, av, ae, ay, az, bm, ba, eu, be, bn, bh, bi, bs, br, bg, my, ca, ch, ce, zh, cu, cv, kw, co, cr, hr, cs, da, dv, nl, dz, en, eo, et, ee, fo, fj, fi, fr, fy, ff, gl, lg, ka, de, el, kl, gn, gu, ht, ha, he, hz, hi, ho, hu, is, io, ig, id, ia, ie, iu, ik, ga, it, ja, jv, kn, kr, ks, kk, km, ki, rw, ky, kv, kg, ko, ku, kj, lo, la, lv, li, ln, lt, lu, lb, mk, mg, ms, ml, mt, gv, mi, mr, mh, mo, mn, na, nv, ng, ne, nd, se, no, nb, nn, ny, oc, oj, or, om, os, pi, pa, fa, pl, pt, ps, qu, rm, ro, rn, ru, sm, sg, sa, sc, gd, sr, sn, ii, sd, si, sk, sl, so, nr, st, es, su, sw, ss, sv, tl, ty, tg, ta, tt, te, th, bo, ti, to, ts, tn, tr, tk, tw, ug, uk, ur, uz, ve, vi, vo, wa, cy, wo, xh, ji, yo, za, zu]

### Return type

[**List&lt;PlatformLanguage&gt;**](PlatformLanguage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A summary of languages |  -  |
**403** | Forbidden |  -  |
**409** | Validation exception |  -  |
**500** | Generic exception |  -  |
**401** | Unauthorized |  -  |

<a name="getRoles"></a>
# **getRoles**
> List&lt;PlatformRole&gt; getRoles()

Get roles

This method returns all the roles available, you can indicate a locale to do the search

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.UtilsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");

    UtilsApi apiInstance = new UtilsApi(defaultClient);
    try {
      List<PlatformRole> result = apiInstance.getRoles();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilsApi#getRoles");
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

[**List&lt;PlatformRole&gt;**](PlatformRole.md)

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
**401** | Unauthorized |  -  |
**200** | A summary of roles  |  -  |

<a name="getZones"></a>
# **getZones**
> List&lt;PlatformZone&gt; getZones(language)

Get zones

This method returns all the zones available, you can indicate a locale to do the search

### Example
```java
// Import classes:
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.models.*;
import com.brand4impact.client.api.UtilsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/backend");

    UtilsApi apiInstance = new UtilsApi(defaultClient);
    String language = "ab"; // String | List of zones
    try {
      List<PlatformZone> result = apiInstance.getZones(language);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilsApi#getZones");
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
 **language** | **String**| List of zones | [enum: ab, aa, af, ak, sq, am, ar, an, hy, as, av, ae, ay, az, bm, ba, eu, be, bn, bh, bi, bs, br, bg, my, ca, ch, ce, zh, cu, cv, kw, co, cr, hr, cs, da, dv, nl, dz, en, eo, et, ee, fo, fj, fi, fr, fy, ff, gl, lg, ka, de, el, kl, gn, gu, ht, ha, he, hz, hi, ho, hu, is, io, ig, id, ia, ie, iu, ik, ga, it, ja, jv, kn, kr, ks, kk, km, ki, rw, ky, kv, kg, ko, ku, kj, lo, la, lv, li, ln, lt, lu, lb, mk, mg, ms, ml, mt, gv, mi, mr, mh, mo, mn, na, nv, ng, ne, nd, se, no, nb, nn, ny, oc, oj, or, om, os, pi, pa, fa, pl, pt, ps, qu, rm, ro, rn, ru, sm, sg, sa, sc, gd, sr, sn, ii, sd, si, sk, sl, so, nr, st, es, su, sw, ss, sv, tl, ty, tg, ta, tt, te, th, bo, ti, to, ts, tn, tr, tk, tw, ug, uk, ur, uz, ve, vi, vo, wa, cy, wo, xh, ji, yo, za, zu]

### Return type

[**List&lt;PlatformZone&gt;**](PlatformZone.md)

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
**200** | A summary of zones |  -  |
**401** | Unauthorized |  -  |

