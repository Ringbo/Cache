diff --git a/src/main/java/com/owncloud/android/ui/activity/FileDisplayActivity.java b/src/main/java/com/owncloud/android/ui/activity/FileDisplayActivity.java
index db4688e..28749a7 100644
--- a/src/main/java/com/owncloud/android/ui/activity/FileDisplayActivity.java
+++ b/src/main/java/com/owncloud/android/ui/activity/FileDisplayActivity.java
@@ -1075,7 +1075,7 @@
                 sortByName(true);
                 break;
             case SortingOrderDialogFragment.BY_NAME_DESC:
-                sortByDate(false);
+                sortByName(false);
                 break;
             case SortingOrderDialogFragment.BY_MODIFICATION_DATE_ASC:
                 sortByDate(true);
