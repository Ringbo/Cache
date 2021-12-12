diff --git a/plugin/watcher/src/main/java/org/elasticsearch/xpack/watcher/transform/search/SearchTransform.java b/plugin/watcher/src/main/java/org/elasticsearch/xpack/watcher/transform/search/SearchTransform.java
index cebfa33..0d3eed3 100644
--- a/plugin/watcher/src/main/java/org/elasticsearch/xpack/watcher/transform/search/SearchTransform.java
+++ b/plugin/watcher/src/main/java/org/elasticsearch/xpack/watcher/transform/search/SearchTransform.java
@@ -79,7 +79,7 @@
             builder.field(Field.REQUEST.getPreferredName(), request);
         }
         if (timeout != null) {
-            builder.timeValueField(Field.TIMEOUT.getPreferredName(), Field.TIMEOUT_HUMAN.getPreferredName(), timeout);
+            builder.humanReadableField(Field.TIMEOUT.getPreferredName(), Field.TIMEOUT_HUMAN.getPreferredName(), timeout);
         }
         if (dynamicNameTimeZone != null) {
             builder.field(Field.DYNAMIC_NAME_TIMEZONE.getPreferredName(), dynamicNameTimeZone);
