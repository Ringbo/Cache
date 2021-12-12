diff --git a/app/src/main/java/com/hippo/ehviewer/ui/scene/ProgressScene.java b/app/src/main/java/com/hippo/ehviewer/ui/scene/ProgressScene.java
index 345265b..2a552be 100644
--- a/app/src/main/java/com/hippo/ehviewer/ui/scene/ProgressScene.java
+++ b/app/src/main/java/com/hippo/ehviewer/ui/scene/ProgressScene.java
@@ -103,7 +103,7 @@
 
         mAction = args.getString(KEY_ACTION);
         if (ACTION_GALLERY_TOKEN.equals(mAction)) {
-            mGid = args.getInt(KEY_GID, -1);
+            mGid = args.getLong(KEY_GID, -1);
             mPToken = args.getString(KEY_PTOKEN, null);
             mPage = args.getInt(KEY_PAGE, -1);
             if (mGid == -1 || mPToken == null || mPage == -1) {
