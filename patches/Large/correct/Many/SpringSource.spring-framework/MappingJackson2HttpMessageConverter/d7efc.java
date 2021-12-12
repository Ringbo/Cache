diff --git a/spring-web/src/main/java/org/springframework/http/converter/json/MappingJackson2HttpMessageConverter.java b/spring-web/src/main/java/org/springframework/http/converter/json/MappingJackson2HttpMessageConverter.java
index a717ecb..4e01b51 100644
--- a/spring-web/src/main/java/org/springframework/http/converter/json/MappingJackson2HttpMessageConverter.java
+++ b/spring-web/src/main/java/org/springframework/http/converter/json/MappingJackson2HttpMessageConverter.java
@@ -148,7 +148,7 @@
 		try {
 			return this.objectMapper.readValue(inputMessage.getBody(), javaType);
 		}
-		catch (JsonProcessingException ex) {
+		catch (IOException ex) {
 			throw new HttpMessageNotReadableException("Could not read JSON: " + ex.getMessage(), ex);
 		}
 	}
