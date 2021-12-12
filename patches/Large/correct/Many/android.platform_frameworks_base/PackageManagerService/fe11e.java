diff --git a/services/java/com/android/server/PackageManagerService.java b/services/java/com/android/server/PackageManagerService.java
index b42cedc..06435c8 100644
--- a/services/java/com/android/server/PackageManagerService.java
+++ b/services/java/com/android/server/PackageManagerService.java
@@ -1918,7 +1918,7 @@
     
     private int performDexOptLI(PackageParser.Package pkg, boolean forceDex) {
         boolean performed = false;
-        if ((pkg.applicationInfo.flags&ApplicationInfo.FLAG_HAS_CODE) != 0) {
+        if ((pkg.applicationInfo.flags&ApplicationInfo.FLAG_HAS_CODE) != 0 && mInstaller != null) {
             String path = pkg.mScanPath;
             int ret = 0;
             try {
