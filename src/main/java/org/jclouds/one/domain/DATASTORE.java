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
    "dsmad",
    "tmmad",
    "basepath",
    "type",
    "disktype",
    "state",
    "clusterid",
    "cluster",
    "totalmb",
    "freemb",
    "usedmb",
    "images",
    "template"
})
@XmlRootElement(name = "DATASTORE")
public class DATASTORE {

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
    protected DATASTORE.PERMISSIONS permissions;
    @XmlElement(name = "DS_MAD", required = true)
    protected String dsmad;
    @XmlElement(name = "TM_MAD", required = true)
    protected String tmmad;
    @XmlElement(name = "BASE_PATH", required = true)
    protected String basepath;
    @XmlElement(name = "TYPE", required = true)
    protected BigInteger type;
    @XmlElement(name = "DISK_TYPE", required = true)
    protected BigInteger disktype;
    @XmlElement(name = "STATE", required = true)
    protected BigInteger state;
    @XmlElement(name = "CLUSTER_ID", required = true)
    protected BigInteger clusterid;
    @XmlElement(name = "CLUSTER", required = true)
    protected String cluster;
    @XmlElement(name = "TOTAL_MB", required = true)
    protected BigInteger totalmb;
    @XmlElement(name = "FREE_MB", required = true)
    protected BigInteger freemb;
    @XmlElement(name = "USED_MB", required = true)
    protected BigInteger usedmb;
    @XmlElement(name = "IMAGES", required = true)
    protected DATASTORE.IMAGES images;
    @XmlElement(name = "TEMPLATE", required = true)
    protected Object template;
    
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
    
    public DATASTORE.PERMISSIONS getPERMISSIONS() {
        return permissions;
    }
    
    public void setPERMISSIONS(DATASTORE.PERMISSIONS value) {
        this.permissions = value;
    }
    
    public String getDSMAD() {
        return dsmad;
    }
    
    public void setDSMAD(String value) {
        this.dsmad = value;
    }
    
    public String getTMMAD() {
        return tmmad;
    }
    
    public void setTMMAD(String value) {
        this.tmmad = value;
    }
    
    public String getBASEPATH() {
        return basepath;
    }
    
    public void setBASEPATH(String value) {
        this.basepath = value;
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
    
    public BigInteger getSTATE() {
        return state;
    }
    
    public void setSTATE(BigInteger value) {
        this.state = value;
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
    
    public BigInteger getTOTALMB() {
        return totalmb;
    }
    
    public void setTOTALMB(BigInteger value) {
        this.totalmb = value;
    }
    
    public BigInteger getFREEMB() {
        return freemb;
    }
    
    public void setFREEMB(BigInteger value) {
        this.freemb = value;
    }
    
    public BigInteger getUSEDMB() {
        return usedmb;
    }
    
    public void setUSEDMB(BigInteger value) {
        this.usedmb = value;
    }
    
    public DATASTORE.IMAGES getIMAGES() {
        return images;
    }
    
    public void setIMAGES(DATASTORE.IMAGES value) {
        this.images = value;
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
    public static class IMAGES {

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

}
