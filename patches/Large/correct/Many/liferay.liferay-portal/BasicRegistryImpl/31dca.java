diff --git a/modules/core/registry-api/src/main/java/com/liferay/registry/BasicRegistryImpl.java b/modules/core/registry-api/src/main/java/com/liferay/registry/BasicRegistryImpl.java
index 24b1bb1..7f07500 100644
--- a/modules/core/registry-api/src/main/java/com/liferay/registry/BasicRegistryImpl.java
+++ b/modules/core/registry-api/src/main/java/com/liferay/registry/BasicRegistryImpl.java
@@ -588,10 +588,10 @@
 
 			if (thisServiceRanking != otherServiceRanking) {
 				if (thisServiceRanking < otherServiceRanking) {
-					return -1;
+					return 1;
 				}
 
-				return 1;
+				return -1;
 			}
 
 			long thisServiceId = (Long)_properties.get("service.id");
