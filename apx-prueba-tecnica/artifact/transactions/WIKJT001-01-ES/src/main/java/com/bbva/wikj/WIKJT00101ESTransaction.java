package com.bbva.wikj;

import com.bbva.wikj.dto.customer.CustomerIn;
import com.bbva.wikj.dto.customer.CustomerOut;
import com.bbva.wikj.lib.r001.WIKJR001;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * customer transaction
 *
 */
public class WIKJT00101ESTransaction extends AbstractWIKJT00101ESTransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJT00101ESTransaction.class);

	@Override
	public void execute() {
		WIKJR001 wikjR001 = this.getServiceLibrary(WIKJR001.class);
		CustomerIn customerIn = this.getCustomerin();
		//if (wikjR001.executeSelectNuip(customerIn.getNuip()))
		//execute first select
		//if the nuip already exists, then dont do the insert
		//if not, do the insert
		int result = wikjR001.executeInsert(customerIn);
		if (result == 0)
			this.setCustomerout(null);
		else {
			this.setCustomerout(wikjR001.executeSelect(customerIn.getNuip()));
		}
	}

}
