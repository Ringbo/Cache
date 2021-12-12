diff --git a/apps/actor-android/src/main/java/im/actor/messenger/app/activity/ViewAvatarActivity.java b/apps/actor-android/src/main/java/im/actor/messenger/app/activity/ViewAvatarActivity.java
index e497ed7..05c5495 100644
--- a/apps/actor-android/src/main/java/im/actor/messenger/app/activity/ViewAvatarActivity.java
+++ b/apps/actor-android/src/main/java/im/actor/messenger/app/activity/ViewAvatarActivity.java
@@ -187,7 +187,7 @@
 
         isUploading = false;
         receiver.clear();
-        if (avatar == null) {
+        if (avatar == null || avatar.getFullImage() == null) {
             photoView.setImageBitmap(null);
             showView(noPhoto);
             goneView(progress);
