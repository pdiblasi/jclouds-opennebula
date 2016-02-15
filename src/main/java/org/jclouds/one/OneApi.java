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
package org.jclouds.one;

import org.jclouds.ec2.EC2Api;
//import org.jclouds.location.functions.RegionToEndpointOrProviderIfNull;
import org.jclouds.rest.annotations.Delegate;
//import org.jclouds.rest.annotations.EndpointParam;

import com.google.common.base.Optional;

import org.jclouds.one.features.ACLApi;
import org.jclouds.one.features.ClusterApi;
import org.jclouds.one.features.DatastoreApi;
import org.jclouds.one.features.DocumentApi;
import org.jclouds.one.features.GroupApi;
import org.jclouds.one.features.HostApi;
import org.jclouds.one.features.ImageApi;
import org.jclouds.one.features.SecGroupApi;
import org.jclouds.one.features.SystemApi;
import org.jclouds.one.features.TemplateApi;
import org.jclouds.one.features.UserApi;
import org.jclouds.one.features.VDCApi;
import org.jclouds.one.features.VMApi;
import org.jclouds.one.features.VNApi;
import org.jclouds.one.features.ZoneApi;

// http://docs.opennebula.org/4.14/integration/system_interfaces/api.html

public interface OneApi extends EC2Api {

   @Delegate
   Optional<? extends ACLApi> getACLApi();
   
   @Delegate
   Optional<? extends ClusterApi> getClusterApi();   
   
   @Delegate
   Optional<? extends DatastoreApi> getDatastoreApi();   

   @Delegate
   Optional<? extends DocumentApi> getDocumentApi();   
   
   @Delegate
   Optional<? extends GroupApi> getGroupApi();   

   @Delegate
   Optional<? extends HostApi> getHostApi();

   @Delegate
   Optional<? extends ImageApi> getImageApi();
   
   @Delegate
   Optional<? extends SecGroupApi> getSecGroupApi();

   @Delegate
   Optional<? extends SystemApi> getSystemApi();

   @Delegate
   Optional<? extends TemplateApi> getTemplateApi();

   @Delegate
   Optional<? extends UserApi> getUserApi();

   @Delegate
   Optional<? extends VDCApi> getVDCApi();

   @Delegate
   Optional<? extends VMApi> getVMApi();

   @Delegate
   Optional<? extends VNApi> getVNApi();

   @Delegate
   Optional<? extends ZoneApi> getZoneApi();   
   
}
