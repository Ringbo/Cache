diff --git a/packages/CaptivePortalLogin/src/com/android/captiveportallogin/CaptivePortalLoginActivity.java b/packages/CaptivePortalLogin/src/com/android/captiveportallogin/CaptivePortalLoginActivity.java
index 6fb8b51..b58c87a 100644
--- a/packages/CaptivePortalLogin/src/com/android/captiveportallogin/CaptivePortalLoginActivity.java
+++ b/packages/CaptivePortalLogin/src/com/android/captiveportallogin/CaptivePortalLoginActivity.java
@@ -96,7 +96,7 @@
         // Exit app if Network disappears.
         final NetworkCapabilities networkCapabilities = mCm.getNetworkCapabilities(mNetwork);
         if (networkCapabilities == null) {
-            finish();
+            finishAndRemoveTask();
             return;
         }
         mNetworkCallback = new NetworkCallback() {
@@ -163,7 +163,7 @@
                 mCaptivePortal.useNetwork();
                 break;
         }
-        finish();
+        finishAndRemoveTask();
     }
 
     @Override
