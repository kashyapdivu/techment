package com.techment.util;

import java.util.UUID;

public class SiteUtil {

	public String generateToken() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}
}
