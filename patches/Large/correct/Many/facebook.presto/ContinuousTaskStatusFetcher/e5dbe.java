diff --git a/presto-main/src/main/java/com/facebook/presto/server/remotetask/ContinuousTaskStatusFetcher.java b/presto-main/src/main/java/com/facebook/presto/server/remotetask/ContinuousTaskStatusFetcher.java
index 77d8dac..12bedf0 100644
--- a/presto-main/src/main/java/com/facebook/presto/server/remotetask/ContinuousTaskStatusFetcher.java
+++ b/presto-main/src/main/java/com/facebook/presto/server/remotetask/ContinuousTaskStatusFetcher.java
@@ -208,7 +208,7 @@
         }
     }
 
-    synchronized void updateTaskStatus(TaskStatus newValue)
+    void updateTaskStatus(TaskStatus newValue)
     {
         // change to new value if old value is not changed and new value has a newer version
         AtomicBoolean taskMismatch = new AtomicBoolean();
