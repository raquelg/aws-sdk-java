/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents the Transport Layer Security (TLS) properties for a listener.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/VirtualGatewayListenerTls" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VirtualGatewayListenerTls implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that represents a Transport Layer Security (TLS) certificate.
     * </p>
     */
    private VirtualGatewayListenerTlsCertificate certificate;
    /**
     * <p>
     * Specify one of the following modes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b/>STRICT – Listener only accepts connections with TLS enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b/>PERMISSIVE – Listener accepts connections with or without TLS enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b/>DISABLED – Listener only accepts connections without TLS.
     * </p>
     * </li>
     * </ul>
     */
    private String mode;

    /**
     * <p>
     * An object that represents a Transport Layer Security (TLS) certificate.
     * </p>
     * 
     * @param certificate
     *        An object that represents a Transport Layer Security (TLS) certificate.
     */

    public void setCertificate(VirtualGatewayListenerTlsCertificate certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * An object that represents a Transport Layer Security (TLS) certificate.
     * </p>
     * 
     * @return An object that represents a Transport Layer Security (TLS) certificate.
     */

    public VirtualGatewayListenerTlsCertificate getCertificate() {
        return this.certificate;
    }

    /**
     * <p>
     * An object that represents a Transport Layer Security (TLS) certificate.
     * </p>
     * 
     * @param certificate
     *        An object that represents a Transport Layer Security (TLS) certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualGatewayListenerTls withCertificate(VirtualGatewayListenerTlsCertificate certificate) {
        setCertificate(certificate);
        return this;
    }

    /**
     * <p>
     * Specify one of the following modes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b/>STRICT – Listener only accepts connections with TLS enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b/>PERMISSIVE – Listener accepts connections with or without TLS enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b/>DISABLED – Listener only accepts connections without TLS.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mode
     *        Specify one of the following modes.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b/>STRICT – Listener only accepts connections with TLS enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b/>PERMISSIVE – Listener accepts connections with or without TLS enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b/>DISABLED – Listener only accepts connections without TLS.
     *        </p>
     *        </li>
     * @see VirtualGatewayListenerTlsMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * Specify one of the following modes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b/>STRICT – Listener only accepts connections with TLS enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b/>PERMISSIVE – Listener accepts connections with or without TLS enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b/>DISABLED – Listener only accepts connections without TLS.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specify one of the following modes.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b/>STRICT – Listener only accepts connections with TLS enabled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b/>PERMISSIVE – Listener accepts connections with or without TLS enabled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b/>DISABLED – Listener only accepts connections without TLS.
     *         </p>
     *         </li>
     * @see VirtualGatewayListenerTlsMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * Specify one of the following modes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b/>STRICT – Listener only accepts connections with TLS enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b/>PERMISSIVE – Listener accepts connections with or without TLS enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b/>DISABLED – Listener only accepts connections without TLS.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mode
     *        Specify one of the following modes.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b/>STRICT – Listener only accepts connections with TLS enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b/>PERMISSIVE – Listener accepts connections with or without TLS enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b/>DISABLED – Listener only accepts connections without TLS.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VirtualGatewayListenerTlsMode
     */

    public VirtualGatewayListenerTls withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * Specify one of the following modes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b/>STRICT – Listener only accepts connections with TLS enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b/>PERMISSIVE – Listener accepts connections with or without TLS enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b/>DISABLED – Listener only accepts connections without TLS.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mode
     *        Specify one of the following modes.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b/>STRICT – Listener only accepts connections with TLS enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b/>PERMISSIVE – Listener accepts connections with or without TLS enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b/>DISABLED – Listener only accepts connections without TLS.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VirtualGatewayListenerTlsMode
     */

    public VirtualGatewayListenerTls withMode(VirtualGatewayListenerTlsMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCertificate() != null)
            sb.append("Certificate: ").append(getCertificate()).append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualGatewayListenerTls == false)
            return false;
        VirtualGatewayListenerTls other = (VirtualGatewayListenerTls) obj;
        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        return hashCode;
    }

    @Override
    public VirtualGatewayListenerTls clone() {
        try {
            return (VirtualGatewayListenerTls) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.VirtualGatewayListenerTlsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
