diff --git a/server/src/main/java/io/druid/segment/realtime/plumber/FlushingPlumber.java b/server/src/main/java/io/druid/segment/realtime/plumber/FlushingPlumber.java
index da27418..e2120b1 100644
--- a/server/src/main/java/io/druid/segment/realtime/plumber/FlushingPlumber.java
+++ b/server/src/main/java/io/druid/segment/realtime/plumber/FlushingPlumber.java
@@ -182,7 +182,7 @@
     log.info("Stopping job");
 
     for (final Map.Entry<Long, Sink> entry : getSinks().entrySet()) {
-      flushAfterDuration(entry.getKey(), entry.getValue());
+      abandonSegment(entry.getKey(), entry.getValue());
     }
     shutdownExecutors();
 
