/*
  Copyright (c) 2015, Alcatel-Lucent Inc
  All rights reserved.

  Redistribution and use in source and binary forms, with or without
  modification, are permitted provided that the following conditions are met:
      * Redistributions of source code must retain the above copyright
        notice, this list of conditions and the following disclaimer.
      * Redistributions in binary form must reproduce the above copyright
        notice, this list of conditions and the following disclaimer in the
        documentation and/or other materials provided with the distribution.
      * Neither the name of the copyright holder nor the names of its contributors
        may be used to endorse or promote products derived from this software without
        specific prior written permission.

  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
  DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY
  DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
  (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
  LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
  ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
  SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package net.nuagenetworks.vspk.v5_0;

import net.nuagenetworks.bambou.RestObject;
import net.nuagenetworks.bambou.annotation.RestEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


import net.nuagenetworks.vspk.v5_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "systemconfig", resourceName = "systemconfigs")
public class SystemConfig extends RestObject {

   private static final long serialVersionUID = 1L;

   
   
   public enum CsprootAuthenticationMethod { LDAP, LOCAL };
   
   public enum DomainTunnelType { DC_DEFAULT, GRE, VXLAN };
   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   
   public enum GroupKeyDefaultSEKPayloadEncryptionAlgorithm { RSA_1024 };
   
   public enum GroupKeyDefaultSEKPayloadSigningAlgorithm { SHA1withRSA, SHA224withRSA, SHA256withRSA, SHA384withRSA, SHA512withRSA };
   
   public enum GroupKeyDefaultSeedPayloadAuthenticationAlgorithm { HMAC_SHA1, HMAC_SHA256, HMAC_SHA512 };
   
   public enum GroupKeyDefaultSeedPayloadEncryptionAlgorithm { AES_128_CBC, AES_256_CBC, TRIPLE_DES_CBC };
   
   public enum GroupKeyDefaultSeedPayloadSigningAlgorithm { SHA1withRSA, SHA224withRSA, SHA256withRSA, SHA384withRSA, SHA512withRSA };
   
   public enum GroupKeyDefaultTrafficAuthenticationAlgorithm { HMAC_MD5, HMAC_SHA1, HMAC_SHA256, HMAC_SHA384, HMAC_SHA512 };
   
   public enum GroupKeyDefaultTrafficEncryptionAlgorithm { AES_128_CBC, AES_192_CBC, AES_256_CBC, TRIPLE_DES_CBC };
   
   public enum SystemAvatarType { BASE64, COMPUTEDURL, URL };

   
   @JsonProperty(value = "AARFlowStatsInterval")
   protected Long AARFlowStatsInterval;
   
   @JsonProperty(value = "AARProbeStatsInterval")
   protected Long AARProbeStatsInterval;
   
   @JsonProperty(value = "ACLAllowOrigin")
   protected String ACLAllowOrigin;
   
   @JsonProperty(value = "ADGatewayPurgeTime")
   protected Long ADGatewayPurgeTime;
   
   @JsonProperty(value = "APIKeyRenewalInterval")
   protected Long APIKeyRenewalInterval;
   
   @JsonProperty(value = "APIKeyValidity")
   protected Long APIKeyValidity;
   
   @JsonProperty(value = "ASNumber")
   protected Long ASNumber;
   
   @JsonProperty(value = "DHCPOptionSize")
   protected Long DHCPOptionSize;
   
   @JsonProperty(value = "ECMPCount")
   protected Long ECMPCount;
   
   @JsonProperty(value = "EVPNBGPCommunityTagASNumber")
   protected Long EVPNBGPCommunityTagASNumber;
   
   @JsonProperty(value = "EVPNBGPCommunityTagLowerLimit")
   protected Long EVPNBGPCommunityTagLowerLimit;
   
   @JsonProperty(value = "EVPNBGPCommunityTagUpperLimit")
   protected Long EVPNBGPCommunityTagUpperLimit;
   
   @JsonProperty(value = "LDAPSyncInterval")
   protected Long LDAPSyncInterval;
   
   @JsonProperty(value = "LDAPTrustStoreCertifcate")
   protected String LDAPTrustStoreCertifcate;
   
   @JsonProperty(value = "LDAPTrustStorePassword")
   protected String LDAPTrustStorePassword;
   
   @JsonProperty(value = "LRUCacheSizePerSubnet")
   protected Long LRUCacheSizePerSubnet;
   
   @JsonProperty(value = "PGIDLowerLimit")
   protected Object PGIDLowerLimit;
   
   @JsonProperty(value = "PGIDUpperLimit")
   protected Object PGIDUpperLimit;
   
   @JsonProperty(value = "RDLowerLimit")
   protected Long RDLowerLimit;
   
   @JsonProperty(value = "RDPublicNetworkLowerLimit")
   protected Long RDPublicNetworkLowerLimit;
   
   @JsonProperty(value = "RDPublicNetworkUpperLimit")
   protected Long RDPublicNetworkUpperLimit;
   
   @JsonProperty(value = "RDUpperLimit")
   protected Long RDUpperLimit;
   
   @JsonProperty(value = "RTLowerLimit")
   protected Long RTLowerLimit;
   
   @JsonProperty(value = "RTPublicNetworkLowerLimit")
   protected Long RTPublicNetworkLowerLimit;
   
   @JsonProperty(value = "RTPublicNetworkUpperLimit")
   protected Long RTPublicNetworkUpperLimit;
   
   @JsonProperty(value = "RTUpperLimit")
   protected Long RTUpperLimit;
   
   @JsonProperty(value = "VLANIDLowerLimit")
   protected Long VLANIDLowerLimit;
   
   @JsonProperty(value = "VLANIDUpperLimit")
   protected Long VLANIDUpperLimit;
   
   @JsonProperty(value = "VMCacheSize")
   protected Long VMCacheSize;
   
   @JsonProperty(value = "VMPurgeTime")
   protected Long VMPurgeTime;
   
   @JsonProperty(value = "VMResyncDeletionWaitTime")
   protected Long VMResyncDeletionWaitTime;
   
   @JsonProperty(value = "VMResyncOutstandingInterval")
   protected Long VMResyncOutstandingInterval;
   
   @JsonProperty(value = "VMUnreachableCleanupTime")
   protected Long VMUnreachableCleanupTime;
   
   @JsonProperty(value = "VMUnreachableTime")
   protected Long VMUnreachableTime;
   
   @JsonProperty(value = "VNFTaskTimeout")
   protected Long VNFTaskTimeout;
   
   @JsonProperty(value = "VNIDLowerLimit")
   protected Long VNIDLowerLimit;
   
   @JsonProperty(value = "VNIDPublicNetworkLowerLimit")
   protected Long VNIDPublicNetworkLowerLimit;
   
   @JsonProperty(value = "VNIDPublicNetworkUpperLimit")
   protected Long VNIDPublicNetworkUpperLimit;
   
   @JsonProperty(value = "VNIDUpperLimit")
   protected Long VNIDUpperLimit;
   
   @JsonProperty(value = "VPortInitStatefulTimer")
   protected Long VPortInitStatefulTimer;
   
   @JsonProperty(value = "VSCOnSameVersionAsVSD")
   protected Boolean VSCOnSameVersionAsVSD;
   
   @JsonProperty(value = "VSDReadOnlyMode")
   protected Boolean VSDReadOnlyMode;
   
   @JsonProperty(value = "VSDUpgradeIsComplete")
   protected Boolean VSDUpgradeIsComplete;
   
   @JsonProperty(value = "VSSStatsInterval")
   protected Long VSSStatsInterval;
   
   @JsonProperty(value = "ZFBBootstrapEnabled")
   protected Boolean ZFBBootstrapEnabled;
   
   @JsonProperty(value = "ZFBRequestRetryTimer")
   protected Long ZFBRequestRetryTimer;
   
   @JsonProperty(value = "ZFBSchedulerStaleRequestTimeout")
   protected Long ZFBSchedulerStaleRequestTimeout;
   
   @JsonProperty(value = "accumulateLicensesEnabled")
   protected Boolean accumulateLicensesEnabled;
   
   @JsonProperty(value = "alarmsMaxPerObject")
   protected Long alarmsMaxPerObject;
   
   @JsonProperty(value = "allowEnterpriseAvatarOnNSG")
   protected Boolean allowEnterpriseAvatarOnNSG;
   
   @JsonProperty(value = "attachProbeToIPsecNPM")
   protected Boolean attachProbeToIPsecNPM;
   
   @JsonProperty(value = "attachProbeToVXLANNPM")
   protected Boolean attachProbeToVXLANNPM;
   
   @JsonProperty(value = "avatarBasePath")
   protected String avatarBasePath;
   
   @JsonProperty(value = "avatarBaseURL")
   protected String avatarBaseURL;
   
   @JsonProperty(value = "csprootAuthenticationMethod")
   protected CsprootAuthenticationMethod csprootAuthenticationMethod;
   
   @JsonProperty(value = "customerIDUpperLimit")
   protected Long customerIDUpperLimit;
   
   @JsonProperty(value = "customerKey")
   protected String customerKey;
   
   @JsonProperty(value = "domainTunnelType")
   protected DomainTunnelType domainTunnelType;
   
   @JsonProperty(value = "dynamicWANServiceDiffTime")
   protected Long dynamicWANServiceDiffTime;
   
   @JsonProperty(value = "ejbcaNSGCertificateProfile")
   protected String ejbcaNSGCertificateProfile;
   
   @JsonProperty(value = "ejbcaNSGEndEntityProfile")
   protected String ejbcaNSGEndEntityProfile;
   
   @JsonProperty(value = "ejbcaOCSPResponderCN")
   protected String ejbcaOCSPResponderCN;
   
   @JsonProperty(value = "ejbcaOCSPResponderURI")
   protected String ejbcaOCSPResponderURI;
   
   @JsonProperty(value = "ejbcaVspRootCa")
   protected String ejbcaVspRootCa;
   
   @JsonProperty(value = "elasticClusterName")
   protected String elasticClusterName;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "esiID")
   protected Long esiID;
   
   @JsonProperty(value = "eventLogCleanupInterval")
   protected Long eventLogCleanupInterval;
   
   @JsonProperty(value = "eventLogEntryMaxAge")
   protected Long eventLogEntryMaxAge;
   
   @JsonProperty(value = "eventProcessorInterval")
   protected Long eventProcessorInterval;
   
   @JsonProperty(value = "eventProcessorMaxEventsCount")
   protected Long eventProcessorMaxEventsCount;
   
   @JsonProperty(value = "eventProcessorTimeout")
   protected Long eventProcessorTimeout;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "flowCollectionEnabled")
   protected Boolean flowCollectionEnabled;
   
   @JsonProperty(value = "globalMACAddress")
   protected String globalMACAddress;
   
   @JsonProperty(value = "groupKeyDefaultSEKGenerationInterval")
   protected Long groupKeyDefaultSEKGenerationInterval;
   
   @JsonProperty(value = "groupKeyDefaultSEKLifetime")
   protected Long groupKeyDefaultSEKLifetime;
   
   @JsonProperty(value = "groupKeyDefaultSEKPayloadEncryptionAlgorithm")
   protected GroupKeyDefaultSEKPayloadEncryptionAlgorithm groupKeyDefaultSEKPayloadEncryptionAlgorithm;
   
   @JsonProperty(value = "groupKeyDefaultSEKPayloadSigningAlgorithm")
   protected GroupKeyDefaultSEKPayloadSigningAlgorithm groupKeyDefaultSEKPayloadSigningAlgorithm;
   
   @JsonProperty(value = "groupKeyDefaultSeedGenerationInterval")
   protected Long groupKeyDefaultSeedGenerationInterval;
   
   @JsonProperty(value = "groupKeyDefaultSeedLifetime")
   protected Long groupKeyDefaultSeedLifetime;
   
   @JsonProperty(value = "groupKeyDefaultSeedPayloadAuthenticationAlgorithm")
   protected GroupKeyDefaultSeedPayloadAuthenticationAlgorithm groupKeyDefaultSeedPayloadAuthenticationAlgorithm;
   
   @JsonProperty(value = "groupKeyDefaultSeedPayloadEncryptionAlgorithm")
   protected GroupKeyDefaultSeedPayloadEncryptionAlgorithm groupKeyDefaultSeedPayloadEncryptionAlgorithm;
   
   @JsonProperty(value = "groupKeyDefaultSeedPayloadSigningAlgorithm")
   protected GroupKeyDefaultSeedPayloadSigningAlgorithm groupKeyDefaultSeedPayloadSigningAlgorithm;
   
   @JsonProperty(value = "groupKeyDefaultTrafficAuthenticationAlgorithm")
   protected GroupKeyDefaultTrafficAuthenticationAlgorithm groupKeyDefaultTrafficAuthenticationAlgorithm;
   
   @JsonProperty(value = "groupKeyDefaultTrafficEncryptionAlgorithm")
   protected GroupKeyDefaultTrafficEncryptionAlgorithm groupKeyDefaultTrafficEncryptionAlgorithm;
   
   @JsonProperty(value = "groupKeyDefaultTrafficEncryptionKeyLifetime")
   protected Long groupKeyDefaultTrafficEncryptionKeyLifetime;
   
   @JsonProperty(value = "groupKeyGenerationIntervalOnForcedReKey")
   protected Long groupKeyGenerationIntervalOnForcedReKey;
   
   @JsonProperty(value = "groupKeyGenerationIntervalOnRevoke")
   protected Long groupKeyGenerationIntervalOnRevoke;
   
   @JsonProperty(value = "groupKeyMinimumSEKGenerationInterval")
   protected Long groupKeyMinimumSEKGenerationInterval;
   
   @JsonProperty(value = "groupKeyMinimumSEKLifetime")
   protected Long groupKeyMinimumSEKLifetime;
   
   @JsonProperty(value = "groupKeyMinimumSeedGenerationInterval")
   protected Long groupKeyMinimumSeedGenerationInterval;
   
   @JsonProperty(value = "groupKeyMinimumSeedLifetime")
   protected Long groupKeyMinimumSeedLifetime;
   
   @JsonProperty(value = "groupKeyMinimumTrafficEncryptionKeyLifetime")
   protected Long groupKeyMinimumTrafficEncryptionKeyLifetime;
   
   @JsonProperty(value = "inactiveTimeout")
   protected Long inactiveTimeout;
   
   @JsonProperty(value = "infrastructureBGPASNumber")
   protected Long infrastructureBGPASNumber;
   
   @JsonProperty(value = "keyServerMonitorEnabled")
   protected Boolean keyServerMonitorEnabled;
   
   @JsonProperty(value = "keyServerVSDDataSynchronizationInterval")
   protected Long keyServerVSDDataSynchronizationInterval;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "maxFailedLogins")
   protected Long maxFailedLogins;
   
   @JsonProperty(value = "maxResponse")
   protected Long maxResponse;
   
   @JsonProperty(value = "nsgBootstrapEndpoint")
   protected String nsgBootstrapEndpoint;
   
   @JsonProperty(value = "nsgConfigEndpoint")
   protected String nsgConfigEndpoint;
   
   @JsonProperty(value = "nsgLocalUiUrl")
   protected String nsgLocalUiUrl;
   
   @JsonProperty(value = "offsetCustomerID")
   protected Long offsetCustomerID;
   
   @JsonProperty(value = "offsetServiceID")
   protected Long offsetServiceID;
   
   @JsonProperty(value = "pageMaxSize")
   protected Long pageMaxSize;
   
   @JsonProperty(value = "pageSize")
   protected Long pageSize;
   
   @JsonProperty(value = "perDomainVlanIdEnabled")
   protected Boolean perDomainVlanIdEnabled;
   
   @JsonProperty(value = "performancePathSelectionVNID")
   protected Long performancePathSelectionVNID;
   
   @JsonProperty(value = "postProcessorThreadsCount")
   protected Long postProcessorThreadsCount;
   
   @JsonProperty(value = "serviceIDUpperLimit")
   protected Long serviceIDUpperLimit;
   
   @JsonProperty(value = "stackTraceEnabled")
   protected Boolean stackTraceEnabled;
   
   @JsonProperty(value = "statefulACLNonTCPTimeout")
   protected Long statefulACLNonTCPTimeout;
   
   @JsonProperty(value = "statefulACLTCPTimeout")
   protected Long statefulACLTCPTimeout;
   
   @JsonProperty(value = "staticWANServicePurgeTime")
   protected Long staticWANServicePurgeTime;
   
   @JsonProperty(value = "statisticsEnabled")
   protected Boolean statisticsEnabled;
   
   @JsonProperty(value = "statsCollectorAddress")
   protected String statsCollectorAddress;
   
   @JsonProperty(value = "statsCollectorPort")
   protected String statsCollectorPort;
   
   @JsonProperty(value = "statsCollectorProtoBufPort")
   protected String statsCollectorProtoBufPort;
   
   @JsonProperty(value = "statsMaxDataPoints")
   protected Long statsMaxDataPoints;
   
   @JsonProperty(value = "statsMinDuration")
   protected Long statsMinDuration;
   
   @JsonProperty(value = "statsNumberOfDataPoints")
   protected Long statsNumberOfDataPoints;
   
   @JsonProperty(value = "statsTSDBServerAddress")
   protected String statsTSDBServerAddress;
   
   @JsonProperty(value = "stickyECMPIdleTimeout")
   protected Long stickyECMPIdleTimeout;
   
   @JsonProperty(value = "subnetResyncInterval")
   protected Long subnetResyncInterval;
   
   @JsonProperty(value = "subnetResyncOutstandingInterval")
   protected Long subnetResyncOutstandingInterval;
   
   @JsonProperty(value = "syslogDestinationHost")
   protected String syslogDestinationHost;
   
   @JsonProperty(value = "syslogDestinationPort")
   protected Long syslogDestinationPort;
   
   @JsonProperty(value = "sysmonCleanupTaskInterval")
   protected Long sysmonCleanupTaskInterval;
   
   @JsonProperty(value = "sysmonNodePresenceTimeout")
   protected Long sysmonNodePresenceTimeout;
   
   @JsonProperty(value = "sysmonProbeResponseTimeout")
   protected Long sysmonProbeResponseTimeout;
   
   @JsonProperty(value = "systemAvatarData")
   protected String systemAvatarData;
   
   @JsonProperty(value = "systemAvatarType")
   protected SystemAvatarType systemAvatarType;
   
   @JsonProperty(value = "twoFactorCodeExpiry")
   protected Long twoFactorCodeExpiry;
   
   @JsonProperty(value = "twoFactorCodeLength")
   protected Long twoFactorCodeLength;
   
   @JsonProperty(value = "twoFactorCodeSeedLength")
   protected Long twoFactorCodeSeedLength;
   
   @JsonProperty(value = "vcinLoadBalancerIP")
   protected String vcinLoadBalancerIP;
   
   @JsonProperty(value = "virtualFirewallRulesEnabled")
   protected Boolean virtualFirewallRulesEnabled;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public SystemConfig() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   @JsonIgnore
   public Long getAARFlowStatsInterval() {
      return AARFlowStatsInterval;
   }

   @JsonIgnore
   public void setAARFlowStatsInterval(Long value) { 
      this.AARFlowStatsInterval = value;
   }
   
   @JsonIgnore
   public Long getAARProbeStatsInterval() {
      return AARProbeStatsInterval;
   }

   @JsonIgnore
   public void setAARProbeStatsInterval(Long value) { 
      this.AARProbeStatsInterval = value;
   }
   
   @JsonIgnore
   public String getACLAllowOrigin() {
      return ACLAllowOrigin;
   }

   @JsonIgnore
   public void setACLAllowOrigin(String value) { 
      this.ACLAllowOrigin = value;
   }
   
   @JsonIgnore
   public Long getADGatewayPurgeTime() {
      return ADGatewayPurgeTime;
   }

   @JsonIgnore
   public void setADGatewayPurgeTime(Long value) { 
      this.ADGatewayPurgeTime = value;
   }
   
   @JsonIgnore
   public Long getAPIKeyRenewalInterval() {
      return APIKeyRenewalInterval;
   }

   @JsonIgnore
   public void setAPIKeyRenewalInterval(Long value) { 
      this.APIKeyRenewalInterval = value;
   }
   
   @JsonIgnore
   public Long getAPIKeyValidity() {
      return APIKeyValidity;
   }

   @JsonIgnore
   public void setAPIKeyValidity(Long value) { 
      this.APIKeyValidity = value;
   }
   
   @JsonIgnore
   public Long getASNumber() {
      return ASNumber;
   }

   @JsonIgnore
   public void setASNumber(Long value) { 
      this.ASNumber = value;
   }
   
   @JsonIgnore
   public Long getDHCPOptionSize() {
      return DHCPOptionSize;
   }

   @JsonIgnore
   public void setDHCPOptionSize(Long value) { 
      this.DHCPOptionSize = value;
   }
   
   @JsonIgnore
   public Long getECMPCount() {
      return ECMPCount;
   }

   @JsonIgnore
   public void setECMPCount(Long value) { 
      this.ECMPCount = value;
   }
   
   @JsonIgnore
   public Long getEVPNBGPCommunityTagASNumber() {
      return EVPNBGPCommunityTagASNumber;
   }

   @JsonIgnore
   public void setEVPNBGPCommunityTagASNumber(Long value) { 
      this.EVPNBGPCommunityTagASNumber = value;
   }
   
   @JsonIgnore
   public Long getEVPNBGPCommunityTagLowerLimit() {
      return EVPNBGPCommunityTagLowerLimit;
   }

   @JsonIgnore
   public void setEVPNBGPCommunityTagLowerLimit(Long value) { 
      this.EVPNBGPCommunityTagLowerLimit = value;
   }
   
   @JsonIgnore
   public Long getEVPNBGPCommunityTagUpperLimit() {
      return EVPNBGPCommunityTagUpperLimit;
   }

   @JsonIgnore
   public void setEVPNBGPCommunityTagUpperLimit(Long value) { 
      this.EVPNBGPCommunityTagUpperLimit = value;
   }
   
   @JsonIgnore
   public Long getLDAPSyncInterval() {
      return LDAPSyncInterval;
   }

   @JsonIgnore
   public void setLDAPSyncInterval(Long value) { 
      this.LDAPSyncInterval = value;
   }
   
   @JsonIgnore
   public String getLDAPTrustStoreCertifcate() {
      return LDAPTrustStoreCertifcate;
   }

   @JsonIgnore
   public void setLDAPTrustStoreCertifcate(String value) { 
      this.LDAPTrustStoreCertifcate = value;
   }
   
   @JsonIgnore
   public String getLDAPTrustStorePassword() {
      return LDAPTrustStorePassword;
   }

   @JsonIgnore
   public void setLDAPTrustStorePassword(String value) { 
      this.LDAPTrustStorePassword = value;
   }
   
   @JsonIgnore
   public Long getLRUCacheSizePerSubnet() {
      return LRUCacheSizePerSubnet;
   }

   @JsonIgnore
   public void setLRUCacheSizePerSubnet(Long value) { 
      this.LRUCacheSizePerSubnet = value;
   }
   
   @JsonIgnore
   public Object getPGIDLowerLimit() {
      return PGIDLowerLimit;
   }

   @JsonIgnore
   public void setPGIDLowerLimit(Object value) { 
      this.PGIDLowerLimit = value;
   }
   
   @JsonIgnore
   public Object getPGIDUpperLimit() {
      return PGIDUpperLimit;
   }

   @JsonIgnore
   public void setPGIDUpperLimit(Object value) { 
      this.PGIDUpperLimit = value;
   }
   
   @JsonIgnore
   public Long getRDLowerLimit() {
      return RDLowerLimit;
   }

   @JsonIgnore
   public void setRDLowerLimit(Long value) { 
      this.RDLowerLimit = value;
   }
   
   @JsonIgnore
   public Long getRDPublicNetworkLowerLimit() {
      return RDPublicNetworkLowerLimit;
   }

   @JsonIgnore
   public void setRDPublicNetworkLowerLimit(Long value) { 
      this.RDPublicNetworkLowerLimit = value;
   }
   
   @JsonIgnore
   public Long getRDPublicNetworkUpperLimit() {
      return RDPublicNetworkUpperLimit;
   }

   @JsonIgnore
   public void setRDPublicNetworkUpperLimit(Long value) { 
      this.RDPublicNetworkUpperLimit = value;
   }
   
   @JsonIgnore
   public Long getRDUpperLimit() {
      return RDUpperLimit;
   }

   @JsonIgnore
   public void setRDUpperLimit(Long value) { 
      this.RDUpperLimit = value;
   }
   
   @JsonIgnore
   public Long getRTLowerLimit() {
      return RTLowerLimit;
   }

   @JsonIgnore
   public void setRTLowerLimit(Long value) { 
      this.RTLowerLimit = value;
   }
   
   @JsonIgnore
   public Long getRTPublicNetworkLowerLimit() {
      return RTPublicNetworkLowerLimit;
   }

   @JsonIgnore
   public void setRTPublicNetworkLowerLimit(Long value) { 
      this.RTPublicNetworkLowerLimit = value;
   }
   
   @JsonIgnore
   public Long getRTPublicNetworkUpperLimit() {
      return RTPublicNetworkUpperLimit;
   }

   @JsonIgnore
   public void setRTPublicNetworkUpperLimit(Long value) { 
      this.RTPublicNetworkUpperLimit = value;
   }
   
   @JsonIgnore
   public Long getRTUpperLimit() {
      return RTUpperLimit;
   }

   @JsonIgnore
   public void setRTUpperLimit(Long value) { 
      this.RTUpperLimit = value;
   }
   
   @JsonIgnore
   public Long getVLANIDLowerLimit() {
      return VLANIDLowerLimit;
   }

   @JsonIgnore
   public void setVLANIDLowerLimit(Long value) { 
      this.VLANIDLowerLimit = value;
   }
   
   @JsonIgnore
   public Long getVLANIDUpperLimit() {
      return VLANIDUpperLimit;
   }

   @JsonIgnore
   public void setVLANIDUpperLimit(Long value) { 
      this.VLANIDUpperLimit = value;
   }
   
   @JsonIgnore
   public Long getVMCacheSize() {
      return VMCacheSize;
   }

   @JsonIgnore
   public void setVMCacheSize(Long value) { 
      this.VMCacheSize = value;
   }
   
   @JsonIgnore
   public Long getVMPurgeTime() {
      return VMPurgeTime;
   }

   @JsonIgnore
   public void setVMPurgeTime(Long value) { 
      this.VMPurgeTime = value;
   }
   
   @JsonIgnore
   public Long getVMResyncDeletionWaitTime() {
      return VMResyncDeletionWaitTime;
   }

   @JsonIgnore
   public void setVMResyncDeletionWaitTime(Long value) { 
      this.VMResyncDeletionWaitTime = value;
   }
   
   @JsonIgnore
   public Long getVMResyncOutstandingInterval() {
      return VMResyncOutstandingInterval;
   }

   @JsonIgnore
   public void setVMResyncOutstandingInterval(Long value) { 
      this.VMResyncOutstandingInterval = value;
   }
   
   @JsonIgnore
   public Long getVMUnreachableCleanupTime() {
      return VMUnreachableCleanupTime;
   }

   @JsonIgnore
   public void setVMUnreachableCleanupTime(Long value) { 
      this.VMUnreachableCleanupTime = value;
   }
   
   @JsonIgnore
   public Long getVMUnreachableTime() {
      return VMUnreachableTime;
   }

   @JsonIgnore
   public void setVMUnreachableTime(Long value) { 
      this.VMUnreachableTime = value;
   }
   
   @JsonIgnore
   public Long getVNFTaskTimeout() {
      return VNFTaskTimeout;
   }

   @JsonIgnore
   public void setVNFTaskTimeout(Long value) { 
      this.VNFTaskTimeout = value;
   }
   
   @JsonIgnore
   public Long getVNIDLowerLimit() {
      return VNIDLowerLimit;
   }

   @JsonIgnore
   public void setVNIDLowerLimit(Long value) { 
      this.VNIDLowerLimit = value;
   }
   
   @JsonIgnore
   public Long getVNIDPublicNetworkLowerLimit() {
      return VNIDPublicNetworkLowerLimit;
   }

   @JsonIgnore
   public void setVNIDPublicNetworkLowerLimit(Long value) { 
      this.VNIDPublicNetworkLowerLimit = value;
   }
   
   @JsonIgnore
   public Long getVNIDPublicNetworkUpperLimit() {
      return VNIDPublicNetworkUpperLimit;
   }

   @JsonIgnore
   public void setVNIDPublicNetworkUpperLimit(Long value) { 
      this.VNIDPublicNetworkUpperLimit = value;
   }
   
   @JsonIgnore
   public Long getVNIDUpperLimit() {
      return VNIDUpperLimit;
   }

   @JsonIgnore
   public void setVNIDUpperLimit(Long value) { 
      this.VNIDUpperLimit = value;
   }
   
   @JsonIgnore
   public Long getVPortInitStatefulTimer() {
      return VPortInitStatefulTimer;
   }

   @JsonIgnore
   public void setVPortInitStatefulTimer(Long value) { 
      this.VPortInitStatefulTimer = value;
   }
   
   @JsonIgnore
   public Boolean getVSCOnSameVersionAsVSD() {
      return VSCOnSameVersionAsVSD;
   }

   @JsonIgnore
   public void setVSCOnSameVersionAsVSD(Boolean value) { 
      this.VSCOnSameVersionAsVSD = value;
   }
   
   @JsonIgnore
   public Boolean getVSDReadOnlyMode() {
      return VSDReadOnlyMode;
   }

   @JsonIgnore
   public void setVSDReadOnlyMode(Boolean value) { 
      this.VSDReadOnlyMode = value;
   }
   
   @JsonIgnore
   public Boolean getVSDUpgradeIsComplete() {
      return VSDUpgradeIsComplete;
   }

   @JsonIgnore
   public void setVSDUpgradeIsComplete(Boolean value) { 
      this.VSDUpgradeIsComplete = value;
   }
   
   @JsonIgnore
   public Long getVSSStatsInterval() {
      return VSSStatsInterval;
   }

   @JsonIgnore
   public void setVSSStatsInterval(Long value) { 
      this.VSSStatsInterval = value;
   }
   
   @JsonIgnore
   public Boolean getZFBBootstrapEnabled() {
      return ZFBBootstrapEnabled;
   }

   @JsonIgnore
   public void setZFBBootstrapEnabled(Boolean value) { 
      this.ZFBBootstrapEnabled = value;
   }
   
   @JsonIgnore
   public Long getZFBRequestRetryTimer() {
      return ZFBRequestRetryTimer;
   }

   @JsonIgnore
   public void setZFBRequestRetryTimer(Long value) { 
      this.ZFBRequestRetryTimer = value;
   }
   
   @JsonIgnore
   public Long getZFBSchedulerStaleRequestTimeout() {
      return ZFBSchedulerStaleRequestTimeout;
   }

   @JsonIgnore
   public void setZFBSchedulerStaleRequestTimeout(Long value) { 
      this.ZFBSchedulerStaleRequestTimeout = value;
   }
   
   @JsonIgnore
   public Boolean getAccumulateLicensesEnabled() {
      return accumulateLicensesEnabled;
   }

   @JsonIgnore
   public void setAccumulateLicensesEnabled(Boolean value) { 
      this.accumulateLicensesEnabled = value;
   }
   
   @JsonIgnore
   public Long getAlarmsMaxPerObject() {
      return alarmsMaxPerObject;
   }

   @JsonIgnore
   public void setAlarmsMaxPerObject(Long value) { 
      this.alarmsMaxPerObject = value;
   }
   
   @JsonIgnore
   public Boolean getAllowEnterpriseAvatarOnNSG() {
      return allowEnterpriseAvatarOnNSG;
   }

   @JsonIgnore
   public void setAllowEnterpriseAvatarOnNSG(Boolean value) { 
      this.allowEnterpriseAvatarOnNSG = value;
   }
   
   @JsonIgnore
   public Boolean getAttachProbeToIPsecNPM() {
      return attachProbeToIPsecNPM;
   }

   @JsonIgnore
   public void setAttachProbeToIPsecNPM(Boolean value) { 
      this.attachProbeToIPsecNPM = value;
   }
   
   @JsonIgnore
   public Boolean getAttachProbeToVXLANNPM() {
      return attachProbeToVXLANNPM;
   }

   @JsonIgnore
   public void setAttachProbeToVXLANNPM(Boolean value) { 
      this.attachProbeToVXLANNPM = value;
   }
   
   @JsonIgnore
   public String getAvatarBasePath() {
      return avatarBasePath;
   }

   @JsonIgnore
   public void setAvatarBasePath(String value) { 
      this.avatarBasePath = value;
   }
   
   @JsonIgnore
   public String getAvatarBaseURL() {
      return avatarBaseURL;
   }

   @JsonIgnore
   public void setAvatarBaseURL(String value) { 
      this.avatarBaseURL = value;
   }
   
   @JsonIgnore
   public CsprootAuthenticationMethod getCsprootAuthenticationMethod() {
      return csprootAuthenticationMethod;
   }

   @JsonIgnore
   public void setCsprootAuthenticationMethod(CsprootAuthenticationMethod value) { 
      this.csprootAuthenticationMethod = value;
   }
   
   @JsonIgnore
   public Long getCustomerIDUpperLimit() {
      return customerIDUpperLimit;
   }

   @JsonIgnore
   public void setCustomerIDUpperLimit(Long value) { 
      this.customerIDUpperLimit = value;
   }
   
   @JsonIgnore
   public String getCustomerKey() {
      return customerKey;
   }

   @JsonIgnore
   public void setCustomerKey(String value) { 
      this.customerKey = value;
   }
   
   @JsonIgnore
   public DomainTunnelType getDomainTunnelType() {
      return domainTunnelType;
   }

   @JsonIgnore
   public void setDomainTunnelType(DomainTunnelType value) { 
      this.domainTunnelType = value;
   }
   
   @JsonIgnore
   public Long getDynamicWANServiceDiffTime() {
      return dynamicWANServiceDiffTime;
   }

   @JsonIgnore
   public void setDynamicWANServiceDiffTime(Long value) { 
      this.dynamicWANServiceDiffTime = value;
   }
   
   @JsonIgnore
   public String getEjbcaNSGCertificateProfile() {
      return ejbcaNSGCertificateProfile;
   }

   @JsonIgnore
   public void setEjbcaNSGCertificateProfile(String value) { 
      this.ejbcaNSGCertificateProfile = value;
   }
   
   @JsonIgnore
   public String getEjbcaNSGEndEntityProfile() {
      return ejbcaNSGEndEntityProfile;
   }

   @JsonIgnore
   public void setEjbcaNSGEndEntityProfile(String value) { 
      this.ejbcaNSGEndEntityProfile = value;
   }
   
   @JsonIgnore
   public String getEjbcaOCSPResponderCN() {
      return ejbcaOCSPResponderCN;
   }

   @JsonIgnore
   public void setEjbcaOCSPResponderCN(String value) { 
      this.ejbcaOCSPResponderCN = value;
   }
   
   @JsonIgnore
   public String getEjbcaOCSPResponderURI() {
      return ejbcaOCSPResponderURI;
   }

   @JsonIgnore
   public void setEjbcaOCSPResponderURI(String value) { 
      this.ejbcaOCSPResponderURI = value;
   }
   
   @JsonIgnore
   public String getEjbcaVspRootCa() {
      return ejbcaVspRootCa;
   }

   @JsonIgnore
   public void setEjbcaVspRootCa(String value) { 
      this.ejbcaVspRootCa = value;
   }
   
   @JsonIgnore
   public String getElasticClusterName() {
      return elasticClusterName;
   }

   @JsonIgnore
   public void setElasticClusterName(String value) { 
      this.elasticClusterName = value;
   }
   
   @JsonIgnore
   public EntityScope getEntityScope() {
      return entityScope;
   }

   @JsonIgnore
   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   
   @JsonIgnore
   public Long getEsiID() {
      return esiID;
   }

   @JsonIgnore
   public void setEsiID(Long value) { 
      this.esiID = value;
   }
   
   @JsonIgnore
   public Long getEventLogCleanupInterval() {
      return eventLogCleanupInterval;
   }

   @JsonIgnore
   public void setEventLogCleanupInterval(Long value) { 
      this.eventLogCleanupInterval = value;
   }
   
   @JsonIgnore
   public Long getEventLogEntryMaxAge() {
      return eventLogEntryMaxAge;
   }

   @JsonIgnore
   public void setEventLogEntryMaxAge(Long value) { 
      this.eventLogEntryMaxAge = value;
   }
   
   @JsonIgnore
   public Long getEventProcessorInterval() {
      return eventProcessorInterval;
   }

   @JsonIgnore
   public void setEventProcessorInterval(Long value) { 
      this.eventProcessorInterval = value;
   }
   
   @JsonIgnore
   public Long getEventProcessorMaxEventsCount() {
      return eventProcessorMaxEventsCount;
   }

   @JsonIgnore
   public void setEventProcessorMaxEventsCount(Long value) { 
      this.eventProcessorMaxEventsCount = value;
   }
   
   @JsonIgnore
   public Long getEventProcessorTimeout() {
      return eventProcessorTimeout;
   }

   @JsonIgnore
   public void setEventProcessorTimeout(Long value) { 
      this.eventProcessorTimeout = value;
   }
   
   @JsonIgnore
   public String getExternalID() {
      return externalID;
   }

   @JsonIgnore
   public void setExternalID(String value) { 
      this.externalID = value;
   }
   
   @JsonIgnore
   public Boolean getFlowCollectionEnabled() {
      return flowCollectionEnabled;
   }

   @JsonIgnore
   public void setFlowCollectionEnabled(Boolean value) { 
      this.flowCollectionEnabled = value;
   }
   
   @JsonIgnore
   public String getGlobalMACAddress() {
      return globalMACAddress;
   }

   @JsonIgnore
   public void setGlobalMACAddress(String value) { 
      this.globalMACAddress = value;
   }
   
   @JsonIgnore
   public Long getGroupKeyDefaultSEKGenerationInterval() {
      return groupKeyDefaultSEKGenerationInterval;
   }

   @JsonIgnore
   public void setGroupKeyDefaultSEKGenerationInterval(Long value) { 
      this.groupKeyDefaultSEKGenerationInterval = value;
   }
   
   @JsonIgnore
   public Long getGroupKeyDefaultSEKLifetime() {
      return groupKeyDefaultSEKLifetime;
   }

   @JsonIgnore
   public void setGroupKeyDefaultSEKLifetime(Long value) { 
      this.groupKeyDefaultSEKLifetime = value;
   }
   
   @JsonIgnore
   public GroupKeyDefaultSEKPayloadEncryptionAlgorithm getGroupKeyDefaultSEKPayloadEncryptionAlgorithm() {
      return groupKeyDefaultSEKPayloadEncryptionAlgorithm;
   }

   @JsonIgnore
   public void setGroupKeyDefaultSEKPayloadEncryptionAlgorithm(GroupKeyDefaultSEKPayloadEncryptionAlgorithm value) { 
      this.groupKeyDefaultSEKPayloadEncryptionAlgorithm = value;
   }
   
   @JsonIgnore
   public GroupKeyDefaultSEKPayloadSigningAlgorithm getGroupKeyDefaultSEKPayloadSigningAlgorithm() {
      return groupKeyDefaultSEKPayloadSigningAlgorithm;
   }

   @JsonIgnore
   public void setGroupKeyDefaultSEKPayloadSigningAlgorithm(GroupKeyDefaultSEKPayloadSigningAlgorithm value) { 
      this.groupKeyDefaultSEKPayloadSigningAlgorithm = value;
   }
   
   @JsonIgnore
   public Long getGroupKeyDefaultSeedGenerationInterval() {
      return groupKeyDefaultSeedGenerationInterval;
   }

   @JsonIgnore
   public void setGroupKeyDefaultSeedGenerationInterval(Long value) { 
      this.groupKeyDefaultSeedGenerationInterval = value;
   }
   
   @JsonIgnore
   public Long getGroupKeyDefaultSeedLifetime() {
      return groupKeyDefaultSeedLifetime;
   }

   @JsonIgnore
   public void setGroupKeyDefaultSeedLifetime(Long value) { 
      this.groupKeyDefaultSeedLifetime = value;
   }
   
   @JsonIgnore
   public GroupKeyDefaultSeedPayloadAuthenticationAlgorithm getGroupKeyDefaultSeedPayloadAuthenticationAlgorithm() {
      return groupKeyDefaultSeedPayloadAuthenticationAlgorithm;
   }

   @JsonIgnore
   public void setGroupKeyDefaultSeedPayloadAuthenticationAlgorithm(GroupKeyDefaultSeedPayloadAuthenticationAlgorithm value) { 
      this.groupKeyDefaultSeedPayloadAuthenticationAlgorithm = value;
   }
   
   @JsonIgnore
   public GroupKeyDefaultSeedPayloadEncryptionAlgorithm getGroupKeyDefaultSeedPayloadEncryptionAlgorithm() {
      return groupKeyDefaultSeedPayloadEncryptionAlgorithm;
   }

   @JsonIgnore
   public void setGroupKeyDefaultSeedPayloadEncryptionAlgorithm(GroupKeyDefaultSeedPayloadEncryptionAlgorithm value) { 
      this.groupKeyDefaultSeedPayloadEncryptionAlgorithm = value;
   }
   
   @JsonIgnore
   public GroupKeyDefaultSeedPayloadSigningAlgorithm getGroupKeyDefaultSeedPayloadSigningAlgorithm() {
      return groupKeyDefaultSeedPayloadSigningAlgorithm;
   }

   @JsonIgnore
   public void setGroupKeyDefaultSeedPayloadSigningAlgorithm(GroupKeyDefaultSeedPayloadSigningAlgorithm value) { 
      this.groupKeyDefaultSeedPayloadSigningAlgorithm = value;
   }
   
   @JsonIgnore
   public GroupKeyDefaultTrafficAuthenticationAlgorithm getGroupKeyDefaultTrafficAuthenticationAlgorithm() {
      return groupKeyDefaultTrafficAuthenticationAlgorithm;
   }

   @JsonIgnore
   public void setGroupKeyDefaultTrafficAuthenticationAlgorithm(GroupKeyDefaultTrafficAuthenticationAlgorithm value) { 
      this.groupKeyDefaultTrafficAuthenticationAlgorithm = value;
   }
   
   @JsonIgnore
   public GroupKeyDefaultTrafficEncryptionAlgorithm getGroupKeyDefaultTrafficEncryptionAlgorithm() {
      return groupKeyDefaultTrafficEncryptionAlgorithm;
   }

   @JsonIgnore
   public void setGroupKeyDefaultTrafficEncryptionAlgorithm(GroupKeyDefaultTrafficEncryptionAlgorithm value) { 
      this.groupKeyDefaultTrafficEncryptionAlgorithm = value;
   }
   
   @JsonIgnore
   public Long getGroupKeyDefaultTrafficEncryptionKeyLifetime() {
      return groupKeyDefaultTrafficEncryptionKeyLifetime;
   }

   @JsonIgnore
   public void setGroupKeyDefaultTrafficEncryptionKeyLifetime(Long value) { 
      this.groupKeyDefaultTrafficEncryptionKeyLifetime = value;
   }
   
   @JsonIgnore
   public Long getGroupKeyGenerationIntervalOnForcedReKey() {
      return groupKeyGenerationIntervalOnForcedReKey;
   }

   @JsonIgnore
   public void setGroupKeyGenerationIntervalOnForcedReKey(Long value) { 
      this.groupKeyGenerationIntervalOnForcedReKey = value;
   }
   
   @JsonIgnore
   public Long getGroupKeyGenerationIntervalOnRevoke() {
      return groupKeyGenerationIntervalOnRevoke;
   }

   @JsonIgnore
   public void setGroupKeyGenerationIntervalOnRevoke(Long value) { 
      this.groupKeyGenerationIntervalOnRevoke = value;
   }
   
   @JsonIgnore
   public Long getGroupKeyMinimumSEKGenerationInterval() {
      return groupKeyMinimumSEKGenerationInterval;
   }

   @JsonIgnore
   public void setGroupKeyMinimumSEKGenerationInterval(Long value) { 
      this.groupKeyMinimumSEKGenerationInterval = value;
   }
   
   @JsonIgnore
   public Long getGroupKeyMinimumSEKLifetime() {
      return groupKeyMinimumSEKLifetime;
   }

   @JsonIgnore
   public void setGroupKeyMinimumSEKLifetime(Long value) { 
      this.groupKeyMinimumSEKLifetime = value;
   }
   
   @JsonIgnore
   public Long getGroupKeyMinimumSeedGenerationInterval() {
      return groupKeyMinimumSeedGenerationInterval;
   }

   @JsonIgnore
   public void setGroupKeyMinimumSeedGenerationInterval(Long value) { 
      this.groupKeyMinimumSeedGenerationInterval = value;
   }
   
   @JsonIgnore
   public Long getGroupKeyMinimumSeedLifetime() {
      return groupKeyMinimumSeedLifetime;
   }

   @JsonIgnore
   public void setGroupKeyMinimumSeedLifetime(Long value) { 
      this.groupKeyMinimumSeedLifetime = value;
   }
   
   @JsonIgnore
   public Long getGroupKeyMinimumTrafficEncryptionKeyLifetime() {
      return groupKeyMinimumTrafficEncryptionKeyLifetime;
   }

   @JsonIgnore
   public void setGroupKeyMinimumTrafficEncryptionKeyLifetime(Long value) { 
      this.groupKeyMinimumTrafficEncryptionKeyLifetime = value;
   }
   
   @JsonIgnore
   public Long getInactiveTimeout() {
      return inactiveTimeout;
   }

   @JsonIgnore
   public void setInactiveTimeout(Long value) { 
      this.inactiveTimeout = value;
   }
   
   @JsonIgnore
   public Long getInfrastructureBGPASNumber() {
      return infrastructureBGPASNumber;
   }

   @JsonIgnore
   public void setInfrastructureBGPASNumber(Long value) { 
      this.infrastructureBGPASNumber = value;
   }
   
   @JsonIgnore
   public Boolean getKeyServerMonitorEnabled() {
      return keyServerMonitorEnabled;
   }

   @JsonIgnore
   public void setKeyServerMonitorEnabled(Boolean value) { 
      this.keyServerMonitorEnabled = value;
   }
   
   @JsonIgnore
   public Long getKeyServerVSDDataSynchronizationInterval() {
      return keyServerVSDDataSynchronizationInterval;
   }

   @JsonIgnore
   public void setKeyServerVSDDataSynchronizationInterval(Long value) { 
      this.keyServerVSDDataSynchronizationInterval = value;
   }
   
   @JsonIgnore
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   @JsonIgnore
   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   
   @JsonIgnore
   public Long getMaxFailedLogins() {
      return maxFailedLogins;
   }

   @JsonIgnore
   public void setMaxFailedLogins(Long value) { 
      this.maxFailedLogins = value;
   }
   
   @JsonIgnore
   public Long getMaxResponse() {
      return maxResponse;
   }

   @JsonIgnore
   public void setMaxResponse(Long value) { 
      this.maxResponse = value;
   }
   
   @JsonIgnore
   public String getNsgBootstrapEndpoint() {
      return nsgBootstrapEndpoint;
   }

   @JsonIgnore
   public void setNsgBootstrapEndpoint(String value) { 
      this.nsgBootstrapEndpoint = value;
   }
   
   @JsonIgnore
   public String getNsgConfigEndpoint() {
      return nsgConfigEndpoint;
   }

   @JsonIgnore
   public void setNsgConfigEndpoint(String value) { 
      this.nsgConfigEndpoint = value;
   }
   
   @JsonIgnore
   public String getNsgLocalUiUrl() {
      return nsgLocalUiUrl;
   }

   @JsonIgnore
   public void setNsgLocalUiUrl(String value) { 
      this.nsgLocalUiUrl = value;
   }
   
   @JsonIgnore
   public Long getOffsetCustomerID() {
      return offsetCustomerID;
   }

   @JsonIgnore
   public void setOffsetCustomerID(Long value) { 
      this.offsetCustomerID = value;
   }
   
   @JsonIgnore
   public Long getOffsetServiceID() {
      return offsetServiceID;
   }

   @JsonIgnore
   public void setOffsetServiceID(Long value) { 
      this.offsetServiceID = value;
   }
   
   @JsonIgnore
   public Long getPageMaxSize() {
      return pageMaxSize;
   }

   @JsonIgnore
   public void setPageMaxSize(Long value) { 
      this.pageMaxSize = value;
   }
   
   @JsonIgnore
   public Long getPageSize() {
      return pageSize;
   }

   @JsonIgnore
   public void setPageSize(Long value) { 
      this.pageSize = value;
   }
   
   @JsonIgnore
   public Boolean getPerDomainVlanIdEnabled() {
      return perDomainVlanIdEnabled;
   }

   @JsonIgnore
   public void setPerDomainVlanIdEnabled(Boolean value) { 
      this.perDomainVlanIdEnabled = value;
   }
   
   @JsonIgnore
   public Long getPerformancePathSelectionVNID() {
      return performancePathSelectionVNID;
   }

   @JsonIgnore
   public void setPerformancePathSelectionVNID(Long value) { 
      this.performancePathSelectionVNID = value;
   }
   
   @JsonIgnore
   public Long getPostProcessorThreadsCount() {
      return postProcessorThreadsCount;
   }

   @JsonIgnore
   public void setPostProcessorThreadsCount(Long value) { 
      this.postProcessorThreadsCount = value;
   }
   
   @JsonIgnore
   public Long getServiceIDUpperLimit() {
      return serviceIDUpperLimit;
   }

   @JsonIgnore
   public void setServiceIDUpperLimit(Long value) { 
      this.serviceIDUpperLimit = value;
   }
   
   @JsonIgnore
   public Boolean getStackTraceEnabled() {
      return stackTraceEnabled;
   }

   @JsonIgnore
   public void setStackTraceEnabled(Boolean value) { 
      this.stackTraceEnabled = value;
   }
   
   @JsonIgnore
   public Long getStatefulACLNonTCPTimeout() {
      return statefulACLNonTCPTimeout;
   }

   @JsonIgnore
   public void setStatefulACLNonTCPTimeout(Long value) { 
      this.statefulACLNonTCPTimeout = value;
   }
   
   @JsonIgnore
   public Long getStatefulACLTCPTimeout() {
      return statefulACLTCPTimeout;
   }

   @JsonIgnore
   public void setStatefulACLTCPTimeout(Long value) { 
      this.statefulACLTCPTimeout = value;
   }
   
   @JsonIgnore
   public Long getStaticWANServicePurgeTime() {
      return staticWANServicePurgeTime;
   }

   @JsonIgnore
   public void setStaticWANServicePurgeTime(Long value) { 
      this.staticWANServicePurgeTime = value;
   }
   
   @JsonIgnore
   public Boolean getStatisticsEnabled() {
      return statisticsEnabled;
   }

   @JsonIgnore
   public void setStatisticsEnabled(Boolean value) { 
      this.statisticsEnabled = value;
   }
   
   @JsonIgnore
   public String getStatsCollectorAddress() {
      return statsCollectorAddress;
   }

   @JsonIgnore
   public void setStatsCollectorAddress(String value) { 
      this.statsCollectorAddress = value;
   }
   
   @JsonIgnore
   public String getStatsCollectorPort() {
      return statsCollectorPort;
   }

   @JsonIgnore
   public void setStatsCollectorPort(String value) { 
      this.statsCollectorPort = value;
   }
   
   @JsonIgnore
   public String getStatsCollectorProtoBufPort() {
      return statsCollectorProtoBufPort;
   }

   @JsonIgnore
   public void setStatsCollectorProtoBufPort(String value) { 
      this.statsCollectorProtoBufPort = value;
   }
   
   @JsonIgnore
   public Long getStatsMaxDataPoints() {
      return statsMaxDataPoints;
   }

   @JsonIgnore
   public void setStatsMaxDataPoints(Long value) { 
      this.statsMaxDataPoints = value;
   }
   
   @JsonIgnore
   public Long getStatsMinDuration() {
      return statsMinDuration;
   }

   @JsonIgnore
   public void setStatsMinDuration(Long value) { 
      this.statsMinDuration = value;
   }
   
   @JsonIgnore
   public Long getStatsNumberOfDataPoints() {
      return statsNumberOfDataPoints;
   }

   @JsonIgnore
   public void setStatsNumberOfDataPoints(Long value) { 
      this.statsNumberOfDataPoints = value;
   }
   
   @JsonIgnore
   public String getStatsTSDBServerAddress() {
      return statsTSDBServerAddress;
   }

   @JsonIgnore
   public void setStatsTSDBServerAddress(String value) { 
      this.statsTSDBServerAddress = value;
   }
   
   @JsonIgnore
   public Long getStickyECMPIdleTimeout() {
      return stickyECMPIdleTimeout;
   }

   @JsonIgnore
   public void setStickyECMPIdleTimeout(Long value) { 
      this.stickyECMPIdleTimeout = value;
   }
   
   @JsonIgnore
   public Long getSubnetResyncInterval() {
      return subnetResyncInterval;
   }

   @JsonIgnore
   public void setSubnetResyncInterval(Long value) { 
      this.subnetResyncInterval = value;
   }
   
   @JsonIgnore
   public Long getSubnetResyncOutstandingInterval() {
      return subnetResyncOutstandingInterval;
   }

   @JsonIgnore
   public void setSubnetResyncOutstandingInterval(Long value) { 
      this.subnetResyncOutstandingInterval = value;
   }
   
   @JsonIgnore
   public String getSyslogDestinationHost() {
      return syslogDestinationHost;
   }

   @JsonIgnore
   public void setSyslogDestinationHost(String value) { 
      this.syslogDestinationHost = value;
   }
   
   @JsonIgnore
   public Long getSyslogDestinationPort() {
      return syslogDestinationPort;
   }

   @JsonIgnore
   public void setSyslogDestinationPort(Long value) { 
      this.syslogDestinationPort = value;
   }
   
   @JsonIgnore
   public Long getSysmonCleanupTaskInterval() {
      return sysmonCleanupTaskInterval;
   }

   @JsonIgnore
   public void setSysmonCleanupTaskInterval(Long value) { 
      this.sysmonCleanupTaskInterval = value;
   }
   
   @JsonIgnore
   public Long getSysmonNodePresenceTimeout() {
      return sysmonNodePresenceTimeout;
   }

   @JsonIgnore
   public void setSysmonNodePresenceTimeout(Long value) { 
      this.sysmonNodePresenceTimeout = value;
   }
   
   @JsonIgnore
   public Long getSysmonProbeResponseTimeout() {
      return sysmonProbeResponseTimeout;
   }

   @JsonIgnore
   public void setSysmonProbeResponseTimeout(Long value) { 
      this.sysmonProbeResponseTimeout = value;
   }
   
   @JsonIgnore
   public String getSystemAvatarData() {
      return systemAvatarData;
   }

   @JsonIgnore
   public void setSystemAvatarData(String value) { 
      this.systemAvatarData = value;
   }
   
   @JsonIgnore
   public SystemAvatarType getSystemAvatarType() {
      return systemAvatarType;
   }

   @JsonIgnore
   public void setSystemAvatarType(SystemAvatarType value) { 
      this.systemAvatarType = value;
   }
   
   @JsonIgnore
   public Long getTwoFactorCodeExpiry() {
      return twoFactorCodeExpiry;
   }

   @JsonIgnore
   public void setTwoFactorCodeExpiry(Long value) { 
      this.twoFactorCodeExpiry = value;
   }
   
   @JsonIgnore
   public Long getTwoFactorCodeLength() {
      return twoFactorCodeLength;
   }

   @JsonIgnore
   public void setTwoFactorCodeLength(Long value) { 
      this.twoFactorCodeLength = value;
   }
   
   @JsonIgnore
   public Long getTwoFactorCodeSeedLength() {
      return twoFactorCodeSeedLength;
   }

   @JsonIgnore
   public void setTwoFactorCodeSeedLength(Long value) { 
      this.twoFactorCodeSeedLength = value;
   }
   
   @JsonIgnore
   public String getVcinLoadBalancerIP() {
      return vcinLoadBalancerIP;
   }

   @JsonIgnore
   public void setVcinLoadBalancerIP(String value) { 
      this.vcinLoadBalancerIP = value;
   }
   
   @JsonIgnore
   public Boolean getVirtualFirewallRulesEnabled() {
      return virtualFirewallRulesEnabled;
   }

   @JsonIgnore
   public void setVirtualFirewallRulesEnabled(Boolean value) { 
      this.virtualFirewallRulesEnabled = value;
   }
   

   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   

   public String toString() {
      return "SystemConfig [" + "AARFlowStatsInterval=" + AARFlowStatsInterval + ", AARProbeStatsInterval=" + AARProbeStatsInterval + ", ACLAllowOrigin=" + ACLAllowOrigin + ", ADGatewayPurgeTime=" + ADGatewayPurgeTime + ", APIKeyRenewalInterval=" + APIKeyRenewalInterval + ", APIKeyValidity=" + APIKeyValidity + ", ASNumber=" + ASNumber + ", DHCPOptionSize=" + DHCPOptionSize + ", ECMPCount=" + ECMPCount + ", EVPNBGPCommunityTagASNumber=" + EVPNBGPCommunityTagASNumber + ", EVPNBGPCommunityTagLowerLimit=" + EVPNBGPCommunityTagLowerLimit + ", EVPNBGPCommunityTagUpperLimit=" + EVPNBGPCommunityTagUpperLimit + ", LDAPSyncInterval=" + LDAPSyncInterval + ", LDAPTrustStoreCertifcate=" + LDAPTrustStoreCertifcate + ", LDAPTrustStorePassword=" + LDAPTrustStorePassword + ", LRUCacheSizePerSubnet=" + LRUCacheSizePerSubnet + ", PGIDLowerLimit=" + PGIDLowerLimit + ", PGIDUpperLimit=" + PGIDUpperLimit + ", RDLowerLimit=" + RDLowerLimit + ", RDPublicNetworkLowerLimit=" + RDPublicNetworkLowerLimit + ", RDPublicNetworkUpperLimit=" + RDPublicNetworkUpperLimit + ", RDUpperLimit=" + RDUpperLimit + ", RTLowerLimit=" + RTLowerLimit + ", RTPublicNetworkLowerLimit=" + RTPublicNetworkLowerLimit + ", RTPublicNetworkUpperLimit=" + RTPublicNetworkUpperLimit + ", RTUpperLimit=" + RTUpperLimit + ", VLANIDLowerLimit=" + VLANIDLowerLimit + ", VLANIDUpperLimit=" + VLANIDUpperLimit + ", VMCacheSize=" + VMCacheSize + ", VMPurgeTime=" + VMPurgeTime + ", VMResyncDeletionWaitTime=" + VMResyncDeletionWaitTime + ", VMResyncOutstandingInterval=" + VMResyncOutstandingInterval + ", VMUnreachableCleanupTime=" + VMUnreachableCleanupTime + ", VMUnreachableTime=" + VMUnreachableTime + ", VNFTaskTimeout=" + VNFTaskTimeout + ", VNIDLowerLimit=" + VNIDLowerLimit + ", VNIDPublicNetworkLowerLimit=" + VNIDPublicNetworkLowerLimit + ", VNIDPublicNetworkUpperLimit=" + VNIDPublicNetworkUpperLimit + ", VNIDUpperLimit=" + VNIDUpperLimit + ", VPortInitStatefulTimer=" + VPortInitStatefulTimer + ", VSCOnSameVersionAsVSD=" + VSCOnSameVersionAsVSD + ", VSDReadOnlyMode=" + VSDReadOnlyMode + ", VSDUpgradeIsComplete=" + VSDUpgradeIsComplete + ", VSSStatsInterval=" + VSSStatsInterval + ", ZFBBootstrapEnabled=" + ZFBBootstrapEnabled + ", ZFBRequestRetryTimer=" + ZFBRequestRetryTimer + ", ZFBSchedulerStaleRequestTimeout=" + ZFBSchedulerStaleRequestTimeout + ", accumulateLicensesEnabled=" + accumulateLicensesEnabled + ", alarmsMaxPerObject=" + alarmsMaxPerObject + ", allowEnterpriseAvatarOnNSG=" + allowEnterpriseAvatarOnNSG + ", attachProbeToIPsecNPM=" + attachProbeToIPsecNPM + ", attachProbeToVXLANNPM=" + attachProbeToVXLANNPM + ", avatarBasePath=" + avatarBasePath + ", avatarBaseURL=" + avatarBaseURL + ", csprootAuthenticationMethod=" + csprootAuthenticationMethod + ", customerIDUpperLimit=" + customerIDUpperLimit + ", customerKey=" + customerKey + ", domainTunnelType=" + domainTunnelType + ", dynamicWANServiceDiffTime=" + dynamicWANServiceDiffTime + ", ejbcaNSGCertificateProfile=" + ejbcaNSGCertificateProfile + ", ejbcaNSGEndEntityProfile=" + ejbcaNSGEndEntityProfile + ", ejbcaOCSPResponderCN=" + ejbcaOCSPResponderCN + ", ejbcaOCSPResponderURI=" + ejbcaOCSPResponderURI + ", ejbcaVspRootCa=" + ejbcaVspRootCa + ", elasticClusterName=" + elasticClusterName + ", entityScope=" + entityScope + ", esiID=" + esiID + ", eventLogCleanupInterval=" + eventLogCleanupInterval + ", eventLogEntryMaxAge=" + eventLogEntryMaxAge + ", eventProcessorInterval=" + eventProcessorInterval + ", eventProcessorMaxEventsCount=" + eventProcessorMaxEventsCount + ", eventProcessorTimeout=" + eventProcessorTimeout + ", externalID=" + externalID + ", flowCollectionEnabled=" + flowCollectionEnabled + ", globalMACAddress=" + globalMACAddress + ", groupKeyDefaultSEKGenerationInterval=" + groupKeyDefaultSEKGenerationInterval + ", groupKeyDefaultSEKLifetime=" + groupKeyDefaultSEKLifetime + ", groupKeyDefaultSEKPayloadEncryptionAlgorithm=" + groupKeyDefaultSEKPayloadEncryptionAlgorithm + ", groupKeyDefaultSEKPayloadSigningAlgorithm=" + groupKeyDefaultSEKPayloadSigningAlgorithm + ", groupKeyDefaultSeedGenerationInterval=" + groupKeyDefaultSeedGenerationInterval + ", groupKeyDefaultSeedLifetime=" + groupKeyDefaultSeedLifetime + ", groupKeyDefaultSeedPayloadAuthenticationAlgorithm=" + groupKeyDefaultSeedPayloadAuthenticationAlgorithm + ", groupKeyDefaultSeedPayloadEncryptionAlgorithm=" + groupKeyDefaultSeedPayloadEncryptionAlgorithm + ", groupKeyDefaultSeedPayloadSigningAlgorithm=" + groupKeyDefaultSeedPayloadSigningAlgorithm + ", groupKeyDefaultTrafficAuthenticationAlgorithm=" + groupKeyDefaultTrafficAuthenticationAlgorithm + ", groupKeyDefaultTrafficEncryptionAlgorithm=" + groupKeyDefaultTrafficEncryptionAlgorithm + ", groupKeyDefaultTrafficEncryptionKeyLifetime=" + groupKeyDefaultTrafficEncryptionKeyLifetime + ", groupKeyGenerationIntervalOnForcedReKey=" + groupKeyGenerationIntervalOnForcedReKey + ", groupKeyGenerationIntervalOnRevoke=" + groupKeyGenerationIntervalOnRevoke + ", groupKeyMinimumSEKGenerationInterval=" + groupKeyMinimumSEKGenerationInterval + ", groupKeyMinimumSEKLifetime=" + groupKeyMinimumSEKLifetime + ", groupKeyMinimumSeedGenerationInterval=" + groupKeyMinimumSeedGenerationInterval + ", groupKeyMinimumSeedLifetime=" + groupKeyMinimumSeedLifetime + ", groupKeyMinimumTrafficEncryptionKeyLifetime=" + groupKeyMinimumTrafficEncryptionKeyLifetime + ", inactiveTimeout=" + inactiveTimeout + ", infrastructureBGPASNumber=" + infrastructureBGPASNumber + ", keyServerMonitorEnabled=" + keyServerMonitorEnabled + ", keyServerVSDDataSynchronizationInterval=" + keyServerVSDDataSynchronizationInterval + ", lastUpdatedBy=" + lastUpdatedBy + ", maxFailedLogins=" + maxFailedLogins + ", maxResponse=" + maxResponse + ", nsgBootstrapEndpoint=" + nsgBootstrapEndpoint + ", nsgConfigEndpoint=" + nsgConfigEndpoint + ", nsgLocalUiUrl=" + nsgLocalUiUrl + ", offsetCustomerID=" + offsetCustomerID + ", offsetServiceID=" + offsetServiceID + ", pageMaxSize=" + pageMaxSize + ", pageSize=" + pageSize + ", perDomainVlanIdEnabled=" + perDomainVlanIdEnabled + ", performancePathSelectionVNID=" + performancePathSelectionVNID + ", postProcessorThreadsCount=" + postProcessorThreadsCount + ", serviceIDUpperLimit=" + serviceIDUpperLimit + ", stackTraceEnabled=" + stackTraceEnabled + ", statefulACLNonTCPTimeout=" + statefulACLNonTCPTimeout + ", statefulACLTCPTimeout=" + statefulACLTCPTimeout + ", staticWANServicePurgeTime=" + staticWANServicePurgeTime + ", statisticsEnabled=" + statisticsEnabled + ", statsCollectorAddress=" + statsCollectorAddress + ", statsCollectorPort=" + statsCollectorPort + ", statsCollectorProtoBufPort=" + statsCollectorProtoBufPort + ", statsMaxDataPoints=" + statsMaxDataPoints + ", statsMinDuration=" + statsMinDuration + ", statsNumberOfDataPoints=" + statsNumberOfDataPoints + ", statsTSDBServerAddress=" + statsTSDBServerAddress + ", stickyECMPIdleTimeout=" + stickyECMPIdleTimeout + ", subnetResyncInterval=" + subnetResyncInterval + ", subnetResyncOutstandingInterval=" + subnetResyncOutstandingInterval + ", syslogDestinationHost=" + syslogDestinationHost + ", syslogDestinationPort=" + syslogDestinationPort + ", sysmonCleanupTaskInterval=" + sysmonCleanupTaskInterval + ", sysmonNodePresenceTimeout=" + sysmonNodePresenceTimeout + ", sysmonProbeResponseTimeout=" + sysmonProbeResponseTimeout + ", systemAvatarData=" + systemAvatarData + ", systemAvatarType=" + systemAvatarType + ", twoFactorCodeExpiry=" + twoFactorCodeExpiry + ", twoFactorCodeLength=" + twoFactorCodeLength + ", twoFactorCodeSeedLength=" + twoFactorCodeSeedLength + ", vcinLoadBalancerIP=" + vcinLoadBalancerIP + ", virtualFirewallRulesEnabled=" + virtualFirewallRulesEnabled + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}