diff --git a/apps/actor-android/src/main/java/im/actor/model/android/providers/AndroidNotifications.java b/apps/actor-android/src/main/java/im/actor/model/android/providers/AndroidNotifications.java
index 91e30bb..9a805bd 100644
--- a/apps/actor-android/src/main/java/im/actor/model/android/providers/AndroidNotifications.java
+++ b/apps/actor-android/src/main/java/im/actor/model/android/providers/AndroidNotifications.java
@@ -130,7 +130,7 @@
             NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
             manager.notify(NOTIFICATION_ID, result);
 
-            if(avatar!=null)messenger().bindFile(avatar.getSmallImage().getFileReference(), true, new FileVMCallback() {
+            if(avatar!=null && avatar.getSmallImage()!=null && avatar.getSmallImage().getFileReference()!=null)messenger().bindFile(avatar.getSmallImage().getFileReference(), true, new FileVMCallback() {
 
                 @Override
                 public void onNotDownloaded() {
@@ -194,7 +194,7 @@
             NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
             manager.notify(NOTIFICATION_ID, result);
 
-            if(avatar!=null)messenger().bindFile(avatar.getSmallImage().getFileReference(), true, new FileVMCallback() {
+            if(avatar!=null && avatar.getSmallImage()!=null && avatar.getSmallImage().getFileReference()!=null)messenger().bindFile(avatar.getSmallImage().getFileReference(), true, new FileVMCallback() {
 
                 @Override
                 public void onNotDownloaded() {
