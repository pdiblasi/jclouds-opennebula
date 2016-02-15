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


public interface UserApi {
   @Named("allocate")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.user.allocate</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><string>{username}</string></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><string>{password}</string></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><string>{auth_driver}</string></value>\n" +
"          </param>\n" +         
"        </params>\n" +
"      </methodCall>")
   String allocate(@PayloadParam("auth") String auth,
           @PayloadParam("username") String username,
           @PayloadParam("password") String password,
           @PayloadParam("auth_driver") String auth_driver);      

   
   @Named("delete")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.user.delete</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" +           
"        </params>\n" +
"      </methodCall>")
   String allocate(@PayloadParam("auth") String auth,
           @PayloadParam("id") int id);  
   
   
   @Named("passwd")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.user.passwd</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" + 
"           <param>\n" +
"            <value><string>{password}</string></value>\n" +
"          </param>\n" +          
"        </params>\n" +
"      </methodCall>")
   String passwd(@PayloadParam("auth") String auth,
           @PayloadParam("id") int id,
           @PayloadParam("password") String password);      

   
   @Named("login")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.user.login</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><string>{username}</string></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><string>{token}</string></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><int>{period}</int></value>\n" +
"          </param>\n" +           
"        </params>\n" +
"      </methodCall>")
   String login(@PayloadParam("auth") String auth,
           @PayloadParam("username") String username,
           @PayloadParam("token") String token,
           @PayloadParam("period") int period);      

   
   @Named("update")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.user.update</methodName>\n" +
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

   
   @Named("chauth")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.user.chauth</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" +  
"           <param>\n" +
"            <value><string>{auth_driver}</string></value>\n" +
"          </param>\n" + 
"           <param>\n" +
"            <value><string>{password}</string></value>\n" +
"          </param>\n" +        
"        </params>\n" +
"      </methodCall>")
   String chauth(@PayloadParam("auth") String auth,
           @PayloadParam("id") int id,
           @PayloadParam("auth_driver") String auth_driver,
           @PayloadParam("password") String password);      

   
   @Named("quota")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.user.quota</methodName>\n" +
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
"        </params>\n" +
"      </methodCall>")
   String quota(@PayloadParam("auth") String auth,
           @PayloadParam("id") int id,
           @PayloadParam("template") String template);      

   
   @Named("chgrp")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.user.chgrp</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><int>{id}</int></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><int>{group_id}</int></value>\n" +
"          </param>\n" +           
"        </params>\n" +
"      </methodCall>")
   String chgrp(@PayloadParam("auth") String auth,
           @PayloadParam("template") int id,
           @PayloadParam("group_id") int group_id);      

   
   @Named("addgroup")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.user.addgroup</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><int>{user_id}</int></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><int>{group_id}</int></value>\n" +
"          </param>\n" +           
"        </params>\n" +
"      </methodCall>")
   String addgroup(@PayloadParam("auth") String auth,
           @PayloadParam("user_id") int user_id,
           @PayloadParam("group_id") int group_id);      

   
   @Named("delgroup")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.user.delgroup</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><int>{user_id}</int></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><int>{group_id}</int></value>\n" +
"          </param>\n" +           
"        </params>\n" +
"      </methodCall>")
   String delgroup(@PayloadParam("auth") String auth,
           @PayloadParam("user_id") int user_id,
           @PayloadParam("group_id") int group_id);      
   

   @Named("info")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.user.info</methodName>\n" +
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

   
   @Named("pool info")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.userpool.info</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +         
"        </params>\n" +
"      </methodCall>")
   String poolInfo(@PayloadParam("auth") String auth);      

   
   @Named("quota info")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.userquota.info</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +          
"        </params>\n" +
"      </methodCall>")
   String quotaInfo(@PayloadParam("auth") String auth);      

   
   @Named("quota update")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.userquota.update</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><string>{template}</string></value>\n" +
"          </param>\n" +         
"        </params>\n" +
"      </methodCall>")
   String quotaUpdate(@PayloadParam("auth") String auth);      

}
