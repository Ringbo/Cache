diff --git a/modules/swagger-jaxrs/src/main/java/io/swagger/jaxrs/Reader.java b/modules/swagger-jaxrs/src/main/java/io/swagger/jaxrs/Reader.java
index 82d3915..a319ea8 100644
--- a/modules/swagger-jaxrs/src/main/java/io/swagger/jaxrs/Reader.java
+++ b/modules/swagger-jaxrs/src/main/java/io/swagger/jaxrs/Reader.java
@@ -489,7 +489,7 @@
             io.swagger.models.auth.ApiKeyAuthDefinition apiKeyAuthDefinition = new io.swagger.models.auth.ApiKeyAuthDefinition();
 
             apiKeyAuthDefinition.setName(apiKeyAuthConfig.name());
-            apiKeyAuthDefinition.setIn(In.valueOf(apiKeyAuthConfig.in().toValue()));
+            apiKeyAuthDefinition.setIn(In.forValue(apiKeyAuthConfig.in().toValue()));
             apiKeyAuthDefinition.setDescription(apiKeyAuthConfig.description());
 
             swagger.addSecurityDefinition(apiKeyAuthConfig.key(), apiKeyAuthDefinition);
