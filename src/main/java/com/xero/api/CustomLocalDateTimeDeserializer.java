package com.xero.api;

import java.lang.reflect.Type;

import org.threeten.bp.LocalDateTime;
import org.threeten.bp.format.DateTimeFormatter;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
 
public class CustomLocalDateTimeDeserializer implements JsonSerializer<LocalDateTime>, JsonDeserializer<LocalDateTime> {
    
	private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
	private static DateTimeFormatter utcFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSSS");
	private static DateTimeFormatter utcFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSS");
	
	public JsonElement serialize(LocalDateTime localDateTime, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(localDateTime.format(dateTimeFormatter));
    }
 
	public LocalDateTime deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
		
		if(json.getAsString().length() == 27) {
			return LocalDateTime.parse(json.getAsString(), utcFormatter);
		} else if(json.getAsString().length() == 26) {
			return LocalDateTime.parse(json.getAsString(), utcFormatter2);
		} else {
			return LocalDateTime.parse(json.getAsString(), dateTimeFormatter);
		}
	}
}