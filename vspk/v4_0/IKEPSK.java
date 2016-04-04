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


package vspk.v4_0;

import bambou.RestObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

import vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import vspk.v4_0.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IKEPSK extends RestObject {

   public final static String REST_NAME = "ikepsk";
   public final static String RESOURCE_NAME = "ikepsks";

   
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "associatedEnterpriseID")
   protected String associatedEnterpriseID;
   
   @JsonProperty(value = "autoCreated")
   protected boolean autoCreated;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "encryptedPSK")
   protected String encryptedPSK;
   
   @JsonProperty(value = "encryptingCertificateSerialNumber")
   protected int encryptingCertificateSerialNumber;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "signature")
   protected String signature;
   
   @JsonProperty(value = "signingCertificateSerialNumber")
   protected int signingCertificateSerialNumber;
   
   @JsonProperty(value = "unencryptedPSK")
   protected String unencryptedPSK;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public IKEPSK() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   public String getAssociatedEnterpriseID() {
      return associatedEnterpriseID;
   }

   public void setAssociatedEnterpriseID(String value) { 
      this.associatedEnterpriseID = value;
   }
   public boolean getAutoCreated() {
      return autoCreated;
   }

   public void setAutoCreated(boolean value) { 
      this.autoCreated = value;
   }
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
   }
   public String getEncryptedPSK() {
      return encryptedPSK;
   }

   public void setEncryptedPSK(String value) { 
      this.encryptedPSK = value;
   }
   public int getEncryptingCertificateSerialNumber() {
      return encryptingCertificateSerialNumber;
   }

   public void setEncryptingCertificateSerialNumber(int value) { 
      this.encryptingCertificateSerialNumber = value;
   }
   public EntityScope getEntityScope() {
      return entityScope;
   }

   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   public String getExternalID() {
      return externalID;
   }

   public void setExternalID(String value) { 
      this.externalID = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public String getName() {
      return name;
   }

   public void setName(String value) { 
      this.name = value;
   }
   public String getSignature() {
      return signature;
   }

   public void setSignature(String value) { 
      this.signature = value;
   }
   public int getSigningCertificateSerialNumber() {
      return signingCertificateSerialNumber;
   }

   public void setSigningCertificateSerialNumber(int value) { 
      this.signingCertificateSerialNumber = value;
   }
   public String getUnencryptedPSK() {
      return unencryptedPSK;
   }

   public void setUnencryptedPSK(String value) { 
      this.unencryptedPSK = value;
   }
   

   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   

   public String toString() {
      return "IKEPSK [" + "associatedEnterpriseID=" + associatedEnterpriseID + ", autoCreated=" + autoCreated + ", description=" + description + ", encryptedPSK=" + encryptedPSK + ", encryptingCertificateSerialNumber=" + encryptingCertificateSerialNumber + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", signature=" + signature + ", signingCertificateSerialNumber=" + signingCertificateSerialNumber + ", unencryptedPSK=" + unencryptedPSK + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}