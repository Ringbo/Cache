diff --git a/services/core/java/com/android/server/pm/PackageManagerService.java b/services/core/java/com/android/server/pm/PackageManagerService.java
index b617bdb..1ff8bd8 100644
--- a/services/core/java/com/android/server/pm/PackageManagerService.java
+++ b/services/core/java/com/android/server/pm/PackageManagerService.java
@@ -8430,7 +8430,7 @@
             }
         } else {
             // Modify state for the given package setting
-            commitPackageSettings(pkg, pkgSetting, user, policyFlags,
+            commitPackageSettings(pkg, pkgSetting, user, scanFlags,
                     (policyFlags & PackageParser.PARSE_CHATTY) != 0 /*chatty*/);
         }
         return pkg;
