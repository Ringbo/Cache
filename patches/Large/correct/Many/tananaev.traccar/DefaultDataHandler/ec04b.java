diff --git a/src/org/traccar/DefaultDataHandler.java b/src/org/traccar/DefaultDataHandler.java
index cb35bac..5949613 100644
--- a/src/org/traccar/DefaultDataHandler.java
+++ b/src/org/traccar/DefaultDataHandler.java
@@ -26,7 +26,7 @@
         try {
             Context.getDataManager().addPosition(position);
             Position lastPosition = Context.getConnectionManager().getLastPosition(position.getDeviceId());
-            if (position.getFixTime().compareTo(lastPosition.getFixTime()) > 0) {
+            if (lastPosition == null || position.getFixTime().compareTo(lastPosition.getFixTime()) > 0) {
                 Context.getDataManager().updateLatestPosition(position);
             }
         } catch (Exception error) {
