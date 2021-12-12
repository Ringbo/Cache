diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/watcher/support/WatcherUtils.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/watcher/support/WatcherUtils.java
index 8747a25..70fa364 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/watcher/support/WatcherUtils.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/watcher/support/WatcherUtils.java
@@ -24,7 +24,7 @@
     }
 
     public static Map<String, Object> responseToData(ToXContentObject response) throws IOException {
-        return XContentHelper.convertToMap(XContentHelper.toXContent(response, XContentType.JSON), false).v2();
+        return XContentHelper.convertToMap(XContentHelper.toXContent(response, XContentType.JSON, false), false).v2();
     }
 
     public static Map<String, Object> flattenModel(Map<String, Object> map) {
