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
    "type",
    "disktype",
    "persistent",
    "regtime",
    "source",
    "path",
    "fstype",
    "size",
    "state",
    "runningvms",
    "cloningops",
    "cloningid",
    "targetsnapshot",
    "datastoreid",
    "datastore",
    "vms",
    "clones",
    "template",
    "snapshots"
})
@XmlRootElement(name = "IMAGE")
public class IMAGE {

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
    protected IMAGE.PERMISSIONS permissions;
    @XmlElement(name = "TYPE", required = true)
    protected BigInteger type;
    @XmlElement(name = "DISK_TYPE", required = true)
    protected BigInteger disktype;
    @XmlElement(name = "PERSISTENT", required = true)
    protected BigInteger persistent;
    @XmlElement(name = "REGTIME", required = true)
    protected BigInteger regtime;
    @XmlElement(name = "SOURCE", required = true)
    protected String source;
    @XmlElement(name = "PATH", required = true)
    protected String path;
    @XmlElement(name = "FSTYPE", required = true)
    protected String fstype;
    @XmlElement(name = "SIZE", required = true)
    protected BigInteger size;
    @XmlElement(name = "STATE", required = true)
    protected BigInteger state;
    @XmlElement(name = "RUNNING_VMS", required = true)
    protected BigInteger runningvms;
    @XmlElement(name = "CLONING_OPS", required = true)
    protected BigInteger cloningops;
    @XmlElement(name = "CLONING_ID", required = true)
    protected BigInteger cloningid;
    @XmlElement(name = "TARGET_SNAPSHOT", required = true)
    protected BigInteger targetsnapshot;
    @XmlElement(name = "DATASTORE_ID", required = true)
    protected BigInteger datastoreid;
    @XmlElement(name = "DATASTORE", required = true)
    protected String datastore;
    @XmlElement(name = "VMS", required = true)
    protected IMAGE.VMS vms;
    @XmlElement(name = "CLONES", required = true)
    protected IMAGE.CLONES clones;
    @XmlElement(name = "TEMPLATE", required = true)
    protected Object template;
    @XmlElement(name = "SNAPSHOTS", required = true)
    protected IMAGE.SNAPSHOTS snapshots;
    
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
    
    public IMAGE.PERMISSIONS getPERMISSIONS() {
        return permissions;
    }
    
    public void setPERMISSIONS(IMAGE.PERMISSIONS value) {
        this.permissions = value;
    }
    
    public BigInteger getTYPE() {
        return type;
    }
    
    public void setTYPE(BigInteger value) {
        this.type = value;
    }
    
    public BigInteger getDISKTYPE() {
        return disktype;
    }
    
    public void setDISKTYPE(BigInteger value) {
        this.disktype = value;
    }
    
    public BigInteger getPERSISTENT() {
        return persistent;
    }
    
    public void setPERSISTENT(BigInteger value) {
        this.persistent = value;
    }
    
    public BigInteger getREGTIME() {
        return regtime;
    }
    
    public void setREGTIME(BigInteger value) {
        this.regtime = value;
    }
    
    public String getSOURCE() {
        return source;
    }
    
    public void setSOURCE(String value) {
        this.source = value;
    }
    
    public String getPATH() {
        return path;
    }
    
    public void setPATH(String value) {
        this.path = value;
    }
    
    public String getFSTYPE() {
        return fstype;
    }
    
    public void setFSTYPE(String value) {
        this.fstype = value;
    }
    
    public BigInteger getSIZE() {
        return size;
    }
    
    public void setSIZE(BigInteger value) {
        this.size = value;
    }
    
    public BigInteger getSTATE() {
        return state;
    }
    
    public void setSTATE(BigInteger value) {
        this.state = value;
    }
    
    public BigInteger getRUNNINGVMS() {
        return runningvms;
    }
    
    public void setRUNNINGVMS(BigInteger value) {
        this.runningvms = value;
    }
    
    public BigInteger getCLONINGOPS() {
        return cloningops;
    }
    
    public void setCLONINGOPS(BigInteger value) {
        this.cloningops = value;
    }
    
    public BigInteger getCLONINGID() {
        return cloningid;
    }
    
    public void setCLONINGID(BigInteger value) {
        this.cloningid = value;
    }
    
    public BigInteger getTARGETSNAPSHOT() {
        return targetsnapshot;
    }
    
    public void setTARGETSNAPSHOT(BigInteger value) {
        this.targetsnapshot = value;
    }
    
    public BigInteger getDATASTOREID() {
        return datastoreid;
    }
    
    public void setDATASTOREID(BigInteger value) {
        this.datastoreid = value;
    }
    
    public String getDATASTORE() {
        return datastore;
    }
    
    public void setDATASTORE(String value) {
        this.datastore = value;
    }
    
    public IMAGE.VMS getVMS() {
        return vms;
    }
    
    public void setVMS(IMAGE.VMS value) {
        this.vms = value;
    }
    
    public IMAGE.CLONES getCLONES() {
        return clones;
    }
    
    public void setCLONES(IMAGE.CLONES value) {
        this.clones = value;
    }
    
    public Object getTEMPLATE() {
        return template;
    }
    
    public void setTEMPLATE(Object value) {
        this.template = value;
    }
    
    public IMAGE.SNAPSHOTS getSNAPSHOTS() {
        return snapshots;
    }
    
    public void setSNAPSHOTS(IMAGE.SNAPSHOTS value) {
        this.snapshots = value;
    }
    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id"
    })
    public static class CLONES {

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
    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "snapshot"
    })
    public static class SNAPSHOTS {

        @XmlElement(name = "SNAPSHOT")
        protected List<IMAGE.SNAPSHOTS.SNAPSHOT> snapshot;
        
        public List<IMAGE.SNAPSHOTS.SNAPSHOT> getSNAPSHOT() {
            if (snapshot == null) {
                snapshot = new ArrayList<IMAGE.SNAPSHOTS.SNAPSHOT>();
            }
            return this.snapshot;
        }
        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "children",
            "active",
            "date",
            "id",
            "name",
            "parent",
            "size"
        })
        public static class SNAPSHOT {

            @XmlElement(name = "CHILDREN")
            protected String children;
            @XmlElement(name = "ACTIVE")
            protected String active;
            @XmlElement(name = "DATE", required = true)
            protected BigInteger date;
            @XmlElement(name = "ID", required = true)
            protected BigInteger id;
            @XmlElement(name = "NAME")
            protected String name;
            @XmlElement(name = "PARENT", required = true)
            protected BigInteger parent;
            @XmlElement(name = "SIZE", required = true)
            protected BigInteger size;
            
            public String getCHILDREN() {
                return children;
            }
            
            public void setCHILDREN(String value) {
                this.children = value;
            }
            
            public String getACTIVE() {
                return active;
            }
            
            public void setACTIVE(String value) {
                this.active = value;
            }
            
            public BigInteger getDATE() {
                return date;
            }
            
            public void setDATE(BigInteger value) {
                this.date = value;
            }
            
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
            
            public BigInteger getPARENT() {
                return parent;
            }
            
            public void setPARENT(BigInteger value) {
                this.parent = value;
            }
            
            public BigInteger getSIZE() {
                return size;
            }
            
            public void setSIZE(BigInteger value) {
                this.size = value;
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
