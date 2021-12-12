diff --git a/watcher/src/main/java/org/elasticsearch/watcher/transport/actions/put/PutWatchRequest.java b/watcher/src/main/java/org/elasticsearch/watcher/transport/actions/put/PutWatchRequest.java
index 1854b40..518aa9c 100644
--- a/watcher/src/main/java/org/elasticsearch/watcher/transport/actions/put/PutWatchRequest.java
+++ b/watcher/src/main/java/org/elasticsearch/watcher/transport/actions/put/PutWatchRequest.java
@@ -31,7 +31,7 @@
     private BytesReference source;
     private boolean active = true;
 
-    PutWatchRequest() {
+    public PutWatchRequest() {
     }
 
     public PutWatchRequest(String id, WatchSourceBuilder source) {
