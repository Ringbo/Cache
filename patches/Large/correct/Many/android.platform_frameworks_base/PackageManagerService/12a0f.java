diff --git a/services/core/java/com/android/server/pm/PackageManagerService.java b/services/core/java/com/android/server/pm/PackageManagerService.java
index ca77335..f09d06e 100644
--- a/services/core/java/com/android/server/pm/PackageManagerService.java
+++ b/services/core/java/com/android/server/pm/PackageManagerService.java
@@ -18088,8 +18088,10 @@
         }
 
         synchronized (mPackages) {
-            if (uid == Process.SHELL_UID) {
+            if (uid == Process.SHELL_UID
+                    && (pkgSetting.pkgFlags & ApplicationInfo.FLAG_TEST_ONLY) == 0) {
                 // Shell can only change whole packages between ENABLED and DISABLED_USER states
+                // unless it is a test package.
                 int oldState = pkgSetting.getEnabled(userId);
                 if (className == null
                     &&
