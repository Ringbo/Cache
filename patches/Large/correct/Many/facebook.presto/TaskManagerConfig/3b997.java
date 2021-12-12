diff --git a/presto-main/src/main/java/com/facebook/presto/execution/TaskManagerConfig.java b/presto-main/src/main/java/com/facebook/presto/execution/TaskManagerConfig.java
index e86d2f5..8a0e21c 100644
--- a/presto-main/src/main/java/com/facebook/presto/execution/TaskManagerConfig.java
+++ b/presto-main/src/main/java/com/facebook/presto/execution/TaskManagerConfig.java
@@ -222,7 +222,7 @@
     @NotNull
     public DataSize getMaxPagePartitioningBufferSize()
     {
-        return sinkMaxBufferSize;
+        return maxPagePartitioningBufferSize;
     }
 
     @Config("driver.max-page-partitioning-buffer-size")
