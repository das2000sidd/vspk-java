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


import net.nuagenetworks.vspk.v5_0.fetchers.ApplicationBindingsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.MonitorscopesFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "application", resourceName = "applications")
public class Application extends RestObject {

   private static final long serialVersionUID = 1L;

   
   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   
   public enum OptimizePathSelection { JITTER, LATENCY, PACKETLOSS };
   
   public enum PerformanceMonitorType { CONTINUOUS, FIRST_PACKET, FIRST_PACKET_AND_CONTINUOUS };
   
   public enum PostClassificationPath { ANY, PRIMARY, SECONDARY };
   
   public enum PreClassificationPath { DEFAULT, PRIMARY, SECONDARY };
   
   public enum Protocol { NONE, TCP, UDP };

   
   @JsonProperty(value = "DSCP")
   protected String DSCP;
   
   @JsonProperty(value = "appId")
   protected Long appId;
   
   @JsonProperty(value = "associatedL7ApplicationSignatureID")
   protected String associatedL7ApplicationSignatureID;
   
   @JsonProperty(value = "bandwidth")
   protected Long bandwidth;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "destinationIP")
   protected String destinationIP;
   
   @JsonProperty(value = "destinationPort")
   protected String destinationPort;
   
   @JsonProperty(value = "enablePPS")
   protected Boolean enablePPS;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "etherType")
   protected String etherType;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "oneWayDelay")
   protected Long oneWayDelay;
   
   @JsonProperty(value = "oneWayJitter")
   protected Long oneWayJitter;
   
   @JsonProperty(value = "oneWayLoss")
   protected Float oneWayLoss;
   
   @JsonProperty(value = "optimizePathSelection")
   protected OptimizePathSelection optimizePathSelection;
   
   @JsonProperty(value = "performanceMonitorType")
   protected PerformanceMonitorType performanceMonitorType;
   
   @JsonProperty(value = "postClassificationPath")
   protected PostClassificationPath postClassificationPath;
   
   @JsonProperty(value = "preClassificationPath")
   protected PreClassificationPath preClassificationPath;
   
   @JsonProperty(value = "protocol")
   protected Protocol protocol;
   
   @JsonProperty(value = "readOnly")
   protected Boolean readOnly;
   
   @JsonProperty(value = "sourceIP")
   protected String sourceIP;
   
   @JsonProperty(value = "sourcePort")
   protected String sourcePort;
   
   @JsonProperty(value = "symmetry")
   protected Boolean symmetry;
   

   
   @JsonIgnore
   private ApplicationBindingsFetcher applicationBindings;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private MonitorscopesFetcher monitorscopes;
   

   public Application() {
      
      applicationBindings = new ApplicationBindingsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      monitorscopes = new MonitorscopesFetcher(this);
      
   }

   
   @JsonIgnore
   public String getDSCP() {
      return DSCP;
   }

   @JsonIgnore
   public void setDSCP(String value) { 
      this.DSCP = value;
   }
   
   @JsonIgnore
   public Long getAppId() {
      return appId;
   }

   @JsonIgnore
   public void setAppId(Long value) { 
      this.appId = value;
   }
   
   @JsonIgnore
   public String getAssociatedL7ApplicationSignatureID() {
      return associatedL7ApplicationSignatureID;
   }

   @JsonIgnore
   public void setAssociatedL7ApplicationSignatureID(String value) { 
      this.associatedL7ApplicationSignatureID = value;
   }
   
   @JsonIgnore
   public Long getBandwidth() {
      return bandwidth;
   }

   @JsonIgnore
   public void setBandwidth(Long value) { 
      this.bandwidth = value;
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
   public String getDestinationIP() {
      return destinationIP;
   }

   @JsonIgnore
   public void setDestinationIP(String value) { 
      this.destinationIP = value;
   }
   
   @JsonIgnore
   public String getDestinationPort() {
      return destinationPort;
   }

   @JsonIgnore
   public void setDestinationPort(String value) { 
      this.destinationPort = value;
   }
   
   @JsonIgnore
   public Boolean getEnablePPS() {
      return enablePPS;
   }

   @JsonIgnore
   public void setEnablePPS(Boolean value) { 
      this.enablePPS = value;
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
   public String getEtherType() {
      return etherType;
   }

   @JsonIgnore
   public void setEtherType(String value) { 
      this.etherType = value;
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
   public Long getOneWayDelay() {
      return oneWayDelay;
   }

   @JsonIgnore
   public void setOneWayDelay(Long value) { 
      this.oneWayDelay = value;
   }
   
   @JsonIgnore
   public Long getOneWayJitter() {
      return oneWayJitter;
   }

   @JsonIgnore
   public void setOneWayJitter(Long value) { 
      this.oneWayJitter = value;
   }
   
   @JsonIgnore
   public Float getOneWayLoss() {
      return oneWayLoss;
   }

   @JsonIgnore
   public void setOneWayLoss(Float value) { 
      this.oneWayLoss = value;
   }
   
   @JsonIgnore
   public OptimizePathSelection getOptimizePathSelection() {
      return optimizePathSelection;
   }

   @JsonIgnore
   public void setOptimizePathSelection(OptimizePathSelection value) { 
      this.optimizePathSelection = value;
   }
   
   @JsonIgnore
   public PerformanceMonitorType getPerformanceMonitorType() {
      return performanceMonitorType;
   }

   @JsonIgnore
   public void setPerformanceMonitorType(PerformanceMonitorType value) { 
      this.performanceMonitorType = value;
   }
   
   @JsonIgnore
   public PostClassificationPath getPostClassificationPath() {
      return postClassificationPath;
   }

   @JsonIgnore
   public void setPostClassificationPath(PostClassificationPath value) { 
      this.postClassificationPath = value;
   }
   
   @JsonIgnore
   public PreClassificationPath getPreClassificationPath() {
      return preClassificationPath;
   }

   @JsonIgnore
   public void setPreClassificationPath(PreClassificationPath value) { 
      this.preClassificationPath = value;
   }
   
   @JsonIgnore
   public Protocol getProtocol() {
      return protocol;
   }

   @JsonIgnore
   public void setProtocol(Protocol value) { 
      this.protocol = value;
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
   public String getSourceIP() {
      return sourceIP;
   }

   @JsonIgnore
   public void setSourceIP(String value) { 
      this.sourceIP = value;
   }
   
   @JsonIgnore
   public String getSourcePort() {
      return sourcePort;
   }

   @JsonIgnore
   public void setSourcePort(String value) { 
      this.sourcePort = value;
   }
   
   @JsonIgnore
   public Boolean getSymmetry() {
      return symmetry;
   }

   @JsonIgnore
   public void setSymmetry(Boolean value) { 
      this.symmetry = value;
   }
   

   
   @JsonIgnore
   public ApplicationBindingsFetcher getApplicationBindings() {
      return applicationBindings;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public MonitorscopesFetcher getMonitorscopes() {
      return monitorscopes;
   }
   

   public String toString() {
      return "Application [" + "DSCP=" + DSCP + ", appId=" + appId + ", associatedL7ApplicationSignatureID=" + associatedL7ApplicationSignatureID + ", bandwidth=" + bandwidth + ", description=" + description + ", destinationIP=" + destinationIP + ", destinationPort=" + destinationPort + ", enablePPS=" + enablePPS + ", entityScope=" + entityScope + ", etherType=" + etherType + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", oneWayDelay=" + oneWayDelay + ", oneWayJitter=" + oneWayJitter + ", oneWayLoss=" + oneWayLoss + ", optimizePathSelection=" + optimizePathSelection + ", performanceMonitorType=" + performanceMonitorType + ", postClassificationPath=" + postClassificationPath + ", preClassificationPath=" + preClassificationPath + ", protocol=" + protocol + ", readOnly=" + readOnly + ", sourceIP=" + sourceIP + ", sourcePort=" + sourcePort + ", symmetry=" + symmetry + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}