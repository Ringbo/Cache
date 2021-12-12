diff --git a/services/core/java/com/android/server/pm/PackageManagerService.java b/services/core/java/com/android/server/pm/PackageManagerService.java
index 1dc53d3..7efd242 100755
--- a/services/core/java/com/android/server/pm/PackageManagerService.java
+++ b/services/core/java/com/android/server/pm/PackageManagerService.java
@@ -5286,7 +5286,7 @@
         if (FileUtils.contains(Environment.getRootDirectory(), codePath)) {
             codeRoot = Environment.getRootDirectory();
         } else if (FileUtils.contains(Environment.getOemDirectory(), codePath)) {
-            codeRoot = Environment.getRootDirectory();
+            codeRoot = Environment.getOemDirectory();
         } else if (FileUtils.contains(Environment.getVendorDirectory(), codePath)) {
             codeRoot = Environment.getVendorDirectory();
         } else {
