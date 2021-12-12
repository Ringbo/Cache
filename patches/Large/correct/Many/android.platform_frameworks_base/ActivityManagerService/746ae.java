diff --git a/services/core/java/com/android/server/am/ActivityManagerService.java b/services/core/java/com/android/server/am/ActivityManagerService.java
index 299935b..6ec94e4 100644
--- a/services/core/java/com/android/server/am/ActivityManagerService.java
+++ b/services/core/java/com/android/server/am/ActivityManagerService.java
@@ -10732,7 +10732,7 @@
         synchronized (this) {
             buildAssistBundleLocked(pae, pae.result);
             mPendingAssistExtras.remove(pae);
-            mHandler.removeCallbacks(pae);
+            mUiHandler.removeCallbacks(pae);
         }
         return pae.extras;
     }
@@ -10820,7 +10820,7 @@
                 activity.app.thread.requestAssistContextExtras(activity.appToken, pae,
                         requestType);
                 mPendingAssistExtras.add(pae);
-                mHandler.postDelayed(pae, timeout);
+                mUiHandler.postDelayed(pae, timeout);
             } catch (RemoteException e) {
                 Slog.w(TAG, "getAssistContextExtras failed: crash calling " + activity);
                 return null;
@@ -10877,7 +10877,7 @@
         synchronized (this) {
             buildAssistBundleLocked(pae, extras);
             boolean exists = mPendingAssistExtras.remove(pae);
-            mHandler.removeCallbacks(pae);
+            mUiHandler.removeCallbacks(pae);
             if (!exists) {
                 // Timed out.
                 return;
