diff --git a/util-bridges/src/com/liferay/util/bridges/alloy/BaseAlloyControllerImpl.java b/util-bridges/src/com/liferay/util/bridges/alloy/BaseAlloyControllerImpl.java
index e163e66..2feb625 100644
--- a/util-bridges/src/com/liferay/util/bridges/alloy/BaseAlloyControllerImpl.java
+++ b/util-bridges/src/com/liferay/util/bridges/alloy/BaseAlloyControllerImpl.java
@@ -199,7 +199,7 @@
 			indexer.reindex(baseModel);
 		}
 		else {
-			Indexer baseModelIndexer = IndexerRegistryUtil.nullSafeGetIndexer(
+			Indexer baseModelIndexer = IndexerRegistryUtil.getIndexer(
 				baseModel.getModelClass());
 
 			if (baseModelIndexer != null) {
