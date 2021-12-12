diff --git a/bundles/binding/org.openhab.binding.myq/src/main/java/org/openhab/binding/myq/internal/LoginData.java b/bundles/binding/org.openhab.binding.myq/src/main/java/org/openhab/binding/myq/internal/LoginData.java
index ebbcfdb..52ffb6d 100644
--- a/bundles/binding/org.openhab.binding.myq/src/main/java/org/openhab/binding/myq/internal/LoginData.java
+++ b/bundles/binding/org.openhab.binding.myq/src/main/java/org/openhab/binding/myq/internal/LoginData.java
@@ -46,7 +46,7 @@
 			throw new InvalidDataException(
 					"Could not find SecurityToken in JSON data");
 		securityToken = data.toString();
-		logger.debug("myq securityToken: {}", securityToken);
+		logger.trace("myq securityToken: {}", securityToken);
 	}
 
 	/**
