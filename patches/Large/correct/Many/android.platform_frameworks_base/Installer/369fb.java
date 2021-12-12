diff --git a/services/core/java/com/android/server/pm/Installer.java b/services/core/java/com/android/server/pm/Installer.java
index 653bb95..747c409 100644
--- a/services/core/java/com/android/server/pm/Installer.java
+++ b/services/core/java/com/android/server/pm/Installer.java
@@ -503,7 +503,7 @@
             throws InstallerException {
         if (!checkBeforeRemote()) return false;
         try {
-            return mInstalld.snapshotProfile(appId, packageName, codePath);
+            return mInstalld.createProfileSnapshot(appId, packageName, codePath);
         } catch (Exception e) {
             throw InstallerException.from(e);
         }
