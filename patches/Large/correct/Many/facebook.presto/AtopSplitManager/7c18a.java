diff --git a/presto-atop/src/main/java/com/facebook/presto/atop/AtopSplitManager.java b/presto-atop/src/main/java/com/facebook/presto/atop/AtopSplitManager.java
index 035bf39..c03a85f 100644
--- a/presto-atop/src/main/java/com/facebook/presto/atop/AtopSplitManager.java
+++ b/presto-atop/src/main/java/com/facebook/presto/atop/AtopSplitManager.java
@@ -62,7 +62,7 @@
 
         List<ConnectorSplit> splits = new ArrayList<>();
         ZonedDateTime end = ZonedDateTime.now(timeZone);
-        for (Node node : nodeManager.getAllNodes()) {
+        for (Node node : nodeManager.getWorkerNodes()) {
             ZonedDateTime start = end.minusDays(maxHistoryDays - 1).withHour(0).withMinute(0).withSecond(0).withNano(0);
             while (start.isBefore(end)) {
                 ZonedDateTime splitEnd = start.withHour(23).withMinute(59).withSecond(59).withNano(0);
