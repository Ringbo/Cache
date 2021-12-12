diff --git a/src/org/thoughtcrime/securesms/database/ThreadDatabase.java b/src/org/thoughtcrime/securesms/database/ThreadDatabase.java
index ff24dae..c16ab17 100644
--- a/src/org/thoughtcrime/securesms/database/ThreadDatabase.java
+++ b/src/org/thoughtcrime/securesms/database/ThreadDatabase.java
@@ -436,7 +436,7 @@
   }
 
   private @Nullable Uri getAttachmentUriFor(MessageRecord record) {
-    if (!record.isMms() || record.isMmsNotification()) return null;
+    if (!record.isMms() || record.isMmsNotification() || record.isGroupAction()) return null;
 
     SlideDeck slideDeck = ((MediaMmsMessageRecord)record).getSlideDeck();
     Slide     thumbnail = slideDeck.getThumbnailSlide();
