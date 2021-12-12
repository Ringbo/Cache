diff --git a/plugin/watcher/src/main/java/org/elasticsearch/xpack/watcher/common/http/HttpRequest.java b/plugin/watcher/src/main/java/org/elasticsearch/xpack/watcher/common/http/HttpRequest.java
index f10dd8e..b2ef351 100644
--- a/plugin/watcher/src/main/java/org/elasticsearch/xpack/watcher/common/http/HttpRequest.java
+++ b/plugin/watcher/src/main/java/org/elasticsearch/xpack/watcher/common/http/HttpRequest.java
@@ -160,11 +160,11 @@
             builder.field(Field.BODY.getPreferredName(), body);
         }
         if (connectionTimeout != null) {
-            builder.timeValueField(HttpRequest.Field.CONNECTION_TIMEOUT.getPreferredName(),
+            builder.humanReadableField(HttpRequest.Field.CONNECTION_TIMEOUT.getPreferredName(),
                     HttpRequest.Field.CONNECTION_TIMEOUT_HUMAN.getPreferredName(), connectionTimeout);
         }
         if (readTimeout != null) {
-            builder.timeValueField(HttpRequest.Field.READ_TIMEOUT.getPreferredName(),
+            builder.humanReadableField(HttpRequest.Field.READ_TIMEOUT.getPreferredName(),
                     HttpRequest.Field.READ_TIMEOUT_HUMAN.getPreferredName(), readTimeout);
         }
         if (proxy != null) {
