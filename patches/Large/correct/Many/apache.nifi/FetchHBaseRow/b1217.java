diff --git a/nifi-nar-bundles/nifi-hbase-bundle/nifi-hbase-processors/src/main/java/org/apache/nifi/hbase/FetchHBaseRow.java b/nifi-nar-bundles/nifi-hbase-bundle/nifi-hbase-processors/src/main/java/org/apache/nifi/hbase/FetchHBaseRow.java
index 8d06da9..654f7af 100644
--- a/nifi-nar-bundles/nifi-hbase-bundle/nifi-hbase-processors/src/main/java/org/apache/nifi/hbase/FetchHBaseRow.java
+++ b/nifi-nar-bundles/nifi-hbase-bundle/nifi-hbase-processors/src/main/java/org/apache/nifi/hbase/FetchHBaseRow.java
@@ -268,7 +268,7 @@
 
         FlowFile handlerFlowFile = handler.getFlowFile();
         if (!handler.handledRow()) {
-            getLogger().error("Row {} not found in {}, transferring to not found", new Object[] {rowId, tableName});
+            getLogger().debug("Row {} not found in {}, transferring to not found", new Object[] {rowId, tableName});
             session.transfer(handlerFlowFile, REL_NOT_FOUND);
             return;
         }
