diff --git a/server/src/main/java/com/metamx/druid/loading/SingleSegmentLoader.java b/server/src/main/java/com/metamx/druid/loading/SingleSegmentLoader.java
index a9fe23d..e7aa60d 100644
--- a/server/src/main/java/com/metamx/druid/loading/SingleSegmentLoader.java
+++ b/server/src/main/java/com/metamx/druid/loading/SingleSegmentLoader.java
@@ -210,7 +210,7 @@
 
     private synchronized void addSegment(DataSegment segment)
     {
-      if (! segments.add(segment)) {
+      if (segments.add(segment)) {
         currSize += segment.getSize();
       }
     }
