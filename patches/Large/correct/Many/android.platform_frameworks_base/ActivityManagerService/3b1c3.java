diff --git a/services/core/java/com/android/server/am/ActivityManagerService.java b/services/core/java/com/android/server/am/ActivityManagerService.java
index b6cd477..55a2659 100644
--- a/services/core/java/com/android/server/am/ActivityManagerService.java
+++ b/services/core/java/com/android/server/am/ActivityManagerService.java
@@ -10906,7 +10906,7 @@
         synchronized (this) {
             buildAssistBundleLocked(pae, pae.result);
             mPendingAssistExtras.remove(pae);
-            mHandler.removeCallbacks(pae);
+            mUiHandler.removeCallbacks(pae);
         }
         return pae.extras;
     }
@@ -10994,7 +10994,7 @@
                 activity.app.thread.requestAssistContextExtras(activity.appToken, pae,
                         requestType);
                 mPendingAssistExtras.add(pae);
-                mHandler.postDelayed(pae, timeout);
+                mUiHandler.postDelayed(pae, timeout);
             } catch (RemoteException e) {
                 Slog.w(TAG, "getAssistContextExtras failed: crash calling " + activity);
                 return null;
@@ -11051,7 +11051,7 @@
         synchronized (this) {
             buildAssistBundleLocked(pae, extras);
             boolean exists = mPendingAssistExtras.remove(pae);
-            mHandler.removeCallbacks(pae);
+            mUiHandler.removeCallbacks(pae);
             if (!exists) {
                 // Timed out.
                 return;
