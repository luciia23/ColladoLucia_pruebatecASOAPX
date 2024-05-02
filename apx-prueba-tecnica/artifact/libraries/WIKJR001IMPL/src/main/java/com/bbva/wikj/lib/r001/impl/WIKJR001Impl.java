package com.bbva.wikj.lib.r001.impl;

import com.bbva.wikj.dto.customer.CustomerIn;
import com.bbva.wikj.dto.customer.CustomerOut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class WIKJR001Impl extends WIKJR001Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJR001Impl.class);

	@Override
	public int executeInsert(CustomerIn customerIn) {
		Map<String, Object> args = new HashMap<>();
		args.put("id", customerIn.getId());
		args.put("nuip", customerIn.getNuip());
		args.put("full_name", customerIn.getFullName());
		args.put("phone", customerIn.getPhone());
		args.put("address", customerIn.getAddress());
		return this.jdbcUtils.update("query", args);
	}

	@Override
	public boolean executeSelectNuip(String nuip) {
		Map<String, Object> result = this.jdbcUtils.queryForMap("query.selectNuip", nuip);
		if (String.valueOf(result.get("nuip")) == null)
			return (false);
		return true;
	}

	@Override
	public CustomerOut executeSelect(String id) {
		Map<String, Object> result = this.jdbcUtils.queryForMap("query.selectNuip", id);
		CustomerOut customerOut = new CustomerOut();
		customerOut.setId(String.valueOf(result.get("id")));
		customerOut.setNuip(String.valueOf(result.get("nuip")));
		customerOut.setFullName(String.valueOf(result.get("full_name")));
		customerOut.setPhone(String.valueOf(result.get("phone")));
		customerOut.setAddress(String.valueOf(result.get("address")));
		return customerOut;
	}
}
