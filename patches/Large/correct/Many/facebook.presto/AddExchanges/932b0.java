diff --git a/presto-main/src/main/java/com/facebook/presto/sql/planner/optimizations/AddExchanges.java b/presto-main/src/main/java/com/facebook/presto/sql/planner/optimizations/AddExchanges.java
index f6cf197..b5a71ec 100644
--- a/presto-main/src/main/java/com/facebook/presto/sql/planner/optimizations/AddExchanges.java
+++ b/presto-main/src/main/java/com/facebook/presto/sql/planner/optimizations/AddExchanges.java
@@ -303,7 +303,7 @@
                 }
             }
             else {
-                if (child.getProperties().isNodePartitionedOn(partitioningRequirement)) {
+                if (child.getProperties().isStreamPartitionedOn(partitioningRequirement)) {
                     return rebaseAndDeriveProperties(node, child);
                 }
                 else {
