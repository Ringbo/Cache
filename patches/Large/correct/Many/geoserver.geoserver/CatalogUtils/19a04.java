diff --git a/src/community/jms-cluster/jms-geoserver/src/main/java/org/geoserver/cluster/impl/handlers/catalog/CatalogUtils.java b/src/community/jms-cluster/jms-geoserver/src/main/java/org/geoserver/cluster/impl/handlers/catalog/CatalogUtils.java
index e2e1169..dbb25b8 100644
--- a/src/community/jms-cluster/jms-geoserver/src/main/java/org/geoserver/cluster/impl/handlers/catalog/CatalogUtils.java
+++ b/src/community/jms-cluster/jms-geoserver/src/main/java/org/geoserver/cluster/impl/handlers/catalog/CatalogUtils.java
@@ -88,7 +88,7 @@
 		if (info==null || catalog==null)
 			throw new NullArgumentException("Arguments may never be null");
 		
-		final StyleInfo localObject = catalog.getStyleByName(info.getName());
+		final StyleInfo localObject = catalog.getStyleByName(info.getWorkspace(),info.getName());
 		if (localObject != null) {
 			return localObject;
 		}
