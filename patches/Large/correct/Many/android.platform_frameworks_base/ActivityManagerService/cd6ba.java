diff --git a/services/core/java/com/android/server/am/ActivityManagerService.java b/services/core/java/com/android/server/am/ActivityManagerService.java
index 113c9b6..1b0e6a2 100644
--- a/services/core/java/com/android/server/am/ActivityManagerService.java
+++ b/services/core/java/com/android/server/am/ActivityManagerService.java
@@ -10730,7 +10730,7 @@
         synchronized (this) {
             buildAssistBundleLocked(pae, pae.result);
             mPendingAssistExtras.remove(pae);
-            mHandler.removeCallbacks(pae);
+            mUiHandler.removeCallbacks(pae);
         }
         return pae.extras;
     }
@@ -10818,7 +10818,7 @@
                 activity.app.thread.requestAssistContextExtras(activity.appToken, pae,
                         requestType);
                 mPendingAssistExtras.add(pae);
-                mHandler.postDelayed(pae, timeout);
+                mUiHandler.postDelayed(pae, timeout);
             } catch (RemoteException e) {
                 Slog.w(TAG, "getAssistContextExtras failed: crash calling " + activity);
                 return null;
@@ -10875,7 +10875,7 @@
         synchronized (this) {
             buildAssistBundleLocked(pae, extras);
             boolean exists = mPendingAssistExtras.remove(pae);
-            mHandler.removeCallbacks(pae);
+            mUiHandler.removeCallbacks(pae);
             if (!exists) {
                 // Timed out.
                 return;
