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


public interface ZoneApi {
   
   @Named("allocate")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.zone.allocate</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +
"           <param>\n" +
"            <value><string>{template}</string></value>\n" +
"          </param>\n" +           
"        </params>\n" +
"      </methodCall>")
   String addHost(@PayloadParam("auth") String auth,
           @PayloadParam("template") String template);
   
   
   @Named("delete")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.zone.delete</methodName>\n" +
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
           @PayloadParam("id") int id);   
   

   
   @Named("update")
   @POST
   @Produces(MediaType.TEXT_XML)
   @Payload(value = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
"      <methodCall>\n" +
"        <methodName>one.zone.update</methodName>\n" +
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
"        <methodName>one.zone.rename</methodName>\n" +
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
"        <methodName>one.zone.info</methodName>\n" +
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
"        <methodName>one.zonepool.info</methodName>\n" +
"        <params>\n" +
"          <param>\n" +
"            <value><string>{auth}</string></value>\n" +
"          </param>\n" +     
"        </params>\n" +
"      </methodCall>")
   String poolInfo(@PayloadParam("auth") String auth);     

}
