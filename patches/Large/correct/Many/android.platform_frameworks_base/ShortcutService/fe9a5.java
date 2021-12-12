diff --git a/services/core/java/com/android/server/pm/ShortcutService.java b/services/core/java/com/android/server/pm/ShortcutService.java
index 6ddd3b3..9bf6895 100644
--- a/services/core/java/com/android/server/pm/ShortcutService.java
+++ b/services/core/java/com/android/server/pm/ShortcutService.java
@@ -3448,7 +3448,7 @@
 
     @Override
     public void dump(FileDescriptor fd, PrintWriter pw, String[] args) {
-        if (!DumpUtils.checkDumpPermission(mContext, TAG, pw)) return;
+        if (!DumpUtils.checkDumpAndUsageStatsPermission(mContext, TAG, pw)) return;
         boolean checkin = false;
         boolean clear = false;
         if (args != null) {
