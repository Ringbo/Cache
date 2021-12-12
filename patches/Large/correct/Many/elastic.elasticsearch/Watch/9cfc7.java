diff --git a/plugin/core/src/main/java/org/elasticsearch/xpack/core/watcher/watch/Watch.java b/plugin/core/src/main/java/org/elasticsearch/xpack/core/watcher/watch/Watch.java
index 56cbba5..7503475 100644
--- a/plugin/core/src/main/java/org/elasticsearch/xpack/core/watcher/watch/Watch.java
+++ b/plugin/core/src/main/java/org/elasticsearch/xpack/core/watcher/watch/Watch.java
@@ -143,7 +143,7 @@
             builder.field(WatchField.TRANSFORM.getPreferredName()).startObject().field(transform.type(), transform, params).endObject();
         }
         if (throttlePeriod != null) {
-            builder.timeValueField(WatchField.THROTTLE_PERIOD.getPreferredName(),
+            builder.humanReadableField(WatchField.THROTTLE_PERIOD.getPreferredName(),
                     WatchField.THROTTLE_PERIOD_HUMAN.getPreferredName(), throttlePeriod);
         }
         builder.startObject(WatchField.ACTIONS.getPreferredName());
