diff --git a/plugin/core/src/main/java/org/elasticsearch/xpack/core/watcher/actions/ActionWrapper.java b/plugin/core/src/main/java/org/elasticsearch/xpack/core/watcher/actions/ActionWrapper.java
index 0d78806..47d3500 100644
--- a/plugin/core/src/main/java/org/elasticsearch/xpack/core/watcher/actions/ActionWrapper.java
+++ b/plugin/core/src/main/java/org/elasticsearch/xpack/core/watcher/actions/ActionWrapper.java
@@ -173,7 +173,7 @@
         builder.startObject();
         TimeValue throttlePeriod = throttler.throttlePeriod();
         if (throttlePeriod != null) {
-            builder.timeValueField(ThrottlerField.THROTTLE_PERIOD.getPreferredName(),
+            builder.humanReadableField(ThrottlerField.THROTTLE_PERIOD.getPreferredName(),
                     ThrottlerField.THROTTLE_PERIOD_HUMAN.getPreferredName(), throttlePeriod);
         }
         if (condition != null) {
