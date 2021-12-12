diff --git a/server/src/main/java/com/metamx/druid/master/ServerHolder.java b/server/src/main/java/com/metamx/druid/master/ServerHolder.java
index 662aca0..6cf4d65 100644
--- a/server/src/main/java/com/metamx/druid/master/ServerHolder.java
+++ b/server/src/main/java/com/metamx/druid/master/ServerHolder.java
@@ -96,7 +96,7 @@
 
   public boolean containsSegment(DataSegment segment)
   {
-    return (server.getSegment(segment.getIdentifier()) != null && peon.getSegmentsToLoad().contains(segment));
+    return (server.getSegment(segment.getIdentifier()) != null || peon.getSegmentsToLoad().contains(segment));
   }
 
   @Override
