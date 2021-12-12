diff --git a/plugin/watcher/src/main/java/org/elasticsearch/xpack/watcher/common/http/HttpRequestTemplate.java b/plugin/watcher/src/main/java/org/elasticsearch/xpack/watcher/common/http/HttpRequestTemplate.java
index c345fe8..e511b30 100644
--- a/plugin/watcher/src/main/java/org/elasticsearch/xpack/watcher/common/http/HttpRequestTemplate.java
+++ b/plugin/watcher/src/main/java/org/elasticsearch/xpack/watcher/common/http/HttpRequestTemplate.java
@@ -192,11 +192,11 @@
             builder.field(HttpRequest.Field.BODY.getPreferredName(), body, params);
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
