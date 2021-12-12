diff --git a/src/com/owncloud/android/files/services/ConnectivityActionReceiver.java b/src/com/owncloud/android/files/services/ConnectivityActionReceiver.java
index b9be0f3..23ac7a5 100755
--- a/src/com/owncloud/android/files/services/ConnectivityActionReceiver.java
+++ b/src/com/owncloud/android/files/services/ConnectivityActionReceiver.java
@@ -61,7 +61,7 @@
             ConnectivityManager cm =
                     (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
             NetworkInfo networkInfo = cm.getActiveNetworkInfo();
-            if(networkInfo.getType() == ConnectivityManager.TYPE_WIFI &&
+            if(networkInfo == null || networkInfo.getType() == ConnectivityManager.TYPE_WIFI &&
                 ! networkInfo.isConnected()) {
                 Log.d(TAG, "Wifi is disconnected: " + String.valueOf(networkInfo));
                 wifiDisconnected(context);
