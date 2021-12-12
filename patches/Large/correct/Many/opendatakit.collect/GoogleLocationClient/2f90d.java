diff --git a/collect_app/src/main/java/org/odk/collect/android/location/client/GoogleLocationClient.java b/collect_app/src/main/java/org/odk/collect/android/location/client/GoogleLocationClient.java
index 93c0e48..92221f0 100644
--- a/collect_app/src/main/java/org/odk/collect/android/location/client/GoogleLocationClient.java
+++ b/collect_app/src/main/java/org/odk/collect/android/location/client/GoogleLocationClient.java
@@ -180,7 +180,7 @@
         locationRequest.setPriority(getPriority().getValue());
 
         locationRequest.setInterval(updateInterval);
-        locationRequest.setInterval(fastestUpdateInterval);
+        locationRequest.setFastestInterval(fastestUpdateInterval);
 
         return locationRequest;
     }
