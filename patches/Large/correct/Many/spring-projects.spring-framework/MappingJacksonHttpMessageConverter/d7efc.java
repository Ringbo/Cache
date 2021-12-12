diff --git a/spring-web/src/main/java/org/springframework/http/converter/json/MappingJacksonHttpMessageConverter.java b/spring-web/src/main/java/org/springframework/http/converter/json/MappingJacksonHttpMessageConverter.java
index b26d8bc..51bc4d5 100644
--- a/spring-web/src/main/java/org/springframework/http/converter/json/MappingJacksonHttpMessageConverter.java
+++ b/spring-web/src/main/java/org/springframework/http/converter/json/MappingJacksonHttpMessageConverter.java
@@ -148,7 +148,7 @@
 		try {
 			return this.objectMapper.readValue(inputMessage.getBody(), javaType);
 		}
-		catch (JsonProcessingException ex) {
+		catch (IOException ex) {
 			throw new HttpMessageNotReadableException("Could not read JSON: " + ex.getMessage(), ex);
 		}
 	}
