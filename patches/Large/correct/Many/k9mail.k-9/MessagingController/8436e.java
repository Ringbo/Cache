diff --git a/src/com/fsck/k9/controller/MessagingController.java b/src/com/fsck/k9/controller/MessagingController.java
index 9a7065c..bf7a323 100644
--- a/src/com/fsck/k9/controller/MessagingController.java
+++ b/src/com/fsck/k9/controller/MessagingController.java
@@ -2085,7 +2085,7 @@
         PendingCommand command = new PendingCommand();
         command.command = PENDING_COMMAND_MOVE_OR_COPY_BULK_NEW;
 
-        int length = 3 + uids.length;
+        int length = 4 + uids.length;
         command.arguments = new String[length];
         command.arguments[0] = srcFolder;
         command.arguments[1] = destFolder;
