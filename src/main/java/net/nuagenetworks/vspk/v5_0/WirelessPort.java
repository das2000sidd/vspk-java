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


import net.nuagenetworks.vspk.v5_0.fetchers.AlarmsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.SSIDConnectionsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.StatisticsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "wirelessport", resourceName = "wirelessports")
public class WirelessPort extends RestObject {

   private static final long serialVersionUID = 1L;

   
   
   public enum CountryCode { AT, AU, BE, BR, CA, CH, CN, CY, CZ, DE, DK, EE, ES, FI, FR, GB, GR, HK, HU, ID, IE, IL, IN, IT, JP, KR, LT, LU, LV, MY, NL, NO, NZ, PH, PL, PT, SE, SG, SI, SK, TH, TW, US, ZA };
   
   public enum FrequencyChannel { CH_0, CH_1, CH_10, CH_100, CH_104, CH_108, CH_11, CH_112, CH_116, CH_12, CH_120, CH_124, CH_128, CH_13, CH_132, CH_136, CH_14, CH_140, CH_144, CH_149, CH_153, CH_157, CH_161, CH_165, CH_2, CH_3, CH_36, CH_4, CH_40, CH_44, CH_48, CH_5, CH_52, CH_56, CH_6, CH_60, CH_64, CH_7, CH_8, CH_9 };
   
   public enum PortType { ACCESS };
   
   public enum WifiFrequencyBand { FREQ_2_4_GHZ, FREQ_5_0_GHZ };
   
   public enum WifiMode { WIFI_A, WIFI_A_AC, WIFI_A_N, WIFI_A_N_AC, WIFI_B_G, WIFI_B_G_N };

   
   @JsonProperty(value = "countryCode")
   protected CountryCode countryCode;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "frequencyChannel")
   protected FrequencyChannel frequencyChannel;
   
   @JsonProperty(value = "genericConfig")
   protected String genericConfig;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "physicalName")
   protected String physicalName;
   
   @JsonProperty(value = "portType")
   protected PortType portType;
   
   @JsonProperty(value = "wifiFrequencyBand")
   protected WifiFrequencyBand wifiFrequencyBand;
   
   @JsonProperty(value = "wifiMode")
   protected WifiMode wifiMode;
   

   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private SSIDConnectionsFetcher sSIDConnections;
   
   @JsonIgnore
   private StatisticsFetcher statistics;
   

   public WirelessPort() {
      
      alarms = new AlarmsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      sSIDConnections = new SSIDConnectionsFetcher(this);
      
      statistics = new StatisticsFetcher(this);
      
   }

   
   @JsonIgnore
   public CountryCode getCountryCode() {
      return countryCode;
   }

   @JsonIgnore
   public void setCountryCode(CountryCode value) { 
      this.countryCode = value;
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
   public FrequencyChannel getFrequencyChannel() {
      return frequencyChannel;
   }

   @JsonIgnore
   public void setFrequencyChannel(FrequencyChannel value) { 
      this.frequencyChannel = value;
   }
   
   @JsonIgnore
   public String getGenericConfig() {
      return genericConfig;
   }

   @JsonIgnore
   public void setGenericConfig(String value) { 
      this.genericConfig = value;
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
   public String getPhysicalName() {
      return physicalName;
   }

   @JsonIgnore
   public void setPhysicalName(String value) { 
      this.physicalName = value;
   }
   
   @JsonIgnore
   public PortType getPortType() {
      return portType;
   }

   @JsonIgnore
   public void setPortType(PortType value) { 
      this.portType = value;
   }
   
   @JsonIgnore
   public WifiFrequencyBand getWifiFrequencyBand() {
      return wifiFrequencyBand;
   }

   @JsonIgnore
   public void setWifiFrequencyBand(WifiFrequencyBand value) { 
      this.wifiFrequencyBand = value;
   }
   
   @JsonIgnore
   public WifiMode getWifiMode() {
      return wifiMode;
   }

   @JsonIgnore
   public void setWifiMode(WifiMode value) { 
      this.wifiMode = value;
   }
   

   
   @JsonIgnore
   public AlarmsFetcher getAlarms() {
      return alarms;
   }
   
   @JsonIgnore
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   
   @JsonIgnore
   public SSIDConnectionsFetcher getSSIDConnections() {
      return sSIDConnections;
   }
   
   @JsonIgnore
   public StatisticsFetcher getStatistics() {
      return statistics;
   }
   

   public String toString() {
      return "WirelessPort [" + "countryCode=" + countryCode + ", description=" + description + ", frequencyChannel=" + frequencyChannel + ", genericConfig=" + genericConfig + ", name=" + name + ", physicalName=" + physicalName + ", portType=" + portType + ", wifiFrequencyBand=" + wifiFrequencyBand + ", wifiMode=" + wifiMode + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}