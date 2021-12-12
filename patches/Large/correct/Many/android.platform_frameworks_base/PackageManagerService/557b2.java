diff --git a/services/core/java/com/android/server/pm/PackageManagerService.java b/services/core/java/com/android/server/pm/PackageManagerService.java
index ad301ef..1accfba 100644
--- a/services/core/java/com/android/server/pm/PackageManagerService.java
+++ b/services/core/java/com/android/server/pm/PackageManagerService.java
@@ -6304,7 +6304,7 @@
                 Slog.e(TAG, "Package: " + pkg + " has multiple bundled libs, but is not multiarch.");
             }
 
-            if (VMRuntime.is64BitAbi(getPreferredInstructionSet())) {
+            if (VMRuntime.is64BitInstructionSet(getPreferredInstructionSet())) {
                 pkg.applicationInfo.primaryCpuAbi = Build.SUPPORTED_64_BIT_ABIS[0];
                 pkg.applicationInfo.secondaryCpuAbi = Build.SUPPORTED_32_BIT_ABIS[0];
             } else {
