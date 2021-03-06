/*
 * Total API Reference
 * Este contrato se usara para generar los clientes con todos los servicios necesarios.  `!Uso exclusivo interno!`               --- 
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: support@brand4impact.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.brand4impact.client.api;

import com.brand4impact.client.invoker.ApiCallback;
import com.brand4impact.client.invoker.ApiClient;
import com.brand4impact.client.invoker.ApiException;
import com.brand4impact.client.invoker.ApiResponse;
import com.brand4impact.client.invoker.Configuration;
import com.brand4impact.client.invoker.Pair;
import com.brand4impact.client.invoker.ProgressRequestBody;
import com.brand4impact.client.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.brand4impact.client.model.PlatformCountry;
import com.brand4impact.client.model.PlatformCurrency;
import com.brand4impact.client.model.PlatformLanguage;
import com.brand4impact.client.model.PlatformRole;
import com.brand4impact.client.model.PlatformZone;
import com.brand4impact.client.model.RestError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UtilsApi {
    private ApiClient localVarApiClient;

    public UtilsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UtilsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getCountries
     * @param language List of countries (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A summary of countries </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Validation exception </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Generic exception </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCountriesCall(String language, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/rest/platform/utils/country";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (language != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("language", language));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCountriesValidateBeforeCall(String language, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'language' is set
        if (language == null) {
            throw new ApiException("Missing the required parameter 'language' when calling getCountries(Async)");
        }
        

        okhttp3.Call localVarCall = getCountriesCall(language, _callback);
        return localVarCall;

    }

    /**
     * Get countries
     * This method returns all the countries available, you can indicate a locale to do the search
     * @param language List of countries (required)
     * @return List&lt;PlatformCountry&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A summary of countries </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Validation exception </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Generic exception </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public List<PlatformCountry> getCountries(String language) throws ApiException {
        ApiResponse<List<PlatformCountry>> localVarResp = getCountriesWithHttpInfo(language);
        return localVarResp.getData();
    }

    /**
     * Get countries
     * This method returns all the countries available, you can indicate a locale to do the search
     * @param language List of countries (required)
     * @return ApiResponse&lt;List&lt;PlatformCountry&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A summary of countries </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Validation exception </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Generic exception </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<PlatformCountry>> getCountriesWithHttpInfo(String language) throws ApiException {
        okhttp3.Call localVarCall = getCountriesValidateBeforeCall(language, null);
        Type localVarReturnType = new TypeToken<List<PlatformCountry>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get countries (asynchronously)
     * This method returns all the countries available, you can indicate a locale to do the search
     * @param language List of countries (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A summary of countries </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Validation exception </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Generic exception </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCountriesAsync(String language, final ApiCallback<List<PlatformCountry>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCountriesValidateBeforeCall(language, _callback);
        Type localVarReturnType = new TypeToken<List<PlatformCountry>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCurrencies
     * @param language List of currencies (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Validation exception </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Generic exception </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> A summary of currencies </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCurrenciesCall(String language, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/rest/platform/utils/currency";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (language != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("language", language));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCurrenciesValidateBeforeCall(String language, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'language' is set
        if (language == null) {
            throw new ApiException("Missing the required parameter 'language' when calling getCurrencies(Async)");
        }
        

        okhttp3.Call localVarCall = getCurrenciesCall(language, _callback);
        return localVarCall;

    }

    /**
     * Get currencies
     * This method returns all the currencies available, you can indicate a locale to do the search
     * @param language List of currencies (required)
     * @return List&lt;PlatformCurrency&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Validation exception </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Generic exception </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> A summary of currencies </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public List<PlatformCurrency> getCurrencies(String language) throws ApiException {
        ApiResponse<List<PlatformCurrency>> localVarResp = getCurrenciesWithHttpInfo(language);
        return localVarResp.getData();
    }

    /**
     * Get currencies
     * This method returns all the currencies available, you can indicate a locale to do the search
     * @param language List of currencies (required)
     * @return ApiResponse&lt;List&lt;PlatformCurrency&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Validation exception </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Generic exception </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> A summary of currencies </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<PlatformCurrency>> getCurrenciesWithHttpInfo(String language) throws ApiException {
        okhttp3.Call localVarCall = getCurrenciesValidateBeforeCall(language, null);
        Type localVarReturnType = new TypeToken<List<PlatformCurrency>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get currencies (asynchronously)
     * This method returns all the currencies available, you can indicate a locale to do the search
     * @param language List of currencies (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Validation exception </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Generic exception </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> A summary of currencies </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCurrenciesAsync(String language, final ApiCallback<List<PlatformCurrency>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCurrenciesValidateBeforeCall(language, _callback);
        Type localVarReturnType = new TypeToken<List<PlatformCurrency>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getLanguages
     * @param language List of languages (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A summary of languages </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Validation exception </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Generic exception </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getLanguagesCall(String language, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/rest/platform/utils/language";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (language != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("language", language));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getLanguagesValidateBeforeCall(String language, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'language' is set
        if (language == null) {
            throw new ApiException("Missing the required parameter 'language' when calling getLanguages(Async)");
        }
        

        okhttp3.Call localVarCall = getLanguagesCall(language, _callback);
        return localVarCall;

    }

    /**
     * Get languages
     * This method returns all the languages available, you can indicate a locale to do the search
     * @param language List of languages (required)
     * @return List&lt;PlatformLanguage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A summary of languages </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Validation exception </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Generic exception </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public List<PlatformLanguage> getLanguages(String language) throws ApiException {
        ApiResponse<List<PlatformLanguage>> localVarResp = getLanguagesWithHttpInfo(language);
        return localVarResp.getData();
    }

    /**
     * Get languages
     * This method returns all the languages available, you can indicate a locale to do the search
     * @param language List of languages (required)
     * @return ApiResponse&lt;List&lt;PlatformLanguage&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A summary of languages </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Validation exception </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Generic exception </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<PlatformLanguage>> getLanguagesWithHttpInfo(String language) throws ApiException {
        okhttp3.Call localVarCall = getLanguagesValidateBeforeCall(language, null);
        Type localVarReturnType = new TypeToken<List<PlatformLanguage>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get languages (asynchronously)
     * This method returns all the languages available, you can indicate a locale to do the search
     * @param language List of languages (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A summary of languages </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Validation exception </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Generic exception </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getLanguagesAsync(String language, final ApiCallback<List<PlatformLanguage>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getLanguagesValidateBeforeCall(language, _callback);
        Type localVarReturnType = new TypeToken<List<PlatformLanguage>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getRoles
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Validation exception </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Generic exception </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> A summary of roles  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRolesCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/rest/platform/utils/roles";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getRolesValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getRolesCall(_callback);
        return localVarCall;

    }

    /**
     * Get roles
     * This method returns all the roles available, you can indicate a locale to do the search
     * @return List&lt;PlatformRole&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Validation exception </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Generic exception </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> A summary of roles  </td><td>  -  </td></tr>
     </table>
     */
    public List<PlatformRole> getRoles() throws ApiException {
        ApiResponse<List<PlatformRole>> localVarResp = getRolesWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get roles
     * This method returns all the roles available, you can indicate a locale to do the search
     * @return ApiResponse&lt;List&lt;PlatformRole&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Validation exception </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Generic exception </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> A summary of roles  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<PlatformRole>> getRolesWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getRolesValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<PlatformRole>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get roles (asynchronously)
     * This method returns all the roles available, you can indicate a locale to do the search
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Validation exception </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Generic exception </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> A summary of roles  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRolesAsync(final ApiCallback<List<PlatformRole>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getRolesValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<PlatformRole>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getZones
     * @param language List of zones (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Validation exception </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Generic exception </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> A summary of zones </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getZonesCall(String language, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/rest/platform/utils/zone";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (language != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("language", language));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getZonesValidateBeforeCall(String language, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'language' is set
        if (language == null) {
            throw new ApiException("Missing the required parameter 'language' when calling getZones(Async)");
        }
        

        okhttp3.Call localVarCall = getZonesCall(language, _callback);
        return localVarCall;

    }

    /**
     * Get zones
     * This method returns all the zones available, you can indicate a locale to do the search
     * @param language List of zones (required)
     * @return List&lt;PlatformZone&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Validation exception </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Generic exception </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> A summary of zones </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public List<PlatformZone> getZones(String language) throws ApiException {
        ApiResponse<List<PlatformZone>> localVarResp = getZonesWithHttpInfo(language);
        return localVarResp.getData();
    }

    /**
     * Get zones
     * This method returns all the zones available, you can indicate a locale to do the search
     * @param language List of zones (required)
     * @return ApiResponse&lt;List&lt;PlatformZone&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Validation exception </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Generic exception </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> A summary of zones </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<PlatformZone>> getZonesWithHttpInfo(String language) throws ApiException {
        okhttp3.Call localVarCall = getZonesValidateBeforeCall(language, null);
        Type localVarReturnType = new TypeToken<List<PlatformZone>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get zones (asynchronously)
     * This method returns all the zones available, you can indicate a locale to do the search
     * @param language List of zones (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Validation exception </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Generic exception </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> A summary of zones </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getZonesAsync(String language, final ApiCallback<List<PlatformZone>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getZonesValidateBeforeCall(language, _callback);
        Type localVarReturnType = new TypeToken<List<PlatformZone>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
