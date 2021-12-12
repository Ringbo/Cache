diff --git a/services/core/java/com/android/server/pm/Installer.java b/services/core/java/com/android/server/pm/Installer.java
index 2af401f..be66fe2 100644
--- a/services/core/java/com/android/server/pm/Installer.java
+++ b/services/core/java/com/android/server/pm/Installer.java
@@ -500,7 +500,7 @@
             throws InstallerException {
         if (!checkBeforeRemote()) return false;
         try {
-            return mInstalld.snapshotProfile(appId, packageName, codePath);
+            return mInstalld.createProfileSnapshot(appId, packageName, codePath);
         } catch (Exception e) {
             throw InstallerException.from(e);
         }
