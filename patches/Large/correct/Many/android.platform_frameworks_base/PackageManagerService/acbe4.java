diff --git a/services/core/java/com/android/server/pm/PackageManagerService.java b/services/core/java/com/android/server/pm/PackageManagerService.java
index f9bfe72..9b619c7 100644
--- a/services/core/java/com/android/server/pm/PackageManagerService.java
+++ b/services/core/java/com/android/server/pm/PackageManagerService.java
@@ -4991,7 +4991,7 @@
                 scanPackageLI(file, parseFlags | PackageParser.PARSE_MUST_BE_APK,
                         scanFlags, currentTime, null);
             } catch (PackageManagerException e) {
-                Slog.w(TAG, "Failed to parse " + file + ": " + e.getMessage());
+                Slog.w(TAG, "Failed to parse " + file + ": " + e.getMessage(), e);
 
                 // Delete invalid userdata apps
                 if ((parseFlags & PackageParser.PARSE_IS_SYSTEM) == 0 &&
