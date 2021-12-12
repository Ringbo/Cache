diff --git a/services/core/java/com/android/server/pm/PackageManagerService.java b/services/core/java/com/android/server/pm/PackageManagerService.java
index 547379d..38144e4 100644
--- a/services/core/java/com/android/server/pm/PackageManagerService.java
+++ b/services/core/java/com/android/server/pm/PackageManagerService.java
@@ -7197,7 +7197,7 @@
 
             performDexOpt(pkg.packageName,
                     null /* instructionSet */,
-                    false /* checkProfiles */,
+                    true /* checkProfiles */,
                     causeFirstBoot ? REASON_FIRST_BOOT : REASON_BOOT,
                     false /* force */);
         }
