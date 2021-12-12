diff --git a/src/com/xabber/android/data/notification/NotificationManager.java b/src/com/xabber/android/data/notification/NotificationManager.java
index b1e6df8..7c79c1e 100644
--- a/src/com/xabber/android/data/notification/NotificationManager.java
+++ b/src/com/xabber/android/data/notification/NotificationManager.java
@@ -391,7 +391,7 @@
 			chatViews.setTextViewText(R.id.text, status);
 
 			Notification notification = new Notification();
-			if (Application.SDK_INT >= 14) {
+			if (Application.SDK_INT >= 14 && SettingsManager.eventsPersistent()) {
 				// Ongoing icons are in the left side, so hide this one.
 				notification.icon = R.drawable.ic_placeholder;
 				notification.when = Long.MIN_VALUE;
@@ -429,7 +429,7 @@
 		persistentNotification.defaults = 0;
 		persistentNotification.sound = null;
 		persistentNotification.tickerText = null;
-		if (Application.SDK_INT >= 14) {
+		if (Application.SDK_INT >= 14 && SettingsManager.eventsPersistent()) {
 			// Ongoing icons are in the left side, so always use it.
 			persistentNotification.when = startTime;
 			if (messageNotifications.isEmpty()) {
