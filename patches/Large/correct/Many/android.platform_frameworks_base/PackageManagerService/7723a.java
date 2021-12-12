diff --git a/services/core/java/com/android/server/pm/PackageManagerService.java b/services/core/java/com/android/server/pm/PackageManagerService.java
index 052f239..e5b0d26 100644
--- a/services/core/java/com/android/server/pm/PackageManagerService.java
+++ b/services/core/java/com/android/server/pm/PackageManagerService.java
@@ -10217,7 +10217,7 @@
         }
 
         if (changedAbiCodePath != null && changedAbiCodePath.size() > 0) {
-            for (int i = changedAbiCodePath.size() - 1; i <= 0; --i) {
+            for (int i = changedAbiCodePath.size() - 1; i >= 0; --i) {
                 final String codePathString = changedAbiCodePath.get(i);
                 try {
                     mInstaller.rmdex(codePathString,
