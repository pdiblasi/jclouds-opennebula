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


public interface TemplateApi {
    @Named("allocate")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.template.allocate</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><string>{template}</string></value>\n" +
"          </param>\n" +
"        </params>\n" +
"      </methodCall>")
    String allocate(@PayloadParam("auth") String auth, 
            @PayloadParam("template") String template); 

    
    @Named("clone")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.template.clone</methodName>\n" +
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
    String clone(@PayloadParam("auth") String auth, 
            @PayloadParam("id") int id, 
            @PayloadParam("name") String name); 

    
    @Named("delete")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.template.delete</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" +           
"        </params>\n" +
"      </methodCall>")
    String delete(@PayloadParam("auth") String auth, 
            @PayloadParam("id") int id); 
    

    @Named("instantiate")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.template.instantiate</methodName>\n" +
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
"          <param>\n" +
"            <value><boolean>{pending}</boolean></value>\n" +
"          </param>\n" +  
"          <param>\n" +
"            <value><string>{extra_template}</string></value>\n" +
"          </param>\n" +            
"        </params>\n" +
"      </methodCall>")
    String instantiate(@PayloadParam("auth") String auth, 
            @PayloadParam("id") int id, 
            @PayloadParam("name") String name, 
            @PayloadParam("pending") int pending,
            @PayloadParam("extra_template") String extra_template); 


    @Named("chmod")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.template.chmod</methodName>\n" +
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
"        <methodName>one.template.chown</methodName>\n" +
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
"        <methodName>one.template.rename</methodName>\n" +
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

    
    @Named("info")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.template.info</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" +
"          <param>\n" +
"            <value><boolean>{flag}</boolean></value>\n" +
"          </param>\n" +
"        </params>\n" +
"      </methodCall>")
    String info(@PayloadParam("auth") String auth, 
            @PayloadParam("id") int id,
            @PayloadParam("flag") int group_id);

    @Named("pool info")
    @POST
    @Produces(MediaType.TEXT_XML)
    @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.templatepool.info</methodName>\n" +
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
"        </params>\n" +
"      </methodCall>")
    String poolInfo(@PayloadParam("auth") String auth, 
            @PayloadParam("id") int id,
            @PayloadParam("filter_flag") int filter_flag,
            @PayloadParam("range_start") int range_start,
            @PayloadParam("range_end") int range_end);   
    
}
