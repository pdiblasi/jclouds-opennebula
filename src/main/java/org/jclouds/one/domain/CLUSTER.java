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
    "hosts",
    "datastores",
    "vnets",
    "template"
})
@XmlRootElement(name = "CLUSTER")
public class CLUSTER {

    @XmlElement(name = "ID", required = true)
    protected BigInteger id;
    @XmlElement(name = "NAME", required = true)
    protected String name;
    @XmlElement(name = "HOSTS", required = true)
    protected CLUSTER.HOSTS hosts;
    @XmlElement(name = "DATASTORES", required = true)
    protected CLUSTER.DATASTORES datastores;
    @XmlElement(name = "VNETS", required = true)
    protected CLUSTER.VNETS vnets;
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
    
    public CLUSTER.HOSTS getHOSTS() {
        return hosts;
    }
    
    public void setHOSTS(CLUSTER.HOSTS value) {
        this.hosts = value;
    }
    
    public CLUSTER.DATASTORES getDATASTORES() {
        return datastores;
    }
    
    public void setDATASTORES(CLUSTER.DATASTORES value) {
        this.datastores = value;
    }
    
    public CLUSTER.VNETS getVNETS() {
        return vnets;
    }
    
    public void setVNETS(CLUSTER.VNETS value) {
        this.vnets = value;
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
    public static class DATASTORES {

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
    public static class HOSTS {

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
    public static class VNETS {

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
