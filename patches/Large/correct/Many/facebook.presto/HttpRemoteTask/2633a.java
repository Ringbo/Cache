diff --git a/presto-main/src/main/java/com/facebook/presto/server/remotetask/HttpRemoteTask.java b/presto-main/src/main/java/com/facebook/presto/server/remotetask/HttpRemoteTask.java
index 44e9c78..ea56a78 100644
--- a/presto-main/src/main/java/com/facebook/presto/server/remotetask/HttpRemoteTask.java
+++ b/presto-main/src/main/java/com/facebook/presto/server/remotetask/HttpRemoteTask.java
@@ -592,7 +592,7 @@
     /**
      * Move the task directly to the failed state if there was a failure in this task
      */
-    void failTask(Throwable cause)
+    private void failTask(Throwable cause)
     {
         TaskStatus taskStatus = getTaskStatus();
         if (!taskStatus.getState().isDone()) {
