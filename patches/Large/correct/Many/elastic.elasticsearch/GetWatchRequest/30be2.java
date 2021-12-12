diff --git a/watcher/src/main/java/org/elasticsearch/watcher/transport/actions/get/GetWatchRequest.java b/watcher/src/main/java/org/elasticsearch/watcher/transport/actions/get/GetWatchRequest.java
index 8de2dba..e35f852 100644
--- a/watcher/src/main/java/org/elasticsearch/watcher/transport/actions/get/GetWatchRequest.java
+++ b/watcher/src/main/java/org/elasticsearch/watcher/transport/actions/get/GetWatchRequest.java
@@ -27,7 +27,7 @@
     private VersionType versionType = VersionType.INTERNAL;
 
 
-    GetWatchRequest() {
+    public GetWatchRequest() {
     }
 
     /**
