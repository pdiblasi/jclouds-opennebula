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
@XmlRootElement(name = "VNET")
public class VNET {

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
    protected VNET.PERMISSIONS permissions;
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
    protected VNET.ARPOOL arpool;

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
    
    public VNET.PERMISSIONS getPERMISSIONS() {
        return permissions;
    }

    /**
     * Imposta il valore della proprietà permissions.
     * 
     * @param value
     *     allowed object is
     *     {@link VNET.PERMISSIONS }
     *     
     */
    public void setPERMISSIONS(VNET.PERMISSIONS value) {
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
    
    public VNET.ARPOOL getARPOOL() {
        return arpool;
    }
    
    public void setARPOOL(VNET.ARPOOL value) {
        this.arpool = value;
    }
    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ar"
    })
    public static class ARPOOL {

        @XmlElement(name = "AR")
        protected List<VNET.ARPOOL.AR> ar;
        
        public List<VNET.ARPOOL.AR> getAR() {
            if (ar == null) {
                ar = new ArrayList<VNET.ARPOOL.AR>();
            }
            return this.ar;
        }
        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "arid",
            "globalprefix",
            "ip",
            "mac",
            "parentnetworkarid",
            "size",
            "type",
            "ulaprefix",
            "vlan",
            "macend",
            "ipend",
            "ip6ULA",
            "ip6ULAEND",
            "ip6GLOBAL",
            "ip6GLOBALEND",
            "usedleases",
            "leases"
        })
        public static class AR {

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
            @XmlElement(name = "MAC_END")
            protected String macend;
            @XmlElement(name = "IP_END")
            protected String ipend;
            @XmlElement(name = "IP6_ULA")
            protected String ip6ULA;
            @XmlElement(name = "IP6_ULA_END")
            protected String ip6ULAEND;
            @XmlElement(name = "IP6_GLOBAL")
            protected String ip6GLOBAL;
            @XmlElement(name = "IP6_GLOBAL_END")
            protected String ip6GLOBALEND;
            @XmlElement(name = "USED_LEASES", required = true)
            protected String usedleases;
            @XmlElement(name = "LEASES")
            protected VNET.ARPOOL.AR.LEASES leases;
            
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
            
            public String getMACEND() {
                return macend;
            }
            
            public void setMACEND(String value) {
                this.macend = value;
            }
            
            public String getIPEND() {
                return ipend;
            }
            
            public void setIPEND(String value) {
                this.ipend = value;
            }
            
            public String getIP6ULA() {
                return ip6ULA;
            }
            
            public void setIP6ULA(String value) {
                this.ip6ULA = value;
            }
            
            public String getIP6ULAEND() {
                return ip6ULAEND;
            }
            
            public void setIP6ULAEND(String value) {
                this.ip6ULAEND = value;
            }
            
            public String getIP6GLOBAL() {
                return ip6GLOBAL;
            }
            
            public void setIP6GLOBAL(String value) {
                this.ip6GLOBAL = value;
            }
            
            public String getIP6GLOBALEND() {
                return ip6GLOBALEND;
            }
            
            public void setIP6GLOBALEND(String value) {
                this.ip6GLOBALEND = value;
            }
            
            public String getUSEDLEASES() {
                return usedleases;
            }
            
            public void setUSEDLEASES(String value) {
                this.usedleases = value;
            }
            
            public VNET.ARPOOL.AR.LEASES getLEASES() {
                return leases;
            }
            
            public void setLEASES(VNET.ARPOOL.AR.LEASES value) {
                this.leases = value;
            }
            
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "lease"
            })
            public static class LEASES {

                @XmlElement(name = "LEASE")
                protected List<VNET.ARPOOL.AR.LEASES.LEASE> lease;
                
                public List<VNET.ARPOOL.AR.LEASES.LEASE> getLEASE() {
                    if (lease == null) {
                        lease = new ArrayList<VNET.ARPOOL.AR.LEASES.LEASE>();
                    }
                    return this.lease;
                }
                
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {

                })
                public static class LEASE {

                    @XmlElement(name = "IP")
                    protected String ip;
                    @XmlElement(name = "IP6_GLOBAL")
                    protected String ip6GLOBAL;
                    @XmlElement(name = "IP6_LINK")
                    protected String ip6LINK;
                    @XmlElement(name = "IP6_ULA")
                    protected String ip6ULA;
                    @XmlElement(name = "MAC", required = true)
                    protected String mac;
                    @XmlElement(name = "VM")
                    protected BigInteger vm;
                    @XmlElement(name = "VNET")
                    protected BigInteger vnet;
                    
                    public String getIP() {
                        return ip;
                    }
                    
                    public void setIP(String value) {
                        this.ip = value;
                    }
                    
                    public String getIP6GLOBAL() {
                        return ip6GLOBAL;
                    }
                    
                    public void setIP6GLOBAL(String value) {
                        this.ip6GLOBAL = value;
                    }
                    
                    public String getIP6LINK() {
                        return ip6LINK;
                    }
                    
                    public void setIP6LINK(String value) {
                        this.ip6LINK = value;
                    }
                    
                    public String getIP6ULA() {
                        return ip6ULA;
                    }
                    
                    public void setIP6ULA(String value) {
                        this.ip6ULA = value;
                    }
                    
                    public String getMAC() {
                        return mac;
                    }
                    
                    public void setMAC(String value) {
                        this.mac = value;
                    }
                    
                    public BigInteger getVM() {
                        return vm;
                    }
                    
                    public void setVM(BigInteger value) {
                        this.vm = value;
                    }
                    
                    public BigInteger getVNET() {
                        return vnet;
                    }
                    
                    public void setVNET(BigInteger value) {
                        this.vnet = value;
                    }

                }

            }

        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OWNER_U" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="OWNER_M" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="OWNER_A" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="GROUP_U" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="GROUP_M" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="GROUP_A" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="OTHER_U" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="OTHER_M" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="OTHER_A" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
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

        /**
         * Recupera il valore della proprietà owneru.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOWNERU() {
            return owneru;
        }

        /**
         * Imposta il valore della proprietà owneru.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOWNERU(BigInteger value) {
            this.owneru = value;
        }

        /**
         * Recupera il valore della proprietà ownerm.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOWNERM() {
            return ownerm;
        }

        /**
         * Imposta il valore della proprietà ownerm.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOWNERM(BigInteger value) {
            this.ownerm = value;
        }

        /**
         * Recupera il valore della proprietà ownera.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOWNERA() {
            return ownera;
        }

        /**
         * Imposta il valore della proprietà ownera.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOWNERA(BigInteger value) {
            this.ownera = value;
        }

        /**
         * Recupera il valore della proprietà groupu.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getGROUPU() {
            return groupu;
        }

        /**
         * Imposta il valore della proprietà groupu.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setGROUPU(BigInteger value) {
            this.groupu = value;
        }

        /**
         * Recupera il valore della proprietà groupm.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getGROUPM() {
            return groupm;
        }

        /**
         * Imposta il valore della proprietà groupm.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setGROUPM(BigInteger value) {
            this.groupm = value;
        }

        /**
         * Recupera il valore della proprietà groupa.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getGROUPA() {
            return groupa;
        }

        /**
         * Imposta il valore della proprietà groupa.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setGROUPA(BigInteger value) {
            this.groupa = value;
        }

        /**
         * Recupera il valore della proprietà otheru.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOTHERU() {
            return otheru;
        }

        /**
         * Imposta il valore della proprietà otheru.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOTHERU(BigInteger value) {
            this.otheru = value;
        }

        /**
         * Recupera il valore della proprietà otherm.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOTHERM() {
            return otherm;
        }

        /**
         * Imposta il valore della proprietà otherm.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOTHERM(BigInteger value) {
            this.otherm = value;
        }

        /**
         * Recupera il valore della proprietà othera.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOTHERA() {
            return othera;
        }

        /**
         * Imposta il valore della proprietà othera.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOTHERA(BigInteger value) {
            this.othera = value;
        }

    }

}
