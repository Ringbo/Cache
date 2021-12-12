diff --git a/k9mail/src/main/java/com/fsck/k9/activity/MessageCompose.java b/k9mail/src/main/java/com/fsck/k9/activity/MessageCompose.java
index 5072c6e..6c15816 100644
--- a/k9mail/src/main/java/com/fsck/k9/activity/MessageCompose.java
+++ b/k9mail/src/main/java/com/fsck/k9/activity/MessageCompose.java
@@ -2611,7 +2611,7 @@
         }
 
         String body = mailTo.getBody();
-        if (body != null && !subject.isEmpty()) {
+        if (body != null && !body.isEmpty()) {
             mMessageContentView.setCharacters(body);
         }
     }
