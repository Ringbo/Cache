diff --git a/services/core/java/com/android/server/MountService.java b/services/core/java/com/android/server/MountService.java
index 0023e4b..dc48cea 100644
--- a/services/core/java/com/android/server/MountService.java
+++ b/services/core/java/com/android/server/MountService.java
@@ -922,7 +922,7 @@
 
         // Record user as started so newly mounted volumes kick off events
         // correctly, then synthesize events for any already-mounted volumes.
-        synchronized (mVolumes) {
+        synchronized (mLock) {
             for (int i = 0; i < mVolumes.size(); i++) {
                 final VolumeInfo vol = mVolumes.valueAt(i);
                 if (vol.isVisibleForRead(userId) && vol.isMountedReadable()) {
@@ -945,7 +945,7 @@
         } catch (NativeDaemonConnectorException ignored) {
         }
 
-        synchronized (mVolumes) {
+        synchronized (mLock) {
             mSystemUnlockedUsers = ArrayUtils.removeInt(mSystemUnlockedUsers, userId);
         }
     }
