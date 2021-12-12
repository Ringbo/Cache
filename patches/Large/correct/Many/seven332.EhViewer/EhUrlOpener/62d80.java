diff --git a/app/src/main/java/com/hippo/ehviewer/client/EhUrlOpener.java b/app/src/main/java/com/hippo/ehviewer/client/EhUrlOpener.java
index 07d459c..25ce4d7 100644
--- a/app/src/main/java/com/hippo/ehviewer/client/EhUrlOpener.java
+++ b/app/src/main/java/com/hippo/ehviewer/client/EhUrlOpener.java
@@ -63,7 +63,7 @@
             args.putString(ProgressScene.KEY_ACTION, ProgressScene.ACTION_GALLERY_TOKEN);
             args.putLong(ProgressScene.KEY_GID, result2.gid);
             args.putString(ProgressScene.KEY_PTOKEN, result2.pToken);
-            args.putLong(ProgressScene.KEY_PAGE, result2.page);
+            args.putInt(ProgressScene.KEY_PAGE, result2.page);
             return new Announcer(ProgressScene.class).setArgs(args);
         }
 
