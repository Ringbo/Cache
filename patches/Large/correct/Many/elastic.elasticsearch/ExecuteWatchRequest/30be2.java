diff --git a/watcher/src/main/java/org/elasticsearch/watcher/transport/actions/execute/ExecuteWatchRequest.java b/watcher/src/main/java/org/elasticsearch/watcher/transport/actions/execute/ExecuteWatchRequest.java
index 33ced37..dee813e 100644
--- a/watcher/src/main/java/org/elasticsearch/watcher/transport/actions/execute/ExecuteWatchRequest.java
+++ b/watcher/src/main/java/org/elasticsearch/watcher/transport/actions/execute/ExecuteWatchRequest.java
@@ -39,7 +39,7 @@
 
     private boolean debug = false;
 
-    ExecuteWatchRequest() {
+    public ExecuteWatchRequest() {
     }
 
     /**
