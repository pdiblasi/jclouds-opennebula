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
    "lastpoll",
    "state",
    "lcmstate",
    "prevstate",
    "prevlcmstate",
    "resched",
    "stime",
    "etime",
    "deployid",
    "monitoring",
    "template",
    "usertemplate",
    "historyrecords",
    "snapshots"
})
@XmlRootElement(name = "VM")
public class VM {

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
    protected VM.PERMISSIONS permissions;
    @XmlElement(name = "LAST_POLL", required = true)
    protected BigInteger lastpoll;
    @XmlElement(name = "STATE", required = true)
    protected BigInteger state;
    @XmlElement(name = "LCM_STATE", required = true)
    protected BigInteger lcmstate;
    @XmlElement(name = "PREV_STATE", required = true)
    protected BigInteger prevstate;
    @XmlElement(name = "PREV_LCM_STATE", required = true)
    protected BigInteger prevlcmstate;
    @XmlElement(name = "RESCHED", required = true)
    protected BigInteger resched;
    @XmlElement(name = "STIME", required = true)
    protected BigInteger stime;
    @XmlElement(name = "ETIME", required = true)
    protected BigInteger etime;
    @XmlElement(name = "DEPLOY_ID", required = true)
    protected String deployid;
    @XmlElement(name = "MONITORING", required = true)
    protected Object monitoring;
    @XmlElement(name = "TEMPLATE", required = true)
    protected Object template;
    @XmlElement(name = "USER_TEMPLATE", required = true)
    protected Object usertemplate;
    @XmlElement(name = "HISTORY_RECORDS", required = true)
    protected VM.HISTORYRECORDS historyrecords;
    @XmlElement(name = "SNAPSHOTS")
    protected List<VM.SNAPSHOTS> snapshots;
    
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
    
    public VM.PERMISSIONS getPERMISSIONS() {
        return permissions;
    }
    
    public void setPERMISSIONS(VM.PERMISSIONS value) {
        this.permissions = value;
    }
    
    public BigInteger getLASTPOLL() {
        return lastpoll;
    }
    
    public void setLASTPOLL(BigInteger value) {
        this.lastpoll = value;
    }
    
    public BigInteger getSTATE() {
        return state;
    }
    
    public void setSTATE(BigInteger value) {
        this.state = value;
    }
    
    public BigInteger getLCMSTATE() {
        return lcmstate;
    }
    
    public void setLCMSTATE(BigInteger value) {
        this.lcmstate = value;
    }
    
    public BigInteger getPREVSTATE() {
        return prevstate;
    }
    
    public void setPREVSTATE(BigInteger value) {
        this.prevstate = value;
    }
    
    public BigInteger getPREVLCMSTATE() {
        return prevlcmstate;
    }
    
    public void setPREVLCMSTATE(BigInteger value) {
        this.prevlcmstate = value;
    }
    
    public BigInteger getRESCHED() {
        return resched;
    }
    
    public void setRESCHED(BigInteger value) {
        this.resched = value;
    }
    
    public BigInteger getSTIME() {
        return stime;
    }
    
    public void setSTIME(BigInteger value) {
        this.stime = value;
    }
    
    public BigInteger getETIME() {
        return etime;
    }
    
    public void setETIME(BigInteger value) {
        this.etime = value;
    }
    
    public String getDEPLOYID() {
        return deployid;
    }
    
    public void setDEPLOYID(String value) {
        this.deployid = value;
    }
    
    public Object getMONITORING() {
        return monitoring;
    }
    
    public void setMONITORING(Object value) {
        this.monitoring = value;
    }
    
    public Object getTEMPLATE() {
        return template;
    }
    
    public void setTEMPLATE(Object value) {
        this.template = value;
    }
    
    public Object getUSERTEMPLATE() {
        return usertemplate;
    }
    
    public void setUSERTEMPLATE(Object value) {
        this.usertemplate = value;
    }
    
    public VM.HISTORYRECORDS getHISTORYRECORDS() {
        return historyrecords;
    }
    
    public void setHISTORYRECORDS(VM.HISTORYRECORDS value) {
        this.historyrecords = value;
    }
    
    public List<VM.SNAPSHOTS> getSNAPSHOTS() {
        if (snapshots == null) {
            snapshots = new ArrayList<VM.SNAPSHOTS>();
        }
        return this.snapshots;
    }
    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "history"
    })
    public static class HISTORYRECORDS {

        @XmlElement(name = "HISTORY")
        protected List<VM.HISTORYRECORDS.HISTORY> history;
        
        public List<VM.HISTORYRECORDS.HISTORY> getHISTORY() {
            if (history == null) {
                history = new ArrayList<VM.HISTORYRECORDS.HISTORY>();
            }
            return this.history;
        }
        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "oid",
            "seq",
            "hostname",
            "hid",
            "cid",
            "stime",
            "etime",
            "vmmmad",
            "vnmmad",
            "tmmad",
            "dslocation",
            "dsid",
            "pstime",
            "petime",
            "rstime",
            "retime",
            "estime",
            "eetime",
            "reason",
            "action"
        })
        public static class HISTORY {

            @XmlElement(name = "OID", required = true)
            protected BigInteger oid;
            @XmlElement(name = "SEQ", required = true)
            protected BigInteger seq;
            @XmlElement(name = "HOSTNAME", required = true)
            protected String hostname;
            @XmlElement(name = "HID", required = true)
            protected BigInteger hid;
            @XmlElement(name = "CID", required = true)
            protected BigInteger cid;
            @XmlElement(name = "STIME", required = true)
            protected BigInteger stime;
            @XmlElement(name = "ETIME", required = true)
            protected BigInteger etime;
            @XmlElement(name = "VMMMAD", required = true)
            protected String vmmmad;
            @XmlElement(name = "VNMMAD", required = true)
            protected String vnmmad;
            @XmlElement(name = "TMMAD", required = true)
            protected String tmmad;
            @XmlElement(name = "DS_LOCATION", required = true)
            protected String dslocation;
            @XmlElement(name = "DS_ID", required = true)
            protected BigInteger dsid;
            @XmlElement(name = "PSTIME", required = true)
            protected BigInteger pstime;
            @XmlElement(name = "PETIME", required = true)
            protected BigInteger petime;
            @XmlElement(name = "RSTIME", required = true)
            protected BigInteger rstime;
            @XmlElement(name = "RETIME", required = true)
            protected BigInteger retime;
            @XmlElement(name = "ESTIME", required = true)
            protected BigInteger estime;
            @XmlElement(name = "EETIME", required = true)
            protected BigInteger eetime;
            @XmlElement(name = "REASON", required = true)
            protected BigInteger reason;
            @XmlElement(name = "ACTION", required = true)
            protected BigInteger action;
            
            public BigInteger getOID() {
                return oid;
            }
            
            public void setOID(BigInteger value) {
                this.oid = value;
            }
            
            public BigInteger getSEQ() {
                return seq;
            }
            
            public void setSEQ(BigInteger value) {
                this.seq = value;
            }
            
            public String getHOSTNAME() {
                return hostname;
            }
            
            public void setHOSTNAME(String value) {
                this.hostname = value;
            }
            
            public BigInteger getHID() {
                return hid;
            }
            
            public void setHID(BigInteger value) {
                this.hid = value;
            }
            
            public BigInteger getCID() {
                return cid;
            }
            
            public void setCID(BigInteger value) {
                this.cid = value;
            }
            
            public BigInteger getSTIME() {
                return stime;
            }
            
            public void setSTIME(BigInteger value) {
                this.stime = value;
            }
            
            public BigInteger getETIME() {
                return etime;
            }
            
            public void setETIME(BigInteger value) {
                this.etime = value;
            }
            
            public String getVMMMAD() {
                return vmmmad;
            }
            
            public void setVMMMAD(String value) {
                this.vmmmad = value;
            }
            
            public String getVNMMAD() {
                return vnmmad;
            }
            
            public void setVNMMAD(String value) {
                this.vnmmad = value;
            }
            
            public String getTMMAD() {
                return tmmad;
            }
            
            public void setTMMAD(String value) {
                this.tmmad = value;
            }
            
            public String getDSLOCATION() {
                return dslocation;
            }
            
            public void setDSLOCATION(String value) {
                this.dslocation = value;
            }
            
            public BigInteger getDSID() {
                return dsid;
            }
            
            public void setDSID(BigInteger value) {
                this.dsid = value;
            }
            
            public BigInteger getPSTIME() {
                return pstime;
            }
            
            public void setPSTIME(BigInteger value) {
                this.pstime = value;
            }
            
            public BigInteger getPETIME() {
                return petime;
            }
            
            public void setPETIME(BigInteger value) {
                this.petime = value;
            }
            
            public BigInteger getRSTIME() {
                return rstime;
            }
            
            public void setRSTIME(BigInteger value) {
                this.rstime = value;
            }
            
            public BigInteger getRETIME() {
                return retime;
            }
            
            public void setRETIME(BigInteger value) {
                this.retime = value;
            }
            
            public BigInteger getESTIME() {
                return estime;
            }
            
            public void setESTIME(BigInteger value) {
                this.estime = value;
            }
            
            public BigInteger getEETIME() {
                return eetime;
            }
            
            public void setEETIME(BigInteger value) {
                this.eetime = value;
            }
            
            public BigInteger getREASON() {
                return reason;
            }
            
            public void setREASON(BigInteger value) {
                this.reason = value;
            }
            
            public BigInteger getACTION() {
                return action;
            }
            
            public void setACTION(BigInteger value) {
                this.action = value;
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
    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "diskid",
        "snapshot"
    })
    public static class SNAPSHOTS {

        @XmlElement(name = "DISK_ID", required = true)
        protected BigInteger diskid;
        @XmlElement(name = "SNAPSHOT")
        protected List<VM.SNAPSHOTS.SNAPSHOT> snapshot;
        
        public BigInteger getDISKID() {
            return diskid;
        }
        
        public void setDISKID(BigInteger value) {
            this.diskid = value;
        }
        
        public List<VM.SNAPSHOTS.SNAPSHOT> getSNAPSHOT() {
            if (snapshot == null) {
                snapshot = new ArrayList<VM.SNAPSHOTS.SNAPSHOT>();
            }
            return this.snapshot;
        }
        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "active",
            "children",
            "date",
            "id",
            "name",
            "parent",
            "size"
        })
        public static class SNAPSHOT {

            @XmlElement(name = "ACTIVE")
            protected String active;
            @XmlElement(name = "CHILDREN")
            protected String children;
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
            
            public String getACTIVE() {
                return active;
            }
            
            public void setACTIVE(String value) {
                this.active = value;
            }
            
            public String getCHILDREN() {
                return children;
            }
            
            public void setCHILDREN(String value) {
                this.children = value;
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

}
