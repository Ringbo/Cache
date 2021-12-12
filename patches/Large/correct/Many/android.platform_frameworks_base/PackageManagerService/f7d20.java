diff --git a/services/core/java/com/android/server/pm/PackageManagerService.java b/services/core/java/com/android/server/pm/PackageManagerService.java
index 8f6d88b..3f56d30 100644
--- a/services/core/java/com/android/server/pm/PackageManagerService.java
+++ b/services/core/java/com/android/server/pm/PackageManagerService.java
@@ -2900,7 +2900,7 @@
                 final List<String> changedAbiCodePath =
                         adjustCpuAbisForSharedUserLPw(setting.packages, null /*scannedPackage*/);
                 if (changedAbiCodePath != null && changedAbiCodePath.size() > 0) {
-                    for (int i = changedAbiCodePath.size() - 1; i <= 0; --i) {
+                    for (int i = changedAbiCodePath.size() - 1; i >= 0; --i) {
                         final String codePathString = changedAbiCodePath.get(i);
                         try {
                             mInstaller.rmdex(codePathString,
