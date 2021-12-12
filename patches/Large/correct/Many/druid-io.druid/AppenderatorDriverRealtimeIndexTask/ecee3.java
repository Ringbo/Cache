diff --git a/indexing-service/src/main/java/io/druid/indexing/common/task/AppenderatorDriverRealtimeIndexTask.java b/indexing-service/src/main/java/io/druid/indexing/common/task/AppenderatorDriverRealtimeIndexTask.java
index c1ee50b..9a0ea65 100644
--- a/indexing-service/src/main/java/io/druid/indexing/common/task/AppenderatorDriverRealtimeIndexTask.java
+++ b/indexing-service/src/main/java/io/druid/indexing/common/task/AppenderatorDriverRealtimeIndexTask.java
@@ -322,7 +322,7 @@
             AppenderatorDriverAddResult addResult = driver.add(inputRow, sequenceName, committerSupplier);
 
             if (addResult.isOk()) {
-              if (addResult.getNumRowsInSegment() > tuningConfig.getMaxRowsPerSegment()) {
+              if (addResult.getNumRowsInSegment() >= tuningConfig.getMaxRowsPerSegment()) {
                 publishSegments(driver, publisher, committerSupplier, sequenceName);
 
                 sequenceNumber++;
