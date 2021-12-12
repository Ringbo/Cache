diff --git a/portal-impl/src/com/liferay/portal/model/impl/ThemeImpl.java b/portal-impl/src/com/liferay/portal/model/impl/ThemeImpl.java
index c3090ea..bf5f4b3 100644
--- a/portal-impl/src/com/liferay/portal/model/impl/ThemeImpl.java
+++ b/portal-impl/src/com/liferay/portal/model/impl/ThemeImpl.java
@@ -415,7 +415,7 @@
 			key = path.concat(StringPool.POUND).concat(portletId);
 		}
 
-		Boolean resourceExists = _resourceExistsMap.containsKey(key);
+		Boolean resourceExists = _resourceExistsMap.get(key);
 
 		if (resourceExists != null) {
 			return resourceExists;
