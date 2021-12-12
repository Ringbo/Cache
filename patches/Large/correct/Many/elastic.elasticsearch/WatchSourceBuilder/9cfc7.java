diff --git a/plugin/core/src/main/java/org/elasticsearch/xpack/core/watcher/client/WatchSourceBuilder.java b/plugin/core/src/main/java/org/elasticsearch/xpack/core/watcher/client/WatchSourceBuilder.java
index 6c6f3ec..b82e9b6 100644
--- a/plugin/core/src/main/java/org/elasticsearch/xpack/core/watcher/client/WatchSourceBuilder.java
+++ b/plugin/core/src/main/java/org/elasticsearch/xpack/core/watcher/client/WatchSourceBuilder.java
@@ -152,7 +152,7 @@
         }
 
         if (defaultThrottlePeriod != null) {
-            builder.timeValueField(WatchField.THROTTLE_PERIOD.getPreferredName(),
+            builder.humanReadableField(WatchField.THROTTLE_PERIOD.getPreferredName(),
                     WatchField.THROTTLE_PERIOD_HUMAN.getPreferredName(), defaultThrottlePeriod);
         }
 
@@ -204,7 +204,7 @@
         public XContentBuilder toXContent(XContentBuilder builder, Params params) throws IOException {
             builder.startObject();
             if (throttlePeriod != null) {
-                builder.timeValueField(ThrottlerField.THROTTLE_PERIOD.getPreferredName(),
+                builder.humanReadableField(ThrottlerField.THROTTLE_PERIOD.getPreferredName(),
                         ThrottlerField.THROTTLE_PERIOD_HUMAN.getPreferredName(), throttlePeriod);
             }
             if (condition != null) {
