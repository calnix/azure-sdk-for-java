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

package com.microsoft.azure.management.websites.models;

/**
* A specific backup.
*/
public class BackupRequestEnvelope extends ResourceBase {
    private BackupRequest request;
    
    /**
    * Optional. TODO.
    * @return The Request value.
    */
    public BackupRequest getRequest() {
        return this.request;
    }
    
    /**
    * Optional. TODO.
    * @param requestValue The Request value.
    */
    public void setRequest(final BackupRequest requestValue) {
        this.request = requestValue;
    }
    
    /**
    * Initializes a new instance of the BackupRequestEnvelope class.
    *
    */
    public BackupRequestEnvelope() {
        super();
    }
    
    /**
    * Initializes a new instance of the BackupRequestEnvelope class with
    * required arguments.
    *
    * @param location Gets or sets the location of the resource.
    */
    public BackupRequestEnvelope(String location) {
        this();
        if (location == null) {
            throw new NullPointerException("location");
        }
        this.setLocation(location);
    }
}