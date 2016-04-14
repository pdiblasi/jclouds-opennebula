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
    "name",
    "state",
    "immad",
    "vmmad",
    "vnmad",
    "lastmontime",
    "clusterid",
    "cluster",
    "hostshare",
    "vms",
    "template"
})
@XmlRootElement(name = "HOST")
public class HOST {

    @XmlElement(name = "ID", required = true)
    protected BigInteger id;
    @XmlElement(name = "NAME", required = true)
    protected String name;
    @XmlElement(name = "STATE", required = true)
    protected BigInteger state;
    @XmlElement(name = "IM_MAD", required = true)
    protected String immad;
    @XmlElement(name = "VM_MAD", required = true)
    protected String vmmad;
    @XmlElement(name = "VN_MAD", required = true)
    protected String vnmad;
    @XmlElement(name = "LAST_MON_TIME", required = true)
    protected BigInteger lastmontime;
    @XmlElement(name = "CLUSTER_ID", required = true)
    protected BigInteger clusterid;
    @XmlElement(name = "CLUSTER", required = true)
    protected String cluster;
    @XmlElement(name = "HOST_SHARE", required = true)
    protected HOST.HOSTSHARE hostshare;
    @XmlElement(name = "VMS", required = true)
    protected HOST.VMS vms;
    @XmlElement(name = "TEMPLATE", required = true)
    protected Object template;
    
    public BigInteger getID() {
        return id;
    }
    
    public void setID(BigInteger value) {
        this.id = value;
    }
    
    public String getNAME() {
        return name;
    }
    
    public void setNAME(String value) {
        this.name = value;
    }
    
    public BigInteger getSTATE() {
        return state;
    }
    
    public void setSTATE(BigInteger value) {
        this.state = value;
    }
    
    public String getIMMAD() {
        return immad;
    }
    
    public void setIMMAD(String value) {
        this.immad = value;
    }
    
    public String getVMMAD() {
        return vmmad;
    }
    
    public void setVMMAD(String value) {
        this.vmmad = value;
    }
    
    public String getVNMAD() {
        return vnmad;
    }
    
    public void setVNMAD(String value) {
        this.vnmad = value;
    }
    
    public BigInteger getLASTMONTIME() {
        return lastmontime;
    }
    
    public void setLASTMONTIME(BigInteger value) {
        this.lastmontime = value;
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
    
    public HOST.HOSTSHARE getHOSTSHARE() {
        return hostshare;
    }
    
    public void setHOSTSHARE(HOST.HOSTSHARE value) {
        this.hostshare = value;
    }
    
    public HOST.VMS getVMS() {
        return vms;
    }
    
    public void setVMS(HOST.VMS value) {
        this.vms = value;
    }
    
    public Object getTEMPLATE() {
        return template;
    }
    
    public void setTEMPLATE(Object value) {
        this.template = value;
    }
    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "diskusage",
        "memusage",
        "cpuusage",
        "maxdisk",
        "maxmem",
        "maxcpu",
        "freedisk",
        "freemem",
        "freecpu",
        "useddisk",
        "usedmem",
        "usedcpu",
        "runningvms",
        "datastores",
        "pcidevices"
    })
    public static class HOSTSHARE {

        @XmlElement(name = "DISK_USAGE", required = true)
        protected BigInteger diskusage;
        @XmlElement(name = "MEM_USAGE", required = true)
        protected BigInteger memusage;
        @XmlElement(name = "CPU_USAGE", required = true)
        protected BigInteger cpuusage;
        @XmlElement(name = "MAX_DISK", required = true)
        protected BigInteger maxdisk;
        @XmlElement(name = "MAX_MEM", required = true)
        protected BigInteger maxmem;
        @XmlElement(name = "MAX_CPU", required = true)
        protected BigInteger maxcpu;
        @XmlElement(name = "FREE_DISK", required = true)
        protected BigInteger freedisk;
        @XmlElement(name = "FREE_MEM", required = true)
        protected BigInteger freemem;
        @XmlElement(name = "FREE_CPU", required = true)
        protected BigInteger freecpu;
        @XmlElement(name = "USED_DISK", required = true)
        protected BigInteger useddisk;
        @XmlElement(name = "USED_MEM", required = true)
        protected BigInteger usedmem;
        @XmlElement(name = "USED_CPU", required = true)
        protected BigInteger usedcpu;
        @XmlElement(name = "RUNNING_VMS", required = true)
        protected BigInteger runningvms;
        @XmlElement(name = "DATASTORES", required = true)
        protected HOST.HOSTSHARE.DATASTORES datastores;
        @XmlElement(name = "PCI_DEVICES", required = true)
        protected HOST.HOSTSHARE.PCIDEVICES pcidevices;
        
        public BigInteger getDISKUSAGE() {
            return diskusage;
        }
        
        public void setDISKUSAGE(BigInteger value) {
            this.diskusage = value;
        }
        
        public BigInteger getMEMUSAGE() {
            return memusage;
        }
        
        public void setMEMUSAGE(BigInteger value) {
            this.memusage = value;
        }
        
        public BigInteger getCPUUSAGE() {
            return cpuusage;
        }
        
        public void setCPUUSAGE(BigInteger value) {
            this.cpuusage = value;
        }
        
        public BigInteger getMAXDISK() {
            return maxdisk;
        }
        
        public void setMAXDISK(BigInteger value) {
            this.maxdisk = value;
        }
        
        public BigInteger getMAXMEM() {
            return maxmem;
        }
        
        public void setMAXMEM(BigInteger value) {
            this.maxmem = value;
        }
        
        public BigInteger getMAXCPU() {
            return maxcpu;
        }
        
        public void setMAXCPU(BigInteger value) {
            this.maxcpu = value;
        }
        
        public BigInteger getFREEDISK() {
            return freedisk;
        }
        
        public void setFREEDISK(BigInteger value) {
            this.freedisk = value;
        }
        
        public BigInteger getFREEMEM() {
            return freemem;
        }
        
        public void setFREEMEM(BigInteger value) {
            this.freemem = value;
        }
        
        public BigInteger getFREECPU() {
            return freecpu;
        }
        
        public void setFREECPU(BigInteger value) {
            this.freecpu = value;
        }
        
        public BigInteger getUSEDDISK() {
            return useddisk;
        }
        
        public void setUSEDDISK(BigInteger value) {
            this.useddisk = value;
        }
        
        public BigInteger getUSEDMEM() {
            return usedmem;
        }
        
        public void setUSEDMEM(BigInteger value) {
            this.usedmem = value;
        }
        
        public BigInteger getUSEDCPU() {
            return usedcpu;
        }
        
        public void setUSEDCPU(BigInteger value) {
            this.usedcpu = value;
        }
        
        public BigInteger getRUNNINGVMS() {
            return runningvms;
        }
        
        public void setRUNNINGVMS(BigInteger value) {
            this.runningvms = value;
        }
        
        public HOST.HOSTSHARE.DATASTORES getDATASTORES() {
            return datastores;
        }
        
        public void setDATASTORES(HOST.HOSTSHARE.DATASTORES value) {
            this.datastores = value;
        }
        
        public HOST.HOSTSHARE.PCIDEVICES getPCIDEVICES() {
            return pcidevices;
        }
        
        public void setPCIDEVICES(HOST.HOSTSHARE.PCIDEVICES value) {
            this.pcidevices = value;
        }
        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "ds"
        })
        public static class DATASTORES {

            @XmlElement(name = "DS")
            protected List<HOST.HOSTSHARE.DATASTORES.DS> ds;
            
            public List<HOST.HOSTSHARE.DATASTORES.DS> getDS() {
                if (ds == null) {
                    ds = new ArrayList<HOST.HOSTSHARE.DATASTORES.DS>();
                }
                return this.ds;
            }
            
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class DS {

                @XmlElement(name = "ID", required = true)
                protected BigInteger id;
                @XmlElement(name = "FREE_MB", required = true)
                protected BigInteger freemb;
                @XmlElement(name = "TOTAL_MB", required = true)
                protected BigInteger totalmb;
                @XmlElement(name = "USED_MB", required = true)
                protected BigInteger usedmb;
                
                public BigInteger getID() {
                    return id;
                }
                
                public void setID(BigInteger value) {
                    this.id = value;
                }
                
                public BigInteger getFREEMB() {
                    return freemb;
                }
                
                public void setFREEMB(BigInteger value) {
                    this.freemb = value;
                }
                
                public BigInteger getTOTALMB() {
                    return totalmb;
                }
                
                public void setTOTALMB(BigInteger value) {
                    this.totalmb = value;
                }
                
                public BigInteger getUSEDMB() {
                    return usedmb;
                }
                
                public void setUSEDMB(BigInteger value) {
                    this.usedmb = value;
                }

            }

        }
        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "pci"
        })
        public static class PCIDEVICES {

            @XmlElement(name = "PCI")
            protected List<Object> pci;
            
            public List<Object> getPCI() {
                if (pci == null) {
                    pci = new ArrayList<Object>();
                }
                return this.pci;
            }

        }

    }
    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id"
    })
    public static class VMS {

        @XmlElement(name = "ID")
        protected List<BigInteger> id;
        
        public List<BigInteger> getID() {
            if (id == null) {
                id = new ArrayList<BigInteger>();
            }
            return this.id;
        }

    }

}
