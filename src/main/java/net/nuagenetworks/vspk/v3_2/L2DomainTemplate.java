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

package net.nuagenetworks.vspk.v3_2;

import net.nuagenetworks.bambou.RestObject;
import net.nuagenetworks.bambou.annotation.RestEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

import net.nuagenetworks.vspk.v3_2.fetchers.L2DomainsFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.AddressRangesFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.RedirectionTargetTemplatesFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.PermissionsFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.EgressACLTemplatesFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.IngressACLTemplatesFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.IngressAdvFwdTemplatesFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.IngressExternalServiceTemplatesFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.JobsFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.PolicyGroupTemplatesFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.QOSsFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.GroupsFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.EventLogsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "l2domaintemplate", resourceName = "l2domaintemplates")
public class L2DomainTemplate extends RestObject {

   
   public enum IPType { IPV4, IPV6 };
   public enum Encryption { DISABLED, ENABLED };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum PolicyChangeStatus { APPLIED, DISCARDED, STARTED };
   public enum Multicast { DISABLED, ENABLED, INHERITED };

   
   @JsonProperty(value = "DHCPManaged")
   protected Boolean DHCPManaged;
   
   @JsonProperty(value = "IPType")
   protected IPType IPType;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "gateway")
   protected String gateway;
   
   @JsonProperty(value = "address")
   protected String address;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "netmask")
   protected String netmask;
   
   @JsonProperty(value = "encryption")
   protected Encryption encryption;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "policyChangeStatus")
   protected PolicyChangeStatus policyChangeStatus;
   
   @JsonProperty(value = "associatedMulticastChannelMapID")
   protected String associatedMulticastChannelMapID;
   
   @JsonProperty(value = "multicast")
   protected Multicast multicast;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private L2DomainsFetcher l2Domains;
   
   @JsonIgnore
   private AddressRangesFetcher addressRanges;
   
   @JsonIgnore
   private RedirectionTargetTemplatesFetcher redirectionTargetTemplates;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private EgressACLTemplatesFetcher egressACLTemplates;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private IngressACLTemplatesFetcher ingressACLTemplates;
   
   @JsonIgnore
   private IngressAdvFwdTemplatesFetcher ingressAdvFwdTemplates;
   
   @JsonIgnore
   private IngressExternalServiceTemplatesFetcher ingressExternalServiceTemplates;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private PolicyGroupTemplatesFetcher policyGroupTemplates;
   
   @JsonIgnore
   private QOSsFetcher qOSs;
   
   @JsonIgnore
   private GroupsFetcher groups;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   

   public L2DomainTemplate() {
      
      l2Domains = new L2DomainsFetcher(this);
      
      addressRanges = new AddressRangesFetcher(this);
      
      redirectionTargetTemplates = new RedirectionTargetTemplatesFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      egressACLTemplates = new EgressACLTemplatesFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      ingressACLTemplates = new IngressACLTemplatesFetcher(this);
      
      ingressAdvFwdTemplates = new IngressAdvFwdTemplatesFetcher(this);
      
      ingressExternalServiceTemplates = new IngressExternalServiceTemplatesFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      policyGroupTemplates = new PolicyGroupTemplatesFetcher(this);
      
      qOSs = new QOSsFetcher(this);
      
      groups = new GroupsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
   }

   public Boolean getDHCPManaged() {
      return DHCPManaged;
   }

   public void setDHCPManaged(Boolean value) { 
      this.DHCPManaged = value;
   }
   public IPType getIPType() {
      return IPType;
   }

   public void setIPType(IPType value) { 
      this.IPType = value;
   }
   public String getName() {
      return name;
   }

   public void setName(String value) { 
      this.name = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public String getGateway() {
      return gateway;
   }

   public void setGateway(String value) { 
      this.gateway = value;
   }
   public String getAddress() {
      return address;
   }

   public void setAddress(String value) { 
      this.address = value;
   }
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
   }
   public String getNetmask() {
      return netmask;
   }

   public void setNetmask(String value) { 
      this.netmask = value;
   }
   public Encryption getEncryption() {
      return encryption;
   }

   public void setEncryption(Encryption value) { 
      this.encryption = value;
   }
   public EntityScope getEntityScope() {
      return entityScope;
   }

   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   public PolicyChangeStatus getPolicyChangeStatus() {
      return policyChangeStatus;
   }

   public void setPolicyChangeStatus(PolicyChangeStatus value) { 
      this.policyChangeStatus = value;
   }
   public String getAssociatedMulticastChannelMapID() {
      return associatedMulticastChannelMapID;
   }

   public void setAssociatedMulticastChannelMapID(String value) { 
      this.associatedMulticastChannelMapID = value;
   }
   public Multicast getMulticast() {
      return multicast;
   }

   public void setMulticast(Multicast value) { 
      this.multicast = value;
   }
   public String getExternalID() {
      return externalID;
   }

   public void setExternalID(String value) { 
      this.externalID = value;
   }
   

   
   @JsonIgnore
   public L2DomainsFetcher getL2Domains() {
      return l2Domains;
   }
   
   @JsonIgnore
   public AddressRangesFetcher getAddressRanges() {
      return addressRanges;
   }
   
   @JsonIgnore
   public RedirectionTargetTemplatesFetcher getRedirectionTargetTemplates() {
      return redirectionTargetTemplates;
   }
   
   @JsonIgnore
   public PermissionsFetcher getPermissions() {
      return permissions;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public EgressACLTemplatesFetcher getEgressACLTemplates() {
      return egressACLTemplates;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public IngressACLTemplatesFetcher getIngressACLTemplates() {
      return ingressACLTemplates;
   }
   
   @JsonIgnore
   public IngressAdvFwdTemplatesFetcher getIngressAdvFwdTemplates() {
      return ingressAdvFwdTemplates;
   }
   
   @JsonIgnore
   public IngressExternalServiceTemplatesFetcher getIngressExternalServiceTemplates() {
      return ingressExternalServiceTemplates;
   }
   
   @JsonIgnore
   public JobsFetcher getJobs() {
      return jobs;
   }
   
   @JsonIgnore
   public PolicyGroupTemplatesFetcher getPolicyGroupTemplates() {
      return policyGroupTemplates;
   }
   
   @JsonIgnore
   public QOSsFetcher getQOSs() {
      return qOSs;
   }
   
   @JsonIgnore
   public GroupsFetcher getGroups() {
      return groups;
   }
   
   @JsonIgnore
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   

   public String toString() {
      return "L2DomainTemplate [" + "DHCPManaged=" + DHCPManaged + ", IPType=" + IPType + ", name=" + name + ", lastUpdatedBy=" + lastUpdatedBy + ", gateway=" + gateway + ", address=" + address + ", description=" + description + ", netmask=" + netmask + ", encryption=" + encryption + ", entityScope=" + entityScope + ", policyChangeStatus=" + policyChangeStatus + ", associatedMulticastChannelMapID=" + associatedMulticastChannelMapID + ", multicast=" + multicast + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}