
/*-
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 */
	
package org.openecomp.ncomp.servers.cdap;

import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.ManagementServer;

public class TestPolling implements ISiriusServer {

	public static void main(String[] args) {
		TestPolling t = new TestPolling();
		t.poll();
	}

	private ManagementServer server;

	private void poll() {
		server = new ManagementServer();
		CdapCdapCluster c = new CdapCdapCluster(this);
		c.setBaseUrl("http://10.0.2.2:10000/v3");
		c.poll();
		System.err.println("XXXX "
				+ ManagementServer.ecore2json(c, 100, null, true).toString(2));

	}

	@Override
	public ManagementServer getServer() {
		return server;
	}

}
