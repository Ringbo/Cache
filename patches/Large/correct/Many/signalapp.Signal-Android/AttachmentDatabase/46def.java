diff --git a/src/org/thoughtcrime/securesms/database/AttachmentDatabase.java b/src/org/thoughtcrime/securesms/database/AttachmentDatabase.java
index 43d4d9d..7dae60b 100644
--- a/src/org/thoughtcrime/securesms/database/AttachmentDatabase.java
+++ b/src/org/thoughtcrime/securesms/database/AttachmentDatabase.java
@@ -150,7 +150,7 @@
     notifyConversationListeners(DatabaseFactory.getMmsDatabase(context).getThreadIdForMessage(mmsId));
   }
 
-  public @Nullable Attachment getAttachment(AttachmentId attachmentId) {
+  public @Nullable DatabaseAttachment getAttachment(AttachmentId attachmentId) {
     SQLiteDatabase database = databaseHelper.getReadableDatabase();
     Cursor cursor           = null;
 
@@ -518,9 +518,9 @@
         return stream;
       }
 
-      Attachment attachment = getAttachment(attachmentId);
+      DatabaseAttachment attachment = getAttachment(attachmentId);
 
-      if (attachment == null || attachment.isInProgress()) {
+      if (attachment == null || !attachment.hasData()) {
         return null;
       }
 
