/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.network.models;

import java.util.List;

/**
 * VpnClientConfiguration for P2S client.
 */
public class VpnClientConfiguration {
    /**
     * Gets or sets the reference of the Address space resource which
     * represents Address space for P2S VpnClient.
     */
    private AddressSpace vpnClientAddressPool;

    /**
     * VpnClientRootCertificate for Virtual network gateway.
     */
    private List<VpnClientRootCertificate> vpnClientRootCertificates;

    /**
     * VpnClientRevokedCertificate for Virtual network gateway.
     */
    private List<VpnClientRevokedCertificate> vpnClientRevokedCertificates;

    /**
     * Get the vpnClientAddressPool value.
     *
     * @return the vpnClientAddressPool value
     */
    public AddressSpace getVpnClientAddressPool() {
        return this.vpnClientAddressPool;
    }

    /**
     * Set the vpnClientAddressPool value.
     *
     * @param vpnClientAddressPool the vpnClientAddressPool value to set
     */
    public void setVpnClientAddressPool(AddressSpace vpnClientAddressPool) {
        this.vpnClientAddressPool = vpnClientAddressPool;
    }

    /**
     * Get the vpnClientRootCertificates value.
     *
     * @return the vpnClientRootCertificates value
     */
    public List<VpnClientRootCertificate> getVpnClientRootCertificates() {
        return this.vpnClientRootCertificates;
    }

    /**
     * Set the vpnClientRootCertificates value.
     *
     * @param vpnClientRootCertificates the vpnClientRootCertificates value to set
     */
    public void setVpnClientRootCertificates(List<VpnClientRootCertificate> vpnClientRootCertificates) {
        this.vpnClientRootCertificates = vpnClientRootCertificates;
    }

    /**
     * Get the vpnClientRevokedCertificates value.
     *
     * @return the vpnClientRevokedCertificates value
     */
    public List<VpnClientRevokedCertificate> getVpnClientRevokedCertificates() {
        return this.vpnClientRevokedCertificates;
    }

    /**
     * Set the vpnClientRevokedCertificates value.
     *
     * @param vpnClientRevokedCertificates the vpnClientRevokedCertificates value to set
     */
    public void setVpnClientRevokedCertificates(List<VpnClientRevokedCertificate> vpnClientRevokedCertificates) {
        this.vpnClientRevokedCertificates = vpnClientRevokedCertificates;
    }

}