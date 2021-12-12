diff --git a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-timelineservice/src/main/java/org/apache/hadoop/yarn/server/timelineservice/collector/TimelineCollectorManager.java b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-timelineservice/src/main/java/org/apache/hadoop/yarn/server/timelineservice/collector/TimelineCollectorManager.java
index 7909a2e..d59b2e0 100644
--- a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-timelineservice/src/main/java/org/apache/hadoop/yarn/server/timelineservice/collector/TimelineCollectorManager.java
+++ b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-timelineservice/src/main/java/org/apache/hadoop/yarn/server/timelineservice/collector/TimelineCollectorManager.java
@@ -220,7 +220,7 @@
 
   @Override
   protected void serviceStop() throws Exception {
-    if (collectors != null && collectors.size() > 1) {
+    if (collectors != null && collectors.size() > 0) {
       synchronized (collectors) {
         for (TimelineCollector c : collectors.values()) {
           c.serviceStop();
