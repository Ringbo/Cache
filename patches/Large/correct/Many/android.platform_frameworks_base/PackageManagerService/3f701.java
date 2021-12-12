diff --git a/services/core/java/com/android/server/pm/PackageManagerService.java b/services/core/java/com/android/server/pm/PackageManagerService.java
index 846efc0..0d51b6d 100644
--- a/services/core/java/com/android/server/pm/PackageManagerService.java
+++ b/services/core/java/com/android/server/pm/PackageManagerService.java
@@ -4512,7 +4512,7 @@
 
     @Override
     public boolean performDexOptIfNeeded(String packageName, String instructionSet) {
-        return performDexOpt(packageName, instructionSet, true);
+        return performDexOpt(packageName, instructionSet, false);
     }
 
     private static String getPrimaryInstructionSet(ApplicationInfo info) {
