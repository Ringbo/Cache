diff --git a/WordPress/src/main/java/org/wordpress/android/ui/notifications/utils/NotificationsUtils.java b/WordPress/src/main/java/org/wordpress/android/ui/notifications/utils/NotificationsUtils.java
index 277864d..910c0b9 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/notifications/utils/NotificationsUtils.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/notifications/utils/NotificationsUtils.java
@@ -280,7 +280,7 @@
                                 .setSpan(styleSpan, indices.get(0), indices.get(1), Spanned.SPAN_INCLUSIVE_INCLUSIVE);
                     }
 
-                    if (onNoteBlockTextClickListener != null) {
+                    if (onNoteBlockTextClickListener != null && textView != null) {
                         textView.setLinksClickable(true);
                         textView.setMovementMethod(new NoteBlockLinkMovementMethod());
                     }
