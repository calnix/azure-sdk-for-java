/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.trafficmanager.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Class representing a Traffic Manager endpoint.
 */
@JsonFlatten
public class EndpointInner {
    /**
     * Gets or sets the ID of the Traffic Manager endpoint.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Gets or sets the name of the Traffic Manager endpoint.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Gets or sets the endpoint type of the Traffic Manager endpoint.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Gets or sets the Azure Resource URI of the of the endpoint.  Not
     * applicable to endpoints of type 'ExternalEndpoints'.
     */
    @JsonProperty(value = "properties.targetResourceId")
    private String targetResourceId;

    /**
     * Gets or sets the fully-qualified DNS name of the endpoint.  Traffic
     * Manager returns this value in DNS responses to direct traffic to this
     * endpoint.
     */
    @JsonProperty(value = "properties.target")
    private String target;

    /**
     * Gets or sets the status of the endpoint..  If the endpoint is Enabled,
     * it is probed for endpoint health and is included in the traffic routing
     * method.  Possible values are 'Enabled' and 'Disabled'.
     */
    @JsonProperty(value = "properties.endpointStatus")
    private String endpointStatus;

    /**
     * Gets or sets the weight of this endpoint when using the 'Weighted'
     * traffic routing method. Possible values are from 1 to 1000.
     */
    @JsonProperty(value = "properties.weight")
    private Long weight;

    /**
     * Gets or sets the priority of this endpoint when using the ‘Priority’
     * traffic routing method. Possible values are from 1 to 1000, lower values
     * represent higher priority. This is an optional parameter.  If specified,
     * it must be specified on all endpoints, and no two endpoints can share
     * the same priority value.
     */
    @JsonProperty(value = "properties.priority")
    private Long priority;

    /**
     * Specifies the location of the external or nested endpoints when using
     * the ‘Performance’ traffic routing method.
     */
    @JsonProperty(value = "properties.endpointLocation")
    private String endpointLocation;

    /**
     * Gets or sets the monitoring status of the endpoint.
     */
    @JsonProperty(value = "properties.endpointMonitorStatus")
    private String endpointMonitorStatus;

    /**
     * Gets or sets the minimum number of endpoints that must be available in
     * the child profile in order for the parent profile to be considered
     * available. Only applicable to endpoint of type 'NestedEndpoints'.
     */
    @JsonProperty(value = "properties.minChildEndpoints")
    private Long minChildEndpoints;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the targetResourceId value.
     *
     * @return the targetResourceId value
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the targetResourceId value.
     *
     * @param targetResourceId the targetResourceId value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * Get the target value.
     *
     * @return the target value
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target value.
     *
     * @param target the target value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the endpointStatus value.
     *
     * @return the endpointStatus value
     */
    public String endpointStatus() {
        return this.endpointStatus;
    }

    /**
     * Set the endpointStatus value.
     *
     * @param endpointStatus the endpointStatus value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withEndpointStatus(String endpointStatus) {
        this.endpointStatus = endpointStatus;
        return this;
    }

    /**
     * Get the weight value.
     *
     * @return the weight value
     */
    public Long weight() {
        return this.weight;
    }

    /**
     * Set the weight value.
     *
     * @param weight the weight value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withWeight(Long weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Get the priority value.
     *
     * @return the priority value
     */
    public Long priority() {
        return this.priority;
    }

    /**
     * Set the priority value.
     *
     * @param priority the priority value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withPriority(Long priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the endpointLocation value.
     *
     * @return the endpointLocation value
     */
    public String endpointLocation() {
        return this.endpointLocation;
    }

    /**
     * Set the endpointLocation value.
     *
     * @param endpointLocation the endpointLocation value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withEndpointLocation(String endpointLocation) {
        this.endpointLocation = endpointLocation;
        return this;
    }

    /**
     * Get the endpointMonitorStatus value.
     *
     * @return the endpointMonitorStatus value
     */
    public String endpointMonitorStatus() {
        return this.endpointMonitorStatus;
    }

    /**
     * Set the endpointMonitorStatus value.
     *
     * @param endpointMonitorStatus the endpointMonitorStatus value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withEndpointMonitorStatus(String endpointMonitorStatus) {
        this.endpointMonitorStatus = endpointMonitorStatus;
        return this;
    }

    /**
     * Get the minChildEndpoints value.
     *
     * @return the minChildEndpoints value
     */
    public Long minChildEndpoints() {
        return this.minChildEndpoints;
    }

    /**
     * Set the minChildEndpoints value.
     *
     * @param minChildEndpoints the minChildEndpoints value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withMinChildEndpoints(Long minChildEndpoints) {
        this.minChildEndpoints = minChildEndpoints;
        return this;
    }

}
