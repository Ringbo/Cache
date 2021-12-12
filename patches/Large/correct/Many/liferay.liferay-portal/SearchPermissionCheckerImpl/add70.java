diff --git a/portal-impl/src/com/liferay/portal/search/SearchPermissionCheckerImpl.java b/portal-impl/src/com/liferay/portal/search/SearchPermissionCheckerImpl.java
index 4e0ee96..16a7739 100644
--- a/portal-impl/src/com/liferay/portal/search/SearchPermissionCheckerImpl.java
+++ b/portal-impl/src/com/liferay/portal/search/SearchPermissionCheckerImpl.java
@@ -95,7 +95,7 @@
 				return;
 			}
 
-			Indexer indexer = IndexerRegistryUtil.getIndexer(className);
+			Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(className);
 
 			if (!indexer.isPermissionAware()) {
 				return;
