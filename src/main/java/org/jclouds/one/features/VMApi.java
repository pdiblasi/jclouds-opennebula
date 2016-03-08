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


public interface VMApi {
    
    @Named("allocate")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vm.allocate</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><string>{template}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><boolean>{hold}</boolean></value>\n" +
"          </param>\n" +            
"        </params>\n" +
"      </methodCall>")
    String allocate(@PayloadParam("auth") String auth,
            @PayloadParam("template") String template,
            @PayloadParam("hold") int hold); 

    
    @Named("deploy")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vm.deploy</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{host_id}</int></value>\n" +
"          </param>\n" +            
"          <param>\n" +
"            <value><boolean>{force}</boolean></value>\n" +
"          </param>\n" +  
"          <param>\n" +
"            <value><int>{datastore_id}</int></value>\n" +
"          </param>\n" +              
"        </params>\n" +
"      </methodCall>")
    String deploy(@PayloadParam("auth") String auth,
            @PayloadParam("id") int id,
            @PayloadParam("host_id") int host_id,
            @PayloadParam("force") boolean force,
            @PayloadParam("datastore_id") int datastore_id); 

    
    @Named("action")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vm.action</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><string>{action}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" +                        
"        </params>\n" +
"      </methodCall>")
    String action(@PayloadParam("auth") String auth,
            @PayloadParam("action") String action,
            @PayloadParam("id") int id); 

    
    @Named("migrate")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vm.migrate</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{host_id}</int></value>\n" +
"          </param>\n" +            
"          <param>\n" +
"            <value><boolean>{live}</boolean></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><boolean>{force}</boolean></value>\n" +
"          </param>\n" +  
"          <param>\n" +
"            <value><int>{datastore_id}</int></value>\n" +
"          </param>\n" +              
"        </params>\n" +
"      </methodCall>")
    String migrate(@PayloadParam("auth") String auth,
            @PayloadParam("id") int id,
            @PayloadParam("host_id") int host_id,
            @PayloadParam("live") boolean live,
            @PayloadParam("force") boolean force,
            @PayloadParam("datastore_id") int datastore_id); 

    
    @Named("disksave")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vm.disksave</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{disk_id}</int></value>\n" +
"          </param>\n" +            
"          <param>\n" +
"            <value><string>{name}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><string>{type}</string></value>\n" +
"          </param>\n" +  
"          <param>\n" +
"            <value><int>{snapshot_id}</int></value>\n" +
"          </param>\n" +              
"        </params>\n" +
"      </methodCall>")
    String disksave(@PayloadParam("auth") String auth,
            @PayloadParam("id") int id,
            @PayloadParam("disk_id") int disk_id,
            @PayloadParam("name") String name,
            @PayloadParam("type") String type,
            @PayloadParam("snapshot_id") int snapshot_id); 

    
    @Named("disksnapshotcreate")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vm.disksnapshotcreate</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{disk_id}</int></value>\n" +
"          </param>\n" +            
"          <param>\n" +
"            <value><string>{description}</string></value>\n" +
"          </param>\n" +            
"        </params>\n" +
"      </methodCall>")
    String disksnapshotcreate(@PayloadParam("auth") String auth,
            @PayloadParam("id") int id,
            @PayloadParam("disk_id") int disk_id,
            @PayloadParam("description") String description); 

    
    @Named("disksnapshotdelete")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vm.disksnapshotdelete</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{disk_id}</int></value>\n" +
"          </param>\n" +            
"          <param>\n" +
"            <value><string>{snapshot_id}</string></value>\n" +
"          </param>\n" +
"        </params>\n" +
"      </methodCall>")
    String disksnapshotdelete(@PayloadParam("auth") String auth,
            @PayloadParam("id") int id,
            @PayloadParam("disk_id") int disk_id,
            @PayloadParam("snapshot_id") int snapshot_id); 

    
    @Named("disksnapshotrevert")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vm.disksnapshotrevert</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{disk_id}</int></value>\n" +
"          </param>\n" +            
"          <param>\n" +
"            <value><int>{snapshot_id}</int></value>\n" +
"          </param>\n" +              
"        </params>\n" +
"      </methodCall>")
    String disksnapshotrevert(@PayloadParam("auth") String auth,
            @PayloadParam("id") int id,
            @PayloadParam("disk_id") int disk_id,
            @PayloadParam("snapshot_id") int snapshot_id); 
            
    @Named("attach")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vm.attach</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" +         
"          <param>\n" +
"            <value><string>{disk}</string></value>\n" +
"          </param>\n" +           
"        </params>\n" +
"      </methodCall>")
    String disksave(@PayloadParam("auth") String auth,
            @PayloadParam("id") int id,
            @PayloadParam("disk") String disk); 
            
    @Named("detach")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vm.detach</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{disk_id}</int></value>\n" +
"          </param>\n" +              
"        </params>\n" +
"      </methodCall>")
    String detach(@PayloadParam("auth") String auth,
            @PayloadParam("id") int id,
            @PayloadParam("disk_id") int disk_id); 
            

    @Named("attachnic")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vm.attachnic</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" +           
"          <param>\n" +
"            <value><string>{nic}</string></value>\n" +
"          </param>\n" +            
"        </params>\n" +
"      </methodCall>")
    String attachnic(@PayloadParam("auth") String auth,
            @PayloadParam("id") int id,
            @PayloadParam("disk_id") int disk_id,
            @PayloadParam("nic") String nic); 

    
    @Named("detachnic")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vm.detachnic</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{nic_id}</int></value>\n" +
"          </param>\n" +           
"        </params>\n" +
"      </methodCall>")
    String detachnic(@PayloadParam("auth") String auth,
            @PayloadParam("id") int id,
            @PayloadParam("nic_id") int nic_id);
    
    @Named("chmod")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vm.chmod</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{user_use}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{user_manage}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{user_admin}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{group_use}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{group_manage}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{group_admin}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{other_use}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{other_manage}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{other_admin}</int></value>\n" +
"          </param>\n" +            
"        </params>\n" +
"      </methodCall>")
    String chmod(@PayloadParam("auth") String auth, 
            @PayloadParam("id") int id,
            @PayloadParam("user_use") int user_use, 
            @PayloadParam("user_manage") int user_manage, 
            @PayloadParam("user_admin") int user_admin,
            @PayloadParam("group_use") int group_use, 
            @PayloadParam("group_manage") int group_manage, 
            @PayloadParam("group_admin") int group_admin,
            @PayloadParam("other_use") int other_use, 
            @PayloadParam("other_manage") int other_manage, 
            @PayloadParam("other_admin") int other_admin); 
    
    @Named("chown")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vm.chown</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{user_id}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{group_id}</int></value>\n" +
"          </param>\n" +
"        </params>\n" +
"      </methodCall>")
    String chown(@PayloadParam("auth") String auth, 
            @PayloadParam("id") int id,
            @PayloadParam("user_id") int user_d,
            @PayloadParam("group_id") int group_id);


    @Named("rename")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vm.rename</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><string>{name}</string></value>\n" +
"          </param>\n" +           
"        </params>\n" +
"      </methodCall>")
    String rename(@PayloadParam("auth") String auth,
            @PayloadParam("id") int id,
            @PayloadParam("name") String name);  
    

    @Named("snapshotcreate")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vm.snapshotcreate</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><string>{name}</string></value>\n" +
"          </param>\n" +           
"        </params>\n" +
"      </methodCall>")
    String snapshotcreate(@PayloadParam("auth") String auth,
            @PayloadParam("id") int id,
            @PayloadParam("name") String name);    


    @Named("snapshotrevert")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vm.snapshotrevert</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{snapshot_id}</int></value>\n" +
"          </param>\n" +           
"        </params>\n" +
"      </methodCall>")
    String snapshotrevert(@PayloadParam("auth") String auth,
            @PayloadParam("id") int id,
            @PayloadParam("snapshot_id") int snapshot_id);    


    @Named("snapshotdelete")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vm.snapshotdelete</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{snapshot_id}</int></value>\n" +
"          </param>\n" +           
"        </params>\n" +
"      </methodCall>")
    String snapshotdelete(@PayloadParam("auth") String auth,
            @PayloadParam("id") int id,
            @PayloadParam("snapshot_id") int snapshot_id);

    @Named("resize")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vm.resize</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><string>{template}</string></value>\n" +
"          </param>\n" +           
"          <param>\n" +
"            <value><boolean>{force}</boolean></value>\n" +
"          </param>\n" +                       
"        </params>\n" +
"      </methodCall>")
    String resize(@PayloadParam("auth") String auth,
            @PayloadParam("id") int id,
            @PayloadParam("template") String template,
            @PayloadParam("force") boolean force);


    @Named("update")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vm.update</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><string>{template}</string></value>\n" +
"          </param>\n" +           
"          <param>\n" +
"            <value><int>{type}</int></value>\n" +
"          </param>\n" +                       
"        </params>\n" +
"      </methodCall>")
    String update(@PayloadParam("auth") String auth,
            @PayloadParam("id") int id,
            @PayloadParam("template") String template,
            @PayloadParam("type") int type);
    
    
    @Named("recover")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vm.recover</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{operation}</int></value>\n" +
"          </param>\n" +                 
"        </params>\n" +
"      </methodCall>")
    String recover(@PayloadParam("auth") String auth,
            @PayloadParam("id") int id,
            @PayloadParam("operation") int operation);


    @Named("info")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vm.info</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" +                    
"        </params>\n" +
"      </methodCall>")
    String info(@PayloadParam("auth") String auth,
            @PayloadParam("id") int id);

    
    @Named("monitoring")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vm.monitoring</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" +                  
"        </params>\n" +
"      </methodCall>")
    String monitoring(@PayloadParam("auth") String auth,
            @PayloadParam("id") int id);
    

    @Named("pool info")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vmpool.info</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{filter_flag}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{range_start}</int></value>\n" +
"          </param>\n" +           
"          <param>\n" +
"            <value><int>{range_end}</int></value>\n" +
"          </param>\n" +            
"          <param>\n" +
"            <value><int>{status}</int></value>\n" +
"          </param>\n" +                      
"        </params>\n" +
"      </methodCall>")
    String poolInfo(@PayloadParam("auth") String auth,
            @PayloadParam("filter_flag") int filter_flag,
            @PayloadParam("range_start") int range_start,
            @PayloadParam("range_end") int range_end,
            @PayloadParam("status") int status);

    
    @Named("pool monitoring")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vmpool.monitoring</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{filter_flag}</int></value>\n" +
"          </param>\n" +          
"        </params>\n" +
"      </methodCall>")
    String poolMonitoring(@PayloadParam("auth") String auth,
            @PayloadParam("id") int id,
            @PayloadParam("filter_flag") int filter_flag);
    
    
    @Named("pool accounting")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vmpool.accounting</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{filter_flag}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{start}</int></value>\n" +
"          </param>\n" +           
"          <param>\n" +
"            <value><int>{end}</int></value>\n" +
"          </param>\n" +                       
"        </params>\n" +
"      </methodCall>")
    String poolAccounting(@PayloadParam("auth") String auth,
            @PayloadParam("filter_flag") int filter_flag,
            @PayloadParam("start") int start,
            @PayloadParam("end") int end);
    
    
    @Named("pool showback")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vmpool.showback</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{first_month}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{first_year}</int></value>\n" +
"          </param>\n" +           
"          <param>\n" +
"            <value><int>{last_month}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{last_year}</int></value>\n" +
"          </param>\n" +                   
"        </params>\n" +
"      </methodCall>")
    String poolShowback(@PayloadParam("auth") String auth,
            @PayloadParam("first_month") int first_month,
            @PayloadParam("first_year") int first_year,
            @PayloadParam("last_month") int last_month,
            @PayloadParam("last_year") int last_year);

    
    @Named("pool calculateshowback")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.vmpool.calculateshowback</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{first_month}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{first_year}</int></value>\n" +
"          </param>\n" +           
"          <param>\n" +
"            <value><int>{last_month}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{last_year}</int></value>\n" +
"          </param>\n" +                   
"        </params>\n" +
"      </methodCall>")
    String poolCalculateShowback(@PayloadParam("auth") String auth,
            @PayloadParam("first_month") int first_month,
            @PayloadParam("first_year") int first_year,
            @PayloadParam("last_month") int last_month,
            @PayloadParam("last_year") int last_year);

}
