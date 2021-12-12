diff --git a/src/community/jms-cluster/jms-geoserver/src/main/java/org/geoserver/cluster/impl/handlers/catalog/CatalogUtils.java b/src/community/jms-cluster/jms-geoserver/src/main/java/org/geoserver/cluster/impl/handlers/catalog/CatalogUtils.java
index a0e2602..e2e1169 100644
--- a/src/community/jms-cluster/jms-geoserver/src/main/java/org/geoserver/cluster/impl/handlers/catalog/CatalogUtils.java
+++ b/src/community/jms-cluster/jms-geoserver/src/main/java/org/geoserver/cluster/impl/handlers/catalog/CatalogUtils.java
@@ -145,7 +145,9 @@
 		if (info==null || catalog==null)
 			throw new NullArgumentException("Arguments may never be null");
 		
-		final LayerInfo localObject=catalog.getLayerByName(info.getName());
+		
+		// make sure we use the prefixed name to include the workspace
+		final LayerInfo localObject=catalog.getLayerByName(info.prefixedName());
 		
 		if (localObject !=null){
 			return localObject;
@@ -214,7 +216,8 @@
 		if (info==null || catalog==null)
 			throw new NullArgumentException("Arguments may never be null");
 		
-		final LayerGroupInfo localObject=catalog.getLayerGroupByName(info.getName());
+		// make sure we use the prefixed name to include the workspace
+		final LayerGroupInfo localObject=catalog.getLayerGroupByName(info.prefixedName());
 		
 		if (localObject !=null){
 			return localObject;
