diff --git a/services/core/java/com/android/server/pm/PackageManagerService.java b/services/core/java/com/android/server/pm/PackageManagerService.java
index f0f249e..a4d4914 100644
--- a/services/core/java/com/android/server/pm/PackageManagerService.java
+++ b/services/core/java/com/android/server/pm/PackageManagerService.java
@@ -4518,7 +4518,7 @@
 
     @Override
     public boolean performDexOptIfNeeded(String packageName, String instructionSet) {
-        return performDexOpt(packageName, instructionSet, true);
+        return performDexOpt(packageName, instructionSet, false);
     }
 
     private static String getPrimaryInstructionSet(ApplicationInfo info) {
