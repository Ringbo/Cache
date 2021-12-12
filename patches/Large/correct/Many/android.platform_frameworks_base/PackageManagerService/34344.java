diff --git a/services/core/java/com/android/server/pm/PackageManagerService.java b/services/core/java/com/android/server/pm/PackageManagerService.java
index 05cb1db..f1c5123 100644
--- a/services/core/java/com/android/server/pm/PackageManagerService.java
+++ b/services/core/java/com/android/server/pm/PackageManagerService.java
@@ -6978,7 +6978,7 @@
 
         NativeLibraryHelper.Handle handle = null;
         try {
-            handle = NativeLibraryHelper.Handle.create(scanFile);
+            handle = NativeLibraryHelper.Handle.create(pkg);
             // TODO(multiArch): This can be null for apps that didn't go through the
             // usual installation process. We can calculate it again, like we
             // do during install time.
