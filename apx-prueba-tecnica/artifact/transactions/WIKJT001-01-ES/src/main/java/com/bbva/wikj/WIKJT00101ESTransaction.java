package com.bbva.wikj;

import com.bbva.wikj.dto.customer.CustomerIn;
import com.bbva.wikj.lib.r001.WIKJR001;

public class WIKJT00101ESTransaction extends AbstractWIKJT00101ESTransaction {

	/*
	 * Ejecuta la lógica de negocio para insertar un cliente y obtener el resultado.
	 * @see  WIKJR001
	 * */
	@Override
	public void execute() {
		WIKJR001 wikjR001 = this.getServiceLibrary(WIKJR001.class);
		CustomerIn customerIn = this.getCustomerin();
		int result = wikjR001.executeInsert(customerIn);
		if (result == 0)
			this.setCustomerout(null);
		else {
			this.setCustomerout(wikjR001.executeSelect(customerIn.getId()));
		}
	}

}
