diff --git a/server/src/main/java/com/metamx/druid/loading/OmniSegmentLoader.java b/server/src/main/java/com/metamx/druid/loading/OmniSegmentLoader.java
index 38b811c..ffe4192 100644
--- a/server/src/main/java/com/metamx/druid/loading/OmniSegmentLoader.java
+++ b/server/src/main/java/com/metamx/druid/loading/OmniSegmentLoader.java
@@ -211,7 +211,7 @@
 
     private synchronized void addSegment(DataSegment segment)
     {
-      if (! segments.add(segment)) {
+      if (segments.add(segment)) {
         currSize += segment.getSize();
       }
     }
