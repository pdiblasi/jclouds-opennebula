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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "groupOrQUOTAS",
    "defaultgroupquotas"
})
@XmlRootElement(name = "GROUP_POOL")
public class GROUPPOOL {

    @XmlElements({
        @XmlElement(name = "GROUP", type = GROUPPOOL.GROUP.class),
        @XmlElement(name = "QUOTAS", type = GROUPPOOL.QUOTAS.class)
    })
    protected List<Object> groupOrQUOTAS;
    @XmlElement(name = "DEFAULT_GROUP_QUOTAS", required = true)
    protected GROUPPOOL.DEFAULTGROUPQUOTAS defaultgroupquotas;

    public List<Object> getGROUPOrQUOTAS() {
        if (groupOrQUOTAS == null) {
            groupOrQUOTAS = new ArrayList<Object>();
        }
        return this.groupOrQUOTAS;
    }
    
    public GROUPPOOL.DEFAULTGROUPQUOTAS getDEFAULTGROUPQUOTAS() {
        return defaultgroupquotas;
    }
    
    public void setDEFAULTGROUPQUOTAS(GROUPPOOL.DEFAULTGROUPQUOTAS value) {
        this.defaultgroupquotas = value;
    }
    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "datastorequota",
        "networkquota",
        "vmquota",
        "imagequota"
    })
    public static class DEFAULTGROUPQUOTAS {

        @XmlElement(name = "DATASTORE_QUOTA")
        protected GROUPPOOL.DEFAULTGROUPQUOTAS.DATASTOREQUOTA datastorequota;
        @XmlElement(name = "NETWORK_QUOTA")
        protected GROUPPOOL.DEFAULTGROUPQUOTAS.NETWORKQUOTA networkquota;
        @XmlElement(name = "VM_QUOTA")
        protected GROUPPOOL.DEFAULTGROUPQUOTAS.VMQUOTA vmquota;
        @XmlElement(name = "IMAGE_QUOTA")
        protected GROUPPOOL.DEFAULTGROUPQUOTAS.IMAGEQUOTA imagequota;
        
        public GROUPPOOL.DEFAULTGROUPQUOTAS.DATASTOREQUOTA getDATASTOREQUOTA() {
            return datastorequota;
        }
        
        public void setDATASTOREQUOTA(GROUPPOOL.DEFAULTGROUPQUOTAS.DATASTOREQUOTA value) {
            this.datastorequota = value;
        }
        
        public GROUPPOOL.DEFAULTGROUPQUOTAS.NETWORKQUOTA getNETWORKQUOTA() {
            return networkquota;
        }
        
        public void setNETWORKQUOTA(GROUPPOOL.DEFAULTGROUPQUOTAS.NETWORKQUOTA value) {
            this.networkquota = value;
        }
        
        public GROUPPOOL.DEFAULTGROUPQUOTAS.VMQUOTA getVMQUOTA() {
            return vmquota;
        }
        
        public void setVMQUOTA(GROUPPOOL.DEFAULTGROUPQUOTAS.VMQUOTA value) {
            this.vmquota = value;
        }
        
        public GROUPPOOL.DEFAULTGROUPQUOTAS.IMAGEQUOTA getIMAGEQUOTA() {
            return imagequota;
        }
        
        public void setIMAGEQUOTA(GROUPPOOL.DEFAULTGROUPQUOTAS.IMAGEQUOTA value) {
            this.imagequota = value;
        }
        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "datastore"
        })
        public static class DATASTOREQUOTA {

            @XmlElement(name = "DATASTORE")
            protected List<GROUPPOOL.DEFAULTGROUPQUOTAS.DATASTOREQUOTA.DATASTORE> datastore;
            
            public List<GROUPPOOL.DEFAULTGROUPQUOTAS.DATASTOREQUOTA.DATASTORE> getDATASTORE() {
                if (datastore == null) {
                    datastore = new ArrayList<GROUPPOOL.DEFAULTGROUPQUOTAS.DATASTOREQUOTA.DATASTORE>();
                }
                return this.datastore;
            }
            
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "id",
                "images",
                "imagesused",
                "size",
                "sizeused"
            })
            public static class DATASTORE {

                @XmlElement(name = "ID", required = true)
                protected String id;
                @XmlElement(name = "IMAGES", required = true)
                protected String images;
                @XmlElement(name = "IMAGES_USED", required = true)
                protected String imagesused;
                @XmlElement(name = "SIZE", required = true)
                protected String size;
                @XmlElement(name = "SIZE_USED", required = true)
                protected String sizeused;
                
                public String getID() {
                    return id;
                }
                
                public void setID(String value) {
                    this.id = value;
                }
                
                public String getIMAGES() {
                    return images;
                }
                
                public void setIMAGES(String value) {
                    this.images = value;
                }
                
                public String getIMAGESUSED() {
                    return imagesused;
                }
                
                public void setIMAGESUSED(String value) {
                    this.imagesused = value;
                }
                
                public String getSIZE() {
                    return size;
                }
                
                public void setSIZE(String value) {
                    this.size = value;
                }
                
                public String getSIZEUSED() {
                    return sizeused;
                }
                
                public void setSIZEUSED(String value) {
                    this.sizeused = value;
                }

            }

        }
        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "image"
        })
        public static class IMAGEQUOTA {

            @XmlElement(name = "IMAGE")
            protected List<GROUPPOOL.DEFAULTGROUPQUOTAS.IMAGEQUOTA.IMAGE> image;
            
            public List<GROUPPOOL.DEFAULTGROUPQUOTAS.IMAGEQUOTA.IMAGE> getIMAGE() {
                if (image == null) {
                    image = new ArrayList<GROUPPOOL.DEFAULTGROUPQUOTAS.IMAGEQUOTA.IMAGE>();
                }
                return this.image;
            }
            
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "id",
                "rvms",
                "rvmsused"
            })
            public static class IMAGE {

                @XmlElement(name = "ID", required = true)
                protected String id;
                @XmlElement(name = "RVMS", required = true)
                protected String rvms;
                @XmlElement(name = "RVMS_USED", required = true)
                protected String rvmsused;
                
                public String getID() {
                    return id;
                }
                
                public void setID(String value) {
                    this.id = value;
                }
                
                public String getRVMS() {
                    return rvms;
                }
                
                public void setRVMS(String value) {
                    this.rvms = value;
                }
                
                public String getRVMSUSED() {
                    return rvmsused;
                }
                
                public void setRVMSUSED(String value) {
                    this.rvmsused = value;
                }

            }

        }
        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "network"
        })
        public static class NETWORKQUOTA {

            @XmlElement(name = "NETWORK")
            protected List<GROUPPOOL.DEFAULTGROUPQUOTAS.NETWORKQUOTA.NETWORK> network;
            
            public List<GROUPPOOL.DEFAULTGROUPQUOTAS.NETWORKQUOTA.NETWORK> getNETWORK() {
                if (network == null) {
                    network = new ArrayList<GROUPPOOL.DEFAULTGROUPQUOTAS.NETWORKQUOTA.NETWORK>();
                }
                return this.network;
            }
            
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "id",
                "leases",
                "leasesused"
            })
            public static class NETWORK {

                @XmlElement(name = "ID", required = true)
                protected String id;
                @XmlElement(name = "LEASES", required = true)
                protected String leases;
                @XmlElement(name = "LEASES_USED", required = true)
                protected String leasesused;
                
                public String getID() {
                    return id;
                }
                
                public void setID(String value) {
                    this.id = value;
                }
                
                public String getLEASES() {
                    return leases;
                }
                
                public void setLEASES(String value) {
                    this.leases = value;
                }
                
                public String getLEASESUSED() {
                    return leasesused;
                }
                
                public void setLEASESUSED(String value) {
                    this.leasesused = value;
                }

            }

        }
        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "vm"
        })
        public static class VMQUOTA {

            @XmlElement(name = "VM")
            protected GROUPPOOL.DEFAULTGROUPQUOTAS.VMQUOTA.VM vm;
            
            public GROUPPOOL.DEFAULTGROUPQUOTAS.VMQUOTA.VM getVM() {
                return vm;
            }
            
            public void setVM(GROUPPOOL.DEFAULTGROUPQUOTAS.VMQUOTA.VM value) {
                this.vm = value;
            }
            
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "cpu",
                "cpuused",
                "memory",
                "memoryused",
                "vms",
                "vmsused"
            })
            public static class VM {

                @XmlElement(name = "CPU", required = true)
                protected String cpu;
                @XmlElement(name = "CPU_USED", required = true)
                protected String cpuused;
                @XmlElement(name = "MEMORY", required = true)
                protected String memory;
                @XmlElement(name = "MEMORY_USED", required = true)
                protected String memoryused;
                @XmlElement(name = "VMS", required = true)
                protected String vms;
                @XmlElement(name = "VMS_USED", required = true)
                protected String vmsused;
                
                public String getCPU() {
                    return cpu;
                }
                
                public void setCPU(String value) {
                    this.cpu = value;
                }
                
                public String getCPUUSED() {
                    return cpuused;
                }
                
                public void setCPUUSED(String value) {
                    this.cpuused = value;
                }
                
                public String getMEMORY() {
                    return memory;
                }
                
                public void setMEMORY(String value) {
                    this.memory = value;
                }
                
                public String getMEMORYUSED() {
                    return memoryused;
                }
                
                public void setMEMORYUSED(String value) {
                    this.memoryused = value;
                }
                
                public String getVMS() {
                    return vms;
                }
                
                public void setVMS(String value) {
                    this.vms = value;
                }
                
                public String getVMSUSED() {
                    return vmsused;
                }
                
                public void setVMSUSED(String value) {
                    this.vmsused = value;
                }

            }

        }

    }
    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "name",
        "template",
        "users",
        "admins"
    })
    public static class GROUP {

        @XmlElement(name = "ID", required = true)
        protected BigInteger id;
        @XmlElement(name = "NAME", required = true)
        protected String name;
        @XmlElement(name = "TEMPLATE", required = true)
        protected Object template;
        @XmlElement(name = "USERS", required = true)
        protected GROUPPOOL.GROUP.USERS users;
        @XmlElement(name = "ADMINS", required = true)
        protected GROUPPOOL.GROUP.ADMINS admins;
        
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
        
        public Object getTEMPLATE() {
            return template;
        }
        
        public void setTEMPLATE(Object value) {
            this.template = value;
        }
        
        public GROUPPOOL.GROUP.USERS getUSERS() {
            return users;
        }
        
        public void setUSERS(GROUPPOOL.GROUP.USERS value) {
            this.users = value;
        }
        
        public GROUPPOOL.GROUP.ADMINS getADMINS() {
            return admins;
        }
        
        public void setADMINS(GROUPPOOL.GROUP.ADMINS value) {
            this.admins = value;
        }
        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id"
        })
        public static class ADMINS {

            @XmlElement(name = "ID")
            protected List<BigInteger> id;
            
            public List<BigInteger> getID() {
                if (id == null) {
                    id = new ArrayList<BigInteger>();
                }
                return this.id;
            }

        }
        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id"
        })
        public static class USERS {

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
    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "datastorequota",
        "networkquota",
        "vmquota",
        "imagequota"
    })
    public static class QUOTAS {

        @XmlElement(name = "ID", required = true)
        protected BigInteger id;
        @XmlElement(name = "DATASTORE_QUOTA")
        protected GROUPPOOL.QUOTAS.DATASTOREQUOTA datastorequota;
        @XmlElement(name = "NETWORK_QUOTA")
        protected GROUPPOOL.QUOTAS.NETWORKQUOTA networkquota;
        @XmlElement(name = "VM_QUOTA")
        protected GROUPPOOL.QUOTAS.VMQUOTA vmquota;
        @XmlElement(name = "IMAGE_QUOTA")
        protected GROUPPOOL.QUOTAS.IMAGEQUOTA imagequota;
        
        public BigInteger getID() {
            return id;
        }
        
        public void setID(BigInteger value) {
            this.id = value;
        }
        
        public GROUPPOOL.QUOTAS.DATASTOREQUOTA getDATASTOREQUOTA() {
            return datastorequota;
        }
        
        public void setDATASTOREQUOTA(GROUPPOOL.QUOTAS.DATASTOREQUOTA value) {
            this.datastorequota = value;
        }
        
        public GROUPPOOL.QUOTAS.NETWORKQUOTA getNETWORKQUOTA() {
            return networkquota;
        }
        
        public void setNETWORKQUOTA(GROUPPOOL.QUOTAS.NETWORKQUOTA value) {
            this.networkquota = value;
        }
        
        public GROUPPOOL.QUOTAS.VMQUOTA getVMQUOTA() {
            return vmquota;
        }
        
        public void setVMQUOTA(GROUPPOOL.QUOTAS.VMQUOTA value) {
            this.vmquota = value;
        }
        
        public GROUPPOOL.QUOTAS.IMAGEQUOTA getIMAGEQUOTA() {
            return imagequota;
        }
        
        public void setIMAGEQUOTA(GROUPPOOL.QUOTAS.IMAGEQUOTA value) {
            this.imagequota = value;
        }
        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "datastore"
        })
        public static class DATASTOREQUOTA {

            @XmlElement(name = "DATASTORE")
            protected List<GROUPPOOL.QUOTAS.DATASTOREQUOTA.DATASTORE> datastore;
            
            public List<GROUPPOOL.QUOTAS.DATASTOREQUOTA.DATASTORE> getDATASTORE() {
                if (datastore == null) {
                    datastore = new ArrayList<GROUPPOOL.QUOTAS.DATASTOREQUOTA.DATASTORE>();
                }
                return this.datastore;
            }
            
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "id",
                "images",
                "imagesused",
                "size",
                "sizeused"
            })
            public static class DATASTORE {

                @XmlElement(name = "ID", required = true)
                protected String id;
                @XmlElement(name = "IMAGES", required = true)
                protected String images;
                @XmlElement(name = "IMAGES_USED", required = true)
                protected String imagesused;
                @XmlElement(name = "SIZE", required = true)
                protected String size;
                @XmlElement(name = "SIZE_USED", required = true)
                protected String sizeused;
                
                public String getID() {
                    return id;
                }
                
                public void setID(String value) {
                    this.id = value;
                }
                
                public String getIMAGES() {
                    return images;
                }
                
                public void setIMAGES(String value) {
                    this.images = value;
                }
                
                public String getIMAGESUSED() {
                    return imagesused;
                }
                
                public void setIMAGESUSED(String value) {
                    this.imagesused = value;
                }
                
                public String getSIZE() {
                    return size;
                }
                
                public void setSIZE(String value) {
                    this.size = value;
                }
                
                public String getSIZEUSED() {
                    return sizeused;
                }
                
                public void setSIZEUSED(String value) {
                    this.sizeused = value;
                }

            }

        }
        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "image"
        })
        public static class IMAGEQUOTA {

            @XmlElement(name = "IMAGE")
            protected List<GROUPPOOL.QUOTAS.IMAGEQUOTA.IMAGE> image;
            
            public List<GROUPPOOL.QUOTAS.IMAGEQUOTA.IMAGE> getIMAGE() {
                if (image == null) {
                    image = new ArrayList<GROUPPOOL.QUOTAS.IMAGEQUOTA.IMAGE>();
                }
                return this.image;
            }
            
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "id",
                "rvms",
                "rvmsused"
            })
            public static class IMAGE {

                @XmlElement(name = "ID", required = true)
                protected String id;
                @XmlElement(name = "RVMS", required = true)
                protected String rvms;
                @XmlElement(name = "RVMS_USED", required = true)
                protected String rvmsused;
                
                public String getID() {
                    return id;
                }
                
                public void setID(String value) {
                    this.id = value;
                }
                
                public String getRVMS() {
                    return rvms;
                }
                
                public void setRVMS(String value) {
                    this.rvms = value;
                }
                
                public String getRVMSUSED() {
                    return rvmsused;
                }
                
                public void setRVMSUSED(String value) {
                    this.rvmsused = value;
                }

            }

        }
        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "network"
        })
        public static class NETWORKQUOTA {

            @XmlElement(name = "NETWORK")
            protected List<GROUPPOOL.QUOTAS.NETWORKQUOTA.NETWORK> network;
            
            public List<GROUPPOOL.QUOTAS.NETWORKQUOTA.NETWORK> getNETWORK() {
                if (network == null) {
                    network = new ArrayList<GROUPPOOL.QUOTAS.NETWORKQUOTA.NETWORK>();
                }
                return this.network;
            }
            
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "id",
                "leases",
                "leasesused"
            })
            public static class NETWORK {

                @XmlElement(name = "ID", required = true)
                protected String id;
                @XmlElement(name = "LEASES", required = true)
                protected String leases;
                @XmlElement(name = "LEASES_USED", required = true)
                protected String leasesused;
                
                public String getID() {
                    return id;
                }
                
                public void setID(String value) {
                    this.id = value;
                }
                
                public String getLEASES() {
                    return leases;
                }
                
                public void setLEASES(String value) {
                    this.leases = value;
                }
                
                public String getLEASESUSED() {
                    return leasesused;
                }
                
                public void setLEASESUSED(String value) {
                    this.leasesused = value;
                }

            }

        }
        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "vm"
        })
        public static class VMQUOTA {

            @XmlElement(name = "VM")
            protected GROUPPOOL.QUOTAS.VMQUOTA.VM vm;
            
            public GROUPPOOL.QUOTAS.VMQUOTA.VM getVM() {
                return vm;
            }
            
            public void setVM(GROUPPOOL.QUOTAS.VMQUOTA.VM value) {
                this.vm = value;
            }
            
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "cpu",
                "cpuused",
                "memory",
                "memoryused",
                "vms",
                "vmsused",
                "systemdisksize",
                "systemdisksizeused"
            })
            public static class VM {

                @XmlElement(name = "CPU", required = true)
                protected String cpu;
                @XmlElement(name = "CPU_USED", required = true)
                protected String cpuused;
                @XmlElement(name = "MEMORY", required = true)
                protected String memory;
                @XmlElement(name = "MEMORY_USED", required = true)
                protected String memoryused;
                @XmlElement(name = "VMS", required = true)
                protected String vms;
                @XmlElement(name = "VMS_USED", required = true)
                protected String vmsused;
                @XmlElement(name = "SYSTEM_DISK_SIZE", required = true)
                protected String systemdisksize;
                @XmlElement(name = "SYSTEM_DISK_SIZE_USED", required = true)
                protected String systemdisksizeused;
                
                public String getCPU() {
                    return cpu;
                }
                
                public void setCPU(String value) {
                    this.cpu = value;
                }
                
                public String getCPUUSED() {
                    return cpuused;
                }
                
                public void setCPUUSED(String value) {
                    this.cpuused = value;
                }
                
                public String getMEMORY() {
                    return memory;
                }
                
                public void setMEMORY(String value) {
                    this.memory = value;
                }
                
                public String getMEMORYUSED() {
                    return memoryused;
                }
                
                public void setMEMORYUSED(String value) {
                    this.memoryused = value;
                }
                
                public String getVMS() {
                    return vms;
                }
                
                public void setVMS(String value) {
                    this.vms = value;
                }
                
                public String getVMSUSED() {
                    return vmsused;
                }
                
                public void setVMSUSED(String value) {
                    this.vmsused = value;
                }
                
                public String getSYSTEMDISKSIZE() {
                    return systemdisksize;
                }
                
                public void setSYSTEMDISKSIZE(String value) {
                    this.systemdisksize = value;
                }
                
                public String getSYSTEMDISKSIZEUSED() {
                    return systemdisksizeused;
                }
                
                public void setSYSTEMDISKSIZEUSED(String value) {
                    this.systemdisksizeused = value;
                }

            }

        }

    }

}
