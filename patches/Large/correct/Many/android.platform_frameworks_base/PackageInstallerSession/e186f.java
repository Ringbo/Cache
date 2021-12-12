diff --git a/services/core/java/com/android/server/pm/PackageInstallerSession.java b/services/core/java/com/android/server/pm/PackageInstallerSession.java
index 17daeed..57deb3f 100644
--- a/services/core/java/com/android/server/pm/PackageInstallerSession.java
+++ b/services/core/java/com/android/server/pm/PackageInstallerSession.java
@@ -959,7 +959,7 @@
         try {
             IApexService apex = IApexService.Stub.asInterface(
                     ServiceManager.getService("apexservice"));
-            apex.installPackage(mResolvedBaseFile.toString());
+            apex.stagePackage(mResolvedBaseFile.toString());
         } catch (Throwable e) {
             // Convert all exceptions into package manager exceptions as only those are handled
             // in the code above
