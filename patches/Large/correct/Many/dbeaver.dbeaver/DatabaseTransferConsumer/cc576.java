diff --git a/plugins/org.jkiss.dbeaver.data.transfer/src/org/jkiss/dbeaver/tools/transfer/database/DatabaseTransferConsumer.java b/plugins/org.jkiss.dbeaver.data.transfer/src/org/jkiss/dbeaver/tools/transfer/database/DatabaseTransferConsumer.java
index dbfc81c..2705ffd 100644
--- a/plugins/org.jkiss.dbeaver.data.transfer/src/org/jkiss/dbeaver/tools/transfer/database/DatabaseTransferConsumer.java
+++ b/plugins/org.jkiss.dbeaver.data.transfer/src/org/jkiss/dbeaver/tools/transfer/database/DatabaseTransferConsumer.java
@@ -93,7 +93,7 @@
     {
         initExporter(session.getProgressMonitor());
 
-        if (offset == 0 && settings.isTruncateBeforeLoad() && (containerMapping == null || containerMapping.getMappingType() == DatabaseMappingType.existing)) {
+        if (offset <= 0 && settings.isTruncateBeforeLoad() && (containerMapping == null || containerMapping.getMappingType() == DatabaseMappingType.existing)) {
             // Truncate target tables
             if ((targetObject.getSupportedFeatures() & DBSDataManipulator.DATA_TRUNCATE) != 0) {
                 targetObject.truncateData(
