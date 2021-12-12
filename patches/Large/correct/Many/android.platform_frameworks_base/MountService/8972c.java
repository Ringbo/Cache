diff --git a/services/core/java/com/android/server/MountService.java b/services/core/java/com/android/server/MountService.java
index 8c8be4e..14f8a00 100644
--- a/services/core/java/com/android/server/MountService.java
+++ b/services/core/java/com/android/server/MountService.java
@@ -1434,7 +1434,7 @@
 
         final VolumeInfo vol = findVolumeById(volId);
         try {
-            mConnector.execute("volume", "format", vol.id);
+            mConnector.execute("volume", "format", vol.id, "auto");
         } catch (NativeDaemonConnectorException e) {
             throw e.rethrowAsParcelableException();
         }
