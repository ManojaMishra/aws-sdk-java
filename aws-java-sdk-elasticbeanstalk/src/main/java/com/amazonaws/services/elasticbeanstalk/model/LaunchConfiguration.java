/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an Auto Scaling launch configuration.
 * </p>
 */
public class LaunchConfiguration implements Serializable {

    /**
     * The name of the launch configuration.
     */
    private String name;

    /**
     * Default constructor for a new LaunchConfiguration object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public LaunchConfiguration() {}
    
    /**
     * The name of the launch configuration.
     *
     * @return The name of the launch configuration.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the launch configuration.
     *
     * @param name The name of the launch configuration.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the launch configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of the launch configuration.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LaunchConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) sb.append("Name: " + getName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof LaunchConfiguration == false) return false;
        LaunchConfiguration other = (LaunchConfiguration)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        return true;
    }
    
}
    