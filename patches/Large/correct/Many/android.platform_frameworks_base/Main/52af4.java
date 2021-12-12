diff --git a/tools/layoutlib/bridge/tests/src/com/android/layoutlib/bridge/intensive/Main.java b/tools/layoutlib/bridge/tests/src/com/android/layoutlib/bridge/intensive/Main.java
index a2588a6..58d1d60 100644
--- a/tools/layoutlib/bridge/tests/src/com/android/layoutlib/bridge/intensive/Main.java
+++ b/tools/layoutlib/bridge/tests/src/com/android/layoutlib/bridge/intensive/Main.java
@@ -161,7 +161,7 @@
         if (!out.isDirectory()) {
             return null;
         }
-        File sdkDir = new File(out, "sdk" + File.separator + "sdk");
+        File sdkDir = new File(out, "sdk");
         if (!sdkDir.isDirectory()) {
             // The directory we thought that should contain the sdk is not a directory.
             return null;
@@ -283,14 +283,14 @@
     }
 
     /**
-     * Uses Theme.Material and Target sdk version as 21.
+     * Uses AppTheme and Target sdk version as 19.
      */
     private SessionParams getSessionParams(LayoutPullParser layoutParser,
             ConfigGenerator configGenerator, LayoutLibTestCallback layoutLibCallback) {
         FolderConfiguration config = configGenerator.getFolderConfig();
         ResourceResolver resourceResolver =
                 ResourceResolver.create(mProjectResources.getConfiguredResources(config),
-                        mFrameworkRepo.getConfiguredResources(config), "Theme.Material", false);
+                        mFrameworkRepo.getConfiguredResources(config), "AppTheme", true);
 
         return new SessionParams(
                 layoutParser,
@@ -300,7 +300,7 @@
                 resourceResolver,
                 layoutLibCallback,
                 0,
-                21, // TODO: Make it more configurable to run tests for various versions.
+                19, // TODO: Make it more configurable to run tests for various versions.
                 getLayoutLog());
     }
 
