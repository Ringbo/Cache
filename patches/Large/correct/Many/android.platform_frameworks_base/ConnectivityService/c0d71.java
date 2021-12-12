diff --git a/services/core/java/com/android/server/ConnectivityService.java b/services/core/java/com/android/server/ConnectivityService.java
index 66f5c4d..b3627ad 100644
--- a/services/core/java/com/android/server/ConnectivityService.java
+++ b/services/core/java/com/android/server/ConnectivityService.java
@@ -883,7 +883,7 @@
 
     private void handleMobileDataAlwaysOn() {
         final boolean enable = (Settings.Global.getInt(
-                mContext.getContentResolver(), Settings.Global.MOBILE_DATA_ALWAYS_ON, 0) == 1);
+                mContext.getContentResolver(), Settings.Global.MOBILE_DATA_ALWAYS_ON, 1) == 1);
         final boolean isEnabled = (mNetworkRequests.get(mDefaultMobileDataRequest) != null);
         if (enable == isEnabled) {
             return;  // Nothing to do.
