diff --git a/core/java/com/android/internal/util/DumpUtils.java b/core/java/com/android/internal/util/DumpUtils.java
index 2b51033..e85b782 100644
--- a/core/java/com/android/internal/util/DumpUtils.java
+++ b/core/java/com/android/internal/util/DumpUtils.java
@@ -122,7 +122,7 @@
         final String[] pkgs = context.getPackageManager().getPackagesForUid(uid);
         if (pkgs != null) {
             for (String pkg : pkgs) {
-                switch (appOps.checkOpNoThrow(AppOpsManager.OP_GET_USAGE_STATS, uid, pkg)) {
+                switch (appOps.noteOpNoThrow(AppOpsManager.OP_GET_USAGE_STATS, uid, pkg)) {
                     case AppOpsManager.MODE_ALLOWED:
                         if (DEBUG) Slog.v(TAG, "Found package " + pkg + " with "
                                 + "android:get_usage_stats allowed");
