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
    "regtime",
    "template"
})
@XmlRootElement(name = "VMTEMPLATE")
public class VMTEMPLATE {

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
    @XmlElement(name = "PERMISSIONS", required = true)
    protected VMTEMPLATE.PERMISSIONS permissions;
    @XmlElement(name = "REGTIME", required = true)
    protected BigInteger regtime;
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
    
    public VMTEMPLATE.PERMISSIONS getPERMISSIONS() {
        return permissions;
    }
    
    public void setPERMISSIONS(VMTEMPLATE.PERMISSIONS value) {
        this.permissions = value;
    }
    
    public BigInteger getREGTIME() {
        return regtime;
    }
    
    public void setREGTIME(BigInteger value) {
        this.regtime = value;
    }
    
    public Object getTEMPLATE() {
        return template;
    }
    
    public void setTEMPLATE(Object value) {
        this.template = value;
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
