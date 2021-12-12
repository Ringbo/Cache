diff --git a/services/core/java/com/android/server/ConnectivityService.java b/services/core/java/com/android/server/ConnectivityService.java
index 6e0c37f..4919bed 100644
--- a/services/core/java/com/android/server/ConnectivityService.java
+++ b/services/core/java/com/android/server/ConnectivityService.java
@@ -1585,7 +1585,7 @@
                 NetworkCapabilities.TRANSPORT_CELLULAR)) {
             timeout = Settings.Global.getInt(mContext.getContentResolver(),
                                              Settings.Global.DATA_ACTIVITY_TIMEOUT_MOBILE,
-                                             5);
+                                             10);
             type = ConnectivityManager.TYPE_MOBILE;
         } else if (networkAgent.networkCapabilities.hasTransport(
                 NetworkCapabilities.TRANSPORT_WIFI)) {
