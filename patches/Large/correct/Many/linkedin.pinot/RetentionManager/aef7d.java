diff --git a/pinot-controller/src/main/java/com/linkedin/pinot/controller/helix/core/retention/RetentionManager.java b/pinot-controller/src/main/java/com/linkedin/pinot/controller/helix/core/retention/RetentionManager.java
index f59b467..5b4e0ee 100644
--- a/pinot-controller/src/main/java/com/linkedin/pinot/controller/helix/core/retention/RetentionManager.java
+++ b/pinot-controller/src/main/java/com/linkedin/pinot/controller/helix/core/retention/RetentionManager.java
@@ -173,7 +173,7 @@
       return tableToDeletionStrategyMap;
     }
 
-    if (offlineTableConfig == null) {
+    if (offlineTableConfig == null || offlineTableConfig.getValidationConfig() == null) {
       LOGGER.info("Table config null for table: {}, treating it as refresh only table.", offlineTableName);
       return tableToDeletionStrategyMap;
     }
