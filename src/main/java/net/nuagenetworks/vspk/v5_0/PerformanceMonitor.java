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


import net.nuagenetworks.vspk.v5_0.fetchers.ApplicationperformancemanagementsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.NSGatewaysFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.TiersFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "performancemonitor", resourceName = "performancemonitors")
public class PerformanceMonitor extends RestObject {

   private static final long serialVersionUID = 1L;

   
   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   
   public enum ProbeType { HTTP, IPSEC_AND_VXLAN, ONEWAY };
   
   public enum ServiceClass { A, B, C, D, E, F, G, H };

   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "destinationTargetList")
   protected java.util.List<String> destinationTargetList;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "holdDownTimer")
   protected Long holdDownTimer;
   
   @JsonProperty(value = "interval")
   protected Long interval;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "numberOfPackets")
   protected Long numberOfPackets;
   
   @JsonProperty(value = "payloadSize")
   protected Long payloadSize;
   
   @JsonProperty(value = "probeType")
   protected ProbeType probeType;
   
   @JsonProperty(value = "readOnly")
   protected Boolean readOnly;
   
   @JsonProperty(value = "serviceClass")
   protected ServiceClass serviceClass;
   
   @JsonProperty(value = "timeout")
   protected Long timeout;
   

   
   @JsonIgnore
   private ApplicationperformancemanagementsFetcher applicationperformancemanagements;
   
   @JsonIgnore
   private NSGatewaysFetcher nSGateways;
   
   @JsonIgnore
   private TiersFetcher tiers;
   

   public PerformanceMonitor() {
      
      applicationperformancemanagements = new ApplicationperformancemanagementsFetcher(this);
      
      nSGateways = new NSGatewaysFetcher(this);
      
      tiers = new TiersFetcher(this);
      
   }

   
   @JsonIgnore
   public String getDescription() {
      return description;
   }

   @JsonIgnore
   public void setDescription(String value) { 
      this.description = value;
   }
   
   @JsonIgnore
   public java.util.List<String> getDestinationTargetList() {
      return destinationTargetList;
   }

   @JsonIgnore
   public void setDestinationTargetList(java.util.List<String> value) { 
      this.destinationTargetList = value;
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
   public String getExternalID() {
      return externalID;
   }

   @JsonIgnore
   public void setExternalID(String value) { 
      this.externalID = value;
   }
   
   @JsonIgnore
   public Long getHoldDownTimer() {
      return holdDownTimer;
   }

   @JsonIgnore
   public void setHoldDownTimer(Long value) { 
      this.holdDownTimer = value;
   }
   
   @JsonIgnore
   public Long getInterval() {
      return interval;
   }

   @JsonIgnore
   public void setInterval(Long value) { 
      this.interval = value;
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
   public String getName() {
      return name;
   }

   @JsonIgnore
   public void setName(String value) { 
      this.name = value;
   }
   
   @JsonIgnore
   public Long getNumberOfPackets() {
      return numberOfPackets;
   }

   @JsonIgnore
   public void setNumberOfPackets(Long value) { 
      this.numberOfPackets = value;
   }
   
   @JsonIgnore
   public Long getPayloadSize() {
      return payloadSize;
   }

   @JsonIgnore
   public void setPayloadSize(Long value) { 
      this.payloadSize = value;
   }
   
   @JsonIgnore
   public ProbeType getProbeType() {
      return probeType;
   }

   @JsonIgnore
   public void setProbeType(ProbeType value) { 
      this.probeType = value;
   }
   
   @JsonIgnore
   public Boolean getReadOnly() {
      return readOnly;
   }

   @JsonIgnore
   public void setReadOnly(Boolean value) { 
      this.readOnly = value;
   }
   
   @JsonIgnore
   public ServiceClass getServiceClass() {
      return serviceClass;
   }

   @JsonIgnore
   public void setServiceClass(ServiceClass value) { 
      this.serviceClass = value;
   }
   
   @JsonIgnore
   public Long getTimeout() {
      return timeout;
   }

   @JsonIgnore
   public void setTimeout(Long value) { 
      this.timeout = value;
   }
   

   
   @JsonIgnore
   public ApplicationperformancemanagementsFetcher getApplicationperformancemanagements() {
      return applicationperformancemanagements;
   }
   
   @JsonIgnore
   public NSGatewaysFetcher getNSGateways() {
      return nSGateways;
   }
   
   @JsonIgnore
   public TiersFetcher getTiers() {
      return tiers;
   }
   

   public String toString() {
      return "PerformanceMonitor [" + "description=" + description + ", destinationTargetList=" + destinationTargetList + ", entityScope=" + entityScope + ", externalID=" + externalID + ", holdDownTimer=" + holdDownTimer + ", interval=" + interval + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", numberOfPackets=" + numberOfPackets + ", payloadSize=" + payloadSize + ", probeType=" + probeType + ", readOnly=" + readOnly + ", serviceClass=" + serviceClass + ", timeout=" + timeout + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}