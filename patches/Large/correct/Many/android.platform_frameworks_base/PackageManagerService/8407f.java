diff --git a/services/core/java/com/android/server/pm/PackageManagerService.java b/services/core/java/com/android/server/pm/PackageManagerService.java
index c401efb..2c623b5 100755
--- a/services/core/java/com/android/server/pm/PackageManagerService.java
+++ b/services/core/java/com/android/server/pm/PackageManagerService.java
@@ -5439,7 +5439,7 @@
         if (FileUtils.contains(Environment.getRootDirectory(), codePath)) {
             codeRoot = Environment.getRootDirectory();
         } else if (FileUtils.contains(Environment.getOemDirectory(), codePath)) {
-            codeRoot = Environment.getRootDirectory();
+            codeRoot = Environment.getOemDirectory();
         } else if (FileUtils.contains(Environment.getVendorDirectory(), codePath)) {
             codeRoot = Environment.getVendorDirectory();
         } else {
