diff --git a/services/core/java/com/android/server/location/GnssLocationProvider.java b/services/core/java/com/android/server/location/GnssLocationProvider.java
index 6b916be..2fc14ec 100644
--- a/services/core/java/com/android/server/location/GnssLocationProvider.java
+++ b/services/core/java/com/android/server/location/GnssLocationProvider.java
@@ -1192,7 +1192,7 @@
         }
 
         if (DEBUG) Log.d(TAG, "setRequest " + mProviderRequest);
-        if (mProviderRequest.reportLocation && !mDisableGps) {
+        if (mProviderRequest.reportLocation && !mDisableGps && isEnabled()) {
             // update client uids
             updateClientUids(mWorkSource);
 
