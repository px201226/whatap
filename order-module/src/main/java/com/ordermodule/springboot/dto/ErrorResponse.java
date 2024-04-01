package com.ordermodule.springboot.dto;

import java.time.LocalDateTime;
import java.util.Map;

public record ErrorResponse(
		String errorCode,
		String message,
		LocalDateTime timestamp,
		Map<Object, Object> extensions

) {

}
