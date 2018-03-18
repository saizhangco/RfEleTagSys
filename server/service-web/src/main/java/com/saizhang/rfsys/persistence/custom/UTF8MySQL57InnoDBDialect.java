package com.saizhang.rfsys.persistence.custom;

import org.hibernate.dialect.MySQL57InnoDBDialect;

public class UTF8MySQL57InnoDBDialect extends MySQL57InnoDBDialect {

	public UTF8MySQL57InnoDBDialect() {
		super();
	}

	@Override
	public String getTableTypeString() {
		return super.getTableTypeString() + " CHARACTER SET 'utf8' COLLATE 'utf8_general_ci'";
	}
	
}
