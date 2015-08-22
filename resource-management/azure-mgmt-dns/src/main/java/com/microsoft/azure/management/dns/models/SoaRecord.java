/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.dns.models;

/**
* An SOA record.
*/
public class SoaRecord {
    private String email;
    
    /**
    * Required. Gets or sets the email for this record.
    * @return The Email value.
    */
    public String getEmail() {
        return this.email;
    }
    
    /**
    * Required. Gets or sets the email for this record.
    * @param emailValue The Email value.
    */
    public void setEmail(final String emailValue) {
        this.email = emailValue;
    }
    
    private long expireTime;
    
    /**
    * Required. Gets or sets the expire time for this record.
    * @return The ExpireTime value.
    */
    public long getExpireTime() {
        return this.expireTime;
    }
    
    /**
    * Required. Gets or sets the expire time for this record.
    * @param expireTimeValue The ExpireTime value.
    */
    public void setExpireTime(final long expireTimeValue) {
        this.expireTime = expireTimeValue;
    }
    
    private String host;
    
    /**
    * Required. Gets or sets the domain name of the authoritative name server,
    * without a temrinating dot.
    * @return The Host value.
    */
    public String getHost() {
        return this.host;
    }
    
    /**
    * Required. Gets or sets the domain name of the authoritative name server,
    * without a temrinating dot.
    * @param hostValue The Host value.
    */
    public void setHost(final String hostValue) {
        this.host = hostValue;
    }
    
    private long minimumTtl;
    
    /**
    * Required. Gets or sets the minimum TTL value for this record.
    * @return The MinimumTtl value.
    */
    public long getMinimumTtl() {
        return this.minimumTtl;
    }
    
    /**
    * Required. Gets or sets the minimum TTL value for this record.
    * @param minimumTtlValue The MinimumTtl value.
    */
    public void setMinimumTtl(final long minimumTtlValue) {
        this.minimumTtl = minimumTtlValue;
    }
    
    private long refreshTime;
    
    /**
    * Required. Gets or sets the refresh value for this record.
    * @return The RefreshTime value.
    */
    public long getRefreshTime() {
        return this.refreshTime;
    }
    
    /**
    * Required. Gets or sets the refresh value for this record.
    * @param refreshTimeValue The RefreshTime value.
    */
    public void setRefreshTime(final long refreshTimeValue) {
        this.refreshTime = refreshTimeValue;
    }
    
    private long retryTime;
    
    /**
    * Required. Gets or sets the retry time for this record.
    * @return The RetryTime value.
    */
    public long getRetryTime() {
        return this.retryTime;
    }
    
    /**
    * Required. Gets or sets the retry time for this record.
    * @param retryTimeValue The RetryTime value.
    */
    public void setRetryTime(final long retryTimeValue) {
        this.retryTime = retryTimeValue;
    }
    
    private long serialNumber;
    
    /**
    * Required. Gets or sets the serial number for this record.
    * @return The SerialNumber value.
    */
    public long getSerialNumber() {
        return this.serialNumber;
    }
    
    /**
    * Required. Gets or sets the serial number for this record.
    * @param serialNumberValue The SerialNumber value.
    */
    public void setSerialNumber(final long serialNumberValue) {
        this.serialNumber = serialNumberValue;
    }
}