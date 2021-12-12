diff --git a/omniNotes/src/main/java/it/feio/android/omninotes/widget/ListRemoteViewsFactory.java b/omniNotes/src/main/java/it/feio/android/omninotes/widget/ListRemoteViewsFactory.java
index 77a740a..4bd9637 100644
--- a/omniNotes/src/main/java/it/feio/android/omninotes/widget/ListRemoteViewsFactory.java
+++ b/omniNotes/src/main/java/it/feio/android/omninotes/widget/ListRemoteViewsFactory.java
@@ -116,7 +116,7 @@
 
         color(note, row);
 
-        if (note.getAttachmentsList().size() > 0 && showThumbnails) {
+        if (!note.isLocked() && showThumbnails && note.getAttachmentsList().size() > 0) {
             Attachment mAttachment = note.getAttachmentsList().get(0);
             Bitmap bmp = BitmapHelper.getBitmapFromAttachment(app, mAttachment, WIDTH, HEIGHT);
             row.setBitmap(R.id.attachmentThumbnail, "setImageBitmap", bmp);
