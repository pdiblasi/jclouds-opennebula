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

package org.jclouds.one.features;

import javax.inject.Named;

import javax.ws.rs.POST;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jclouds.rest.annotations.Payload;
import org.jclouds.rest.annotations.PayloadParam;


public interface VDCApi {
   @Named("allocate")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vdc.allocate</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><string>{template}</string></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><int>{cluster_id}</int></value>\n" +
"          </param>\n" +           
"        </params>\n" +
"      </methodCall>")
   String allocate(@PayloadParam("auth") String auth,
           @PayloadParam("template") String template,
           @PayloadParam("cluster_id") int cluster_id);      

   @Named("delete")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vdc.delete</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" +           
"        </params>\n" +
"      </methodCall>")
   String delete(@PayloadParam("auth") String auth,
           @PayloadParam("template") String template,
           @PayloadParam("id") int id);      

   
   @Named("update")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vdc.update</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" +  
"           <param>\n" +
"            <value><string>{template}</string></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><int>{type}</int></value>\n" +
"          </param>\n" +           
"        </params>\n" +
"      </methodCall>")
   String update(@PayloadParam("auth") String auth,
           @PayloadParam("id") int id,
           @PayloadParam("template") String template,
           @PayloadParam("type") int type);      

   
   @Named("rename")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vdc.rename</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><string>{name}</string></value>\n" +
"          </param>\n" +           
"        </params>\n" +
"      </methodCall>")
   String rename(@PayloadParam("auth") String auth,
           @PayloadParam("id") int id,
           @PayloadParam("name") String name);      

   
   @Named("info")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vdc.info</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" +        
"        </params>\n" +
"      </methodCall>")
   String info(@PayloadParam("auth") String auth,
           @PayloadParam("id") int id);      

   
   @Named("addgroup")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vdc.addgroup</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><int>{vdc_id}</int></value>\n" +
"          </param>\n" + 
"           <param>\n" +
"            <value><int>{group_id}</int></value>\n" +
"          </param>\n" +           
"        </params>\n" +
"      </methodCall>")
   String addGroup(@PayloadParam("auth") String auth,
           @PayloadParam("vdc_id") int vdc_id,
           @PayloadParam("group_id") int group_id);      

   
   @Named("del group")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vdc.delgroup</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><int>{vdc_id}</int></value>\n" +
"          </param>\n" +  
"           <param>\n" +
"            <value><int>{group_id}</int></value>\n" +
"          </param>\n" +           
"        </params>\n" +
"      </methodCall>")
   String delGroup(@PayloadParam("auth") String auth,
           @PayloadParam("vdc_id") int vdc_id,
           @PayloadParam("group_id") int group_id);      
   

   @Named("add cluster")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vdc.addcluster</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><int>{vdc_id}</int></value>\n" +
"          </param>\n" + 
"           <param>\n" +
"            <value><int>{zone_id}</int></value>\n" +
"          </param>\n" +  
"           <param>\n" +
"            <value><int>{cluster_id}</int></value>\n" +
"          </param>\n" +           
"        </params>\n" +
"      </methodCall>")
   String addCluster(@PayloadParam("auth") String auth,
           @PayloadParam("vdc_id") int vdc_id,
           @PayloadParam("zone_id") int zone_id,
           @PayloadParam("cluster_id") int cluster_id);      
   
   
   @Named("delcluster")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vdc.delcluster</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><int>{vdc_id}</int></value>\n" +
"          </param>\n" +  
"           <param>\n" +
"            <value><int>{zone_id}</int></value>\n" +
"          </param>\n" +  
"           <param>\n" +
"            <value><int>{cluster_id}</int></value>\n" +
"          </param>\n" +           
"        </params>\n" +
"      </methodCall>")
   String delCluster(@PayloadParam("auth") String auth,
           @PayloadParam("vdc_id") int vdc_id,
           @PayloadParam("zone_id") int zone_id,
           @PayloadParam("cluster_id") int cluster_id);      

   
   @Named("add host")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vdc.addhost</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><int>{vdc_id}</int></value>\n" +
"          </param>\n" +  
"           <param>\n" +
"            <value><int>{zone_id}</int></value>\n" +
"          </param>\n" +  
"           <param>\n" +
"            <value><int>{host_id}</int></value>\n" +
"          </param>\n" +           
"        </params>\n" +
"      </methodCall>")
   String addHost(@PayloadParam("auth") String auth,
           @PayloadParam("vdc_id") int vdc_id,
           @PayloadParam("zone_id") int zone_id,           
           @PayloadParam("host_id") int host_id);      

   
   @Named("del host")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vdc.del</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><int>{vdc_id}</int></value>\n" +
"          </param>\n" +  
"           <param>\n" +
"            <value><int>{zone_id}</int></value>\n" +
"          </param>\n" +  
"           <param>\n" +
"            <value><int>{host_id}</int></value>\n" +
"          </param>\n" +           
"        </params>\n" +
"      </methodCall>")
   String delHost(@PayloadParam("auth") String auth,
           @PayloadParam("vdc_id") int vdc_id,
           @PayloadParam("zone_id") int zone_id,           
           @PayloadParam("host_id") int host_id);  
   
    

   
   @Named("add datastore")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vdc.adddatastore</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><int>{vdc_id}</int></value>\n" +
"          </param>\n" +  
"           <param>\n" +
"            <value><int>{zone_id}</int></value>\n" +
"          </param>\n" +  
"           <param>\n" +
"            <value><int>{datastore_id}</int></value>\n" +
"          </param>\n" +           
"        </params>\n" +
"      </methodCall>")
   String addDatastore(@PayloadParam("auth") String auth,
           @PayloadParam("vdc_id") int vdc_id,
           @PayloadParam("zone_id") int zone_id,           
           @PayloadParam("datastore_id") int host_id);     

   
   @Named("del datastore")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vdc.deldatastore</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><int>{vdc_id}</int></value>\n" +
"          </param>\n" +  
"           <param>\n" +
"            <value><int>{zone_id}</int></value>\n" +
"          </param>\n" +  
"           <param>\n" +
"            <value><int>{datastore_id}</int></value>\n" +
"          </param>\n" +           
"        </params>\n" +
"      </methodCall>")
   String delDatastore(@PayloadParam("auth") String auth,
           @PayloadParam("vdc_id") int vdc_id,
           @PayloadParam("zone_id") int zone_id,           
           @PayloadParam("datastore_id") int datastore_id);     

   
   @Named("add vnet")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vdc.addvnet</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><int>{vdc_id}</int></value>\n" +
"          </param>\n" +  
"           <param>\n" +
"            <value><int>{zone_id}</int></value>\n" +
"          </param>\n" +  
"           <param>\n" +
"            <value><int>{vnet_id}</int></value>\n" +
"          </param>\n" +           
"        </params>\n" +
"      </methodCall>")
   String addVnet(@PayloadParam("auth") String auth,
           @PayloadParam("vdc_id") int vdc_id,
           @PayloadParam("zone_id") int zone_id,           
           @PayloadParam("vnet_id") int vnet_id);  

   
   @Named("del vnet")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vdc.delvnet</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><int>{vdc_id}</int></value>\n" +
"          </param>\n" +  
"           <param>\n" +
"            <value><int>{zone_id}</int></value>\n" +
"          </param>\n" +  
"           <param>\n" +
"            <value><int>{vnet_id}</int></value>\n" +
"          </param>\n" +           
"        </params>\n" +
"      </methodCall>")
   String delVnet(@PayloadParam("auth") String auth,
           @PayloadParam("vdc_id") int vdc_id,
           @PayloadParam("zone_id") int zone_id,           
           @PayloadParam("vnet_id") int vnet_id); 

   
   @Named("pool info")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vdcpool.info</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +     
"        </params>\n" +
"      </methodCall>")
   String poolInfo(@PayloadParam("auth") String auth);      

   
    
    
    
    
    
   
    
    
}
