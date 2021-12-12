diff --git a/presto-raptor/src/main/java/com/facebook/presto/raptor/storage/ShardCompactionManager.java b/presto-raptor/src/main/java/com/facebook/presto/raptor/storage/ShardCompactionManager.java
index 2ba7a08..0e01e2f 100644
--- a/presto-raptor/src/main/java/com/facebook/presto/raptor/storage/ShardCompactionManager.java
+++ b/presto-raptor/src/main/java/com/facebook/presto/raptor/storage/ShardCompactionManager.java
@@ -170,7 +170,7 @@
             startDiscovery();
         }
 
-        if (compactionStarted.getAndSet(true)) {
+        if (!compactionStarted.getAndSet(true)) {
             compactionDriverService.submit(new ShardCompactionDriver());
         }
     }
