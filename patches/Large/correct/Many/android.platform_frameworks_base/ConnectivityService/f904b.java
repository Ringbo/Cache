diff --git a/services/java/com/android/server/ConnectivityService.java b/services/java/com/android/server/ConnectivityService.java
index dfb6ff7..45eb672 100644
--- a/services/java/com/android/server/ConnectivityService.java
+++ b/services/java/com/android/server/ConnectivityService.java
@@ -1269,9 +1269,16 @@
                     info = (NetworkInfo) msg.obj;
                     int type = info.getType();
                     NetworkInfo.State state = info.getState();
-                    if (mNetAttributes[type].mLastState == state) {
+                    // only do this optimization for wifi.  It going into scan mode for location
+                    // services generates alot of noise.  Meanwhile the mms apn won't send out
+                    // subsequent notifications when on default cellular because it never
+                    // disconnects..  so only do this to wifi notifications.  Fixed better when the
+                    // APN notifications are standardized.
+                    if (mNetAttributes[type].mLastState == state &&
+                            mNetAttributes[type].mRadio == ConnectivityManager.TYPE_WIFI) {
                         if (DBG) {
-                            // TODO - remove this after we validate the dropping doesn't break anything
+                            // TODO - remove this after we validate the dropping doesn't break
+                            // anything
                             Log.d(TAG, "Dropping ConnectivityChange for " +
                                     info.getTypeName() + ": " +
                                     state + "/" + info.getDetailedState());
