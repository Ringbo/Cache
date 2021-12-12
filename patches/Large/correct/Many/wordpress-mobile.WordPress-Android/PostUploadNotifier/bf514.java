diff --git a/WordPress/src/main/java/org/wordpress/android/ui/uploads/PostUploadNotifier.java b/WordPress/src/main/java/org/wordpress/android/ui/uploads/PostUploadNotifier.java
index 257d674..23d8f46 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/uploads/PostUploadNotifier.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/uploads/PostUploadNotifier.java
@@ -420,9 +420,9 @@
     }
 
     private String buildNotificationSubtitleForMixedContent(){
-        int currentPostItem = sNotificationData.currentPostItem >= sNotificationData.totalPostItems ?
+        int currentPostItem = sNotificationData.currentPostItem > sNotificationData.totalPostItems ?
                 sNotificationData.totalPostItems-1 : sNotificationData.currentPostItem;
-        int currentMediaItem = sNotificationData.currentMediaItem >= sNotificationData.totalMediaItems ?
+        int currentMediaItem = sNotificationData.currentMediaItem > sNotificationData.totalMediaItems ?
                 sNotificationData.totalMediaItems-1 : sNotificationData.currentMediaItem;
 
         String uploadingMessage = String.format(
