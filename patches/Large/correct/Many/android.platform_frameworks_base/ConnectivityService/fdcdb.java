diff --git a/services/core/java/com/android/server/ConnectivityService.java b/services/core/java/com/android/server/ConnectivityService.java
index 5997680..82904d0 100644
--- a/services/core/java/com/android/server/ConnectivityService.java
+++ b/services/core/java/com/android/server/ConnectivityService.java
@@ -3247,7 +3247,7 @@
             Settings.Global.putInt(cr, Settings.Global.AIRPLANE_MODE_ON, enable ? 1 : 0);
             Intent intent = new Intent(Intent.ACTION_AIRPLANE_MODE_CHANGED);
             intent.putExtra("state", enable);
-            mContext.sendBroadcast(intent);
+            mContext.sendBroadcastAsUser(intent, UserHandle.ALL);
         } finally {
             Binder.restoreCallingIdentity(ident);
         }
