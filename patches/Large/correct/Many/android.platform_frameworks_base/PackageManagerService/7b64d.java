diff --git a/services/core/java/com/android/server/pm/PackageManagerService.java b/services/core/java/com/android/server/pm/PackageManagerService.java
index 782325a..5ddd2f1 100644
--- a/services/core/java/com/android/server/pm/PackageManagerService.java
+++ b/services/core/java/com/android/server/pm/PackageManagerService.java
@@ -18531,7 +18531,7 @@
                         pkg.staticSharedLibVersion);
                 if (libEntry != null) {
                     for (int currUserId : allUsers) {
-                        if (userId != UserHandle.USER_ALL && userId != currUserId) {
+                        if (removeUser != UserHandle.USER_ALL && removeUser != currUserId) {
                             continue;
                         }
                         List<VersionedPackage> libClientPackages = getPackagesUsingSharedLibraryLPr(
