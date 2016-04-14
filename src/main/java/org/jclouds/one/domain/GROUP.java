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
    "template",
    "users",
    "admins",
    "datastorequota",
    "networkquota",
    "vmquota",
    "imagequota",
    "defaultgroupquotas"
})
@XmlRootElement(name = "GROUP")
public class GROUP {

    @XmlElement(name = "ID", required = true)
    protected BigInteger id;
    @XmlElement(name = "NAME", required = true)
    protected String name;
    @XmlElement(name = "TEMPLATE", required = true)
    protected Object template;
    @XmlElement(name = "USERS", required = true)
    protected GROUP.USERS users;
    @XmlElement(name = "ADMINS", required = true)
    protected GROUP.ADMINS admins;
    @XmlElement(name = "DATASTORE_QUOTA")
    protected GROUP.DATASTOREQUOTA datastorequota;
    @XmlElement(name = "NETWORK_QUOTA")
    protected GROUP.NETWORKQUOTA networkquota;
    @XmlElement(name = "VM_QUOTA")
    protected GROUP.VMQUOTA vmquota;
    @XmlElement(name = "IMAGE_QUOTA")
    protected GROUP.IMAGEQUOTA imagequota;
    @XmlElement(name = "DEFAULT_GROUP_QUOTAS", required = true)
    protected GROUP.DEFAULTGROUPQUOTAS defaultgroupquotas;
    
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
    
    public GROUP.USERS getUSERS() {
        return users;
    }
    
    public void setUSERS(GROUP.USERS value) {
        this.users = value;
    }
    
    public GROUP.ADMINS getADMINS() {
        return admins;
    }
    
    public void setADMINS(GROUP.ADMINS value) {
        this.admins = value;
    }
    
    public GROUP.DATASTOREQUOTA getDATASTOREQUOTA() {
        return datastorequota;
    }
    
    public void setDATASTOREQUOTA(GROUP.DATASTOREQUOTA value) {
        this.datastorequota = value;
    }
    
    public GROUP.NETWORKQUOTA getNETWORKQUOTA() {
        return networkquota;
    }
    
    public void setNETWORKQUOTA(GROUP.NETWORKQUOTA value) {
        this.networkquota = value;
    }
    
    public GROUP.VMQUOTA getVMQUOTA() {
        return vmquota;
    }
    
    public void setVMQUOTA(GROUP.VMQUOTA value) {
        this.vmquota = value;
    }
    
    public GROUP.IMAGEQUOTA getIMAGEQUOTA() {
        return imagequota;
    }
    
    public void setIMAGEQUOTA(GROUP.IMAGEQUOTA value) {
        this.imagequota = value;
    }
    
    public GROUP.DEFAULTGROUPQUOTAS getDEFAULTGROUPQUOTAS() {
        return defaultgroupquotas;
    }
    
    public void setDEFAULTGROUPQUOTAS(GROUP.DEFAULTGROUPQUOTAS value) {
        this.defaultgroupquotas = value;
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
        "datastore"
    })
    public static class DATASTOREQUOTA {

        @XmlElement(name = "DATASTORE")
        protected List<GROUP.DATASTOREQUOTA.DATASTORE> datastore;
        
        public List<GROUP.DATASTOREQUOTA.DATASTORE> getDATASTORE() {
            if (datastore == null) {
                datastore = new ArrayList<GROUP.DATASTOREQUOTA.DATASTORE>();
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
        "datastorequota",
        "networkquota",
        "vmquota",
        "imagequota"
    })
    public static class DEFAULTGROUPQUOTAS {

        @XmlElement(name = "DATASTORE_QUOTA")
        protected GROUP.DEFAULTGROUPQUOTAS.DATASTOREQUOTA datastorequota;
        @XmlElement(name = "NETWORK_QUOTA")
        protected GROUP.DEFAULTGROUPQUOTAS.NETWORKQUOTA networkquota;
        @XmlElement(name = "VM_QUOTA")
        protected GROUP.DEFAULTGROUPQUOTAS.VMQUOTA vmquota;
        @XmlElement(name = "IMAGE_QUOTA")
        protected GROUP.DEFAULTGROUPQUOTAS.IMAGEQUOTA imagequota;
        
        public GROUP.DEFAULTGROUPQUOTAS.DATASTOREQUOTA getDATASTOREQUOTA() {
            return datastorequota;
        }
        
        public void setDATASTOREQUOTA(GROUP.DEFAULTGROUPQUOTAS.DATASTOREQUOTA value) {
            this.datastorequota = value;
        }
        
        public GROUP.DEFAULTGROUPQUOTAS.NETWORKQUOTA getNETWORKQUOTA() {
            return networkquota;
        }
        
        public void setNETWORKQUOTA(GROUP.DEFAULTGROUPQUOTAS.NETWORKQUOTA value) {
            this.networkquota = value;
        }
        
        public GROUP.DEFAULTGROUPQUOTAS.VMQUOTA getVMQUOTA() {
            return vmquota;
        }
        
        public void setVMQUOTA(GROUP.DEFAULTGROUPQUOTAS.VMQUOTA value) {
            this.vmquota = value;
        }
        
        public GROUP.DEFAULTGROUPQUOTAS.IMAGEQUOTA getIMAGEQUOTA() {
            return imagequota;
        }
        
        public void setIMAGEQUOTA(GROUP.DEFAULTGROUPQUOTAS.IMAGEQUOTA value) {
            this.imagequota = value;
        }
        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "datastore"
        })
        public static class DATASTOREQUOTA {

            @XmlElement(name = "DATASTORE")
            protected List<GROUP.DEFAULTGROUPQUOTAS.DATASTOREQUOTA.DATASTORE> datastore;
            
            public List<GROUP.DEFAULTGROUPQUOTAS.DATASTOREQUOTA.DATASTORE> getDATASTORE() {
                if (datastore == null) {
                    datastore = new ArrayList<GROUP.DEFAULTGROUPQUOTAS.DATASTOREQUOTA.DATASTORE>();
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
            protected List<GROUP.DEFAULTGROUPQUOTAS.IMAGEQUOTA.IMAGE> image;
            
            public List<GROUP.DEFAULTGROUPQUOTAS.IMAGEQUOTA.IMAGE> getIMAGE() {
                if (image == null) {
                    image = new ArrayList<GROUP.DEFAULTGROUPQUOTAS.IMAGEQUOTA.IMAGE>();
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
            protected List<GROUP.DEFAULTGROUPQUOTAS.NETWORKQUOTA.NETWORK> network;
            
            public List<GROUP.DEFAULTGROUPQUOTAS.NETWORKQUOTA.NETWORK> getNETWORK() {
                if (network == null) {
                    network = new ArrayList<GROUP.DEFAULTGROUPQUOTAS.NETWORKQUOTA.NETWORK>();
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
            protected GROUP.DEFAULTGROUPQUOTAS.VMQUOTA.VM vm;
            
            public GROUP.DEFAULTGROUPQUOTAS.VMQUOTA.VM getVM() {
                return vm;
            }
            
            public void setVM(GROUP.DEFAULTGROUPQUOTAS.VMQUOTA.VM value) {
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
        "image"
    })
    public static class IMAGEQUOTA {

        @XmlElement(name = "IMAGE")
        protected List<GROUP.IMAGEQUOTA.IMAGE> image;
        
        public List<GROUP.IMAGEQUOTA.IMAGE> getIMAGE() {
            if (image == null) {
                image = new ArrayList<GROUP.IMAGEQUOTA.IMAGE>();
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
        protected List<GROUP.NETWORKQUOTA.NETWORK> network;
        
        public List<GROUP.NETWORKQUOTA.NETWORK> getNETWORK() {
            if (network == null) {
                network = new ArrayList<GROUP.NETWORKQUOTA.NETWORK>();
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
    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vm"
    })
    public static class VMQUOTA {

        @XmlElement(name = "VM")
        protected GROUP.VMQUOTA.VM vm;
        
        public GROUP.VMQUOTA.VM getVM() {
            return vm;
        }
        
        public void setVM(GROUP.VMQUOTA.VM value) {
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
