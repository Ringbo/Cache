diff --git a/src/org/wordpress/android/ui/notifications/NotificationsActivity.java b/src/org/wordpress/android/ui/notifications/NotificationsActivity.java
index 12a4568..ca41101 100644
--- a/src/org/wordpress/android/ui/notifications/NotificationsActivity.java
+++ b/src/org/wordpress/android/ui/notifications/NotificationsActivity.java
@@ -216,7 +216,7 @@
      *  Open a note fragment based on the type of note
      */
     public void openNote(final Note note){
-        if (note == null)
+        if (note == null || isFinishing())
             return;
         // if note is "unread" set note to "read"
         if (note.isUnread()) {
