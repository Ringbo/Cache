diff --git a/src/org/traccar/events/OverspeedEventHandler.java b/src/org/traccar/events/OverspeedEventHandler.java
index aed79a2..4f9a357 100644
--- a/src/org/traccar/events/OverspeedEventHandler.java
+++ b/src/org/traccar/events/OverspeedEventHandler.java
@@ -117,7 +117,7 @@
         double geofenceSpeedLimit = 0;
         long overspeedGeofenceId = 0;
 
-        if (Context.getGeofenceManager() != null) {
+        if (Context.getGeofenceManager() != null && device.getGeofenceIds() != null) {
             for (long geofenceId : device.getGeofenceIds()) {
                 Geofence geofence = Context.getGeofenceManager().getById(geofenceId);
                 if (geofence != null) {
