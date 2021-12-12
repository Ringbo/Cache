diff --git a/services/core/java/com/android/server/pm/PackageManagerService.java b/services/core/java/com/android/server/pm/PackageManagerService.java
index 99b74a9..1800db3 100644
--- a/services/core/java/com/android/server/pm/PackageManagerService.java
+++ b/services/core/java/com/android/server/pm/PackageManagerService.java
@@ -2264,7 +2264,7 @@
                             int dexoptNeeded = DexFile.getDexOptNeeded(
                                     lib, dexCodeInstructionSet,
                                     getCompilerFilterForReason(REASON_SHARED_APK),
-                                    false /* newProfile */);
+                                    false /* newProfile */, false /* downgrade */);
                             if (dexoptNeeded != DexFile.NO_DEXOPT_NEEDED) {
                                 mInstaller.dexopt(lib, Process.SYSTEM_UID, "*",
                                         dexCodeInstructionSet, dexoptNeeded, null,
