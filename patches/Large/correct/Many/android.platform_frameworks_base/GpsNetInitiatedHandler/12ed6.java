diff --git a/location/java/com/android/internal/location/GpsNetInitiatedHandler.java b/location/java/com/android/internal/location/GpsNetInitiatedHandler.java
index f0a2072..e9e475c 100644
--- a/location/java/com/android/internal/location/GpsNetInitiatedHandler.java
+++ b/location/java/com/android/internal/location/GpsNetInitiatedHandler.java
@@ -289,7 +289,7 @@
                         + " mPopupImmediately: " + mPopupImmediately
                         + " mInEmergency: " + getInEmergency());
 
-        if (getLocationEnabled() && !getInEmergency()) {
+        if (!getLocationEnabled() && !getInEmergency()) {
             // Location is currently disabled, ignore all NI requests.
             try {
                 mNetInitiatedListener.sendNiResponse(notif.notificationId,
