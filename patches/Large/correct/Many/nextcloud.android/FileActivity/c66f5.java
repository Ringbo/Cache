diff --git a/src/com/owncloud/android/ui/activity/FileActivity.java b/src/com/owncloud/android/ui/activity/FileActivity.java
index f63c9ee..3e39f2e 100644
--- a/src/com/owncloud/android/ui/activity/FileActivity.java
+++ b/src/com/owncloud/android/ui/activity/FileActivity.java
@@ -860,7 +860,7 @@
                     startActivity(settingsIntent);
                     break;
 
-                case 3: // Logs
+                case 2: // Logs
                     Intent loggerIntent = new Intent(getApplicationContext(),
                             LogHistoryActivity.class);
                     startActivity(loggerIntent);
