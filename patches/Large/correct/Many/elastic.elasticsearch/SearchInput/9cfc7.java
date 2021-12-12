diff --git a/plugin/watcher/src/main/java/org/elasticsearch/xpack/watcher/input/search/SearchInput.java b/plugin/watcher/src/main/java/org/elasticsearch/xpack/watcher/input/search/SearchInput.java
index 47ca9ab..e8acf1e 100644
--- a/plugin/watcher/src/main/java/org/elasticsearch/xpack/watcher/input/search/SearchInput.java
+++ b/plugin/watcher/src/main/java/org/elasticsearch/xpack/watcher/input/search/SearchInput.java
@@ -96,7 +96,7 @@
             builder.field(Field.EXTRACT.getPreferredName(), extractKeys);
         }
         if (timeout != null) {
-            builder.timeValueField(Field.TIMEOUT.getPreferredName(), Field.TIMEOUT_HUMAN.getPreferredName(), timeout);
+            builder.humanReadableField(Field.TIMEOUT.getPreferredName(), Field.TIMEOUT_HUMAN.getPreferredName(), timeout);
         }
         if (dynamicNameTimeZone != null) {
             builder.field(Field.DYNAMIC_NAME_TIMEZONE.getPreferredName(), dynamicNameTimeZone);
