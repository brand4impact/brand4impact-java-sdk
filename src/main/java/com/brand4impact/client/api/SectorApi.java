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


import com.brand4impact.client.model.PlatformSector;
import com.brand4impact.client.model.PlatformSectorItemWrapper;
import com.brand4impact.client.model.RestError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SectorApi {
    private ApiClient localVarApiClient;

    public SectorApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SectorApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getSector
     * @param token The unique token for the sector. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Validation exception </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Generic exception </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> The name of the sector </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSectorCall(String token, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/rest/platform/sector/{token}"
            .replaceAll("\\{" + "token" + "\\}", localVarApiClient.escapeString(token.toString()));

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
    private okhttp3.Call getSectorValidateBeforeCall(String token, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling getSector(Async)");
        }
        

        okhttp3.Call localVarCall = getSectorCall(token, _callback);
        return localVarCall;

    }

    /**
     * Get a single sector
     * This method returns a specific sector and represents principals industries  
     * @param token The unique token for the sector. (required)
     * @return PlatformSector
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Validation exception </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Generic exception </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> The name of the sector </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public PlatformSector getSector(String token) throws ApiException {
        ApiResponse<PlatformSector> localVarResp = getSectorWithHttpInfo(token);
        return localVarResp.getData();
    }

    /**
     * Get a single sector
     * This method returns a specific sector and represents principals industries  
     * @param token The unique token for the sector. (required)
     * @return ApiResponse&lt;PlatformSector&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Validation exception </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Generic exception </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> The name of the sector </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PlatformSector> getSectorWithHttpInfo(String token) throws ApiException {
        okhttp3.Call localVarCall = getSectorValidateBeforeCall(token, null);
        Type localVarReturnType = new TypeToken<PlatformSector>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a single sector (asynchronously)
     * This method returns a specific sector and represents principals industries  
     * @param token The unique token for the sector. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Validation exception </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Generic exception </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> The name of the sector </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSectorAsync(String token, final ApiCallback<PlatformSector> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSectorValidateBeforeCall(token, _callback);
        Type localVarReturnType = new TypeToken<PlatformSector>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSectors
     * @param page The number of the page. Possible values: 0 to unlimited (optional)
     * @param size The number of items inside a page. Possible values: 1 to 100 (optional)
     * @param sort The order direction for sorted results. Possible values: ASC or DESC (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Validation exception </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Generic exception </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> An array of sectors </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSectorsCall(Integer page, Integer size, String sort, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/rest/platform/sector";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (size != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("size", size));
        }

        if (sort != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort", sort));
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
    private okhttp3.Call getSectorsValidateBeforeCall(Integer page, Integer size, String sort, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getSectorsCall(page, size, sort, _callback);
        return localVarCall;

    }

    /**
     * Get a set of sectors
     * This method returns all the sectors according the filters and represents principals industries    [![pagination](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/brackets.png &#39;pagination&#39;)](http://localhost:8080/backend/blog/home#pagination)
     * @param page The number of the page. Possible values: 0 to unlimited (optional)
     * @param size The number of items inside a page. Possible values: 1 to 100 (optional)
     * @param sort The order direction for sorted results. Possible values: ASC or DESC (optional)
     * @return PlatformSectorItemWrapper
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Validation exception </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Generic exception </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> An array of sectors </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public PlatformSectorItemWrapper getSectors(Integer page, Integer size, String sort) throws ApiException {
        ApiResponse<PlatformSectorItemWrapper> localVarResp = getSectorsWithHttpInfo(page, size, sort);
        return localVarResp.getData();
    }

    /**
     * Get a set of sectors
     * This method returns all the sectors according the filters and represents principals industries    [![pagination](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/brackets.png &#39;pagination&#39;)](http://localhost:8080/backend/blog/home#pagination)
     * @param page The number of the page. Possible values: 0 to unlimited (optional)
     * @param size The number of items inside a page. Possible values: 1 to 100 (optional)
     * @param sort The order direction for sorted results. Possible values: ASC or DESC (optional)
     * @return ApiResponse&lt;PlatformSectorItemWrapper&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Validation exception </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Generic exception </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> An array of sectors </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PlatformSectorItemWrapper> getSectorsWithHttpInfo(Integer page, Integer size, String sort) throws ApiException {
        okhttp3.Call localVarCall = getSectorsValidateBeforeCall(page, size, sort, null);
        Type localVarReturnType = new TypeToken<PlatformSectorItemWrapper>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a set of sectors (asynchronously)
     * This method returns all the sectors according the filters and represents principals industries    [![pagination](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/brackets.png &#39;pagination&#39;)](http://localhost:8080/backend/blog/home#pagination)
     * @param page The number of the page. Possible values: 0 to unlimited (optional)
     * @param size The number of items inside a page. Possible values: 1 to 100 (optional)
     * @param sort The order direction for sorted results. Possible values: ASC or DESC (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Validation exception </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Generic exception </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> An array of sectors </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSectorsAsync(Integer page, Integer size, String sort, final ApiCallback<PlatformSectorItemWrapper> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSectorsValidateBeforeCall(page, size, sort, _callback);
        Type localVarReturnType = new TypeToken<PlatformSectorItemWrapper>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
