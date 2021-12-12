diff --git a/services/core/java/com/android/server/pm/PackageManagerService.java b/services/core/java/com/android/server/pm/PackageManagerService.java
index a24bd52..5188fbe 100644
--- a/services/core/java/com/android/server/pm/PackageManagerService.java
+++ b/services/core/java/com/android/server/pm/PackageManagerService.java
@@ -8006,7 +8006,7 @@
 
         // Persist the runtime permissions state for users with changes.
         for (int userId : changedRuntimePermissionUserIds) {
-            mSettings.writeRuntimePermissionsForUserLPr(userId, true);
+            mSettings.writeRuntimePermissionsForUserLPr(userId, false);
         }
     }
 
