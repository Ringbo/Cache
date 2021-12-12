diff --git a/services/java/com/android/server/pm/PackageManagerService.java b/services/java/com/android/server/pm/PackageManagerService.java
index 070c038..bf489b7 100755
--- a/services/java/com/android/server/pm/PackageManagerService.java
+++ b/services/java/com/android/server/pm/PackageManagerService.java
@@ -5253,7 +5253,7 @@
         if (FileUtils.contains(Environment.getRootDirectory(), codePath)) {
             codeRoot = Environment.getRootDirectory();
         } else if (FileUtils.contains(Environment.getOemDirectory(), codePath)) {
-            codeRoot = Environment.getRootDirectory();
+            codeRoot = Environment.getOemDirectory();
         } else if (FileUtils.contains(Environment.getVendorDirectory(), codePath)) {
             codeRoot = Environment.getVendorDirectory();
         } else {
