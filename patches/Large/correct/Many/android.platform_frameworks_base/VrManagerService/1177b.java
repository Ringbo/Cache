diff --git a/services/core/java/com/android/server/vr/VrManagerService.java b/services/core/java/com/android/server/vr/VrManagerService.java
index e8ebbe4..5493207 100644
--- a/services/core/java/com/android/server/vr/VrManagerService.java
+++ b/services/core/java/com/android/server/vr/VrManagerService.java
@@ -756,7 +756,7 @@
 
         mBootsToVr = SystemProperties.getBoolean("ro.boot.vr", false);
         mUseStandbyToExitVrMode = mBootsToVr
-                && SystemProperties.getBoolean("persist.vr.use_standby_to_exit_vr_mode", false);
+                && SystemProperties.getBoolean("persist.vr.use_standby_to_exit_vr_mode", true);
         publishLocalService(VrManagerInternal.class, new LocalService());
         publishBinderService(Context.VR_SERVICE, mVrManager.asBinder());
     }
