diff --git a/services/java/com/android/server/am/ActivityManagerService.java b/services/java/com/android/server/am/ActivityManagerService.java
index 267c76a..50fffd0 100644
--- a/services/java/com/android/server/am/ActivityManagerService.java
+++ b/services/java/com/android/server/am/ActivityManagerService.java
@@ -6996,7 +6996,8 @@
 
         addErrorToDropBox("wtf", r, null, null, tag, null, null, crashInfo);
 
-        if (Settings.Secure.getInt(mContext.getContentResolver(),
+        if (r != null && r.pid != Process.myPid() &&
+                Settings.Secure.getInt(mContext.getContentResolver(),
                 Settings.Secure.WTF_IS_FATAL, 0) != 0) {
             crashApplication(r, crashInfo);
             return true;
