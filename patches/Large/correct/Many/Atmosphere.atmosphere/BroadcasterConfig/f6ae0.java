diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/BroadcasterConfig.java b/modules/cpr/src/main/java/org/atmosphere/cpr/BroadcasterConfig.java
index ac889f5..5db0309 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/BroadcasterConfig.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/BroadcasterConfig.java
@@ -525,10 +525,10 @@
      * @return BroadcastAction that tell Atmosphere to invoke the next filter or not.
      */
     protected BroadcastAction filter(AtmosphereResource r, Object message, Object originalMessage) {
-        BroadcastAction transformed = new BroadcastAction(originalMessage);
+        BroadcastAction transformed = new BroadcastAction(message);
         for (PerRequestBroadcastFilter mf : perRequestFilters) {
             synchronized (mf) {
-                transformed = mf.filter(r, message, transformed.message());
+                transformed = mf.filter(r, originalMessage, transformed.message());
                 if (transformed == null || transformed.action() == BroadcastAction.ACTION.ABORT) {
                     return transformed;
                 }
