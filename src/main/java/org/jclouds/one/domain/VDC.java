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
    "groups",
    "clusters",
    "hosts",
    "datastores",
    "vnets",
    "template"
})
@XmlRootElement(name = "VDC")
public class VDC {

    @XmlElement(name = "ID", required = true)
    protected BigInteger id;
    @XmlElement(name = "NAME", required = true)
    protected String name;
    @XmlElement(name = "GROUPS", required = true)
    protected VDC.GROUPS groups;
    @XmlElement(name = "CLUSTERS", required = true)
    protected VDC.CLUSTERS clusters;
    @XmlElement(name = "HOSTS", required = true)
    protected VDC.HOSTS hosts;
    @XmlElement(name = "DATASTORES", required = true)
    protected VDC.DATASTORES datastores;
    @XmlElement(name = "VNETS", required = true)
    protected VDC.VNETS vnets;
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
    
    public VDC.GROUPS getGROUPS() {
        return groups;
    }
    
    public void setGROUPS(VDC.GROUPS value) {
        this.groups = value;
    }
    
    public VDC.CLUSTERS getCLUSTERS() {
        return clusters;
    }
    
    public void setCLUSTERS(VDC.CLUSTERS value) {
        this.clusters = value;
    }
    
    public VDC.HOSTS getHOSTS() {
        return hosts;
    }
    
    public void setHOSTS(VDC.HOSTS value) {
        this.hosts = value;
    }
    
    public VDC.DATASTORES getDATASTORES() {
        return datastores;
    }
    
    public void setDATASTORES(VDC.DATASTORES value) {
        this.datastores = value;
    }
    
    public VDC.VNETS getVNETS() {
        return vnets;
    }
    
    public void setVNETS(VDC.VNETS value) {
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
        "cluster"
    })
    public static class CLUSTERS {

        @XmlElement(name = "CLUSTER")
        protected List<VDC.CLUSTERS.CLUSTER> cluster;
        
        public List<VDC.CLUSTERS.CLUSTER> getCLUSTER() {
            if (cluster == null) {
                cluster = new ArrayList<VDC.CLUSTERS.CLUSTER>();
            }
            return this.cluster;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "zoneid",
            "clusterid"
        })
        public static class CLUSTER {

            @XmlElement(name = "ZONE_ID", required = true)
            protected BigInteger zoneid;
            @XmlElement(name = "CLUSTER_ID", required = true)
            protected BigInteger clusterid;
            
            public BigInteger getZONEID() {
                return zoneid;
            }
            
            public void setZONEID(BigInteger value) {
                this.zoneid = value;
            }
            
            public BigInteger getCLUSTERID() {
                return clusterid;
            }
            
            public void setCLUSTERID(BigInteger value) {
                this.clusterid = value;
            }

        }

    }
    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "datastore"
    })
    public static class DATASTORES {

        @XmlElement(name = "DATASTORE")
        protected List<VDC.DATASTORES.DATASTORE> datastore;
        
        public List<VDC.DATASTORES.DATASTORE> getDATASTORE() {
            if (datastore == null) {
                datastore = new ArrayList<VDC.DATASTORES.DATASTORE>();
            }
            return this.datastore;
        }
        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "zoneid",
            "datastoreid"
        })
        public static class DATASTORE {

            @XmlElement(name = "ZONE_ID", required = true)
            protected BigInteger zoneid;
            @XmlElement(name = "DATASTORE_ID", required = true)
            protected BigInteger datastoreid;
            
            public BigInteger getZONEID() {
                return zoneid;
            }
            
            public void setZONEID(BigInteger value) {
                this.zoneid = value;
            }
            
            public BigInteger getDATASTOREID() {
                return datastoreid;
            }
            
            public void setDATASTOREID(BigInteger value) {
                this.datastoreid = value;
            }

        }

    }
    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id"
    })
    public static class GROUPS {

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
        "host"
    })
    public static class HOSTS {

        @XmlElement(name = "HOST")
        protected List<VDC.HOSTS.HOST> host;
        
        public List<VDC.HOSTS.HOST> getHOST() {
            if (host == null) {
                host = new ArrayList<VDC.HOSTS.HOST>();
            }
            return this.host;
        }
        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "zoneid",
            "hostid"
        })
        public static class HOST {

            @XmlElement(name = "ZONE_ID", required = true)
            protected BigInteger zoneid;
            @XmlElement(name = "HOST_ID", required = true)
            protected BigInteger hostid;
            
            public BigInteger getZONEID() {
                return zoneid;
            }
            
            public void setZONEID(BigInteger value) {
                this.zoneid = value;
            }
            
            public BigInteger getHOSTID() {
                return hostid;
            }
            
            public void setHOSTID(BigInteger value) {
                this.hostid = value;
            }

        }

    }
    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vnet"
    })
    public static class VNETS {

        @XmlElement(name = "VNET")
        protected List<VDC.VNETS.VNET> vnet;
        
        public List<VDC.VNETS.VNET> getVNET() {
            if (vnet == null) {
                vnet = new ArrayList<VDC.VNETS.VNET>();
            }
            return this.vnet;
        }
        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "zoneid",
            "vnetid"
        })
        public static class VNET {

            @XmlElement(name = "ZONE_ID", required = true)
            protected BigInteger zoneid;
            @XmlElement(name = "VNET_ID", required = true)
            protected BigInteger vnetid;
            
            public BigInteger getZONEID() {
                return zoneid;
            }
            
            public void setZONEID(BigInteger value) {
                this.zoneid = value;
            }
            
            public BigInteger getVNETID() {
                return vnetid;
            }
            
            public void setVNETID(BigInteger value) {
                this.vnetid = value;
            }

        }

    }

}
