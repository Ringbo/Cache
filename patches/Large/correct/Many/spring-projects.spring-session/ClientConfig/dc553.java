diff --git a/samples/httpsession-gemfire-clientserver/src/main/java/sample/ClientConfig.java b/samples/httpsession-gemfire-clientserver/src/main/java/sample/ClientConfig.java
index 6d32ba5..9ebe13a 100644
--- a/samples/httpsession-gemfire-clientserver/src/main/java/sample/ClientConfig.java
+++ b/samples/httpsession-gemfire-clientserver/src/main/java/sample/ClientConfig.java
@@ -68,7 +68,7 @@
 	}
 
 	@Bean
-	PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
+	static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
 		return new PropertySourcesPlaceholderConfigurer();
 	}
 
