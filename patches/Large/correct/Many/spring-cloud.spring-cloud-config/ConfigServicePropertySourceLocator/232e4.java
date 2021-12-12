diff --git a/spring-cloud-config-client/src/main/java/org/springframework/cloud/config/client/ConfigServicePropertySourceLocator.java b/spring-cloud-config-client/src/main/java/org/springframework/cloud/config/client/ConfigServicePropertySourceLocator.java
index 1d4dcb0..845347c 100644
--- a/spring-cloud-config-client/src/main/java/org/springframework/cloud/config/client/ConfigServicePropertySourceLocator.java
+++ b/spring-cloud-config-client/src/main/java/org/springframework/cloud/config/client/ConfigServicePropertySourceLocator.java
@@ -104,7 +104,7 @@
 					"Could not locate PropertySource and the fail fast property is set, failing",
 					error);
 		}
-		logger.error("Could not locate PropertySource: "
+		logger.warn("Could not locate PropertySource: "
 				+ (errorBody == null ? error==null ? "label not found" : error.getMessage() : errorBody));
 		return null;
 
