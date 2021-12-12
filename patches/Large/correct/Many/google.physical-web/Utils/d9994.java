diff --git a/android/PhysicalWeb/app/src/main/java/org/physical_web/physicalweb/Utils.java b/android/PhysicalWeb/app/src/main/java/org/physical_web/physicalweb/Utils.java
index 46c7b98..76bfd66 100644
--- a/android/PhysicalWeb/app/src/main/java/org/physical_web/physicalweb/Utils.java
+++ b/android/PhysicalWeb/app/src/main/java/org/physical_web/physicalweb/Utils.java
@@ -392,7 +392,7 @@
         // Get the service
         UrlDeviceDiscoveryService.LocalBinder localBinder =
             (UrlDeviceDiscoveryService.LocalBinder) service;
-        localBinder.getServiceInstance().clearCache();
+        localBinder.getServiceInstance().restartScan();
         mContext.unbindService(this);
       }
 
