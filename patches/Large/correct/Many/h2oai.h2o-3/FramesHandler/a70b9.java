diff --git a/h2o-core/src/main/java/water/api/FramesHandler.java b/h2o-core/src/main/java/water/api/FramesHandler.java
index 4a34e04..e002083 100644
--- a/h2o-core/src/main/java/water/api/FramesHandler.java
+++ b/h2o-core/src/main/java/water/api/FramesHandler.java
@@ -190,7 +190,7 @@
 
     Frame frame = getFromDKV("key", s.key.key()); // safe
     s.frames = new FrameV2[1];
-    s.frames[0] = new FrameV2().fillFromImpl(frame);
+    s.frames[0] = new FrameV2(frame, s.offset, s.len).fillFromImpl(frame);  // TODO: Refactor with FrameBase
 
     // Summary data is big, and not always there: null it out here.  You have to call columnSummary
     // to force computation of the summary data.
