diff --git a/plugin/watcher/src/main/java/org/elasticsearch/xpack/watcher/actions/index/IndexAction.java b/plugin/watcher/src/main/java/org/elasticsearch/xpack/watcher/actions/index/IndexAction.java
index 28dea80..ca36487 100644
--- a/plugin/watcher/src/main/java/org/elasticsearch/xpack/watcher/actions/index/IndexAction.java
+++ b/plugin/watcher/src/main/java/org/elasticsearch/xpack/watcher/actions/index/IndexAction.java
@@ -110,7 +110,7 @@
             builder.field(Field.EXECUTION_TIME_FIELD.getPreferredName(), executionTimeField);
         }
         if (timeout != null) {
-            builder.timeValueField(Field.TIMEOUT.getPreferredName(), Field.TIMEOUT_HUMAN.getPreferredName(), timeout);
+            builder.humanReadableField(Field.TIMEOUT.getPreferredName(), Field.TIMEOUT_HUMAN.getPreferredName(), timeout);
         }
         if (dynamicNameTimeZone != null) {
             builder.field(Field.DYNAMIC_NAME_TIMEZONE.getPreferredName(), dynamicNameTimeZone);
