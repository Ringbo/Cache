diff --git a/android/src/main/java/com/dieam/reactnativepushnotification/modules/RNPushNotificationHelper.java b/android/src/main/java/com/dieam/reactnativepushnotification/modules/RNPushNotificationHelper.java
index 363bf59..5819e61 100644
--- a/android/src/main/java/com/dieam/reactnativepushnotification/modules/RNPushNotificationHelper.java
+++ b/android/src/main/java/com/dieam/reactnativepushnotification/modules/RNPushNotificationHelper.java
@@ -17,7 +17,7 @@
 import android.util.Log;
 
 public class RNPushNotificationHelper {
-    private static final long DEFAULT_VIBRATION = 1000L;
+    private static final long DEFAULT_VIBRATION = 300L;
     private static final String TAG = RNPushNotificationHelper.class.getSimpleName();
 
     private Context mContext;
@@ -188,7 +188,7 @@
                 notification.setSound(defaultSoundUri);
             }
 
-            if (bundle.containsKey("ongoing")) {
+            if (bundle.containsKey("ongoing") || bundle.getBoolean("ongoing")) {
                 notification.setOngoing(bundle.getBoolean("ongoing"));
             }
 
