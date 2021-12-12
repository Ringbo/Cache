diff --git a/src/org/qii/weiciyuan/othercomponent/MentionsAndCommentsReceiver.java b/src/org/qii/weiciyuan/othercomponent/MentionsAndCommentsReceiver.java
index e13b0d1..0327f5d 100644
--- a/src/org/qii/weiciyuan/othercomponent/MentionsAndCommentsReceiver.java
+++ b/src/org/qii/weiciyuan/othercomponent/MentionsAndCommentsReceiver.java
@@ -108,7 +108,7 @@
                 .setLargeIcon(bitmap)
                 .setAutoCancel(true)
                 .setContentIntent(activity);
-        if (sum > 0) {
+        if (sum > 1) {
             notification.setNumber(sum);
         }
         notificationManager.notify(0, notification.getNotification());
