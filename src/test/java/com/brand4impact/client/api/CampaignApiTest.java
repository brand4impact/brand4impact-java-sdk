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

import com.brand4impact.client.invoker.ApiException;
import java.io.File;
import com.brand4impact.client.model.PlatformCampaign;
import com.brand4impact.client.model.PlatformCampaignCreate;
import com.brand4impact.client.model.PlatformCampaignItemWrapper;
import com.brand4impact.client.model.PlatformCampaignUpdate;
import com.brand4impact.client.model.RestError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CampaignApi
 */
@Ignore
public class CampaignApiTest {

    private final CampaignApi api = new CampaignApi();

    
    /**
     * Create a new campaign
     *
     * This method creates a new campaign within a Company  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCampaignTest() throws ApiException {
        PlatformCampaignCreate campaign = null;
        File primaryImage = null;
        File secondaryImage = null;
                PlatformCampaign response = api.createCampaign(campaign, primaryImage, secondaryImage);
        // TODO: test validations
    }
    
    /**
     * Get a single campaign
     *
     * This method returns a specific campaign within your tenant  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCampaignTest() throws ApiException {
        String token = null;
                PlatformCampaign response = api.getCampaign(token);
        // TODO: test validations
    }
    
    /**
     * Get a set of campaigns
     *
     * This method returns a set of campaigns within your tenant    [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)[![pagination](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/brackets.png &#39;pagination&#39;)](http://localhost:8080/backend/blog/home#pagination)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCampaignsTest() throws ApiException {
        String titleFilter = null;
        Integer page = null;
        Integer size = null;
        String sort = null;
                PlatformCampaignItemWrapper response = api.getCampaigns(titleFilter, page, size, sort);
        // TODO: test validations
    }
    
    /**
     * Switch campaign status
     *
     * This method switch the status of a specific campaign  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void switchCampaignTest() throws ApiException {
        String token = null;
                PlatformCampaign response = api.switchCampaign(token);
        // TODO: test validations
    }
    
    /**
     * Update a campaign
     *
     * This method updates an existing campaign  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCampaignTest() throws ApiException {
        String token = null;
        PlatformCampaignUpdate campaign = null;
        File primaryImage = null;
        File secondaryImage = null;
                PlatformCampaign response = api.updateCampaign(token, campaign, primaryImage, secondaryImage);
        // TODO: test validations
    }
    
}
