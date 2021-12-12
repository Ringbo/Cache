diff --git a/spring-security-oauth2/src/main/java/org/springframework/security/oauth2/provider/endpoint/FrameworkEndpointHandlerMapping.java b/spring-security-oauth2/src/main/java/org/springframework/security/oauth2/provider/endpoint/FrameworkEndpointHandlerMapping.java
index fd86a3a..ed12a5b 100644
--- a/spring-security-oauth2/src/main/java/org/springframework/security/oauth2/provider/endpoint/FrameworkEndpointHandlerMapping.java
+++ b/spring-security-oauth2/src/main/java/org/springframework/security/oauth2/provider/endpoint/FrameworkEndpointHandlerMapping.java
@@ -118,7 +118,7 @@
 
 	public FrameworkEndpointHandlerMapping() {
 		// Make sure user-supplied mappings take precedence by default (except the resource mapping)
-		setOrder(Ordered.LOWEST_PRECEDENCE - 1);
+		setOrder(Ordered.LOWEST_PRECEDENCE - 2);
 	}
 
 	/**
