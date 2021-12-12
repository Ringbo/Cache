diff --git a/services/core/java/com/android/server/MountService.java b/services/core/java/com/android/server/MountService.java
index 595b7ea..0410be9 100644
--- a/services/core/java/com/android/server/MountService.java
+++ b/services/core/java/com/android/server/MountService.java
@@ -1435,7 +1435,7 @@
 
         final VolumeInfo vol = findVolumeById(volId);
         try {
-            mConnector.execute("volume", "format", vol.id);
+            mConnector.execute("volume", "format", vol.id, "auto");
         } catch (NativeDaemonConnectorException e) {
             throw e.rethrowAsParcelableException();
         }
