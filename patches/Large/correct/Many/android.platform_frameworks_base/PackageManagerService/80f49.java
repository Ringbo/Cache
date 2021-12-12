diff --git a/services/java/com/android/server/PackageManagerService.java b/services/java/com/android/server/PackageManagerService.java
index fc6f100..5b48ab5 100644
--- a/services/java/com/android/server/PackageManagerService.java
+++ b/services/java/com/android/server/PackageManagerService.java
@@ -1921,7 +1921,7 @@
     
     private int performDexOptLI(PackageParser.Package pkg, boolean forceDex) {
         boolean performed = false;
-        if ((pkg.applicationInfo.flags&ApplicationInfo.FLAG_HAS_CODE) != 0) {
+        if ((pkg.applicationInfo.flags&ApplicationInfo.FLAG_HAS_CODE) != 0 && mInstaller != null) {
             String path = pkg.mScanPath;
             int ret = 0;
             try {
