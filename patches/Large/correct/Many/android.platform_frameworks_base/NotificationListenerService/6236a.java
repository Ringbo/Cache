diff --git a/core/java/android/service/notification/NotificationListenerService.java b/core/java/android/service/notification/NotificationListenerService.java
index b8493d4..8c6cd09 100644
--- a/core/java/android/service/notification/NotificationListenerService.java
+++ b/core/java/android/service/notification/NotificationListenerService.java
@@ -646,7 +646,7 @@
     private void createLegacyIconExtras(Notification n) {
         Icon smallIcon = n.getSmallIcon();
         Icon largeIcon = n.getLargeIcon();
-        if (smallIcon.getType() == Icon.TYPE_RESOURCE) {
+        if (smallIcon != null && smallIcon.getType() == Icon.TYPE_RESOURCE) {
             n.extras.putInt(Notification.EXTRA_SMALL_ICON, smallIcon.getResId());
             n.icon = smallIcon.getResId();
         }
