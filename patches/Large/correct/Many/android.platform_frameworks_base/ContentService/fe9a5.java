diff --git a/services/core/java/com/android/server/content/ContentService.java b/services/core/java/com/android/server/content/ContentService.java
index 6e31e5d..13054a6 100644
--- a/services/core/java/com/android/server/content/ContentService.java
+++ b/services/core/java/com/android/server/content/ContentService.java
@@ -163,7 +163,7 @@
 
     @Override
     protected synchronized void dump(FileDescriptor fd, PrintWriter pw_, String[] args) {
-        if (!DumpUtils.checkDumpPermission(mContext, TAG, pw_)) return;
+        if (!DumpUtils.checkDumpAndUsageStatsPermission(mContext, TAG, pw_)) return;
         final IndentingPrintWriter pw = new IndentingPrintWriter(pw_, "  ");
 
         // This makes it so that future permission checks will be in the context of this
