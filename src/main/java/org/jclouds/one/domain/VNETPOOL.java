/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jclouds.one.domain;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vnet"
})
@XmlRootElement(name = "VNET_POOL")
public class VNETPOOL {

    @XmlElement(name = "VNET")
    protected List<VNETPOOL.VNET> vnet;
    
    public List<VNETPOOL.VNET> getVNET() {
        if (vnet == null) {
            vnet = new ArrayList<VNETPOOL.VNET>();
        }
        return this.vnet;
    }
    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "uid",
        "gid",
        "uname",
        "gname",
        "name",
        "permissions",
        "clusterid",
        "cluster",
        "bridge",
        "vlan",
        "parentnetworkid",
        "phydev",
        "vlanid",
        "usedleases",
        "template",
        "arpool"
    })
    public static class VNET {

        @XmlElement(name = "ID", required = true)
        protected BigInteger id;
        @XmlElement(name = "UID", required = true)
        protected BigInteger uid;
        @XmlElement(name = "GID", required = true)
        protected BigInteger gid;
        @XmlElement(name = "UNAME", required = true)
        protected String uname;
        @XmlElement(name = "GNAME", required = true)
        protected String gname;
        @XmlElement(name = "NAME", required = true)
        protected String name;
        @XmlElement(name = "PERMISSIONS")
        protected VNETPOOL.VNET.PERMISSIONS permissions;
        @XmlElement(name = "CLUSTER_ID", required = true)
        protected BigInteger clusterid;
        @XmlElement(name = "CLUSTER", required = true)
        protected String cluster;
        @XmlElement(name = "BRIDGE", required = true)
        protected String bridge;
        @XmlElement(name = "VLAN", required = true)
        protected BigInteger vlan;
        @XmlElement(name = "PARENT_NETWORK_ID", required = true)
        protected String parentnetworkid;
        @XmlElement(name = "PHYDEV", required = true)
        protected String phydev;
        @XmlElement(name = "VLAN_ID", required = true)
        protected String vlanid;
        @XmlElement(name = "USED_LEASES", required = true)
        protected BigInteger usedleases;
        @XmlElement(name = "TEMPLATE", required = true)
        protected Object template;
        @XmlElement(name = "AR_POOL", required = true)
        protected VNETPOOL.VNET.ARPOOL arpool;
        
        public BigInteger getID() {
            return id;
        }
        
        public void setID(BigInteger value) {
            this.id = value;
        }
        
        public BigInteger getUID() {
            return uid;
        }
        
        public void setUID(BigInteger value) {
            this.uid = value;
        }
        
        public BigInteger getGID() {
            return gid;
        }
        
        public void setGID(BigInteger value) {
            this.gid = value;
        }
        
        public String getUNAME() {
            return uname;
        }
        
        public void setUNAME(String value) {
            this.uname = value;
        }
        
        public String getGNAME() {
            return gname;
        }
        
        public void setGNAME(String value) {
            this.gname = value;
        }
        
        public String getNAME() {
            return name;
        }
        
        public void setNAME(String value) {
            this.name = value;
        }
        
        public VNETPOOL.VNET.PERMISSIONS getPERMISSIONS() {
            return permissions;
        }
        
        public void setPERMISSIONS(VNETPOOL.VNET.PERMISSIONS value) {
            this.permissions = value;
        }
        
        public BigInteger getCLUSTERID() {
            return clusterid;
        }
        
        public void setCLUSTERID(BigInteger value) {
            this.clusterid = value;
        }
        
        public String getCLUSTER() {
            return cluster;
        }
        
        public void setCLUSTER(String value) {
            this.cluster = value;
        }
        
        public String getBRIDGE() {
            return bridge;
        }
        
        public void setBRIDGE(String value) {
            this.bridge = value;
        }
        
        public BigInteger getVLAN() {
            return vlan;
        }
        
        public void setVLAN(BigInteger value) {
            this.vlan = value;
        }
        
        public String getPARENTNETWORKID() {
            return parentnetworkid;
        }
        
        public void setPARENTNETWORKID(String value) {
            this.parentnetworkid = value;
        }
        
        public String getPHYDEV() {
            return phydev;
        }
        
        public void setPHYDEV(String value) {
            this.phydev = value;
        }
        
        public String getVLANID() {
            return vlanid;
        }
        
        public void setVLANID(String value) {
            this.vlanid = value;
        }
        
        public BigInteger getUSEDLEASES() {
            return usedleases;
        }
        
        public void setUSEDLEASES(BigInteger value) {
            this.usedleases = value;
        }
        
        public Object getTEMPLATE() {
            return template;
        }
        
        public void setTEMPLATE(Object value) {
            this.template = value;
        }
        
        public VNETPOOL.VNET.ARPOOL getARPOOL() {
            return arpool;
        }
        
        public void setARPOOL(VNETPOOL.VNET.ARPOOL value) {
            this.arpool = value;
        }
        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "ar"
        })
        public static class ARPOOL {

            @XmlElement(name = "AR")
            protected List<VNETPOOL.VNET.ARPOOL.AR> ar;
            
            public List<VNETPOOL.VNET.ARPOOL.AR> getAR() {
                if (ar == null) {
                    ar = new ArrayList<VNETPOOL.VNET.ARPOOL.AR>();
                }
                return this.ar;
            }
            
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "allocated",
                "arid",
                "globalprefix",
                "ip",
                "mac",
                "parentnetworkarid",
                "size",
                "type",
                "ulaprefix",
                "vlan"
            })
            public static class AR {

                @XmlElement(name = "ALLOCATED")
                protected String allocated;
                @XmlElement(name = "AR_ID", required = true)
                protected String arid;
                @XmlElement(name = "GLOBAL_PREFIX")
                protected String globalprefix;
                @XmlElement(name = "IP")
                protected String ip;
                @XmlElement(name = "MAC", required = true)
                protected String mac;
                @XmlElement(name = "PARENT_NETWORK_AR_ID")
                protected String parentnetworkarid;
                @XmlElement(name = "SIZE", required = true)
                protected BigInteger size;
                @XmlElement(name = "TYPE", required = true)
                protected String type;
                @XmlElement(name = "ULA_PREFIX")
                protected String ulaprefix;
                @XmlElement(name = "VLAN")
                protected String vlan;
                
                public String getALLOCATED() {
                    return allocated;
                }
                
                public void setALLOCATED(String value) {
                    this.allocated = value;
                }
                
                public String getARID() {
                    return arid;
                }
                
                public void setARID(String value) {
                    this.arid = value;
                }
                
                public String getGLOBALPREFIX() {
                    return globalprefix;
                }
                
                public void setGLOBALPREFIX(String value) {
                    this.globalprefix = value;
                }
                
                public String getIP() {
                    return ip;
                }
                
                public void setIP(String value) {
                    this.ip = value;
                }
                
                public String getMAC() {
                    return mac;
                }
                
                public void setMAC(String value) {
                    this.mac = value;
                }
                
                public String getPARENTNETWORKARID() {
                    return parentnetworkarid;
                }
                
                public void setPARENTNETWORKARID(String value) {
                    this.parentnetworkarid = value;
                }
                
                public BigInteger getSIZE() {
                    return size;
                }
                
                public void setSIZE(BigInteger value) {
                    this.size = value;
                }
                
                public String getTYPE() {
                    return type;
                }
                
                public void setTYPE(String value) {
                    this.type = value;
                }
                
                public String getULAPREFIX() {
                    return ulaprefix;
                }
                
                public void setULAPREFIX(String value) {
                    this.ulaprefix = value;
                }
                
                public String getVLAN() {
                    return vlan;
                }
                
                public void setVLAN(String value) {
                    this.vlan = value;
                }

            }

        }
        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "owneru",
            "ownerm",
            "ownera",
            "groupu",
            "groupm",
            "groupa",
            "otheru",
            "otherm",
            "othera"
        })
        public static class PERMISSIONS {

            @XmlElement(name = "OWNER_U", required = true)
            protected BigInteger owneru;
            @XmlElement(name = "OWNER_M", required = true)
            protected BigInteger ownerm;
            @XmlElement(name = "OWNER_A", required = true)
            protected BigInteger ownera;
            @XmlElement(name = "GROUP_U", required = true)
            protected BigInteger groupu;
            @XmlElement(name = "GROUP_M", required = true)
            protected BigInteger groupm;
            @XmlElement(name = "GROUP_A", required = true)
            protected BigInteger groupa;
            @XmlElement(name = "OTHER_U", required = true)
            protected BigInteger otheru;
            @XmlElement(name = "OTHER_M", required = true)
            protected BigInteger otherm;
            @XmlElement(name = "OTHER_A", required = true)
            protected BigInteger othera;
            
            public BigInteger getOWNERU() {
                return owneru;
            }
            
            public void setOWNERU(BigInteger value) {
                this.owneru = value;
            }
            
            public BigInteger getOWNERM() {
                return ownerm;
            }
            
            public void setOWNERM(BigInteger value) {
                this.ownerm = value;
            }
            
            public BigInteger getOWNERA() {
                return ownera;
            }
            
            public void setOWNERA(BigInteger value) {
                this.ownera = value;
            }
            
            public BigInteger getGROUPU() {
                return groupu;
            }
            
            public void setGROUPU(BigInteger value) {
                this.groupu = value;
            }
            
            public BigInteger getGROUPM() {
                return groupm;
            }
            
            public void setGROUPM(BigInteger value) {
                this.groupm = value;
            }
            
            public BigInteger getGROUPA() {
                return groupa;
            }
            
            public void setGROUPA(BigInteger value) {
                this.groupa = value;
            }
            
            public BigInteger getOTHERU() {
                return otheru;
            }
            
            public void setOTHERU(BigInteger value) {
                this.otheru = value;
            }
            
            public BigInteger getOTHERM() {
                return otherm;
            }
            
            public void setOTHERM(BigInteger value) {
                this.otherm = value;
            }
            
            public BigInteger getOTHERA() {
                return othera;
            }
            
            public void setOTHERA(BigInteger value) {
                this.othera = value;
            }

        }

    }

}
