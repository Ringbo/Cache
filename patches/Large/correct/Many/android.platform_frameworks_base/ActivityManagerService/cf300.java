diff --git a/services/java/com/android/server/am/ActivityManagerService.java b/services/java/com/android/server/am/ActivityManagerService.java
index ddd99f4..d004034 100755
--- a/services/java/com/android/server/am/ActivityManagerService.java
+++ b/services/java/com/android/server/am/ActivityManagerService.java
@@ -6667,7 +6667,8 @@
 
         addErrorToDropBox("wtf", r, null, null, tag, null, null, crashInfo);
 
-        if (Settings.Secure.getInt(mContext.getContentResolver(),
+        if (r != null && r.pid != Process.myPid() &&
+                Settings.Secure.getInt(mContext.getContentResolver(),
                 Settings.Secure.WTF_IS_FATAL, 0) != 0) {
             crashApplication(r, crashInfo);
             return true;
