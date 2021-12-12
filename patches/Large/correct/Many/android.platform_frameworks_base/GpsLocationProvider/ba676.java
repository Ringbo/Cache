diff --git a/services/java/com/android/server/location/GpsLocationProvider.java b/services/java/com/android/server/location/GpsLocationProvider.java
index 4b4c784..f8c9a61 100755
--- a/services/java/com/android/server/location/GpsLocationProvider.java
+++ b/services/java/com/android/server/location/GpsLocationProvider.java
@@ -892,7 +892,7 @@
                     Settings.Secure.ASSISTED_GPS_ENABLED, 1) != 0) {
                 if (singleShot && hasCapability(GPS_CAPABILITY_MSA)) {
                     mPositionMode = GPS_POSITION_MODE_MS_ASSISTED;
-                } else if (hasCapability(GPS_CAPABILITY_MSA)) {
+                } else if (hasCapability(GPS_CAPABILITY_MSB)) {
                     mPositionMode = GPS_POSITION_MODE_MS_BASED;
                 }
             }
