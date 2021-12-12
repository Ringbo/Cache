diff --git a/services/core/java/com/android/server/MountService.java b/services/core/java/com/android/server/MountService.java
index 6c3a4b4..50f2ae9 100644
--- a/services/core/java/com/android/server/MountService.java
+++ b/services/core/java/com/android/server/MountService.java
@@ -775,7 +775,7 @@
                  */
                 try {
                     final String[] vols = NativeDaemonEvent.filterMessageList(
-                            mConnector.executeForList("volume", "list"),
+                            mConnector.executeForList("volume", "list", "broadcast"),
                             VoldResponseCode.VolumeListResult);
                     for (String volstr : vols) {
                         String[] tok = volstr.split(" ");
