diff --git a/services/java/com/android/server/pm/PackageManagerService.java b/services/java/com/android/server/pm/PackageManagerService.java
index 800814d..cb437ed 100755
--- a/services/java/com/android/server/pm/PackageManagerService.java
+++ b/services/java/com/android/server/pm/PackageManagerService.java
@@ -5246,7 +5246,7 @@
         if (FileUtils.contains(Environment.getRootDirectory(), codePath)) {
             codeRoot = Environment.getRootDirectory();
         } else if (FileUtils.contains(Environment.getOemDirectory(), codePath)) {
-            codeRoot = Environment.getRootDirectory();
+            codeRoot = Environment.getOemDirectory();
         } else if (FileUtils.contains(Environment.getVendorDirectory(), codePath)) {
             codeRoot = Environment.getVendorDirectory();
         } else {
