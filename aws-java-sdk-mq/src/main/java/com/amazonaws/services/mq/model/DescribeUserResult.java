/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeUserResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** Required. The unique ID that Amazon MQ generates for the broker. */
    private String brokerId;
    /** Enables access to the the ActiveMQ Web Console for the ActiveMQ user. */
    private Boolean consoleAccess;
    /**
     * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric
     * characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     */
    private java.util.List<String> groups;
    /** The status of the changes pending for the ActiveMQ user. */
    private UserPendingChanges pending;
    /**
     * Required. The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes,
     * periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     */
    private String username;

    /**
     * Required. The unique ID that Amazon MQ generates for the broker.
     * 
     * @param brokerId
     *        Required. The unique ID that Amazon MQ generates for the broker.
     */

    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    /**
     * Required. The unique ID that Amazon MQ generates for the broker.
     * 
     * @return Required. The unique ID that Amazon MQ generates for the broker.
     */

    public String getBrokerId() {
        return this.brokerId;
    }

    /**
     * Required. The unique ID that Amazon MQ generates for the broker.
     * 
     * @param brokerId
     *        Required. The unique ID that Amazon MQ generates for the broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withBrokerId(String brokerId) {
        setBrokerId(brokerId);
        return this;
    }

    /**
     * Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
     * 
     * @param consoleAccess
     *        Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
     */

    public void setConsoleAccess(Boolean consoleAccess) {
        this.consoleAccess = consoleAccess;
    }

    /**
     * Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
     * 
     * @return Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
     */

    public Boolean getConsoleAccess() {
        return this.consoleAccess;
    }

    /**
     * Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
     * 
     * @param consoleAccess
     *        Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withConsoleAccess(Boolean consoleAccess) {
        setConsoleAccess(consoleAccess);
        return this;
    }

    /**
     * Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
     * 
     * @return Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
     */

    public Boolean isConsoleAccess() {
        return this.consoleAccess;
    }

    /**
     * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric
     * characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * 
     * @return The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only
     *         alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100
     *         characters long.
     */

    public java.util.List<String> getGroups() {
        return groups;
    }

    /**
     * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric
     * characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * 
     * @param groups
     *        The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only
     *        alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100
     *        characters long.
     */

    public void setGroups(java.util.Collection<String> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<String>(groups);
    }

    /**
     * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric
     * characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only
     *        alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100
     *        characters long.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withGroups(String... groups) {
        if (this.groups == null) {
            setGroups(new java.util.ArrayList<String>(groups.length));
        }
        for (String ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric
     * characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * 
     * @param groups
     *        The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only
     *        alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100
     *        characters long.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withGroups(java.util.Collection<String> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * The status of the changes pending for the ActiveMQ user.
     * 
     * @param pending
     *        The status of the changes pending for the ActiveMQ user.
     */

    public void setPending(UserPendingChanges pending) {
        this.pending = pending;
    }

    /**
     * The status of the changes pending for the ActiveMQ user.
     * 
     * @return The status of the changes pending for the ActiveMQ user.
     */

    public UserPendingChanges getPending() {
        return this.pending;
    }

    /**
     * The status of the changes pending for the ActiveMQ user.
     * 
     * @param pending
     *        The status of the changes pending for the ActiveMQ user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withPending(UserPendingChanges pending) {
        setPending(pending);
        return this;
    }

    /**
     * Required. The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes,
     * periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * 
     * @param username
     *        Required. The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes,
     *        periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Required. The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes,
     * periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * 
     * @return Required. The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes,
     *         periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * Required. The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes,
     * periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * 
     * @param username
     *        Required. The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes,
     *        periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBrokerId() != null)
            sb.append("BrokerId: ").append(getBrokerId()).append(",");
        if (getConsoleAccess() != null)
            sb.append("ConsoleAccess: ").append(getConsoleAccess()).append(",");
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups()).append(",");
        if (getPending() != null)
            sb.append("Pending: ").append(getPending()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeUserResult == false)
            return false;
        DescribeUserResult other = (DescribeUserResult) obj;
        if (other.getBrokerId() == null ^ this.getBrokerId() == null)
            return false;
        if (other.getBrokerId() != null && other.getBrokerId().equals(this.getBrokerId()) == false)
            return false;
        if (other.getConsoleAccess() == null ^ this.getConsoleAccess() == null)
            return false;
        if (other.getConsoleAccess() != null && other.getConsoleAccess().equals(this.getConsoleAccess()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        if (other.getPending() == null ^ this.getPending() == null)
            return false;
        if (other.getPending() != null && other.getPending().equals(this.getPending()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBrokerId() == null) ? 0 : getBrokerId().hashCode());
        hashCode = prime * hashCode + ((getConsoleAccess() == null) ? 0 : getConsoleAccess().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getPending() == null) ? 0 : getPending().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return hashCode;
    }

    @Override
    public DescribeUserResult clone() {
        try {
            return (DescribeUserResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
