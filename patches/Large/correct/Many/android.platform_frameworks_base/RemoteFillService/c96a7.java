diff --git a/services/autofill/java/com/android/server/autofill/RemoteFillService.java b/services/autofill/java/com/android/server/autofill/RemoteFillService.java
index 3e932e8..8366cdd 100644
--- a/services/autofill/java/com/android/server/autofill/RemoteFillService.java
+++ b/services/autofill/java/com/android/server/autofill/RemoteFillService.java
@@ -270,7 +270,7 @@
         }
 
         final boolean willBind = mContext.bindServiceAsUser(mIntent, mServiceConnection, flags,
-                new UserHandle(mUserId));
+            mHandler,new UserHandle(mUserId));
 
         if (!willBind) {
             Slog.w(LOG_TAG, "[user: " + mUserId + "] could not bind to " + mIntent + " using flags "
