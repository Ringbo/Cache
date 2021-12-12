diff --git a/src/org/traccar/database/GeofenceManager.java b/src/org/traccar/database/GeofenceManager.java
index 3f4d4c5..cc9f828 100644
--- a/src/org/traccar/database/GeofenceManager.java
+++ b/src/org/traccar/database/GeofenceManager.java
@@ -150,7 +150,7 @@
                             deviceGeofenceIds.clear();
                         }
                         Position lastPosition = Context.getConnectionManager().getLastPosition(device.getId());
-                        if (lastPosition != null) {
+                        if (lastPosition != null && deviceGeofencesWithGroups.containsKey(device.getId())) {
                             for (Long geofenceId : deviceGeofencesWithGroups.get(device.getId())) {
                                 if (getGeofence(geofenceId).getGeometry()
                                         .containsPoint(lastPosition.getLatitude(), lastPosition.getLongitude())) {
