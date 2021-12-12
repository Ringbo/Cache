diff --git a/src/org/traccar/BasePipelineFactory.java b/src/org/traccar/BasePipelineFactory.java
index 3b52287..c0952db 100644
--- a/src/org/traccar/BasePipelineFactory.java
+++ b/src/org/traccar/BasePipelineFactory.java
@@ -40,11 +40,11 @@
     private DistanceHandler distanceHandler;
     private ReverseGeocoderHandler reverseGeocoderHandler;
 
-    private static class OpenChannelHandler extends SimpleChannelHandler {
+    private static final class OpenChannelHandler extends SimpleChannelHandler {
 
         private final TrackerServer server;
 
-        public OpenChannelHandler(TrackerServer server) {
+        private OpenChannelHandler(TrackerServer server) {
             this.server = server;
         }
 
