diff --git a/src/main/java/com/owncloud/android/ui/activity/FileDisplayActivity.java b/src/main/java/com/owncloud/android/ui/activity/FileDisplayActivity.java
index 237baec..d12ba36 100644
--- a/src/main/java/com/owncloud/android/ui/activity/FileDisplayActivity.java
+++ b/src/main/java/com/owncloud/android/ui/activity/FileDisplayActivity.java
@@ -315,7 +315,7 @@
                 if (grantResults.length > 0
                         && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                     // permission was granted
-                    startSynchronization();
+                    refreshList(true);
                     // toggle on is save since this is the only scenario this code gets accessed
                 } else {
                     // permission denied --> do nothing
