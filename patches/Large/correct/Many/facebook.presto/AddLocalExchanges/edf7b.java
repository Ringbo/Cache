diff --git a/presto-main/src/main/java/com/facebook/presto/sql/planner/optimizations/AddLocalExchanges.java b/presto-main/src/main/java/com/facebook/presto/sql/planner/optimizations/AddLocalExchanges.java
index 489178b..be4fdb4 100644
--- a/presto-main/src/main/java/com/facebook/presto/sql/planner/optimizations/AddLocalExchanges.java
+++ b/presto-main/src/main/java/com/facebook/presto/sql/planner/optimizations/AddLocalExchanges.java
@@ -424,7 +424,8 @@
         {
             StreamPreferredProperties requiredProperties;
             StreamPreferredProperties preferredProperties;
-            if (getTaskWriterCount(session) > 1) {
+            // Force single writer when partition function exists
+            if (getTaskWriterCount(session) > 1 && !node.getPartitioningScheme().isPresent()) {
                 requiredProperties = fixedParallelism(getTaskWriterCount(session));
                 preferredProperties = fixedParallelism(getTaskWriterCount(session));
             }
