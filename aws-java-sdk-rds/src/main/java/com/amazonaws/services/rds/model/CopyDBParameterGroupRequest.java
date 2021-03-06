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
package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#copyDBParameterGroup(CopyDBParameterGroupRequest) CopyDBParameterGroup operation}.
 * <p>
 * Copies the specified DBParameterGroup.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#copyDBParameterGroup(CopyDBParameterGroupRequest)
 */
public class CopyDBParameterGroupRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The identifier or ARN for the source DB Parameter Group.
     * <p>Constraints: <ul> <li>Must specify a valid DB Parameter Group.</li>
     * <li>If the source DB Parameter Group is in the same region as the
     * copy, specify a valid DB Parameter Group identifier, or a valid
     * ARN.</li> <li>If the source DB Parameter Group is in a different
     * region than the copy, specify a valid DB parameter group ARN.</li>
     * </ul> <p>Example: <code>my-db-param-group</code> <p>Example:
     * <code>arn:aws:rds:us-west-2:123456789012:pg:special-parameters</code>
     */
    private String sourceDBParameterGroupIdentifier;

    /**
     * The identifier for the copied DB Parameter Group. <p>Constraints: <ul>
     * <li>Cannot be null, empty, or blank</li> <li>Must contain from 1 to
     * 255 alphanumeric characters or hyphens</li> <li>First character must
     * be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul> <p>Example:
     * <code>my-db-parameter-group</code>
     */
    private String targetDBParameterGroupIdentifier;

    /**
     * The description for the copied DB Parameter Group.
     */
    private String targetDBParameterGroupDescription;

    /**
     * A list of tags.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The identifier or ARN for the source DB Parameter Group.
     * <p>Constraints: <ul> <li>Must specify a valid DB Parameter Group.</li>
     * <li>If the source DB Parameter Group is in the same region as the
     * copy, specify a valid DB Parameter Group identifier, or a valid
     * ARN.</li> <li>If the source DB Parameter Group is in a different
     * region than the copy, specify a valid DB parameter group ARN.</li>
     * </ul> <p>Example: <code>my-db-param-group</code> <p>Example:
     * <code>arn:aws:rds:us-west-2:123456789012:pg:special-parameters</code>
     *
     * @return The identifier or ARN for the source DB Parameter Group.
     *         <p>Constraints: <ul> <li>Must specify a valid DB Parameter Group.</li>
     *         <li>If the source DB Parameter Group is in the same region as the
     *         copy, specify a valid DB Parameter Group identifier, or a valid
     *         ARN.</li> <li>If the source DB Parameter Group is in a different
     *         region than the copy, specify a valid DB parameter group ARN.</li>
     *         </ul> <p>Example: <code>my-db-param-group</code> <p>Example:
     *         <code>arn:aws:rds:us-west-2:123456789012:pg:special-parameters</code>
     */
    public String getSourceDBParameterGroupIdentifier() {
        return sourceDBParameterGroupIdentifier;
    }
    
    /**
     * The identifier or ARN for the source DB Parameter Group.
     * <p>Constraints: <ul> <li>Must specify a valid DB Parameter Group.</li>
     * <li>If the source DB Parameter Group is in the same region as the
     * copy, specify a valid DB Parameter Group identifier, or a valid
     * ARN.</li> <li>If the source DB Parameter Group is in a different
     * region than the copy, specify a valid DB parameter group ARN.</li>
     * </ul> <p>Example: <code>my-db-param-group</code> <p>Example:
     * <code>arn:aws:rds:us-west-2:123456789012:pg:special-parameters</code>
     *
     * @param sourceDBParameterGroupIdentifier The identifier or ARN for the source DB Parameter Group.
     *         <p>Constraints: <ul> <li>Must specify a valid DB Parameter Group.</li>
     *         <li>If the source DB Parameter Group is in the same region as the
     *         copy, specify a valid DB Parameter Group identifier, or a valid
     *         ARN.</li> <li>If the source DB Parameter Group is in a different
     *         region than the copy, specify a valid DB parameter group ARN.</li>
     *         </ul> <p>Example: <code>my-db-param-group</code> <p>Example:
     *         <code>arn:aws:rds:us-west-2:123456789012:pg:special-parameters</code>
     */
    public void setSourceDBParameterGroupIdentifier(String sourceDBParameterGroupIdentifier) {
        this.sourceDBParameterGroupIdentifier = sourceDBParameterGroupIdentifier;
    }
    
    /**
     * The identifier or ARN for the source DB Parameter Group.
     * <p>Constraints: <ul> <li>Must specify a valid DB Parameter Group.</li>
     * <li>If the source DB Parameter Group is in the same region as the
     * copy, specify a valid DB Parameter Group identifier, or a valid
     * ARN.</li> <li>If the source DB Parameter Group is in a different
     * region than the copy, specify a valid DB parameter group ARN.</li>
     * </ul> <p>Example: <code>my-db-param-group</code> <p>Example:
     * <code>arn:aws:rds:us-west-2:123456789012:pg:special-parameters</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceDBParameterGroupIdentifier The identifier or ARN for the source DB Parameter Group.
     *         <p>Constraints: <ul> <li>Must specify a valid DB Parameter Group.</li>
     *         <li>If the source DB Parameter Group is in the same region as the
     *         copy, specify a valid DB Parameter Group identifier, or a valid
     *         ARN.</li> <li>If the source DB Parameter Group is in a different
     *         region than the copy, specify a valid DB parameter group ARN.</li>
     *         </ul> <p>Example: <code>my-db-param-group</code> <p>Example:
     *         <code>arn:aws:rds:us-west-2:123456789012:pg:special-parameters</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CopyDBParameterGroupRequest withSourceDBParameterGroupIdentifier(String sourceDBParameterGroupIdentifier) {
        this.sourceDBParameterGroupIdentifier = sourceDBParameterGroupIdentifier;
        return this;
    }

    /**
     * The identifier for the copied DB Parameter Group. <p>Constraints: <ul>
     * <li>Cannot be null, empty, or blank</li> <li>Must contain from 1 to
     * 255 alphanumeric characters or hyphens</li> <li>First character must
     * be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul> <p>Example:
     * <code>my-db-parameter-group</code>
     *
     * @return The identifier for the copied DB Parameter Group. <p>Constraints: <ul>
     *         <li>Cannot be null, empty, or blank</li> <li>Must contain from 1 to
     *         255 alphanumeric characters or hyphens</li> <li>First character must
     *         be a letter</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens</li> </ul> <p>Example:
     *         <code>my-db-parameter-group</code>
     */
    public String getTargetDBParameterGroupIdentifier() {
        return targetDBParameterGroupIdentifier;
    }
    
    /**
     * The identifier for the copied DB Parameter Group. <p>Constraints: <ul>
     * <li>Cannot be null, empty, or blank</li> <li>Must contain from 1 to
     * 255 alphanumeric characters or hyphens</li> <li>First character must
     * be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul> <p>Example:
     * <code>my-db-parameter-group</code>
     *
     * @param targetDBParameterGroupIdentifier The identifier for the copied DB Parameter Group. <p>Constraints: <ul>
     *         <li>Cannot be null, empty, or blank</li> <li>Must contain from 1 to
     *         255 alphanumeric characters or hyphens</li> <li>First character must
     *         be a letter</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens</li> </ul> <p>Example:
     *         <code>my-db-parameter-group</code>
     */
    public void setTargetDBParameterGroupIdentifier(String targetDBParameterGroupIdentifier) {
        this.targetDBParameterGroupIdentifier = targetDBParameterGroupIdentifier;
    }
    
    /**
     * The identifier for the copied DB Parameter Group. <p>Constraints: <ul>
     * <li>Cannot be null, empty, or blank</li> <li>Must contain from 1 to
     * 255 alphanumeric characters or hyphens</li> <li>First character must
     * be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul> <p>Example:
     * <code>my-db-parameter-group</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targetDBParameterGroupIdentifier The identifier for the copied DB Parameter Group. <p>Constraints: <ul>
     *         <li>Cannot be null, empty, or blank</li> <li>Must contain from 1 to
     *         255 alphanumeric characters or hyphens</li> <li>First character must
     *         be a letter</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens</li> </ul> <p>Example:
     *         <code>my-db-parameter-group</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CopyDBParameterGroupRequest withTargetDBParameterGroupIdentifier(String targetDBParameterGroupIdentifier) {
        this.targetDBParameterGroupIdentifier = targetDBParameterGroupIdentifier;
        return this;
    }

    /**
     * The description for the copied DB Parameter Group.
     *
     * @return The description for the copied DB Parameter Group.
     */
    public String getTargetDBParameterGroupDescription() {
        return targetDBParameterGroupDescription;
    }
    
    /**
     * The description for the copied DB Parameter Group.
     *
     * @param targetDBParameterGroupDescription The description for the copied DB Parameter Group.
     */
    public void setTargetDBParameterGroupDescription(String targetDBParameterGroupDescription) {
        this.targetDBParameterGroupDescription = targetDBParameterGroupDescription;
    }
    
    /**
     * The description for the copied DB Parameter Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targetDBParameterGroupDescription The description for the copied DB Parameter Group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CopyDBParameterGroupRequest withTargetDBParameterGroupDescription(String targetDBParameterGroupDescription) {
        this.targetDBParameterGroupDescription = targetDBParameterGroupDescription;
        return this;
    }

    /**
     * A list of tags.
     *
     * @return A list of tags.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * A list of tags.
     *
     * @param tags A list of tags.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * A list of tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CopyDBParameterGroupRequest withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CopyDBParameterGroupRequest withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

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
        if (getSourceDBParameterGroupIdentifier() != null) sb.append("SourceDBParameterGroupIdentifier: " + getSourceDBParameterGroupIdentifier() + ",");
        if (getTargetDBParameterGroupIdentifier() != null) sb.append("TargetDBParameterGroupIdentifier: " + getTargetDBParameterGroupIdentifier() + ",");
        if (getTargetDBParameterGroupDescription() != null) sb.append("TargetDBParameterGroupDescription: " + getTargetDBParameterGroupDescription() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSourceDBParameterGroupIdentifier() == null) ? 0 : getSourceDBParameterGroupIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getTargetDBParameterGroupIdentifier() == null) ? 0 : getTargetDBParameterGroupIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getTargetDBParameterGroupDescription() == null) ? 0 : getTargetDBParameterGroupDescription().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CopyDBParameterGroupRequest == false) return false;
        CopyDBParameterGroupRequest other = (CopyDBParameterGroupRequest)obj;
        
        if (other.getSourceDBParameterGroupIdentifier() == null ^ this.getSourceDBParameterGroupIdentifier() == null) return false;
        if (other.getSourceDBParameterGroupIdentifier() != null && other.getSourceDBParameterGroupIdentifier().equals(this.getSourceDBParameterGroupIdentifier()) == false) return false; 
        if (other.getTargetDBParameterGroupIdentifier() == null ^ this.getTargetDBParameterGroupIdentifier() == null) return false;
        if (other.getTargetDBParameterGroupIdentifier() != null && other.getTargetDBParameterGroupIdentifier().equals(this.getTargetDBParameterGroupIdentifier()) == false) return false; 
        if (other.getTargetDBParameterGroupDescription() == null ^ this.getTargetDBParameterGroupDescription() == null) return false;
        if (other.getTargetDBParameterGroupDescription() != null && other.getTargetDBParameterGroupDescription().equals(this.getTargetDBParameterGroupDescription()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
}
    