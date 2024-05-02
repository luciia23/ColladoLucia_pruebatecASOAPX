package com.bbva.wikj.lib.r001;

import com.bbva.wikj.dto.customer.CustomerIn;
import com.bbva.wikj.dto.customer.CustomerOut;

public interface WIKJR001 {

	int executeInsert(CustomerIn customerIn);
	boolean	executeSelectNuip(String nuip);
	CustomerOut executeSelect(String id);

}
