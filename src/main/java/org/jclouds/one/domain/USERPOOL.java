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
    "userOrQUOTAS",
    "defaultuserquotas"
})
@XmlRootElement(name = "USER_POOL")
public class USERPOOL {

    @XmlElements({
        @XmlElement(name = "USER", type = USERPOOL.USER.class),
        @XmlElement(name = "QUOTAS", type = USERPOOL.QUOTAS.class)
    })
    protected List<Object> userOrQUOTAS;
    @XmlElement(name = "DEFAULT_USER_QUOTAS", required = true)
    protected USERPOOL.DEFAULTUSERQUOTAS defaultuserquotas;
    
    public List<Object> getUSEROrQUOTAS() {
        if (userOrQUOTAS == null) {
            userOrQUOTAS = new ArrayList<Object>();
        }
        return this.userOrQUOTAS;
    }
    
    public USERPOOL.DEFAULTUSERQUOTAS getDEFAULTUSERQUOTAS() {
        return defaultuserquotas;
    }
    
    public void setDEFAULTUSERQUOTAS(USERPOOL.DEFAULTUSERQUOTAS value) {
        this.defaultuserquotas = value;
    }
    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "datastorequota",
        "networkquota",
        "vmquota",
        "imagequota"
    })
    public static class DEFAULTUSERQUOTAS {

        @XmlElement(name = "DATASTORE_QUOTA")
        protected USERPOOL.DEFAULTUSERQUOTAS.DATASTOREQUOTA datastorequota;
        @XmlElement(name = "NETWORK_QUOTA")
        protected USERPOOL.DEFAULTUSERQUOTAS.NETWORKQUOTA networkquota;
        @XmlElement(name = "VM_QUOTA")
        protected USERPOOL.DEFAULTUSERQUOTAS.VMQUOTA vmquota;
        @XmlElement(name = "IMAGE_QUOTA")
        protected USERPOOL.DEFAULTUSERQUOTAS.IMAGEQUOTA imagequota;
        
        public USERPOOL.DEFAULTUSERQUOTAS.DATASTOREQUOTA getDATASTOREQUOTA() {
            return datastorequota;
        }
        
        public void setDATASTOREQUOTA(USERPOOL.DEFAULTUSERQUOTAS.DATASTOREQUOTA value) {
            this.datastorequota = value;
        }
        
        public USERPOOL.DEFAULTUSERQUOTAS.NETWORKQUOTA getNETWORKQUOTA() {
            return networkquota;
        }
        
        public void setNETWORKQUOTA(USERPOOL.DEFAULTUSERQUOTAS.NETWORKQUOTA value) {
            this.networkquota = value;
        }
        
        public USERPOOL.DEFAULTUSERQUOTAS.VMQUOTA getVMQUOTA() {
            return vmquota;
        }
        
        public void setVMQUOTA(USERPOOL.DEFAULTUSERQUOTAS.VMQUOTA value) {
            this.vmquota = value;
        }
        
        public USERPOOL.DEFAULTUSERQUOTAS.IMAGEQUOTA getIMAGEQUOTA() {
            return imagequota;
        }
        
        public void setIMAGEQUOTA(USERPOOL.DEFAULTUSERQUOTAS.IMAGEQUOTA value) {
            this.imagequota = value;
        }
        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "datastore"
        })
        public static class DATASTOREQUOTA {

            @XmlElement(name = "DATASTORE")
            protected List<USERPOOL.DEFAULTUSERQUOTAS.DATASTOREQUOTA.DATASTORE> datastore;
            
            public List<USERPOOL.DEFAULTUSERQUOTAS.DATASTOREQUOTA.DATASTORE> getDATASTORE() {
                if (datastore == null) {
                    datastore = new ArrayList<USERPOOL.DEFAULTUSERQUOTAS.DATASTOREQUOTA.DATASTORE>();
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
            protected List<USERPOOL.DEFAULTUSERQUOTAS.IMAGEQUOTA.IMAGE> image;
            
            public List<USERPOOL.DEFAULTUSERQUOTAS.IMAGEQUOTA.IMAGE> getIMAGE() {
                if (image == null) {
                    image = new ArrayList<USERPOOL.DEFAULTUSERQUOTAS.IMAGEQUOTA.IMAGE>();
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
            protected List<USERPOOL.DEFAULTUSERQUOTAS.NETWORKQUOTA.NETWORK> network;
            
            public List<USERPOOL.DEFAULTUSERQUOTAS.NETWORKQUOTA.NETWORK> getNETWORK() {
                if (network == null) {
                    network = new ArrayList<USERPOOL.DEFAULTUSERQUOTAS.NETWORKQUOTA.NETWORK>();
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
            protected USERPOOL.DEFAULTUSERQUOTAS.VMQUOTA.VM vm;
            
            public USERPOOL.DEFAULTUSERQUOTAS.VMQUOTA.VM getVM() {
                return vm;
            }
            
            public void setVM(USERPOOL.DEFAULTUSERQUOTAS.VMQUOTA.VM value) {
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
        "datastorequota",
        "networkquota",
        "vmquota",
        "imagequota"
    })
    public static class QUOTAS {

        @XmlElement(name = "ID", required = true)
        protected BigInteger id;
        @XmlElement(name = "DATASTORE_QUOTA")
        protected USERPOOL.QUOTAS.DATASTOREQUOTA datastorequota;
        @XmlElement(name = "NETWORK_QUOTA")
        protected USERPOOL.QUOTAS.NETWORKQUOTA networkquota;
        @XmlElement(name = "VM_QUOTA")
        protected USERPOOL.QUOTAS.VMQUOTA vmquota;
        @XmlElement(name = "IMAGE_QUOTA")
        protected USERPOOL.QUOTAS.IMAGEQUOTA imagequota;
        
        public BigInteger getID() {
            return id;
        }
        
        public void setID(BigInteger value) {
            this.id = value;
        }
        
        public USERPOOL.QUOTAS.DATASTOREQUOTA getDATASTOREQUOTA() {
            return datastorequota;
        }
        
        public void setDATASTOREQUOTA(USERPOOL.QUOTAS.DATASTOREQUOTA value) {
            this.datastorequota = value;
        }
        
        public USERPOOL.QUOTAS.NETWORKQUOTA getNETWORKQUOTA() {
            return networkquota;
        }
        
        public void setNETWORKQUOTA(USERPOOL.QUOTAS.NETWORKQUOTA value) {
            this.networkquota = value;
        }
        
        public USERPOOL.QUOTAS.VMQUOTA getVMQUOTA() {
            return vmquota;
        }
        
        public void setVMQUOTA(USERPOOL.QUOTAS.VMQUOTA value) {
            this.vmquota = value;
        }
        
        public USERPOOL.QUOTAS.IMAGEQUOTA getIMAGEQUOTA() {
            return imagequota;
        }
        
        public void setIMAGEQUOTA(USERPOOL.QUOTAS.IMAGEQUOTA value) {
            this.imagequota = value;
        }
        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "datastore"
        })
        public static class DATASTOREQUOTA {

            @XmlElement(name = "DATASTORE")
            protected List<USERPOOL.QUOTAS.DATASTOREQUOTA.DATASTORE> datastore;
            
            public List<USERPOOL.QUOTAS.DATASTOREQUOTA.DATASTORE> getDATASTORE() {
                if (datastore == null) {
                    datastore = new ArrayList<USERPOOL.QUOTAS.DATASTOREQUOTA.DATASTORE>();
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
            protected List<USERPOOL.QUOTAS.IMAGEQUOTA.IMAGE> image;
            
            public List<USERPOOL.QUOTAS.IMAGEQUOTA.IMAGE> getIMAGE() {
                if (image == null) {
                    image = new ArrayList<USERPOOL.QUOTAS.IMAGEQUOTA.IMAGE>();
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
            protected List<USERPOOL.QUOTAS.NETWORKQUOTA.NETWORK> network;
            
            public List<USERPOOL.QUOTAS.NETWORKQUOTA.NETWORK> getNETWORK() {
                if (network == null) {
                    network = new ArrayList<USERPOOL.QUOTAS.NETWORKQUOTA.NETWORK>();
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
            protected USERPOOL.QUOTAS.VMQUOTA.VM vm;
            
            public USERPOOL.QUOTAS.VMQUOTA.VM getVM() {
                return vm;
            }
            
            public void setVM(USERPOOL.QUOTAS.VMQUOTA.VM value) {
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
    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "gid",
        "groups",
        "gname",
        "name",
        "password",
        "authdriver",
        "enabled",
        "logintoken",
        "template"
    })
    public static class USER {

        @XmlElement(name = "ID", required = true)
        protected BigInteger id;
        @XmlElement(name = "GID", required = true)
        protected BigInteger gid;
        @XmlElement(name = "GROUPS", required = true)
        protected USERPOOL.USER.GROUPS groups;
        @XmlElement(name = "GNAME", required = true)
        protected String gname;
        @XmlElement(name = "NAME", required = true)
        protected String name;
        @XmlElement(name = "PASSWORD", required = true)
        protected String password;
        @XmlElement(name = "AUTH_DRIVER", required = true)
        protected String authdriver;
        @XmlElement(name = "ENABLED", required = true)
        protected BigInteger enabled;
        @XmlElement(name = "LOGIN_TOKEN", required = true)
        protected String logintoken;
        @XmlElement(name = "TEMPLATE", required = true)
        protected Object template;
        
        public BigInteger getID() {
            return id;
        }
        
        public void setID(BigInteger value) {
            this.id = value;
        }
        
        public BigInteger getGID() {
            return gid;
        }
        
        public void setGID(BigInteger value) {
            this.gid = value;
        }
        
        public USERPOOL.USER.GROUPS getGROUPS() {
            return groups;
        }
        
        public void setGROUPS(USERPOOL.USER.GROUPS value) {
            this.groups = value;
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
        
        public String getPASSWORD() {
            return password;
        }
        
        public void setPASSWORD(String value) {
            this.password = value;
        }
        
        public String getAUTHDRIVER() {
            return authdriver;
        }
        
        public void setAUTHDRIVER(String value) {
            this.authdriver = value;
        }
        
        public BigInteger getENABLED() {
            return enabled;
        }
        
        public void setENABLED(BigInteger value) {
            this.enabled = value;
        }
        
        public String getLOGINTOKEN() {
            return logintoken;
        }
        
        public void setLOGINTOKEN(String value) {
            this.logintoken = value;
        }
        
        public Object getTEMPLATE() {
            return template;
        }
        
        public void setTEMPLATE(Object value) {
            this.template = value;
        }
        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id"
        })
        public static class GROUPS {

            @XmlElement(name = "ID", required = true)
            protected List<BigInteger> id;
            
            public List<BigInteger> getID() {
                if (id == null) {
                    id = new ArrayList<BigInteger>();
                }
                return this.id;
            }

        }

    }

}
