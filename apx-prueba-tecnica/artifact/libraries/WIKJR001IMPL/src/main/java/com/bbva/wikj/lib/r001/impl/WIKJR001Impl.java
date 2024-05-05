package com.bbva.wikj.lib.r001.impl;

import com.bbva.wikj.dto.customer.CustomerIn;
import com.bbva.wikj.dto.customer.CustomerOut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class WIKJR001Impl extends WIKJR001Abstract {

	/*
	* Ejecuta la inserción de un cliente en la base de datos
	* @param customerIn objeto con los datos del cliente a insertar
	* @return resultado de la operación de la inserción (1 si es éxito, 0 si hay error)
	* */
	@Override
	public int executeInsert(CustomerIn customerIn) {
		Map<String, Object> args = new HashMap<>();
		args.put("id", customerIn.getId());
		args.put("nuip", customerIn.getNuip());
		args.put("full_name", customerIn.getFullName());
		args.put("phone", customerIn.getPhone());
		args.put("address", customerIn.getAddress());
		return this.jdbcUtils.update("query.insert", args);
	}

	/*
	* Ejecuta la selección de un cliente en la base de datos
	* @param id ID del cliente a seleccionar
	* @return objeto CustomerOut con los datos del cliente seleccionado
	* */
	@Override
	public CustomerOut executeSelect(String id) {
		Map<String, Object> result = this.jdbcUtils.queryForMap("query.select", id);
		CustomerOut customerOut = new CustomerOut();
		customerOut.setId(String.valueOf(result.get("id")));
		customerOut.setNuip(String.valueOf(result.get("nuip")));
		customerOut.setFullName(String.valueOf(result.get("full_name")));
		customerOut.setPhone(String.valueOf(result.get("phone")));
		customerOut.setAddress(String.valueOf(result.get("address")));
		return customerOut;
	}
}
