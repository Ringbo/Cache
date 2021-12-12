diff --git a/services/java/com/android/server/NetworkManagementService.java b/services/java/com/android/server/NetworkManagementService.java
index 30de385..cb5e968 100644
--- a/services/java/com/android/server/NetworkManagementService.java
+++ b/services/java/com/android/server/NetworkManagementService.java
@@ -188,10 +188,9 @@
 
         // only enable bandwidth control when support exists, and requested by
         // system setting.
-        // TODO: eventually migrate to be always enabled
         final boolean hasKernelSupport = new File("/proc/net/xt_qtaguid/ctrl").exists();
         final boolean shouldEnable =
-                Settings.Secure.getInt(mContext.getContentResolver(), NETSTATS_ENABLED, 0) != 0;
+                Settings.Secure.getInt(mContext.getContentResolver(), NETSTATS_ENABLED, 1) != 0;
 
         mBandwidthControlEnabled = false;
         if (hasKernelSupport && shouldEnable) {
