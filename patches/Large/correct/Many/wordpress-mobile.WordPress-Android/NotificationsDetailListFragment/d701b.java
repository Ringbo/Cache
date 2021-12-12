diff --git a/WordPress/src/main/java/org/wordpress/android/ui/notifications/NotificationsDetailListFragment.java b/WordPress/src/main/java/org/wordpress/android/ui/notifications/NotificationsDetailListFragment.java
index f945773..f3282b2 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/notifications/NotificationsDetailListFragment.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/notifications/NotificationsDetailListFragment.java
@@ -357,7 +357,7 @@
                 for (int i = 0; i < bodyArray.length(); i++) {
                     try {
                         FormattableContent noteObject = mNotificationsUtilsWrapper
-                                .mapJsonToFormattablbeContent(bodyArray.getJSONObject(i));
+                                .mapJsonToFormattableContent(bodyArray.getJSONObject(i));
                         // Determine NoteBlock type and add it to the array
                         NoteBlock noteBlock;
 
@@ -371,7 +371,7 @@
                                 // Next item in the bodyArray is comment text
                                 if (i + 1 < bodyArray.length()) {
                                     commentTextBlock = mNotificationsUtilsWrapper
-                                            .mapJsonToFormattablbeContent(bodyArray.getJSONObject(i + 1));
+                                            .mapJsonToFormattableContent(bodyArray.getJSONObject(i + 1));
                                     i++;
                                 }
 
@@ -455,7 +455,7 @@
             if (headerArray != null) {
                 for (int i = 0; i < headerArray.length(); i++) {
                     try {
-                        headersList.add(mNotificationsUtilsWrapper.mapJsonToFormattablbeContent(
+                        headersList.add(mNotificationsUtilsWrapper.mapJsonToFormattableContent(
                                 headerArray.getJSONObject(i)));
                     } catch (JSONException e) {
                         AppLog.e(T.NOTIFS, "Header array has invalid format.");
