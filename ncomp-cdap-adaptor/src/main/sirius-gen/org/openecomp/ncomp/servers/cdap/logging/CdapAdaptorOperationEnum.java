
package org.openecomp.ncomp.servers.cdap.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum CdapAdaptorOperationEnum implements EcompOperationEnum {
 ; 


	private String n;
	
	private CdapAdaptorOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
