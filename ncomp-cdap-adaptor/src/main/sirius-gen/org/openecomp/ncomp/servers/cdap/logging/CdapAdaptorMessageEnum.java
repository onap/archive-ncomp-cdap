
package org.openecomp.ncomp.servers.cdap.logging;

import com.att.eelf.i18n.EELFResourceManager;
import org.openecomp.logger.EcompMessageEnum;

public enum CdapAdaptorMessageEnum implements EcompMessageEnum {

  dummy;

	static {
		EELFResourceManager.loadMessageBundle("org/openecomp/ncomp/servers/cdap/logging/CdapAdaptor");
	}
}
